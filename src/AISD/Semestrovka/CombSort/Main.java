package AISD.Semestrovka.CombSort;
import java.util.Set;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) array[i] = sc.nextInt();
        long start = System.currentTimeMillis();
        new CombSort<Integer>().sort(array, Integer::compareTo);
        for (Integer x : array) System.out.print(x + " ");

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println(" ");
        System.out.println("Прошло времени, мс: " + elapsed);
    }
}
