package OOPS;

public class student1 {
    String name;
    int age;

    public void Introduce_yourself(){
        System.out.println("name:"+ this.name+" "+"age "+this.age );
        
    }
    public void SayHey(String name){
        System.out.println(this.name+" Say hey "+name);
    }
    // static block always executes first
    static{
        // cannot use non-static method in static block 
        // can use static method in non-static block
        System.out.println("I am in student_client1");
    }
}
