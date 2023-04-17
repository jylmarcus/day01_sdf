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

        //Slide 19
        Integer myAge = 0;
        String inputAge = cons.readLine("What is your age?");

        myAge = Integer.parseInt(inputAge);

        if(myAge >=0 && myAge <= 3) {
            System.out.println("you are baby");
        } else if(myAge > 2 && myAge <= 4) {
            System.out.println("you are toddler");
        } else if (myAge > 4 && myAge <= 12) {
            System.out.println("you are child");
        } else if (myAge > 12 && myAge <= 19) {
            System.out.println("you are teenager");
        } else {
            System.out.println("you are old and have back pains");
        }

        //Slide 21
        Integer i = 0;
        input = cons.readLine("Type a phrase: ");

        while(i<input.length()) {
            System.out.println(input.substring(0, i));
            i++;
        }

        for(int idx = 0; idx <= input.length(); idx++) {
            System.out.println(input.substring(0, i));
        }

        //Slide 23
        String[] todo = new String[5];
        for(int pos = 0; pos < todo.length; pos++) {
            input = cons.readLine("Enter Todo task " + (pos + 1) + ": ");
            todo[pos] = input;
        }

        for (int pos = 0; pos < todo.length; pos++) {
            System.out.println("Task "+ (pos + 1) + "--> " + todo[pos]);
        }

        String strName = "NUS";
        //Slide 24
        if (args.length >0) {
            strName = args[0];
        }
        System.out.println("Hello " + strName);
    }
}
