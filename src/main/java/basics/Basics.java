package basics;

import java.util.Scanner;

public class Basics {
    Scanner scanner = new Scanner(System.in);

    private String askEntry(String message){
        System.out.print(message);
        return scanner.nextLine();
    }

    /*
    Exposed methods
     */

    public String askUserData(){
        var entrada = askEntry("Indique su nombre o cero para salir: ");

        return !entrada.equals("0") ? entrada : null;
    }

    public void askImparNumber(){
        var entrada = askEntry("Indique un numero impar: ");

        int number = Integer.parseInt(entrada);
        //(number%2==0) ? true : false; //if ternario
        System.out.println(number%2 != 0);
    }


}
