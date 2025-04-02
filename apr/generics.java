package apr;

public class generics {
    public static void main(String[] args) {
        
    
    Integer[] arr={10,20,40,4,60};
    Display(arr);
    String[] arr1={"kaju","raju","ram","shyam"};
    Display(arr1);
    System.out.println(get(arr1));
    }
    
    public static <T>void Display(T[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }
    public static <T> T get(T[] arr) {
        return arr[0];
    }
}
