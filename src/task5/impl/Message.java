package task5.impl;

public class Message {
	private String from;
	private String to;
	private String text;
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String toString(){
		return String.format( "from: %s\n"
				+ "to: %s\n"
				+ "test: %s", this.getFrom(), this.getTo(), this.getText());
	}
	
}
