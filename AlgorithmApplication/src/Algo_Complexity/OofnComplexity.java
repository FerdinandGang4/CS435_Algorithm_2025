package Algo_Complexity;

public class OofnComplexity {
    public static void main(String[] args) {

        printInteger(7);
    }

    //Time complexity is O(n) Also called linear time complexity
    public static  void printInteger(int n)
    {
        for(int i = 1; i<=n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.println(i + "  " + j);
            }

        }
    }
}
