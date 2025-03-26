package OOPS;

public class person_client {
    public static void main(String[] args)  {
        person p= new person();
        System.out.println(p.age);
        System.out.println(p.name);
        p.age=99;
        person p2= new person(); 
        p2.setAge(-5);
        System.out.println("Age of p2 is "+p2.getAge());
        p2.setName("AAA");
        System.out.println("Name of p2 is "+p2.getName());
        
    }
}
