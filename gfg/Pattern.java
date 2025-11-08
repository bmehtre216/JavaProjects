package gfg;

import java.util.ArrayList;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int n = 3;  // You can change this to any number

        for (int i = 0; i < n; i++) {
            

            // Print numbers with repetitions
            for (int j = n; j >= 1; j--) {
                for (int k = i; k < n; k++) {
                    System.out.print(j + " ");
                }
            }

            System.out.print("-1 "); // Next line
        }
        
    }
}

