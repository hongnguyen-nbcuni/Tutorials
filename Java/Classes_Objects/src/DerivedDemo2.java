// Java program to illustrate the  
// concept of Multilevel inheritance 

class one 
{ 
    public void print_one() 
    { 
        System.out.println("one"); 
    } 
} 
  
class two extends one 
{ 
    public void print_two() 
    { 
        System.out.println("two"); 
    } 
} 
  
class three extends two 
{ 
    public void print_three() 
    { 
        System.out.println("three"); 
    } 
} 
  
// Derived class 
public class DerivedDemo2 
{ 
    public static void main(String[] args) 
    { 
        three g = new three(); 
        g.print_three(); 
        g.print_two(); 
        g.print_one(); 
             
        two g2 = new three();
        g2.print_one();
        g2.print_two();
        

    } 
}
