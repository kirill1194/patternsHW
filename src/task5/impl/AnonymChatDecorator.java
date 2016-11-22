package task5.impl;

import task5.interfaces.IChat;

public class AnonymChatDecorator extends ChatDecoratorBase {

	public AnonymChatDecorator(IChat chat) {
		super(chat);
	}
	
	public Message beforSend(Message m) {
		m.setFrom(String.valueOf(m.getFrom().hashCode()));
		return m;
	}
	
	public Message beforGet(Message m) {
		m.setFrom(String.valueOf(m.getFrom().hashCode()));
		return m;
	}
}
