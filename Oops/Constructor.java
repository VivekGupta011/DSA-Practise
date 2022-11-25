package Oops;
public class Constructor {
// Types of Constructor
// In Java, constructors can be divided into 3 types:
// No-Arg Constructor
// Parameterized Constructor
String language;
Constructor(String lang){
    language=lang;
    System.out.println(language+" Your First Language");
}

Constructor(){
    System.out.println("This is constructor which having no body");
}
// Default Constructor

// class ConstructorTesting{

// }
    public static void main(String[] args) {
        Constructor p=new Constructor("Javascript");
        Constructor pp=new Constructor("Python");
        Constructor ppp=new Constructor();

        
    }
    
}
