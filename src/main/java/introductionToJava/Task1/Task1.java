package introductionToJava.Task1;

import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(0, 2000); //это кидалка случайных чисел!)

        int n = Integer.toBinaryString(i).length();

        int max = Short.MAX_VALUE;
        int[] m1 = new int[0];
        int count1 = 0;
        for (int j = i; j < max; j++) {
            if (j % n == 0) {
                int[] tmp = new int[1+m1.length];
                if (tmp.length > 1) {
                    for (int k = 0; k < m1.length; k++) {
                        tmp[k] = m1[k];
                    }
                }
                tmp[count1] = j;
                count1++;
                m1 = tmp;
            }
        }

        int min = Short.MIN_VALUE;
        int[] m2 = new int[0];
        int count2 = 0;
        for (int j = i; j > min; j--) {
            if (j % n != 0) {
                int[] tmp = new int[1+m2.length];
                if (tmp.length > 1) {
                    for (int k = 0; k < m2.length; k++) {
                        tmp[k] = m2[k];
                    }
                }
                tmp[count2] = j;
                count2++;
                m2 = tmp;
            }
        }        
    }
}





