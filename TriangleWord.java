//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class TriangleWord
{
   private String word;

	public TriangleWord()
	{
		setWord("");
	}

	public TriangleWord(String w)
	{
		setWord(w);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
    int i = word.length();
    String anything = "";

    for(int j = 0; j <= i; j++) {
      for(int k = 0; k < j; k++) {
        anything += word.substring(0,j);
      }
      anything += "\n";
    }
    return anything;
	}
}
