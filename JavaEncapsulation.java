/* 
 * Encapsulation : 
 * make sensitive data hidden from the user.
 * to access private class through get and set methods.
 * flexible : change a part of code without effecting other one.
 * better control of class attributes and methods.
 * Increased security of the data.
 * Classes attribute can be make read only(if we use only get method) or write only(if we use ony set method).
 */

public class JavaEncapsulation {
    private String name;

    public String getName(){
        return name;
    };

    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String args[]){
        JavaEncapsulation je = new JavaEncapsulation();
        je.setName("Deepak");
        System.out.println(je.getName());
    }
}


