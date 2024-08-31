public class JavaConstructor {
    int totalAgent;
    String agentRole;
    public JavaConstructor(int total , String role ){
        totalAgent = total ;
        agentRole = role ;
    }

    public static void main (String args[]){
        JavaConstructor jc = new JavaConstructor(10 , "Duelist");
        System.out.println(jc.agentRole + " " + jc.totalAgent);
    }
}
