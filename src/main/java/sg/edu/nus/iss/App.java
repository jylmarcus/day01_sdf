package sg.edu.nus.iss;

import java.io.Console;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Console cons = System.console();
        String name = cons.readLine("What is your name? ");
        System.out.printf("Hello %s. Pleased to meet you.\n", name);

    }
}
