package Amir.gl41;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<String> numero_tel = new ArrayList<String>();
    	numero_tel.add("06 78 67 65 67");
    	numero_tel.add("06 79 57 25 47");
    	Personnel marc = new Personnel.Builder("Ilya", "Arshavinn", "batal", LocalDate.of(1991, 9, 12),numero_tel).build();
    	marc.print();
    }
}
