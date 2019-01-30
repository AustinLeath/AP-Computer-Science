
public class Fibonacci {
	private int[] array; //array
   public int number = 0; // instance variable
   public int size = 0;
   public Fibonacci() {
   
   }
   
	public Fibonacci(int num) {
		number = num;
	}
   
   public void setSize(int siz) {
      size = siz;
      array = new int[size];
   }

	public void setNumber(int num) {
      if(size > num)
      {
        array[0] = 1;
         if(size > 1)
         {
           array[1] = 1;
            if(size > 2)
            {
               for(int i = 2; i < size; i++)
               {
               array[i] = array[i - 1] + array[i - 2];
               }
            }
         }
         number = array[num - 1];
        }
        else {
         number = -1;
        }
	}

	public int getNumber() {
      int numout = number;
      return numout;
	}

	public String toString() {
     return getNumber() + "";
	}
}