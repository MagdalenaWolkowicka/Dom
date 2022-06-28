package obiektowe.powtorka.kompozycja;

public class BlokDemo {

    //Blok blok = new Blok();

    public static void main(String[] args) {


        Mieszkanie mieszkanie1 = new Mieszkanie(4);
        Mieszkanie mieszkanie2 = new Mieszkanie(6);
        Mieszkanie mieszkanie3 = new Mieszkanie(7);



        Mieszkanie[] mieszkania = new Mieszkanie[3];
        mieszkania[0] = mieszkanie1;
        mieszkania[1] = mieszkanie2;
        mieszkania[2] = mieszkanie3;

        Blok blok = new Blok(mieszkania);

        System.out.println(blok);
        SerwisSpoldzielni serwisSpoldzielni = new SerwisSpoldzielni();
        serwisSpoldzielni.opaclCzynsz(3);



    }
}