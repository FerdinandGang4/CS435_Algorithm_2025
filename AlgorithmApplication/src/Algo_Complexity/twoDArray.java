package Algo_Complexity;

import javax.swing.plaf.IconUIResource;

public class twoDArray {

    public static void main(String[] args) {

        int[][] m2 = {
                {5, 7, 10, 12, 14},
                {56, 9, 13, 15, 18},
                {16, 17, 22, 25, 26},
                {21, 23, 27, 29, 40},
                {24, 28, 31, 35, 41}

        };

        //Search2D2(m2,4);
        Search2DV2(m2, 29);
        //  print2D(m2,4);
    }

    /*
    * (a) [6 points] Write a search algorithm “Search2D(M, key)” such that if key is
     present in the Sorted 2-D array, your algorithm will print both row and column
     numbers as a pair. If the key is not present in the Sorted 2-D array, it will print
     “Not Found”
    *
    * */
    public static void Search2D2(int[][] M, int key) {
        boolean flag = false;
        for (int r = 0; r < M.length; r++) {
            for (int c = 0; c < M[0][0]; c++) {
                int element = M[r][c];
                if (element == key) {

                    System.out.println("(" + r + "  " + c + ")");
                    flag = true;

                }

            }
        }
        if (flag == false) {
            System.out.println("Not Found");
        }
    }

    //Optimal solution
    public static void Search2DV2(int[][] m, int key) {
        System.out.println("Calling Search2DV2 ...");
        int n = m.length;
        int i = 0;
        int j = n - 1;
        boolean flag = false;
        while (i < n - 1 && j >= 0) {
            if (m[i][j] == key) {
                System.out.println(i + " " + j);
                break;
            } else if (m[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }
        if (flag == false) {
            System.out.println("Not Found!");
        }
    }
}
