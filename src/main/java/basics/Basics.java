package basics;

import java.util.Scanner;

public class Basics {
    Scanner scanner = new Scanner(System.in);

    private String askEntry(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public String askUserData(){
        var entrada = askEntry("Indique su nombre o cero para salir: ");

        return !entrada.equals("0") ? entrada : null;
    }

    public void askImparNumber(){
        var entrada = askEntry("Indique un numero impar: ");

        int number = Integer.parseInt(entrada);
        var result = (number%2==0) ? true : false; //if ternario

        System.out.println(result);
    }
}
