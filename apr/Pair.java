package apr;
public class Pair<T, P>{
   T x;
   P y;

   public Pair(T x, P y){
    this.x=x;
    this.y=y;
   }
   public T getx(){
    return x;
   }
   public static void main(String[] args) {
    Pair<Integer, String> p = new Pair<Integer, String>(10, "Hello");
    Pair<String, Boolean > p2= new Pair<String, Boolean>("ABC",false);
    
   }

}