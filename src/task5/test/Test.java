package task5.test;

import java.util.List;

import task5.impl.AnonymChatDecorator;
import task5.impl.Chat;
import task5.impl.Message;
import task5.impl.SecurityCharDecorator;
import task5.interfaces.IChat;

public class Test {
	public static void main(String[] args) {
		IChat chat = new SecurityCharDecorator(new Chat());
		doTest(chat);
		
		System.out.println("--------------------------------");
		
		IChat chat2 = new AnonymChatDecorator(new Chat());
		doTest(chat2);
		
	}
	
	public static void doTest(IChat chat) {
		Message m = new Message();
		m.setFrom("me");
		m.setTo("something");
		m.setText("tteexxtt");
		chat.sendMessage(m);
		
		List<Message> messages = chat.getNewMessages();
		for (Message msg : messages) {
			System.out.println("get message: \n" + msg.toString());
		}
	}
}
