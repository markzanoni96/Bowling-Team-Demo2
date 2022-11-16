// Chapter 8 practice exercise

import java.util.*;

public class BowlingTeamDemo2
{
	public static void main(String[] args)
	{
		// variables and constants
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 4;
		Scanner input = new Scanner(System.in);
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];

		// input phase
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			teams[y] = new BowlingTeam(); 
			System.out.print("Please enter team name >>");
			name = input.nextLine();
			teams[y].setTeamName(name);

		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
		{
			 System.out.print("Please enter the name of member " + (x + 1) + ">> ");
			 name = input.nextLine();
			 teams[y].setMember(x, name);
		} // end of x for loop
			System.out.println("Team added successfully!");
		} // end of y for loop	

		// output phase
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			System.out.println("\nMember of team " + teams[y].getTeamName());
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print(teams[y].getMember(x) + " ");
				{
					// if we find a team name match, loop through all the members 
					for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
					{
						System.out.print(teams[y].getMember(x) + " ");
					} // end of X for loop
					break;
				}
			} // end of x for loop
				
		} // end of y for loop
		System.out.print("\n\nEnter a team name to see its full roster >>");
		name = input.nextLine();

		// loop through all the team names to see if there's a match
		for(y = 0; y < teams.length; ++y)
		{
			if(name.equalsIgnoreCase(teams[y].getTeamName()))
			{

			} // end of IF statement
		} // end of for loop

		System.out.println("\nExiting program...");
	} // end of main()
} // end of class