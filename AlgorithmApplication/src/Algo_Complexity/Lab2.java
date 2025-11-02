package Algo_Complexity;

public class Lab2 {

    public static void main(String[] args) {
     int[] a = {1,77,41,10,50};
     int[] b = {7, 20, 18, 4, 20, 19, 20, 3};
        System.out.println(getThirdMaxb2(a));
    }

    //first solution
    public static int getThirdMax(int[] arr) {
        int max = arr[0];
        int secondMax = max;
        int thirdMax = max;
        int indexOfMax =0;
        int indexOfPremax =0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                indexOfMax =i;
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>=secondMax &&  i!=indexOfMax)
            {
                secondMax=arr[i];
                indexOfPremax = i;
            }
        }
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>=thirdMax &&  i!=indexOfPremax && i!= indexOfMax)
            {
                thirdMax=arr[i];
            }
        }
        System.out.println("firstMax: " + max + ""
                + " secondMax: " + secondMax + " " + " thirdMax: " + thirdMax);

        return thirdMax;
    }



    public static int  getThirdMaxb(int[] arr)
    {
       int  max =arr[0] , preMax= arr[0], prePreMax = arr[0];
       int flag =0;
       while (flag<arr.length)
       {
           if(arr[flag]> max)
           {
               prePreMax =preMax;
               preMax =max;
               max =arr[flag];
           }
           else if(arr[flag] >preMax && arr[flag]<=max)
           {
               prePreMax =preMax;
               preMax =arr[flag];
           }
           else if(arr[flag] > prePreMax && arr[flag]<=preMax)
           {
               prePreMax =arr[flag];
           }
           flag++;
       }
        System.out.println( "max: " + max + " " + " Pre Max: " + preMax + " Pre pre Max: " + prePreMax);
       return  prePreMax;
    }

    public static int  getThirdMaxb2(int[] arr)
    {
        int  max =arr[0] , preMax= arr[0], prePreMax = arr[0];
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]> max)
            {
                prePreMax =preMax;
                preMax =max;
                max =arr[i];
            }
            else if(arr[i] >preMax && arr[i]<=max)
            {
                prePreMax =preMax;
                preMax =arr[i];
            }
            else if(arr[i] > prePreMax && arr[i]<=preMax)
            {
                prePreMax =arr[i];
            }
        }
        System.out.println( "max: " + max + " " + " Pre Max: " + preMax + " Pre pre Max: " + prePreMax);
        return  prePreMax;
    }
}

