package task5.impl;

import java.util.ArrayList;
import java.util.List;

import task5.interfaces.IChat;

public abstract class ChatDecoratorBase implements IChat {
	
	private IChat chat;
	
	public ChatDecoratorBase(IChat chat) {
		this.chat = chat;
	}
	
	@Override
	public void sendMessage(Message m) {
		m = beforSend(m);
		chat.sendMessage(m);
		
	}
	
	public Message beforSend(Message m) {
		return m;
	}
	
	public Message beforGet(Message m) {
		return m;
	}

	@Override
	public List<Message> getNewMessages() {
		List<Message> messages = chat.getNewMessages();
		List<Message> response = new ArrayList<Message>(messages.size());
		for (Message m : messages) {
			response.add(beforGet(m));
		}
		return response;
	}

}
