package task3.impl;

import java.util.LinkedList;
import java.util.List;

import task3.interfaces.IMailFinal;

public class MailFinal extends MailWithBody implements IMailFinal{

	protected String recipient;
	private List<String> recipientCopy;
	private String theme;
	
	public MailFinal() {
		super();
		recipientCopy = new LinkedList<>();
	}
	
	@Override
	public void build() {
		System.out.println("body: " + this.body);
		System.out.println("recipient: " + this.recipient);
		if (this.recipientCopy.size() != 0)
		{
			String recipientsCopyString = this.recipientCopy.get(0);
			for (int i=1; i<this.recipientCopy.size(); i++)
				recipientsCopyString += ", " + this.recipientCopy.get(i);
			System.out.println("recipient copy: " + recipientsCopyString);	
		}
		if (this.theme != null)
			System.out.println("theme: " + this.theme);
		
	}

	@Override
	public IMailFinal addCopyRecipient(String copyRecipient) {
		this.recipientCopy.add(copyRecipient);
		return this;
	}

	@Override
	public IMailFinal setTheme(String theme) {
		this.theme = theme;
		return this;
	}

}
