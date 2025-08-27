package sorting;

import apr.stack_class;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr={5,3,4,7,1,2};
        insertion_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 
    }
    public static void insertion_sort(int [] arr){
        for(int i=1;i<arr.length;i++){
            correct_last_ele(arr, i);
        }
    }
    public static void correct_last_ele(int [] arr, int i){
        int item=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>item){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=item;
    }
}
