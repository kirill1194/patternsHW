package task3.impl;

import task3.interfaces.IEmptyMail;
import task3.interfaces.IMailWithBody;

public class Mail implements IEmptyMail{

	@Override
	public IMailWithBody setBody(String body) {
		MailWithBody mailWithBody = new MailWithBody();
		mailWithBody.body = body;
		return mailWithBody;
	}

}
