package sorting;

public class quick_sort {
    public static void main(String[] args) {
        int [] arr= {5,7,2,3,8,1,4};
        sort(arr,0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void sort(int [] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int idx=partition(arr, si, ei);
        sort(arr,si,idx-1);
        sort(arr,idx+1,ei);
    }
    public static int partition(int [] arr, int si, int ei){
        int item= arr[ei];
        int idx=si;
        for(int i=si;i<ei;i++){
            if(arr[i]<item){
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        int temp=arr[ei];
        arr[ei]=arr[idx];
        arr[idx]=temp;
        return idx;
    }
}
