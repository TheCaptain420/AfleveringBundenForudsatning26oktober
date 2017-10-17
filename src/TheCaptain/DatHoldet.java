package TheCaptain;


public class DatHoldet {
    //Laver her 4 studerende, der alle bliver hentet fra klassen Studerende.
    Studerende mads = new Studerende("Mads",45454545,20,'m');
    Studerende jensine = new Studerende("Jensine",45555545,23,'k');
    Studerende hans = new Studerende("Hans",48888545,15,'m');
    Studerende grete = new Studerende("Grete",48881235,45,'k');

    //Laver en metode der printer navne på alle elever
    public void alleStu(){
        System.out.println("Denne klasse har følgende elever:");
        System.out.println(mads.stuNavn);
        System.out.println(jensine.stuNavn);
        System.out.println(hans.stuNavn);
        System.out.println(grete.stuNavn);
    }
}
