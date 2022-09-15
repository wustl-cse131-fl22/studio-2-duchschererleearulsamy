package studio2;

import java.util.Scanner;

public class GamblersRuin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Insert Starting Amount:");
		int starti = in.nextInt();
		System.out.println("Insert Winchance out of 1:");
		double chance = in.nextDouble();
		System.out.println("Insert your Win Limit:");
		int limit = in.nextInt();
		System.out.println("How many total trials are you running?");
		int total = in.nextInt();
		int days = 0;
		int wins = 0;
		int loses = 0;
		while (days < total)
		{
			int startf = starti;
			while (startf > 0 && startf < limit)
			{
				double play = Math.random();
				if (chance >= play)
				{
					startf = startf + 1;
				}
				else 
				{
					startf = startf - 1;
				}
		//System.out.println(start);
			}
		if (startf == limit)
				{
				wins = wins + 1;
			//System.out.println("You win! Leave Casino.");
				}
		else 
		{
			loses = loses + 1;
			//System.out.println("The day was a ruin!");
		}
		days = days + 1;
		}
	System.out.println("You won " + wins + " times.");
	System.out.println("You lost " + loses + " times.");
	double winrate = (double)wins / total;
	System.out.println("Actual winrate is " + winrate + "%");
	System.out.println("Expected winrate is " + chance +"%");
	}
}
