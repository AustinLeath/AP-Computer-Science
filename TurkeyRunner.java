import static java.lang.System.*;

public class TurkeyRunner
{
   public static void main(String[] args)
   {
		System.out.println( "Test 1" );
      Turkey bird = new Turkey();
      bird.sayName();
      bird.speak();
      bird.quickMath();

		System.out.println( "\n\nTest 2" );
      Turkey it = new Turkey();
      it.sayName();
      it.quickMath();
      it.speak();

		System.out.println( "\n\nTest 3" );
      Turkey easy = new Turkey();
      easy.sayName();
      easy.speak();
      easy.quickMath();
   }
}
