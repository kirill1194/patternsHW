package task7.states;

import task7.interfaces.IState;

public class Context{
	public IState state = new StateStart();
	public int money = 0;
	public int spent = 0;
	public static int price = 2;

	public void pushMoney(int money) {
		this.state.pushMoney(money, this);
		
	}
	
	public void chooseDevice(int deviceId) {
		this.state.chooseDevice(deviceId, this);
		
	}
	
	public void chooseDocument(String documentName) {
		this.state.chooseDocument(documentName, this);
	}
	
	public void printDocument() {
		this.state.printDocument(this);
	}
	
	public int getRenting() {
		return this.state.getRenting(this);
	}
	
	public void chooseAnotherDocument() {
		this.state.chooseAnotherDocument(this);
	}
	
	public void finish() {
		this.state.finish(this);
	}

}
