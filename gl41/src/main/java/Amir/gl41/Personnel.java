package Amir.gl41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public final class Personnel {
	private String Nom;
	private String Prenom;
	private String fonctions;
	private DateTimeFormatter germanFormatter;
    LocalDate Date_naissance  = LocalDate.parse("24.12.2014", germanFormatter);
    private List<Integer> numero_tel;
    public static class Builder{
    	
    }
}
