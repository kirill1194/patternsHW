package task5.impl;

import task5.interfaces.IChat;

public class SecurityCharDecorator extends ChatDecoratorBase{

	public SecurityCharDecorator(IChat chat) {
		super(chat);
	}
	
	private String openTag = "<decode>";
	private String closeTag = "</decode>";
	
	@Override
	public Message beforSend(Message m) {
		m.setText(openTag + m.getText() + closeTag);
		return m;
	}
	
	@Override
	public Message beforGet(Message m) {
		String text = m.getText();
		if (text.startsWith(openTag)) {
			text = text.substring(openTag.length());
		}
		if (text.endsWith(closeTag)) {
			text = text.substring(0, text.length()-closeTag.length());
		}
		m.setText(text);
		return m;
	}

}
