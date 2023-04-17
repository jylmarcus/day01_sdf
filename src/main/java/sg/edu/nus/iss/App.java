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

        if(name.length()>0){
            System.out.printf("Nice to meet you, %s\n", name);
        } else {
            System.err.println("You have not told me your name.");
        }

        Integer age = 80;
        System.out.println("\n" + name + " is " + age + " years old");

        //Slide 17
        //read input from keyboard
        String input = cons.readLine("What is your hobby?");
        input.trim(); //remove whitespace from front and end of input

        if(input.equals("swim")){
            System.out.println("The nearest swimming pools is Clementi");
        } else if (input.equals("jog")){
            System.out.println("The nearest park is West Coast park");
        } else if (input.equals("cycle")){
            System.out.println("You could cycle along the PCN");
        } else {
            System.out.println("Seems like you are a boring person without hobby");
        }

        //Slide 18
        //switch statement
        switch(input) {
            case "swim":
                System.out.println("The nearest swimming pools is Clementi");
                break;
            case "jog":
                System.out.println("The nearest park is West Coast park");
                break;
            case "cycle":
                System.out.println("You could cycle along the PCN");
                break;
            default:
                System.out.println("Seems like you are a boring person without hobby");
                break;
        }
    }
}
