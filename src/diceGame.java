import java.util.Scanner;


public class diceGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Die die = new Die ();
	
		System.out.println("Please enter a number between 2 and 12: ");
		int number = input.nextInt();
		if(number<2 || number>12){
			System.out.println("Your selected number is out of range");
		
		}
		else{
		die.SetNumber(number);
		for (int i=0;i<3;i++){
		Die die1 = new Die();
		Die die2 = new Die();
		die.diceValue(die1.GetDice(),die2.GetDice());
		if(die.GetGame()==1){
			break;
		}
		}
		
		if (die.GetGame()==0){
			System.out.println();
			System.out.println("Sorry! Computer won. Maybe next time you would be lucky...");
		}
		}
		}

	}


