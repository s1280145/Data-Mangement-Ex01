import java.util.Random;
import java.util.Scanner;

public class Dice{
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("What is your name?");
		System.out.print(">");
		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Hello, " + str +"!");
        scan.close();
		
		System.out.println("Rolling the dice...");
		int D1,D2,Total;
		D1 = rand.nextInt((6)+1);
		D2 = rand.nextInt((6)+1);
		Total = D1+D2;
		System.out.println("Dice 1: " + D1);
		System.out.println("Dice 2: " + D2);
		System.out.println("Total value: " + Total);
		if(Total>7) {
			System.out.println(str + " won!");
		}else {
			System.out.println(str + " lost");
		}
	}
}
