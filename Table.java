class Table
{
   private int upperBound;
   private int multiplier;

   public Table(int bound, int mult)
   {
     upperBound = bound;
     multiplier = mult;
   }

   public void setNums(int bound, int mult)
   {
     upperBound = bound;
     multiplier = mult;
   }

   public void print()
   {
     for(int x = 1; x <= upperBound;  x++){
       System.out.println(x + " - " + multiplier * x);
     }
   }
}
