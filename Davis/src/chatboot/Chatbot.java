package chatboot;

public class Chatbot {

	private String username;
	private boolean chatting;
	private Topic theo;
	public Chatbot() {
		// TODO Auto-generated constructor stub
		theo = new TheoChatbot();
		username = "Unknown user";
		chatting = true;
	}

	public void startChatting() {
		ChatbotMain.print("Hi I am boot. Tell me your name");
		username= ChatbotMain.getInput();
		while(chatting) {
			ChatbotMain.print("What would u like to talk about?");
			String response = ChatbotMain.getInput();
			if(theo.isTriggered(response)) {
				chatting = false;
				theo.talk(response);
			}
			else {
				ChatbotMain.print("I'm sorry. I don't understand.");
			}
		}
	}

}
