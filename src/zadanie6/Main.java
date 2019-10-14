package zadanie6;

import java.util.Arrays;
import java.util.Random;

public class Main {
//    Napisz program, w którym zaimplementujesz metodę zwracającą ślad macierzy
//    kwadratowej. Ślad macierzy jest wyznaczany jako suma elementów na głównej przekątnej
//    macierzy kwadratowej. W tym celu wygeneruj macierz liczb całkowitych z zakresu [-10, 5].
public static void main(String[] args) {
    int macierz[][]=macierz();
    System.out.println(Arrays.deepToString(macierz));
    System.out.println(sladMacierzy(macierz));
}
public static int sladMacierzy(int [][]array){
        int suma = 0;
        for (int i = 0; i < array.length; i++)
        {
            suma += array[i][i];
        }
        return suma;

}
public static int[][] macierz(){
    Random rand= new Random();
int array[] []=new int[10][10];
    for(int i=0;i<array.length;i++){
        for(int n=0;n<array[0].length;n++){

            array[i][n]= rand.nextInt((5 -(-10) ) + 1) + 5;
        }
    }
    return array;
}
}
