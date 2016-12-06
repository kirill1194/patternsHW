package task7.states;


public class StatePrint extends BaseState {
	@Override
	public void printDocument(Context context) {
		System.out.println("Распечатка");
		context.spent += Context.price;
		context.state = new StateChooseAnotherDocument();
	}

}
