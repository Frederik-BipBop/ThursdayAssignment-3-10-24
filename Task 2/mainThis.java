import java.util.Scanner;

public class mainThis{
private int age = 28;
private String name = "Knud";
	public static void main(String[] args) {
		System.out.println("Please type your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(" Hello " + name + " please type your age");
		int age = scanner.nextInt();
		System.out.println(" You are " + age + " years old.");
		if(age < 67 ){
			System.out.println(" You have " + (67 - age) + " years until retirement");

		}

	}
}