//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.*;

public class MostFreqRunner
{
	public static void main( String args[] )
	{		
    RayMostFreq test = new RayMostFreq();
    int[] Array1 = new int[]{-99,1,2,3,4,5,6,6,6,6,6,7,8,9,10,12345,5,5,5,5};
    
    int[] Array2 = new int[]{10,9,8,7,6,5,4,3,2,1,-99};
    
    int[] Array3 = new int[]{10,20,30,40,50,10,10,40,30,20,10};
    
    int[] Array4 = new int[]{32767};
    
    int[] Array5 = new int[]{255,255};
    
    int[] Array6 = new int[]{9,10,-88,100,-555,1000};
    
    int[] Array7 = new int[]{10,10,10,11,456,10,10,2,2,2,2,2,2,2};
    
    int[] Array8 = new int[]{-111,1,2,3,9,11,20,30};
    
    int[] Array9 = new int[]{9,8,7,6,5,4,3,2,0,-2,-989};
    
    int[] Array10 = new int[]{12,12,15,18,21,23,1000};
    
    int[] Array11 = new int[]{250,19,17,15,13,13,13,13,11,10,9,6,3,2,1,1};
    
    int[] Array12 = new int[]{9,10,-8,10000,-5000,1000};
    
    test.go(Array1);
    test.go(Array2);
    test.go(Array3);
    test.go(Array4);
    test.go(Array5);
    test.go(Array6);
    test.go(Array7);
    test.go(Array8);
    test.go(Array9);
    test.go(Array10);
    test.go(Array11);
    test.go(Array12);					
	}
}