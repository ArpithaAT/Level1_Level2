package Addtwonumber;

public class Addtwonumber {

		
		    public static void main(String[] args) {
		        int a = 8;
		        int b = 5;
		        int sum = addtwonumber(a, b);
		     
		        System.out.println("Sum: " + sum);
		    }
            public static int addtwonumber(int a, int b){
		        while (b != 0) {
		            int carry = a & b; 
		            a = a ^ b;  
		            b = carry << 1; 
		        }
		        
		        return a;
		    }
		

}
