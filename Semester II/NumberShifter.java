import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] newRay = new int[size];
		for(int i = 0; i<size; i++){
			newRay[i] = (int)(Math.ceil(Math.random()*10));
		}
		return newRay;
	}
	public static void shiftEm(int[] array)
	{
		System.out.println(Arrays.toString(array));
		int count = 0;
		int temp = 0;
		for(int i = 0; i<array.length; i++){
			if(array[i]==7){
				temp=array[count];
				array[count]=7;
				array[i]=temp;
				count++;
			}
		}
		System.out.println(Arrays.toString(array)+"\n\n\n");
	}
}