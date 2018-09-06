public class Notes {
  public static void main(String[] args) {
    //Different escape sequences
    System.out.println("This \"Is\" working");
    System.out.println("Here is one line \nHere is another");
    System.out.println("\\");
    System.out.println("This line\tincludes tabs");
    //Different methods for reading strings
    String name = "BaRtHoLoMeW";
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    System.out.println(name.substring(4));
    System.out.println(name.substring(2,10));
  }
}
