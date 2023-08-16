package reverse;

public class StringReverse {
	
 public static void main(String[] args) {

			String input = "APPLE";
	        String reversed = reverseString(input);
	         System.out.println("Input: " + input);
	        System.out.println("Reversed string: " + reversed);
	    }

	    public static String reverseString(String input) {
	        char[] charArray = input.toCharArray();
	        int left = 0;
	        int right = charArray.length - 1;

	        while (left < right) {
	           
	        	// Swap characters at left and right indices
	            
	        	char temp = charArray[left];
	            charArray[left] = charArray[right];
	            charArray[right] = temp;

	           
	            // Move indices towards each other
	            
	            left++;
	            right--;
	        }

	        return new String(charArray);
	    }
	}
	




   