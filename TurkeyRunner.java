//(c) A+ Computer Science
// www.apluscompsci.com

//methods example 2 and 3

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
      //make more Turkeys and
      //call the old methods and
      //the new method you created
   }
}
