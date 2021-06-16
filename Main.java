package com.metanit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
public class Main {

    public static void main(String[] args) {
        List<Integer> studients = new ArrayList();

        for (int i = 0; i < 10; i++) {
            studients.add(ThreadLocalRandom.current().nextInt(1, 10));


        }
        System.out.println("Marks before sorting"  + studients);
        studients.removeIf(i -> (i < 7));
        System.out.println("Marks after sorting" + studients);

    }
}
