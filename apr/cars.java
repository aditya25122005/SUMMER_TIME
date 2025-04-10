package apr;

public class cars implements Comparable<cars> {
    int price;
    String color;
    int speed;

    public cars(){

    }
    public cars(int price, int speed, String color){
        this.price= price;
        this.speed = speed;
        this.color = color;
    }
    public String toString(){
        return "Price: " + price  + " Color: " + color + " Speed:"+ speed;
    }
    @Override
    public int compareTo(cars o) {
        // TODO Auto-generated method stub
        return this.price-o.price;
    
    }

    
}
