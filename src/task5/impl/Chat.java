package task5.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import task5.interfaces.IChat;

public class Chat implements IChat {
	private List<String> randomUsers = new ArrayList<String>(){{
		add("Andrey");
		add("Max");
		add("Ivan");
		add("Aleg");
	}};
	private List<String> randomMessage = new ArrayList<String>(){{
		add("message text with something meaning");
		add("message with text but without meaning");
		add("message about our world");
		add("<decode>SECURITY</decode>");
	}};
	
	
	@Override
	public void sendMessage(Message m) {
		System.out.println("send message: \n" + m.toString());
		
	}

	@Override
	public List<Message> getNewMessages() {
		Random r = new Random();
		int count = r.nextInt(4)+1;
		List<Message> response = new ArrayList<>(count);
		for (int i=0; i<count; i++) {
			int random_usr = r.nextInt(this.randomUsers.size());
			int random_msg = r.nextInt(this.randomMessage.size());
			Message msg = new Message();
			msg.setFrom(randomUsers.get(random_usr));
			msg.setText(randomMessage.get(random_msg));
			msg.setTo("me");
			response.add(msg);
		}
		return response;
	}
}