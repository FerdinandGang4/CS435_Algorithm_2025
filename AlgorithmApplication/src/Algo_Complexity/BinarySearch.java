package Algo_Complexity;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Hellow world");
        int[] a ={23,4,5,6,8,9,4,23};

        System.out.println(binSearch(a,3,0,a.length-1));
    }

    //Analysis of this recursive algorithm
    public static boolean binSearch(int[] arr, int x, int lower, int upper)
    {
        if(lower>upper) return false; //1
        int mid = (lower+upper)/2;    //3
        if(x ==arr[mid]) return true; //3 //this is the best case
        if(x< arr[mid])
            return binSearch(arr,x, lower,mid-1);//This for the worst case then you have atleast one recursive call
        else
            return binSearch(arr,x,mid+1, upper);

        /*
        * number of recursive calls in one iteration =1
        * number of extra work (primitive operations)
        *
        *
        * */
    }
}
