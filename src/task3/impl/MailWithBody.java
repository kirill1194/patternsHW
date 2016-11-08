package task3.impl;

import task3.interfaces.IMailFinal;
import task3.interfaces.IMailWithBody;

public class MailWithBody extends Mail implements IMailWithBody {

	protected String body;
	
	@Override
	public IMailFinal addRecipient(String recipient) {
		MailFinal mailFinal = new MailFinal();
		mailFinal.body = this.body;
		mailFinal.recipient = recipient;
		return mailFinal;
	}

}
