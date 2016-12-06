package task7.states;

public class StateChooseDevice extends BaseState {

	@Override
	public void chooseDevice(int deviceId, Context context) {
		System.out.println("Выбрано устройство с id=" + deviceId);
		context.state = new StateChooseDocument();
	}
		
}
