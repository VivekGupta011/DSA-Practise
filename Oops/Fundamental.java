package Oops;


class Student{
    String name;
    int age;
    public void StudentInfo(){
        System.out.println("Ans is:"+this.name);
        System.out.println("Ans is:"+this.age);
    }
// non parameter constructor
    // Student(){
    //     System.out.println("Constructor called!");
    // }

// parameter constructor
Student(String name,int age){
    this.name=name;
    this.age=age;
} 
}
class Admission{
    String Fullname;
    
}
public class Fundamental {
    public static void main(String[] args) {
        // object
        Student pp=new Student("Vivek",27);
    
        pp.StudentInfo();
    }
    
}
