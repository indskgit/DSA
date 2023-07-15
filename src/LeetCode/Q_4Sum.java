package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q_4Sum {

    //Brute Force T.C = O(n^4)
    static List<List<Integer>> fourSumBrute(int[] a, int target) {
        int n = a.length;

        Arrays.sort(a);
        HashSet<List<Integer>> hs = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k <n; k++) {
                    for (int l = k+1; l < n; l++) {
                         if (a[i]+a[j]+a[k]+a[l] == target){
                             hs.add(Arrays.asList(a[i],a[j],a[k],a[l]));
                         }
                    }
                }
            }
        }
        res.addAll(hs);
        return res;
    }



    //Optimal Approach --> T.C = O(n^2+log(n));
    static List<List<Integer>> fourSumOptimal(int[] b,int target){

        List<List<Integer>> ans = new ArrayList<>();
        int n = b.length;
        Arrays.sort(b);

        for(int i = 0; i<n;i++){
            if(i>0 && b[i] == b[i-1]) continue;
            for(int j = i+1;j<n;j++){
                if(j!=(i+1) && b[j] == b[j-1]) continue;
                int k = j+1;
                int l = n-1;

                while(k<l){
                    long sum = b[i];
                    sum+= b[j];
                    sum+= b[k];
                    sum+= b[l];
                    if( sum == target){
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(b[i]);
                        temp.add(b[j]);
                        temp.add(b[k]);
                        temp.add(b[l]);
                        if(!ans.contains(temp)) ans.add(temp);
                        k++;
                        l--;
                        while(k<l && b[k] == b[k-1])k++;
                        while(k<l && b[l] == b[l+1])l--;
                    }else if(sum< target) k++;
                    else l--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,0,-1,0,-2,2};
        int target = 0;

        System.out.println(fourSumBrute(arr, target));
        System.out.println(fourSumOptimal(arr, target));
    }
}
