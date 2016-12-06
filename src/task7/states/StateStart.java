package task7.states;


public class StateStart extends BaseState{
	
	@Override
	public void pushMoney(int money, Context context) {
		if (money <= 0)
			throw new RuntimeException("Надо внести положительную сумму");
		System.out.println("Получено " + money + " рублей");
		context.money = money;
		context.state = new StateChooseDevice();
	}

}
