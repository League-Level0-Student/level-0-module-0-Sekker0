package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String ask = JOptionPane.showInputDialog("do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if(ask.equalsIgnoreCase("yes")) {
			System.out.println("You will rule the world!");
		}else {
			
			System.out.println("Sign up for the League!");
			
		}
	
		// 3. Otherwise, tell them to sign up for classes at The League.
		
		
	}
	}