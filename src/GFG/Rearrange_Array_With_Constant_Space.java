package GFG;

public class Rearrange_Array_With_Constant_Space {
/*
    Input:
    N = 2
    arr[] = {1,0}
    Output: 0 1
    Explanation:
    arr[arr[0]] = arr[1] = 0.
    arr[arr[1]] = arr[0] = 1.
*/

    //Without Using Extra Space
/*
   Intitution
   arr[i] = 4 +(4%5) * 5 => here 5 is size of array, and 4 is at i =0;
*/

static void arrange(long[] arr, int n){
    for(int i=0; i<n; i++) {
//        4+= arr[4%5]*5
//        =>4+= 3*5      since 4%5 = 4 and arr[4] = 3 in given example
//        =>arr[i] = 19
        arr[i] += (arr[(int)arr[i]]%n)*n;
        System.out.println(arr[i]+" ");
    }

    for(int i=0; i<n; i++){
        arr[i] = arr[i]/n;
        System.out.println(arr[i]+" ");
    }

}


//Using Extra Space
static void arranges(int[] arr, int n){
    int[] a2 = new int[n+1];
    int j = 0;
    for(int i=0;i<n;i++){
        int temp = arr[i];
        a2[j] = arr[temp];
        System.out.println(a2[j]+" ");
        j++;
    }
}

    public static void main(String[] args) {
    long[] arr = {4,0,2,1,3};
    int[] a = {4,0,2,1,3};
        arrange(arr, arr.length);
        arranges(a, arr.length);
    }
}
