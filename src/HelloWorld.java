import com.unia.common.Neofit;
import com.unia.common.Person;
import com.unia.process.PersonProcessor;

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        Neofit[] neofits = new Neofit[5];
        Date birth = new Date();
        PersonProcessor pp = new PersonProcessor();
        neofits[0] = pp.createNeofit("Болдрик", "Дорф", birth,"говночерпий");
        neofits[1] = pp.createNeofit("Франк", "Могучий", new Date(), "пикенер");
        neofits[2] = pp.createNeofit("Лютар", "Толстый", new Date(), "барабанщик");
        neofits[3] = pp.createNeofit("Акил","Вандервинд", new Date(), "рыцарь");
        neofits[4] = pp.createNeofit("Кастен","Пьяный", new Date(), "артиллерист");

        //for (int i = 0; i < neofits.length; i++) {

       // }

        //for (Neofit neofit : neofits) {

        //}
        int i = 0;
        while (i< neofits.length) {
            Neofit n = neofits[i];
            System.out.println("наемник "+ n.getFirstName() + " " + n.getLastName() + " " + n.getWork());
            i ++;

        }


    }




    private void test() {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("Hello World!");

    }
}

