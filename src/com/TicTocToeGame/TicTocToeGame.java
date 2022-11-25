package com.TicTocToeGame;
	public class TicTocToeGame {
			 public static void Displayboard( ) {
			        char[] board = new char[10];
			        System.out.println(" ____________");
			        for (int i = 1; i <= board.length; i++) {
			            
			            System.out.print("|___");
			          if (i % 3 == 0)
			            {
			        	  System.out.println("|");
			            }
			               
			        }
			        System.out.println("|");
			 }
	    public static void main(String[] args) {
	        System.out.println("Welcome in tic tak toe game ");
	      
	        TicTocToeGame.Displayboard();
	   
	    
	
}
}