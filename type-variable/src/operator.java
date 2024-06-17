public class operator {

  public static void main(String[] args) {

    String name1 = "BRENDO";
    String name2 = "BRENDO";

    System.out.println(name1 == name2);

    String name3 = "BRENDO";
    String name4 = new String("BRENDO");

    System.out.println(name3 == name4);// even though it contein the same mensagem, '==' won't work with objects
    System.out.println(name3.equals(name4));// It's necessary to use '.equals' to compare two objects

    int number1 = 1;
    int number2 = 2;

    boolean yesNot = number1 == number2;
    System.out.println("Is number1 egual to number2 ? " + yesNot);

    yesNot = number1 != number2;
    System.out.println("Is number1 different from number2 ? " + yesNot);

  }
}
/*
 * String fullName = "language" + "java";
 * 
 * System.out.println(fullName);
 * 
 * String concatenation ="?";
 * 
 * concatenation = 1+1+1+"1";
 * 
 * System.out.println(concatenation);
 * 
 * concatenation = 1+"1"+1+1;
 * 
 * System.out.println(concatenation);
 * 
 * concatenation = 1+"1"+1+"1";
 * 
 * System.out.println(concatenation);
 * 
 * concatenation = "1"+1+1+1;
 * 
 * System.out.println(concatenation);
 * 
 * concatenation = "1"+(1+1+1);
 * 
 * System.out.println(concatenation);
 */

/*
 * int number = 5;
 * 
 * number = - number;//number = number * -1; work the same
 * System.out.println(number);
 * 
 * number = number * -1;// turn a positive number to negative or the opposite in
 * case the number is negative
 * System.out.println(number);
 * 
 * number ++;// number = number + 1;
 * System.out.println(number);
 * 
 * System.out.println( ++ number);//System.out.println(number ++); won't work
 * because it will first print number, then increase
 * 
 * 
 * boolean booleanNumber = false;// set the variable booleanNumber as false
 * System.out.println(booleanNumber);// print the false value
 * 
 * System.out.println(!booleanNumber);// it only reverse on the print, the
 * variable remains the same
 * System.out.println(booleanNumber);// remains false
 * 
 * booleanNumber = !booleanNumber;// reverse the value of the variable
 * booleanNumber
 * System.out.println(booleanNumber);// show the reverse value
 */

/*
 * int a, b;
 * a = 5;
 * b = 6;
 * String result = "";
 * if(a==b)
 * result = "true";
 * else
 * result = "false";
 * 
 * System.out.println(result);
 * 
 * result = a==b ? "true" : "false";// same as using IF ELSE
 * System.out.println(result);
 * 
 * a=b;
 * result = a==b ? "true" : "false";// same as using IF ELSE
 * System.out.println(result);
 */