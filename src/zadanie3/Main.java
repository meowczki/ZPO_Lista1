package zadanie3;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

public static void main(String[] args) {
    String str=". Ola ma, kota,ala Bla bla ";
    str = str.replaceAll("\\.", " ");
    str = str.replaceAll(",", " ");
    str = str.trim().replaceAll(" +", " ");
    String[] words = str.split(" ");
    for(int i=0;i<words.length;i++){
        if(words[i].matches("^[bcdfghjklmnpqrstwvxyz].*")) {
            words[i]=words[i]+"ay";
            StringBuilder myString = new StringBuilder(words[i]);
            myString.deleteCharAt(0);
            words[i]= myString.toString();
        }
        else if(words[i].matches("^[aeiou].*")) {
            words[i]=words[i]+"way";
        }
    }
    //konwertowanie tablicy na strumien
    Stream<String> stream = Arrays.stream(words);
    stream.forEach(slowa -> System.out.print(slowa + " "));

}

}
