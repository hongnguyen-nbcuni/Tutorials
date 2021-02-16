import java.util.ArrayList;

public class NewClass2 {

    public static void main(String[] args) 
    { 
        int ar[] = {1, 2, 3, 4, 5}; 
        for (int i=0; i<ar.length; i++) 
          System.out.println(ar[i]);        
        
        for(int m : ar){
        	System.out.println("test two : " + m); 
        }
               
        ArrayList<String> lis = new ArrayList<>(); 
        lis.add("My"); 
        lis.add("Name"); 
        System.out.println(lis.get(0)); 
        System.out.println(lis.get(1)); 
        
    } 
    
    
}
