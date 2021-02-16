
class Student 
{ 
    public int roll_no; 
    public String name; 
    
    Student(int roll_no, String name) 
    { 
        this.roll_no = roll_no; 
        this.name = name; 
    } 
} 

public class ArrayDemo2 {

	public static void main(String[] args) {
		// declares an Array of integers. 
		int[] arr; 

		// allocating memory for 5 integers. 
		arr = new int[5]; 

		// initialize the first elements of the array 
		arr[0] = 10; 

		// initialize the second elements of the array 
		arr[1] = 20; 
		arr[2] = 30; 
		arr[3] = 40; 
		arr[4] = 50; 

		// accessing the elements of the specified array 
		for (int i = 0; i < arr.length; i++) 
			System.out.println("Element at index " + i +  
					" : "+ arr[i]); 

		// declares an Array of integers. 
		Student[] studArr; 

		// allocating memory for 5 objects of type Student. 
		studArr = new Student[5]; 

		// initialize the first elements of the array 
		studArr[0] = new Student(1,"aman"); 

		// initialize the second elements of the array 
		studArr[1] = new Student(2,"vaibhav"); 
		studArr[2] = new Student(3,"shikar"); 
		studArr[3] = new Student(4,"dharmesh"); 
		studArr[4] = new Student(5,"mohit"); 

		// accessing the elements of the specified array 
		for (int i = 0; i < studArr.length; i++) 
			System.out.println("Element at " + i + " : " + 
					studArr[i].roll_no +" "+ studArr[i].name); 
			
		// declaring and initializing 2D array 
        int multiarr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
  
        // printing 2D array 
        for (int i=0; i< 3 ; i++) 
        { 
            for (int j=0; j < 3 ; j++) 
                System.out.print(multiarr[i][j] + " "); 
  
            System.out.println(); 
        } 
            
        int[][] arr2 = { { 1, 2 }, { 3, 4 } }; 
        
        for (int i = 0; i < 2; i++) 
            for (int j = 0; j < 2; j++) 
                System.out.println("arr2[" + i + "][" + j + "] = "
                                   + arr2[i][j]);    
        
        int[][][] arr3 = new int[10][20][30]; 
        arr3[0][0][0] = 1; 
  
        System.out.println("arr[0][0][0] = " + arr3[0][0][0]); 
        
        
            

	}

}
