package TheCaptain;

public class Studerende {
    //Deklarerer klassevariabler
    String stuNavn;
    int studieID;
    int alder;
    char kon; //char: efter køn, M = mand og K = kvinde


    //Constructer, der tillader "bruger" at oprette samt beskrive en ny studerende.
    Studerende(String stuNavn, int studieID, int alder, char kon) {
        this.studieID = studieID; //Giver værdierne til variablerne vi deklarerede oven over
        this.stuNavn = stuNavn;
        this.alder = alder;
        this.kon = kon;
    }

    //Tillader bruger at ændre alder
    public void setAlder(int alder) {
        this.alder = alder;
        System.out.println("Eleven "+ stuNavn + " har nu fået ændret sin alder til "+ alder+".");
    }


    //Get'ere tillader "bruger" at hente værdier.
    public int getAlder(){ //Er "public" så alle kan tilgå det. "Int": da det er et tal.
        return alder;// sender Alder tilbage til bruger når man "kalder" metoden
    }
    public int getStudieID(){
        return studieID;
    }
    public String getstuNavn(){
        return stuNavn;
    }
    public String getKon(){
        String kon1 = "Appache attack helicopter"; //Da kon er char, bliver jeg nødt til at lave en variable(kon1) af typen String.

        //Laver en if/else statment, der spørg om værdien, og udsender resultat efter hvad værdien er.
        if (kon == 'k'){
             kon1= "Kvinde";
        }else if (kon =='m'){
            kon1 = "Mand";
        }else { //else er bare en default, hvis hverken if eller else if er "rigtige".
            kon1 = "Appache attack helicopter";
        }
        return kon1;
    }

    /*Laver en metode, der tilfældigt giver studenten et fag han skal have den dag.*/
    //Opretter en array, der indholder alle fag
    String fag[] = {"Programmering.", "Systemudvikling og DataBase.", "Virksomhed."};
    //Laver et tilfældigt tal mellem 0 og 2
    int tilfTal = (int) (Math.random()*3);
    //Her tilføjer jeg det tilfældige tal til array
    String skema = fag[tilfTal];

    //Her tillader jeg brugeren at hente skemaet
    public void dagensSkema(){
        System.out.println("Idag har " + stuNavn+ " " + skema);
    }

    //En metode der simulerer vores oplevelse med intelliJ
    public void hentIntelliJ(){
        System.out.println("*Elev prøver at hente IntelliJ*");
        System.out.println("fejl");
        System.out.println("*Elev prøver at hente IntelliJ*");
        System.out.println("fejl");
        System.out.println("*Elev prøver at hente IntelliJ*");
        System.out.println("Succes, eleven har nu hentet IntelliJ");
    }







}
