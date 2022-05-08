abstract class Shape{
    abstract  void draw();
}
class circle extends  Shape{
    void draw(){
        System.out.println("Deaw anything you want");
    }
}
class Rectangle extends  Shape{
    void draw(){
        System.out.println("My name is aman maurya");
    }
}
class Abstract{
public static void main(String[] args){
    Rectangle r = new Rectangle();
    r.draw();
    circle c = new circle();
    c.draw();
}
}