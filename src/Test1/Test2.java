package Test1;

public class Test2 
{

	

		public static void main(String[] args) 
		{
			
			   // declare and initialize variable for output size  
	        final int size = 8;  
	        final String msg = " I love You ";  
	          
	        // nested for loop to print the upper part of Heart  
	        for (int m = 0; m < size; m++) {  
	            for (int n = 0; n <= 4 * size; n++) {  
	                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
	                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));  
	   
	                if (pos1 < size + 0.5 || pos2 < size + 0.5) {  
	                    System.out.print('*');  
	                } else {  
	                    System.out.print(' ');  
	                }  
	            }  
	            System.out.print(System.lineSeparator());  
	        }  
		}}
