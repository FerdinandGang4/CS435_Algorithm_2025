package Algo_Complexity;

import javax.swing.plaf.PanelUI;

public class Lab1Exercise1 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 7};
        System.out.println(method2(arr1));

    }

    public static int method2Opposite (int[] arr)
    {
        int total =0;

        for(int num :arr)
        {
            total += (num%2 !=0?1:0 ) +(num%3 !=0?1:0) + (num%5 !=0?1:0)
                    + ((num%2 !=0 && num%3 !=0  && num%5 !=0)?1:0);
        }

        return (total == arr.length)?1:0;
    }

    public static int method2 (int[] arr)
    {

        int total =0;

        for(int num :arr)
        {
            total += (num%2 ==0?1:0 ) +(num%3 ==0?1:0) + (num%5 ==0?1:0)
                    + ((num%2 !=0 && num%3 !=0  && num%5 !=0)?1:0);
        }

        return (total == arr.length)?1:0;
    }

}
