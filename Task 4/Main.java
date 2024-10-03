import java.util.ArrayList;
public class Main{

	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start game:");
		actions.add("2) resume game:");

		actions.add("3) pause game:");

		actions.add("4) end game:");
		
		GameMenu menu = new GameMenu(actions);
		menu.displayMenu();




	}	

}
