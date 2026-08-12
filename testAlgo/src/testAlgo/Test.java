package testAlgo;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int random[];
		
		//because range is: 10 - 50; input has to be atleast 10, and no bigger than 40
		random = new int[40];
	      for (int i = 0; i < 40; i++)  //capped at 40, because 40 + 10 = 50 (which is the max input range)
	      {
	    	  random[i]=i+10; //atleast 10
	      }
	      randomize(random,40);
	      
	}

	
	// Randomize the array of number between 10-50  
	   static void randomize( int arr[], int size) 
	    { 
		   //  write your code here
		   Random r = new Random();
		   for(int i = 0; i<arr.length;i++) {
			    arr[i] = r.nextInt();
		   }
	    }
}
