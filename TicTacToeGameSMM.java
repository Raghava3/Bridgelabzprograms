package com.Bridgelabz;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class TicTacToeGameSMM
{
	//Single player method
     private static void singlePlayer()
	{
		char a[][]=new char[3][3];
		int r=0,c=0;
		int n=1,d=0;
		int i=0;
		int p=0;
		int l = 0;
		char pos[][]= new char[3][3];
		Scanner scn=new Scanner(System.in);
		{
			System.err.println("                                         WELCOME  To TIC TAC TOE GAME");
			System.err.println("                                       single player");

			a[0][0] = '.';
			a[0][1] = '.';
			a[0][2] = '.';
			a[1][0] = '.';
			a[1][1] = '.';
			a[1][2] = '.';
			a[2][0] = '.';
			a[2][1] = '.';
			a[2][2] = '.';

			pos[0][0] = '1';
			pos[0][1] = '2';
			pos[0][2] = '3';
			pos[1][0] = '4';
			pos[1][1] = '5';
			pos[1][2] = '6';
			pos[2][0] = '7';
			pos[2][1] = '8';
			pos[2][2] = '9';
		    
		  
			for (l = 1; l < 10; l++) {
				n++;
				if (l % 2 == 0)

				{
				//system is playing no need to print any thing
				}

				else {

					System.out.println("            your turn ");
					System.out.println("       this is your    symbol - @");
				}
				if(l%2!=0)
				{
				for (i = 0; i < 3; i++) {
					
					for (int j = 0; j < pos.length; j++)
					{
						System.out.print("\t" + pos[i][j]);	
					}
					System.out.println();
				}	

				}
				System.out.println();
				try{
			
				if (l % 2 == 0)
				{

					Random rm=new Random();
					p=rm.nextInt(9);
				
				}
				else
				{
					System.out.println("           enter the number where  (@) u will add your are symbol ");
					p = scn.nextInt();
				}
				}
				catch(InputMismatchException e)
				{
					System.out.println("wrong location");
					System.exit(0);
				}
			
                                 if (p == 1 || p == 2 || p == 3) {
					r = 0;

					c = p - 1;

				} else if (p == 4 || p == 5 || p == 6) {
					r = 1;
					c = p - 4;

				} else if (p == 7 || p == 8 || p == 9) {
					r = 2;
					c = p - 7;
				}
				
				
				if (l % 2 == 0) {
					 
					if(a[r][c]!='@'&&a[r][c]!='X'){
					
					pos[r][c] = (char) 'X';
					
					}
				} else {
					
					if(a[r][c]!='@'&&a[r][c]!='X'){
					pos[r][c] = (char) '@';}
				}
				

			if(l%2==                                        0)
				
				{

					if(a[r][c]!='@'&&a[r][c]!='X')
					{

						a[r][c]='X';

						if((a[r][0]=='X'&&a[r][1]=='X'&&a[r][2]=='X')||(a[0][c]=='X'&&a[1][c]=='X'&&a[2][c]=='X')||
								(a[0][0]=='X'&&a[1][1]=='X'&&a[2][2]=='X')||(a[0][2]=='X'&&a[2][0]=='X'&&a[1][1]=='X'))
						{
				                                        			System.out.println(" sorry  ");
							System.out.println("you lost");
							break;
						}

					}
					else	
					{
					//	System.out.println("alredy entered");
						l--;
						n--;
						if(n==10)
						{
							System.out.println("  box filled . game over its draw");
						}
					}

				}
				else{
					if(a[r][c]!='@'&&a[r][c]!='X')
					{

						a[r][c]='@';
						if((a[r][0]=='@'&&a[r][1]=='@'&&a[r][2]=='@')
								||(a[0][c]=='@'&&a[1][c]=='@'&&a[2][c]=='@')
								   ||(a[0][0]=='@'&&a[1][1]=='@'&&a[2][2]=='@')
								       ||(a[0][2]=='@'&&a[2][0]=='@'&&a[1][1]=='@'))
						{
							System.out.println("congrats ");
							System.out.println("you  won the game");
							break;
						}
					}
					else
					{
						System.out.println("alredy enterd");
						l--;
						n--;
					}
				}
				if(n==10)
				{
					System.out.println("  box filled . game over");
				}
			
				}
			}
		
		System.err.println("TIC TAC TOE DISPLAY");
		for (int j = 0; j < a.length; j++) {
			for (int j2 = 0; j2 < a.length; j2++) 
			{
				System.out.print(a[j][j2]);
			}
			System.out.println();
		}
System.out.println(" do you want contine the game ");

try{
	System.out.println("Enter  n to exit");
	System.out.println("Enter 1 for SINGLE PLAYER");
    System.out.println("Enter 2 for DUAL PLAYER");


 d=scn.nextInt();
}
catch(InputMismatchException e)
{
System.out.println("Thank you ");
System.exit(0);
}


if(d==1)
{
TicTacToeGameSMM.singlePlayer();
}
else
{
TicTacToeGameSMM.dualPlayer();
}

	


	}
//Dual player method

	public static void dualPlayer()
	{
		char a[][]=new char[3][3];
		int r=0,c=0;
		int n=1,d=0;
		int i=0;
		int p=0;
		int l = 0;
		char pos[][];
		pos = new char[3][3];
		Scanner scn=new Scanner(System.in);
		{
			System.err.println("                                         WELCOME  TO TIC TAC TOE GAME");
			System.err.println("                                    Dual player");

			a[0][0] = '.';
			a[0][1] = '.';
			a[0][2] = '.';

			a[1][0] = '.';
			a[1][1] = '.';
			a[1][2] = '.';
			
			a[2][0] = '.';
			a[2][1] = '.';
			a[2][2] = '.';

			pos[0][0] = '1';
			pos[0][1] = '2';
			pos[0][2] = '3';
			

			pos[1][0] = '4';
			pos[1][1] = '5';
			pos[1][2] = '6';
			
			pos[2][0] = '7';
			pos[2][1] = '8';
			pos[2][2] = '9';
		    
		  
			for (l = 1; l < 10; l++) {
				n++;
				if (l % 2 == 0)

				{
					System.out.println("         player 2 turn  ");
					System.out.println("     this is your    symbol - X");
				}

				else {

					System.out.println("            player 1 turn ");
					System.out.println("       this is your    symbol - @");
				}
				for (i = 0; i < 3; i++) {
					
					for (int j = 0; j < pos.length; j++) {
						System.out.print("\t" + pos[i][j]);	
					}
					
					System.out.println();
				}
				System.out.println();
				try{
				System.out.println("           enter the number where u will add your are symbol ");
				p = scn.nextInt();
				}
				catch(InputMismatchException e)
				{
					System.out.println("wrong location");
					System.exit(0);
				}
			

				if (p == 1 || p == 2 || p == 3) {
					r = 0;

					c = p - 1;

				} else if (p == 4 || p == 5 || p == 6) {
					r = 1;
					c = p - 4;

				} else if (p == 7 || p == 8 || p == 9) {
					r = 2;
					c = p - 7;
				}
				
				
				if (l % 2 == 0) {
					 
					if(a[r][c]!='@'&&a[r][c]!='X'){
					
					pos[r][c] = (char) 'X';
					
					}
				} else {
					
					if(a[r][c]!='@'&&a[r][c]!='X'){
					pos[r][c] = (char) '@';}
				}
				

			if(l%2==0)
				
				{

					if(a[r][c]!='@'&&a[r][c]!='X')
					{

						a[r][c]='X';

						if((a[r][0]=='X'&&a[r][1]=='X'&&a[r][2]=='X')||(a[0][c]=='X'&&a[1][c]=='X'&&a[2][c]=='X')||
								(a[0][0]=='X'&&a[1][1]=='X'&&a[2][2]=='X')||(a[0][2]=='X'&&a[2][0]=='X'&&a[1][1]=='X'))
						{
							System.out.println(" congrats ");
							System.out.println("player 2 win");
							break;
						}

					}
					else
					{
						System.out.println("alredy entered");
						l--;
						n--;
						if(n==10)
						{
							System.out.println("  box filled . game over its draw");
						}
					}

				}
				else{
					if(a[r][c]!='@'&&a[r][c]!='X')
					{

						a[r][c]='@';
						if((a[r][0]=='@'&&a[r][1]=='@'&&a[r][2]=='@')
								||(a[0][c]=='@'&&a[1][c]=='@'&&a[2][c]=='@')
								   ||(a[0][0]=='@'&&a[1][1]=='@'&&a[2][2]=='@')
								       ||(a[0][2]=='@'&&a[2][0]=='@'&&a[1][1]=='@'))
						{
							System.out.println("congrats ");
							System.out.println("player 1 win");
							break;
						}
					}
					else
					{
						System.out.println("alredy enterd");
						l--;
						n--;
					}
				}
				if(n==10)
				{
					System.out.println("  box filled . game over");
				}
			
				}
			}
		
		System.err.println("TIC TAC TOE DISPLAY");
		for (int j = 0; j < a.length; j++) {
			for (int j2 = 0; j2 < a.length; j2++) 
			{
				System.out.print(a[j][j2]);
			}
			System.out.println();
		}
		System.out.println(" do you want contine the game ");

		try{
			System.out.println("Enter  n to exit");
			System.out.println("Enter 1 for SINGLE PLAYER");
		    System.out.println("Enter 2 for DUAL PLAYER");


		 d=scn.nextInt();
		}
		catch(InputMismatchException e)
		{
		System.out.println("Thank you ");
		System.exit(0);
		}


		if(d==1)
		{
		TicTacToeGameSMM.singlePlayer();
		}
		else
		{
		TicTacToeGameSMM.dualPlayer();
		}
	}

public static void main(String[] args)
{
	System.out.println("Enter 1 for SINGLE PLAYER");
	System.out.println("Enter 2 for DUAL PLAYER");
	Scanner scn=new Scanner(System.in);
	int d=scn.nextInt();
	char de=' ';
do
	{
	if(d==1)
{
	TicTacToeGameSMM.singlePlayer();
}
else
{
	TicTacToeGameSMM.dualPlayer();
}
try{
System.out.println("do you want to play again . press y ");
de=scn.next().charAt(0);
}
catch(InputMismatchException e)
{
	System.out.println("Thank you ");
	System.exit(0);
}



}while(de=='y'||de=='Y');
System.out.println("Thank you.");
scn.close();
}

}