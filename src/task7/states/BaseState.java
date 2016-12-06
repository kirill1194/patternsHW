package task7.states;

import task7.interfaces.IState;

public abstract class BaseState implements IState{

	@Override
	public void pushMoney(int money, Context context) {
		throw new RuntimeException("В данный момент внести деньги нельзя");
		
	}

	@Override
	public void chooseDevice(int deviceId, Context context) {
		throw new RuntimeException("В данный момент выбрать устройство нельзя");
		
	}

	@Override
	public void chooseDocument(String documentName, Context context) {
		throw new RuntimeException("В данный момент выбрать устройство нельзя");
		
	}

	@Override
	public void printDocument(Context context) {
		throw new RuntimeException("В данный момент распечатать документ нельзя");
		
	}

	@Override
	public int getRenting(Context context) {
		throw new RuntimeException("В данный момент сдачу получить нельзя");
	}
	
	@Override
	public void chooseAnotherDocument(Context context) {
		throw new RuntimeException("В данный момент нельзя выбрать другой документ");
		
	}
	
	@Override
	public void finish(Context context) {
		throw new RuntimeException("В данный момент нельзя закончить");
	}
}
