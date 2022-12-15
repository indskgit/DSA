package GFG;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    /*
    Given an array A of N elements.
    Find the majority element in the array.
    A majority element in an array A of size N is an element
    that appears more than N/2 times in the array.
    */
    public static void main(String[] args) {
        int[] arr = {3,2,2,2,2,1,1};
        int size = arr.length;
        System.out.println(frequencyOfElements(arr,size));
        System.out.println(freqOfElements(arr,size));
    }

    static int frequencyOfElements(int[] a, int size) {
        Arrays.sort(a);
        int count = 1;
        int majority = 0;
        int element = -1;

        if (size == 1) return a[0];

        for (int i = 1; i < size; i++) {
            if (a[i - 1] == a[i]) {
                count++;
            } else count = 1;

            if (majority < count) {
                if (count > size / 2) {
                    majority = count;
                    element = a[i];
                }
            }

        }
        System.out.println("Element "+element+" is repeated "+majority +" times which is greater than n/2");
        return element;
    }

    static int freqOfElements(int[] a, int size){
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < size; i++) {
            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1 );
            }else map.put(a[i], 1);
        }
        for (int key : map.keySet()){
            if (map.get(key)>size/3){
                ans = key;
                System.out.println("Element " + key +" is repeated "+map.get(key)+" times which is greater than size/3");
            }
        }
        return ans;
    }
}
