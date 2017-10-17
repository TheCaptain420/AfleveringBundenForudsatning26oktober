package TheCaptain;
//^ Package indeholder alle mine klasser og tillader mig at have mine egne variabel navne, uden at de korrigere med andres variabelnavne

//Mads Nielsen @TheCaptain420
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Laver en ny variable der indeholder klassen DatHoldet
        DatHoldet dat17 = new DatHoldet();
        //Kalder metoden der printer alle navne fra DatHoldet
        dat17.alleStu();

        System.out.println(" ");

        //Kalder metoden "dagensSkema" fra studerende.java
        dat17.mads.dagensSkema();
        //Henter alderen på Mads
        System.out.println(dat17.mads.getAlder());
        //Ændrer alleren på Mads
        dat17.mads.setAlder(21);
        //Printer alder igen, efter den er blevet ændret
        System.out.println(dat17.mads.getAlder());
        //Printer al info på mads
        System.out.println("Eleven "+dat17.mads.getstuNavn()+ " er "+dat17.mads.getAlder()+" år gammel. Personens StudieID nummer er "+ dat17.mads.getStudieID()+" og personen er af kønnet "+ dat17.mads.getKon());


        System.out.println(" ");

        //Her printer den MineMetoder
        MineMetoder testMetoder = new MineMetoder();
        System.out.println(testMetoder.getNavn());
        System.out.println(testMetoder.getRandom());
        testMetoder.skrivTal();
        testMetoder.loekker();
        testMetoder.getDay();



    }
}
