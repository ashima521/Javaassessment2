package com.qa.game;

import java.util.Random;

public class TextGame {

	public static void main(String[] args) {
		
		Random rand = new Random();
     	int location = rand.nextInt(10); 
     	 
     	int x;
     	int y;
     	
		double a = Math.sqrt((location*location) - (y*y));
     	double b = Math.sqrt((location*location) - (x*x));

		Direction direction = new Direction();
		int N = direction.North();
		int S = direction.South();
		int E = direction.East();
		int W = direction.West();

		int newlocation;
		System.out.println("Game Start");

		while (newlocation != location) {

			System.out.println("Enter Direction: north, south, east, west");
			String player = Utils.Player();
			String north;
			String south;
			String east;
			String west;

			if (player == north) {
				x = N.nextInt(location);
				y = y.nextInt();
			} else if (player == south) {
			} else if (player == east) {

			} else if (player == west) {
			} else {

			}
		}
	}
}



