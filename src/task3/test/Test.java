package task3.test;

import task3.impl.Mail;
import task3.interfaces.IEmptyMail;

public class Test {
	public static void main(String[] args) {
		IEmptyMail mail1 = new Mail();
		mail1.setBody("Это тело письма")
		.addRecipient("Это получатель")
		.addCopyRecipient("Это получатель, который получит копию")
		.addCopyRecipient("Это еще один получатель, который получит копию")
		.setTheme("Это тема письма")
		.build();
		
		System.out.println();
		
		IEmptyMail mail2 = new Mail();
		mail2.setBody("Это тело письма")
		.addRecipient("Это получатель")
		.build();
	}
}
