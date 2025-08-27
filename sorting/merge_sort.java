package sorting;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr={5,7,1,4,3};
        int[] ans=sort(arr, 0, arr.length-1);
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
    public static int[] sort(int[] arr, int si, int ei){
        if(si==ei){
            int[] base= new int[1];
            base[0]=arr[si];
            return base;
        }
        int mid=(si+ei)/2;
        int[] one= sort(arr, si, mid);
        int[] two=sort(arr, mid+1, ei);
        return Merge(one, two);
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
