using System;
using System.Collections.Generic;

namespace Example_06.ChainOfResponsibility
{
    public class Currencys
    {
        public enum Type
        {
            Eur,
            Dollar,
            Ruble
        }
        public static Type parse(String s)
        {
            s = s.ToLower();
            if (s.Equals("$"))
                return Type.Dollar;
            if (s.Equals("рублей"))
                return Type.Ruble;
            throw new Exception();
        }
    }


    public interface IBanknote
    {
        Currencys.Type Currency { get; }
        String Value { get; }
    }


    public class Bancomat
    {
        public Queue<string> cashQueue;
        private readonly BanknoteHandler _handler;

        public Bancomat()
        {
            _handler = new TenRubleHandler(null);
            _handler = new TenDollarHandler(_handler);
            _handler = new FiftyDollarHandler(_handler);
            _handler = new HundredDollarHandler(_handler);
        }

        public bool Validate(string banknote)
        {
            return _handler.Validate(banknote);
        }

        public void giveMoney(string money)
        {
            Console.WriteLine("Получено " + money);

            cashQueue = new Queue<string>();

            int value = int.Parse(money.Split()[0]);
            Currencys.Type type = Currencys.parse(money.Split()[1]);

            if (isCashed(value, type, cashQueue))
            {
                Dictionary<String, int> dict = new Dictionary<String, int>();
                foreach (String cash in cashQueue)
                {
                    if (dict.ContainsKey(cash))
                        dict[cash]++;
                    else
                        dict.Add(cash, 1);
                }
                Console.WriteLine("Выдано:");
                foreach (KeyValuePair<String, int> keyValue in dict)
                {
                    if (keyValue.Value == 1)
                        Console.WriteLine(keyValue.Key);
                    else
                        Console.WriteLine(keyValue.Key + " x" + keyValue.Value);
                }
            }
            else
                Console.WriteLine("Неверная сумма");

        }

        protected bool isCashed(int balance, Currencys.Type currencyType, Queue<string> casheQueue)
        {
            return _handler.isCashed(balance, currencyType, casheQueue);
        }
    }

    public abstract class BanknoteHandler
    {
        private readonly BanknoteHandler _nextHandler;

        protected BanknoteHandler(BanknoteHandler nextHandler)
        {
            _nextHandler = nextHandler;
        }

        public virtual bool Validate(string banknote)
        {
            return _nextHandler != null && _nextHandler.Validate(banknote);
        }

        public virtual bool isCashed(int balance, Currencys.Type currencyType, Queue<string> casheQueue)
        {
            return _nextHandler != null && _nextHandler.isCashed(balance, currencyType, casheQueue);
        }

    }

    public class TenRubleHandler : BanknoteHandler
    {
        public int Value => 10;

        public override bool Validate(string banknote)
        {
            if (banknote.Equals("10 Рублей"))
            {
                return true;
            }
            return base.Validate(banknote);
        }

        public override bool isCashed(int balance, Currencys.Type currencyType, Queue<string> casheQueue)
        {
            if (currencyType != Currencys.Type.Ruble)
                return base.isCashed(balance, currencyType, casheQueue);

            while (balance >= Value)
            {
                casheQueue.Enqueue(Value + " Рублей");
                balance -= Value;
            }

            return balance == 0 || base.isCashed(balance, currencyType, casheQueue);
        }

        public TenRubleHandler(BanknoteHandler nextHandler) : base(nextHandler)
        { }
    }

    public abstract class DollarHandlerBase : BanknoteHandler
    {
        public override bool Validate(string banknote)
        {
            if (banknote.Equals($"{Value} $"))
            {
                return true;
            }
            return base.Validate(banknote);
        }

        public override bool isCashed(int balance, Currencys.Type currencyType, Queue<string> casheQueue)
        {
            if (Value > balance || Currency != currencyType )
                return base.isCashed(balance, currencyType, casheQueue);

            while (Value <= balance)
            {
                casheQueue.Enqueue(Value + " $");
                balance -= Value;
            }

            return balance == 0 || base.isCashed(balance, currencyType, casheQueue);
        }

        public Currencys.Type Currency => Currencys.Type.Dollar;
        public abstract int Value { get; }

        protected DollarHandlerBase(BanknoteHandler nextHandler) : base(nextHandler)
        {
        }
    }

    public class HundredDollarHandler : DollarHandlerBase
    {
        public override int Value => 100;

        public HundredDollarHandler(BanknoteHandler nextHandler) : base(nextHandler)
        { }
    }

    public class FiftyDollarHandler : DollarHandlerBase
    {
        public override int Value => 50;

        public FiftyDollarHandler(BanknoteHandler nextHandler) : base(nextHandler)
        { }
    }

    public class TenDollarHandler : DollarHandlerBase
    {
        public override int Value => 10;

        public TenDollarHandler(BanknoteHandler nextHandler) : base(nextHandler)
        { }
    }
}