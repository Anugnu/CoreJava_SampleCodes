package gamePack;

import java.util.Arrays;

public class Game{
	
	static char[][] battleBoard = new char[10][10];
	public static void buildBoard()
	{
		for(char[] row : battleBoard)
		{
			Arrays.fill(row, '*'); 
		}
	}
	public static void redrawBoard()
	{
		int k =  1;
		while(k<=30){System.out.print('-'); k++;}
		System.out.println();
		
		for(int i = 0; i < battleBoard.length; i++)
		{
			for(int j=0; j< battleBoard[i].length; j++)
			{
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		k =  1;
		while(k<=30){System.out.print('-'); k++;}
		System.out.println();
	}

private int health = 500;
private int attack = 10;
private int movement = 2;
private boolean alive = true;

public int xposition = 0;
public int yposition = 0;
public String name = "Big Monster";
public char nameChar = 'B';
public static int numOfMonsters = 0;

public int getAttack(){ return attack;}
public int getMOvement(){ return movement;}
public int getHealth(){ return health;}
public boolean getalive(){ return alive;}

	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		if(health<0) alive = false;
	}
	public void setHealth(double decreaseHealth)
	{
		int decHealth = (int) decreaseHealth;
		health = health - decHealth;
		if(health<0) alive = false;
	}

	public Game (int newHealth, int newAttack, int newMovement, String newName)
	{
		health = newHealth;
		attack = newAttack;
		movement = newMovement;
		name = newName;
		
		int randNumX, randNumY;
		do{
			randNumX = (int) (Math.random() * battleBoard.length);
			randNumY = (int) (Math.random() * battleBoard[0].length);
		} while(battleBoard[randNumX][randNumY] != '*');
		
		this.xposition = randNumX;
		this.yposition = randNumY;
		this.nameChar = name.charAt(0);
		battleBoard[this.yposition][xposition] = this.nameChar;
		
		numOfMonsters++;
	}


	public static void main(String[] args)
	{
		Game.buildBoard();
		Game[] newGame = new Game[4];
		
		newGame[0] = new Game(1000, 20, 1, "SAM");
		newGame[1] = new Game(1000, 20, 1, "Anugnu");
		newGame[2] = new Game(1000, 20, 1, "Angie");
		newGame[3] = new Game(1000, 20, 1, "Kalyani");
		
		Game.redrawBoard();
	}	
}	