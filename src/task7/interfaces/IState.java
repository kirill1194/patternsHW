package task7.interfaces;

import task7.states.Context;

public interface IState {
	public void pushMoney(int money, Context context);
	public void chooseDevice(int deviceId, Context context);
	public void chooseDocument(String documentName, Context context);
	public void printDocument(Context context);
	public int getRenting(Context context);
	public void chooseAnotherDocument(Context context);
	public void finish(Context context);
}
