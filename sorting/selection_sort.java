package sorting;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr={5,3,4,7,1,2};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx=min_from_ith_idx(arr,i);
            if(arr[i]>arr[idx]){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
    }
    public static int min_from_ith_idx(int[] arr, int i){
        int mini=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[mini]){
                mini=j;
            }
        }
        return mini;
    }
    
}
