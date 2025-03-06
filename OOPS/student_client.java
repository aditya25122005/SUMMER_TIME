package OOPS;

public class student_client {
    public static void main(String[] args) {
        student s=new student();
        s.name="Kamlesh";
        s.age=16;
        s.intro_yourself();
        student  s1=new student();
        s1.name="Rahul";
        s1.age=17;
        s1.intro_yourself();

        s.SayHey("Adi");  //Reference variable me this keyword wala and 

    }
}
