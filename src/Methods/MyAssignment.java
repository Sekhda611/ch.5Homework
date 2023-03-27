/**
 * @class MyAssignment
 * @author Sonal Sekhda
 * @course ITEC 2140 section 04
 * @date March 27, 2023
 */
package Methods;

public class MyAssignment {
    public static void main(String[] args) {
        MyAssignment obj = new MyAssignment(); // Declare the object for instance in class method

        String str = "All the best"; //Declare the actual parameter
        String output = obj.reverseDoubleChar(str); // call method reverseDouble char
        System.out.println("the output of the " + str + " is " + output); // output of the calling method

        int num = 987; //Declare the integer variable
        int sum = obj.sumDigits(num); //Call method sumDigits
        System.out.println("The sum of " + num + " is " + sum); // output of the Method sumDigits

        String name = "Keshvee"; //Declare a string
        String result = obj.birthdayName(name); // Call method birthdayName
        System.out.println(result); // Output of the birthdayName result.

        //String sc = "All the best"; // Declare a string
        System.out.println("The missing front statement is: " + obj.missingString(str)); // Output of the missingString.

        System.out.println("the swap ends character output of Hello World is : " + obj.swapEnds("Hello World"));// calling method swapEnds output.

        System.out.println("The output of the every Other character of the string is: " + obj.everyOther(str)); // Calling method everyOther String output.

        String a = "Hello";
        String b = "World";
        System.out.println("The concat of " + a + " and " + b + " is : " + obj.nonStart(a, b));// Calling method nonStart output.

        int n = 10;
        System.out.println("The Fibonacci sequence of " + n + " is : " + obj.fibonacci(n)); // Calling method fibonacci output

        System.out.println("the result  of the lucky numbers sum is : " + obj.luckySum(5, 10, 13)); // calling method luckySum output

        System.out.println("Output of Palindrome is: " + obj.hasPalindrome("level radar")); //Calling method hasPalindrome output

        System.out.println("the result of power of two is: " + obj.powerOfTwo(16)); //Calling method power of two output

    }
    // Method1 of reverseDoubleChar
    public String reverseDoubleChar(String word) {
        String result = ""; //Declare the variable to process method
        for (int i = word.length() - 1; i >= 0; i--) {
            char c = word.charAt(i); // Get character from string
            result = result + c + c; //Double the character and store the result
        }
        return result; // return the result
    }

    //Method2 of sumDigits
    public int sumDigits(int n) {
        if (n == 0) { // Condition check if number is 0 than sumDigits will be 0.
            return 0;
        } else {
            int sum = 0; // Declare the variable to process number
            while (n > 0) { // Condition if n > 0
                sum = sum + n % 10;
                n /= 10;
            }
            return sum; // return the sumDigits.
        }
    }

    //Method3 of birthdayName
    public String birthdayName(String name) {
        return "Happy " + "Birthday " + name + "!"; // Concat the "Happy Birthday" with name and "!"
    }

    //Method4 of missingString
    public String missingString(String str) {
        if (str.length() < 3) { // if String length is less than 3 then return "".
            return "";
        } else {
            return str.substring(3); // return the string without first 3 characters
        }
    }

    //Method5 of swapping ends in the string
    public String swapEnds(String str) {
        if (str.length() <= 1) { // String is 1 or less than return will be a same string
            return str;
        } else {
            char firstChar = str.charAt(0); // get a first char form string
            char lastChar = str.charAt(str.length() - 1); // get a middle string form a string
            String middle = str.substring(1, str.length() - 1); // last char from string
            return lastChar + middle + firstChar; // concat the last char, middle string and first-char
        }
    }

    //Method 6 everyOtherChar in the string
    public String everyOther(String str) {
        String result = ""; //Declare empty string to store result

        for (int i = 0; i < str.length(); i += 2) {// increase i by 2 to skip a letter.
            char c = str.charAt(i);
            result += c;
        }
        return result; // return a string with skipping a one letter in the string
    }

    //Method 7 nonStart 2 strings without first character and concat
    public String nonStart(String a, String b) {
        if (a.length() < 1 || b.length() < 1) { //Check the length of the strings if less than 1 then output is "".
            return "";
        } else {
            return a.substring(1) + b.substring(1); // concat 2 strings without first character.
        }
    }

    // Method 8 Fibonacci nth number of fibonacci sequence
    public int fibonacci(int n) {
        if (n < 0) { //if integer is negative throw this message
            throw new IllegalArgumentException("Input must be non-negative.");
        } else if (n == 0) { // if n is zero than value of fibonacci of nth number is zero
            return 0;
        } else {
            int a = 0; // Declare a variable
            int b = 1; // Declare a variable
            for (int i = 1; i < n; i++) { // condition for the number n
                int sum = a + b; //add a and b to get fibonacci
                a = b; // swap the value of b to a
                b = sum; // swap the value of sum to b
            }
            return b; // return value of b
        }
    }

    // Method 9 luckySum
    public int luckySum(int a, int b, int c) {
        if (a == 13) { // if first number is 13 the value returns 0
            return 0;
        } else if (b == 13) { // if second number is 13, the value returns first number
            return a;
        } else if (c == 13) { //if third number is 13, the value returns first and second number sum
            return a + b;
        } else {
            return a + b + c; // otherwise get 3 numbers sum
        }
    }
    // Method 10
    public boolean hasPalindrome(String str){
        str = str.toLowerCase().replaceAll("[^a-zA-z0-9]", "");
        String reverse = "";
        for( int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
    //Method 11 Power of two
    public  boolean powerOfTwo(int n) {
        if ( n == 0){
            return false;
        }
        else {
            do {
                if ( n == 1){
                    return true;
                }

                else if( n % 2 != 0){
                    return false;
                }
                n = n / 2;

            }while(true);
        }
    }
}
