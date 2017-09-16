package com.company;

import static com.company.LAB12.lookFor;

public class Main {

    public static void main(String[] args) {
        //System.out.println(lookFor(14));
        int[] array = {0};

        System.out.println(lookFor(array)[0]);
        System.out.println(lookFor(array)[1]);
    }

    /*public static int lookFor(int max) {
        int a=1;
        int b=1;
        int result = 0;
        while(a*a + b*b <= max) {
            while (a * a + b * b <= max) {
                result ++;
                b++;
            }
            b=1;
            a++;
        }
        return result;
    }*/

}
