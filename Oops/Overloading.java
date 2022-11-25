package Oops;

class Shape{
    String Triangle;
     int nums;
     void RadiusChecker(int nums){
        System.out.println((3.14)*nums*nums);
    }
}
class MyTriangle extends Shape{
     void RadiusChecker(int nums){
        System.out.println((3.14)*nums*nums);
    }
}

public class Overloading {
    public static void main(String[] args) {
        MyTriangle pp=new MyTriangle();
        Shape pq=new Shape();
        pq.nums=15;
        pp.RadiusChecker(99);
        
    }
}
