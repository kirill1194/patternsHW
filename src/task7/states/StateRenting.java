package task7.states;

public class StateRenting extends BaseState {
	@Override
	public int getRenting(Context context) {
		int renting = context.money - context.spent;
		System.out.println("Ваша сдача: " + renting);
		context.money = 0;
		context.spent = 0;
		context.state = new StateStart();
		return renting;
	}
}
