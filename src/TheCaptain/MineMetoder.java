package TheCaptain;

import java.util.Scanner;//Her importer jeg klassen Scanner, bliver brugt linje 26

public class MineMetoder {
    /* String*/
    //En String er en klasse, der består af en masse char's.
    //Brug:
    String navn = "Mads Nielsen"; // "String":beskriver variabletype. "navn": navnet på variablen. "=": Siger den er lig med. "Mads Nielsen" er værdien.
    //Her bliver den kaldt.
    public String getNavn(){
        return navn;
    }

    /* Math.random*/
    //Bliver også brugt i Studerende.java, linje 44.
    //Brug:
    public double getRandom() {
        //Laver et tal mellem 0.0...01 og 0.9...99. Her efter kan man så gange det med et tal, for at ændre hvad den går til og sætte (int) ind foran for at runde det ned til nærmeste int.
        //f.eks. "(int) Math.random()*6", ville give et tal mellem 0 og 5.
        return Math.random();
    }

    /*Scanner*/
    //Her laver jeg en ny Scanner "klasse", der tilader mig at kalde funktioner(input fra bruger) ala. nextInt().
    Scanner input = new Scanner(System.in);
    //Her tillader jeg brugeren at hente "min funktion".
    public void skrivTal() {
        System.out.println(" ");
        System.out.println("Skriv et tal, og tryk enter: ");
        //Her deklarere en int, der bliver initierer ved næste int+enter.
        int ts = input.nextInt();
        //Her printer den tallet, der blev skrevet oven over.
        System.out.println("Tallet du skrev: "+ts);
    }

    /*Løkker*/
    //Her tillader jeg bruger at hente funktionen
    public void loekker() {
        //Her laver jeg en variable og giver den en værdi. Det skal gøres når man arbejder med "while" løkker.
        int i = 0;
        // i "while" løkken skriver man først while, efterfulgt af hvor langt tid den skal gøre det f.eks. (i<10)
        while(i<10){
            System.out.print("  ");
                //I "for" løkken, laver man både variablen, hvor langt tid den skal køre og hvor meget der skal lægges til i "()".
                for(int j= 0; j<10;j++){
                    System.out.print("-");
                }
            System.out.println("");
            // til "while" løkken. Her beskriver man hvor meget der skal lægges til.
            i++;
        }
    }
    /*Enums*/
    //enums er konstanter, der ikke burde ændres, som f.eks. ugens dage, mdr, alfabetet.
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }
    //Her tillader jeg bruger at hente funktionen
    public void getDay(){
        //Her printer den bare Saturday, men et godt brug, ville være ligesom det vi lavede på klassen med switch og ugedage, eller et kompass.
        System.out.println(Day.SATURDAY);
    }
}

