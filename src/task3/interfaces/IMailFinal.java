package task3.interfaces;

public interface IMailFinal {
	void build();
	IMailFinal addCopyRecipient(String copyRecipient);
	IMailFinal setTheme(String theme);
}
