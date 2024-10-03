import java.util.ArrayList;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start game:");
		actions.add("2) resume game:");

		actions.add("3) pause game:");

		actions.add("4) end game:");
		
		GameMenu menu = new GameMenu(actions);
		menu.displayMenu();
		String yourChoice = menu.getAction();
		doAction(Integer.valueOf(yourChoice));









	}	
	public static void doAction(int action){
		switch(action){
		case 1: 
			System.out.println("Starting the game now");
			break;
		case 2: 
			System.out.println("Fetching previously saved game data");
			break;
		case 3: 
			System.out.println("Game paused");
			break;
		case 4: 
			System.out.println("Ending game");
			break;

		}

	}

}
