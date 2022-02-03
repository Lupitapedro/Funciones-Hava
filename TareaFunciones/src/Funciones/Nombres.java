package Funciones;
import java.util.Scanner;

public class Nombres {
	public static void name( String [] args) {
		Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        printNameCharacters( name );
        printNameLength( name );

		
	}
	private static void printNameLength( String name )
    {
      int s = name.length();
      System.out.println(s);
    }

    private static void printNameCharacters( String name )
    {
    	for (int i=0; i<name.length();i++) {
    		char letter=name.charAt(i);
    		System.out.println(letter);
    	}
    }

}
