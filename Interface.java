interface Shape{
    void draw();
    int i = 100;
    int a = 20;
    String d = "Drawing ";
}
class Circle implements Shape{
    public void draw(){
        System.out.println(d+ "circle " +i+ " times in "+a+ " Pages ");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println(d+ "rectangle " +i+ " times in "+a+ " Pages");
    }
}    
class Interface{    
public static void main(String[] args){
    Circle c = new Circle();
    c.draw();
    Rectangle r = new Rectangle();
    r.draw(); 
}    
}