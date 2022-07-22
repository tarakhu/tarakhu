package com.by;

public class TestClass {
    public static void main(String[] args) {
        //однострочный комментарий
        /*
        многострочный комментарий
         */
        /**
         * документационный комментарий
         */
        //TODO: туду
        int t = 7, e = 74, j;
        e-= 17;
        System.out.println("e: " + e);
        t+= 4;
        System.out.println("t: " + t);
        byte b = 13;
        b++; // b = b + 1



        System.out.println(b);

        short s = 137;
        s--; //s = s - 1
        System.out.println(s);
        char c = 'c';
        int i = 453456;
        long l = 24563566776L;
        int p = 13 % 2;
        System.out.println("p: " + p);
        float f = 1.755F, g;
        double d = 154.5667;

        boolean o = true;

        long result1 = i + s;
        double result2 = l - d;
        double result3 = f * d;
        boolean result4 = l > d;
        boolean result5 = f < i;

        System.out.println();//вывод чего либо в консоль

        System.out.println(result1 + result2);
        System.out.println("hgfuh" + "jhb");
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println("com.by.TestClass");


        boolean jojo = f == d;
        boolean joj = f != d;
        boolean jo = !jojo;
        boolean j = f > d;
        boolean hj = i >= d;
        boolean jk= s <= d;





    }
}
