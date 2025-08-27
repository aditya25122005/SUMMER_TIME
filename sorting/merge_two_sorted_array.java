package sorting;

public class merge_two_sorted_array {
    public static void main(String[] args) {
        int [] arr1={2,3,4,5,7,8,11};
        int [] arr2={1,2,5,6,9,11,13,14};
        int []ans=Merge(arr1, arr2);
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
    public static int[] Merge(int[] arr1,int [] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int [] ans= new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;

    }
}
