package zadanie2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

            Random r = new Random();
            String haslo = "hasaaqwrslo";
            StringBuilder zgadnij = new StringBuilder();
            String zgadnijS = zgadnij.toString();
            char hasloTab[] = haslo.toLowerCase().toCharArray();
            char alfabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'x', 'y', 'z'};
            Random rand = new Random();
            ArrayList<Integer> list = getIntegers(alfabet);
            for (int i = 0; !haslo.equals(zgadnijS); i++) {
                Collections.shuffle(list);
                char litera = alfabet[list.get(i)];
                for (int n = 0; litera != hasloTab[i]; n++) {
                    litera = alfabet[list.get(n)];
                }
                zgadnij.append(litera);
                zgadnijS = zgadnij.toString();
            }
            System.out.println(zgadnijS.toUpperCase());
        }

    private static ArrayList<Integer> getIntegers(char[] alfabet) {
        ArrayList<Integer> list = new ArrayList<Integer>(alfabet.length);
        for (int i = 0; i < alfabet.length; i++) {
            list.add(i);
        }
        return list;
    }


}

