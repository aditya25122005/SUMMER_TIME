package apr;
import java.util.*;
public class cars_client {
    public static void main(String[] args) {
        cars[] arr = new cars[5];
        arr[0]= new cars(200,10,"White");
        arr[1]= new cars(300,20,"Black");
        arr[2]= new cars(400,30,"Red");
        arr[3]= new cars(500,40,"Blue");
        arr[4]= new cars(600,50,"Green");
        // Arrays.sort(arr);
        Arrays.sort(arr, new Comparator<cars>() {
            @Override
            public int compare(cars o1, cars o2) {
                return o1.price - o2.price;
            }
        });
        
        Sort(arr);
        Display(arr);
    }

    public static void Display(cars[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
   
    public static <T extends Comparable<T>> void Sort(T[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length - turn; i++) {
				if (arr[i].compareTo(arr[i+1])>0) {
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;  
				}
			}

		}
	}

}
