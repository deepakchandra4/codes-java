import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;

public class JavaLists {

    //This is Array List functions 

    public void arrayListmethod() {
        ArrayList<String> valorant = new ArrayList<String>();
        valorant.add("Agents");
        valorant.add("Guns");
        valorant.add("modes");
        valorant.add("ranks");
        System.out.println("<---------Sorted ArrayList--------->");
        // for(int i=0; i<=valorant.size(); i++){
        //     System.out.println(valorant.get(i));
        // }
        Collections.sort(valorant);
        for(String i : valorant){
            System.out.println(i);
        }

        System.out.println("<-------Reverse Sorted ArrayList------>");
        Collections.sort(valorant , Collections.reverseOrder());
        for(String i : valorant){
            System.out.println(i);
        }
    }
    
    //This is Linked List Methodd/function

    public void linkedListmethod(){
        LinkedList<String> agents = new LinkedList<String>();
        agents.addFirst("Sova");
        agents.addFirst("Reyna");
        agents.addLast("Jett");
        // agents.getFirst();
        Collections.sort(agents);
        System.out.println("<-------------Linked List------------->");
        for(String i : agents){
            System.out.println(i);
        }
    }

    // This is Hashmap Function/Method 

    public void hashMapMethod(){
        HashMap<String , String> abilities = new HashMap<String , String>();
        abilities.put("Killjoy", "Sentinel");
        abilities.put("Sage" , "Sentinel");
        abilities.put("jett" , "Duelist");
        System.out.println("<-----------HashMap---------->");
        System.out.println("===================================");
        System.err.println("<--------Keys------>");
        for(String i : abilities.keySet()){
            System.out.println(i);
        }
        System.out.println("===================================");

        System.err.println("<----Values------>");
        for(String i : abilities.values()){
            System.out.println(i);
        }
        System.out.println("===================================");

        System.err.println("This is the key and values");
        for(String i : abilities.keySet()){
            System.out.println(i + " : "+ abilities.get(i));
        }
    }


    //This is HashSet Method/Functions : it stores unique items as an object.
    //it does not output same value multiple times store : as it store uniques values only


    public void hashSetMethod(){
        HashSet<Integer> numbers = new HashSet<Integer>();
        System.out.println("===================================");
        System.out.println("<----------HashSet-------->");
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(11);
        for(int i = 1; i <= 10 ; i++){
            if(numbers.contains(i)){
                System.out.println(i + ": Found");
            }else{
                System.out.println(i + ": Not Found");
            }
        }
    }

    //Iterators
        
    

    public static void main(String[] args){
        JavaLists jl = new JavaLists();
        // jl.arrayListmethod();
        // jl.linkedListmethod();
        // jl.hashMapMethod();
        jl.hashSetMethod();
    }
}