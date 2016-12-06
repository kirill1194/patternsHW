package task7.states;

public class StateChooseDocument extends BaseState {
	
	@Override
	public void chooseDocument(String documentName, Context context) 
	{
		System.out.println("Выбран документ с именем " + documentName);
		context.state = new StatePrint();
	}

}
