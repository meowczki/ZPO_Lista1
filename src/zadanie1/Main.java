package zadanie1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(podatek(91000));
    }

    public static double podatek(double dochod) {
        List<Prog> lista = new ArrayList();
        lista.add(new Prog(0, 11000));
        lista.add(new Prog(0.25, 11000, 18000));
        lista.add(new Prog(0.35, 18000, 31000));
        lista.add(new Prog(0.42, 31000, 60000));
        lista.add(new Prog(0.48, 60000, 90000));
        lista.add(new Prog(0.5, 90000, 1000000));
        lista.add(new Prog(0.55, 1000000));

        if (dochod < (lista.get(0)).getProg1()) {
            return lista.get(0).getProcent() * dochod;
        }
        for (int i = 1; i < lista.size() - 1; i++) {
            if ((dochod > lista.get(i).getProg1()) && (dochod < lista.get(i).getProg2())) {
                return lista.get(i).getProcent() * dochod;
            }
        }
        if (dochod > lista.get(lista.size() - 1).getProg1()) {
            return lista.get(6).getProcent() * dochod;
        } else {
            return 0;
        }


    }
}