package task5.interfaces;

import java.util.List;

import task5.impl.Message;

public interface IChat {
	void sendMessage(Message m);
	List<Message> getNewMessages();
	
}
