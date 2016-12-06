package task7.states;

public class StateChooseAnotherDocument extends BaseState {

	@Override
	public void chooseAnotherDocument(Context context) 
	{
		if (context.money - context.spent < Context.price)
			throw new RuntimeException("Недостаточно средств");
		System.out.println("Вы хотите распечатать еще документ. ок.");
		context.state = new StateChooseDocument();
	}
	
	@Override
	public void finish(Context context) {
		System.out.println("Переход к получению сдачи");
		context.state = new StateRenting();
	}

}
