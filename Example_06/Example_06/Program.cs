using Example_06.ChainOfResponsibility;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Example_06
{
    class Program
    {
        static void Main(string[] args)
        {
            Bancomat b = new Bancomat();
            Console.WriteLine("-----------------------------");
            b.giveMoney("10 $");
            Console.WriteLine("-----------------------------");
            b.giveMoney("750 $");
            Console.WriteLine("-----------------------------");
            b.giveMoney("111 $");
            Console.WriteLine("-----------------------------");
            b.giveMoney("100 Рублей");
            Console.ReadLine();
        }
    }
}
