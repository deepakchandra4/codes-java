import java.awt.*;
public class AwtProgram extends Frame{
    
    Panel p1,p2;
    Label l1, l2;
    AwtProgram(){
        p1 = new Panel();
        l1 = new Label("red is blood");
        p1.add(l1);
        l2 = new Label("Blue is Sky");
        p1.add(l2);
        add(p1);
    }
    
}
























/*import java.awt.*;
public class AwtProgram extends Frame{
    AwtProgram(){
        Frame f = new Frame();
        Button b = new Button("Submit");
        TextField t = new TextField();
        Label l = new Label("User Name : ");
        l.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);
        f.add(b);
        f.add(l);
        f.add(t);
        f.setSize(500,400);
        f.setTitle("BBD info. ");
        f.setLayout(null);
        f.setVisible(true); 
    }
    public static void main(String[] args){
        AwtProgram a = new AwtProgram();
    }
}*/