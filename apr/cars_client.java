package apr;

public class cars_client {
    public static void main(String[] args) {
        cars[] arr = new cars[5];
        arr[0]= new cars(200,10,"White");
        arr[1]= new cars(300,20,"Black");
        arr[2]= new cars(400,30,"Red");
        arr[3]= new cars(500,40,"Blue");
        arr[4]= new cars(600,50,"Green");
        Display(arr);

    }

    public static void Display(cars[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

}
