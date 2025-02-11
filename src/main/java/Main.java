import basics.printFormat.Color;
import basics.printFormat.Decorators;
import basics.printFormat.Enfasis;
import basics.printFormat.Formato;

public class Main {

    public static void main(String[] args) {
        showInitMessage();
    }

    private static void showInitMessage(){
        // Format message
        // más combinaciones en https://en.wikipedia.org/wiki/ANSI_escape_code
        final Formato formato = new Formato(Color.MAGENTA, Decorators.CURSIVA, Enfasis.BRILLANTE);

        System.out.println(formato + "/*************/");
        System.out.println(formato + "/** Running **/");
        System.out.println(formato + "/*************/" + Formato.RESET);
    }
}
