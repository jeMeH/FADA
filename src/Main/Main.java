package Main;

import java.util.LinkedList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jefferson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        int n = 100;
        int n = Integer.parseInt(args[0]);
//            int n = 125;
        long t0 = 0;
        long t1 = 0;

        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();

        boolean a2[] = new boolean[n];
        boolean b2[] = new boolean[n];


        long a3[] = new long[n];
        long b3[] = new long[n];


        for (int i = 0; i < 64; i++) {
            a.add(i);
            b.add(i);
        }

        for (int z = 0; z < n / 64; z++) {
            for (int i = 0; i < 64; i++) {
                a3[z] = a3[i] | 1 << i;
                b3[z] = a3[i] | 1 << i;
            }
        }
        for (int i = 0; i < n; i++) {
            a2[i] = false;
            b2[i] = false;
        }
        for (int i = 0; i < n; i++) {
            a2[i] = true;
            b2[i] = true;
        }
        String msj = "";
        //linkedList
//        t0 = System.nanoTime();
//        Set.isEqual(a, b);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.isEmpty(a);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//
//        t0 = System.nanoTime();
//        Set.isSubSet(a, b);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.isDisjunct(a, b);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.intersect(a, b);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.diference(a, b);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.junction(a, b);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";

        //boolean
//        t0 = System.nanoTime();
//        Set.isEqual(a2, b2);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";

//        t0 = System.nanoTime();
//        Set.isEmpty(a2);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//
//        t0 = System.nanoTime();
//        Set.isSubSet(a2, b2);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.isDisjunct(a2, b2);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.intersect(a2, b2);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.diference(a2, b2);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
        t0 = System.nanoTime();
        Set.junction(a2, b2);
        t1 = System.nanoTime();
        msj += t1 - t0 + " ";

        //binario
//        t0 = System.nanoTime();
//        Set.isEqual(a3, b3);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";

//        t0 = System.nanoTime();
//        Set.isEmpty(a3);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//
//        t0 = System.nanoTime();
//        Set.isSubSet(a3, b3);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.isDisjunct(a3, b3);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
////
//        t0 = System.nanoTime();
//        Set.intersect(a3, b3);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.diference(a3, b3);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";
//
//        t0 = System.nanoTime();
//        Set.junction(a3, b3);
//        t1 = System.nanoTime();
//        msj += t1 - t0 + " ";

//        }
        System.out.print(msj + "\n");
    }
}
