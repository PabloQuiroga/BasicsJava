package basics.colors;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeerEntrada {

    public static List<DataColor> leerDatos(Scanner s){
        List<DataColor> data = new ArrayList<>();
        while (s.hasNextLine()){
            String line = s.nextLine();
            String[] dato = line.split(":");
            String name = dato[0];
            String value = dato[1];

            DataColor leido = new DataColor();
            leido.setName(name);
            leido.setValue(value);
            data.add(leido);
        }
        return data;
    }

    private static File getFileFromResources(String filename) throws URISyntaxException {
        URL url = LeerEntrada.class.getClassLoader().getResource(filename);
        return new File(url.toURI());
    }

    //only for demo
    public static void main(String[] args) throws Exception {
        String fileName = "Colors.txt";

        Scanner s = new Scanner(getFileFromResources(fileName));
        System.out.println(leerDatos(s));
    }
}
