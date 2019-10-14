package zadanie5;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;

public class Main {
//    Wypełnij wartościami tablicę 10-ciu rzutów. Następnie wyznacz
//    prawdopodobieństwo wyrzucenia każdego z oczek i wstaw do drugiej tablicy (wartość oczka
//odpowiada pozycji elementu, np. 1 odpowiada indeksowi 0 tablicy).

    public static void main(String[] args) {
        int tablica[] = new int[10];
        double prawdopod[]=new double[6];
        for (int i = 0; i < tablica.length; i++) {
            int rzut=rzutKostka();
            tablica[i] = rzut;
            prawdopod[rzut-1]+=1;
        }
        prawdopod = DoubleStream.of(prawdopod).map(p->p/10).toArray();
        System.out.println(Arrays.toString(tablica));
        System.out.println(Arrays.toString(prawdopod));

    }

    public static int rzutKostka() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

}
