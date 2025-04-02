package apr;

public class cars {
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

    
}
