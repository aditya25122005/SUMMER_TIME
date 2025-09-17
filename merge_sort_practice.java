public class merge_sort_practice {
    public static void main(String[] args) {
        int[] arr={5,7,1,4,3};
        int [] ans=Sort(arr,0,arr.length-1);
        for(int num:ans){
            System.out.println(num+" ");
        }
    }
    public static int[] Sort(int[] arr, int si, int ei){
        if(si==ei){
            int[] base= new int[1];
            base[0]=arr[si];
            return base;
        }
        int mid=(si+ei)/2;
        int[] a1= Sort(arr,si,mid);
        int [] a2= Sort(arr,mid+1,ei);
        return merge(a1, a2);
    }
    public static int[] merge(int[] arr1, int []arr2){
        int i=0;
        int j=0;
        int k=0;
        int[] ans= new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                i++;
                k++;
            }else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length){
            ans[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;
    }
}
