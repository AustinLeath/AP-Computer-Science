import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter 1st monster's name : ");
		String name = keyboard.nextLine();
		out.print("Enter 1st monster's size : ");
		int size = keyboard.nextInt();
		keyboard.nextLine();
		Monster monster1 = new Monster(name,size);

		out.print("Enter 2nd monster's name : ");
		name = keyboard.nextLine();
		out.print("Enter 2nd monster's size : ");
		size = keyboard.nextInt();
		out.println();
		Monster monster2 = new Monster(name,size);

		System.out.println("Monster 1 - " + monster1.toString());
		System.out.println("Monster 2 - " + monster2.toString());
		out.println();

		if (monster1.isSmaller(monster2) == true)
			System.out.println("Monster one is smaller than Monster two.");
		else
			System.out.println("Monster one is bigger than Monster two.");

		if (monster1.namesTheSame(monster2) == true)
			System.out.println("Monster one has the same name as Monster two.");
		else
			System.out.println("Monster one does not have the same name as Monster two.");

		out.println();

		out.print("Enter 1st monster's name : ");
		keyboard.nextLine();
		name = keyboard.nextLine();
		out.print("Enter 1st monster's size : ");
		size = keyboard.nextInt();
		keyboard.nextLine();
		Monster monster3 = new Monster(name,size);
		out.print("Enter 2nd monster's name : ");
		name = keyboard.nextLine();
		out.print("Enter 2nd monster's size : ");
		size = keyboard.nextInt();
		Monster monster4 = new Monster(name,size);
		out.println();

		if (monster3.isSmaller(monster4) == true)
			System.out.println("Monster one is smaller than Monster two.");
		else
			System.out.println("Monster one is bigger than Monster two.");

		if (monster3.namesTheSame(monster4) == true)
			System.out.println("Monster one has the same name as Monster two.");
		else
			System.out.println("Monster one does not have the same name as Monster two.");

      out.println();

		out.print("Enter 1st monster's name : ");
		keyboard.nextLine();
		name = keyboard.nextLine();
		out.print("Enter 1st monster's size : ");
		size = keyboard.nextInt();
		keyboard.nextLine();
		Monster monster5 = new Monster(name,size);
		out.print("Enter 2nd monster's name : ");
		name = keyboard.nextLine();
		out.print("Enter 2nd monster's size : ");
		size = keyboard.nextInt();
		Monster monster6 = new Monster(name,size);
		out.println();

		if (monster5.isSmaller(monster6) == true)
			System.out.println("Monster one is smaller than Monster two.");
		else
			System.out.println("Monster one is bigger than Monster two.");

		if (monster5.namesTheSame(monster6) == true)
			System.out.println("Monster one has the same name as Monster two.");
		else
			System.out.println("Monster one does not have the same name as Monster two.");
	}
}
