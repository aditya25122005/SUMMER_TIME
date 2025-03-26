package OOPS;

public class person {
    String name="raj";
    int age=20;
    public person(){
 
    }
    public person(String name, int age){
         this.name=name;
         this.age=age;
    }
    public void setAge(int age){ // throws Exception{
        try{
            if(age<0){
                throw new Exception("Age cannot be negative");
            }
            this.age=age;
        }
        catch(Exception e){
            e.printStackTrace();
            }
        finally{
            System.out.println("Finally");
        }    
        // if(age<0){
        //     throw new Exception("Age can't be negative");
        // }
        // this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

}
