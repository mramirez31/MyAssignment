/**
 * @Class: MyAssignment
 * @Author: Miguel Ramirez
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: March 28, 2023
 * Description: This is a collection of codes from codingbat to better help
 * understand methods in java.
 */

public class MyAssignment {
    public static void main(String[] args) {
        MyAssignment results = new MyAssignment();

        // reverseDoubleChar
        /**
         * This method will return a string where for every char is the original
         * and there is two chars also this will return the reverse of the string
         * and print the string in reverse and each letter twice.
         */
        System.out.println("reverseDoubleChar");
        System.out.println(results.reverseDoubleChar("The")); //"eehhTT"
        System.out.println(results.reverseDoubleChar("AABB")); //"BBBBAAAA"
        System.out.println(results.reverseDoubleChar("String")); //"ggnniirrttSS"
        System.out.println(results.reverseDoubleChar("aa")); //"aaaa"
        System.out.println(results.reverseDoubleChar("chance")); //"eeccnnaahhcc"
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.

        //sumDigits
        /**
         * This method program tries to use a given non-negative int n and
         * return method that will then give
         * the sum of its digits while using loop to find the answer as well.
         * this method will return 0 if the given integer is 0 and if not
         * then it will add the integer by the remainder of 10 and then divide the
         * given integer by ten and then return sum as the answer.
         */
        System.out.println("sumDigits");
        System.out.println(results.sumDigits(0)); // 0
        System.out.println(results.sumDigits(1)); // 1
        System.out.println(results.sumDigits(9)); // 9
        System.out.println(results.sumDigits(126)); // 9
        System.out.println(results.sumDigits(49)); // 13
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.

        //birthdayName
        /**
         *This method will return a message as "Happy Birthday Cindy",
         * by a given integer string called name where it will input the name given
         * to the code and give a happy Birthday message from the name given by
         * the user.
         */
        System.out.println("birthdayName");
        System.out.println(results.birthdayName("Jaun")); // "Happy Birthday Jaun!"
        System.out.println(results.birthdayName("Cindy")); // "Happy Birthday Cindy!"
        System.out.println(results.birthdayName("John")); // "Happy Birthday John!"
        System.out.println(results.birthdayName("Joseph")); // "Happy Birthday Joseph!"
        System.out.println(results.birthdayName("Juno")); // "Happy Birthday Juno!"
        System.out.println(results.birthdayName("Jessy")); // "Happy Birthday Jessy!"
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.

        //missingFront
        /**
         *This method will run a code where it will return the string
         * without the first three letters given in the beginning and
         * only give back what's left after it take three letters from
         * the string value and return a version without the first 3 chars.
         */
        System.out.println("missingFront");
        System.out.println(results.missingFront("abcd")); // "d"
        System.out.println(results.missingFront("Holiday")); // "iday"
        System.out.println(results.missingFront("House")); // "se"
        System.out.println(results.missingFront("efghij")); // "hij"
        System.out.println(results.missingFront("mother")); // "her"
        System.out.println(results.missingFront("objects")); // "ects"
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.

        //swapEnds
        /**
         * This method will return a string in which the first and last letters of
         * the string are swapped and return a new version with the last letter
         * as the first letter and the first letter as the last letter.
         */
        System.out.println("swapEnds");
        System.out.println(results.swapEnds("hello")); // "oellh"
        System.out.println(results.swapEnds("codingbat")); // "todingbac"
        System.out.println(results.swapEnds("x")); // "x"
        System.out.println(results.swapEnds("ab")); // "ba"
        System.out.println(results.swapEnds("12345")); // "52341"
        System.out.println(results.swapEnds("")); // "", I tried using the code but can't get the answer and a blank instead.
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.

        //everyOther
        /**
         * In this method it will return a string made up of every other character
         * starting from the first character then skips the second letter and goes to
         * the third one and repeats until the code goes through the whole string.
         */
        System.out.println("everyOther");
        System.out.println(results.everyOther("hello")); // "hlo"
        System.out.println(results.everyOther("codingbat")); // "cdnbt"
        System.out.println(results.everyOther("abcdefg")); // "aceg"
        System.out.println(results.everyOther("123456789")); // "13579
        System.out.println(results.everyOther("x")); // "x"
        System.out.println(results.everyOther("")); // "", won't give the code answer but this is the answer.
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.

        //nonStart
        /**
         * This method will return their concatenation of two strings and when they
         * are returned back it will return with a new version where it will
         * concatenation the string and also have both strings first letters removed.
         */
        System.out.println("nonStart");
        System.out.println(results.nonStart("Hello","There")); // "ellohere"
        System.out.println(results.nonStart("coding","bat")); // "odingat"
        System.out.println(results.nonStart("123","456")); // "2356"
        System.out.println(results.nonStart("a","b")); // "", won't give the code answer but this is the answer.
        System.out.println(results.nonStart("a","")); // "", won't give the code answer but this is the answer.
        System.out.println(results.nonStart("","")); // "", won't give the code answer but this is the answer.
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.

        //fibonacci
        /**
         *This method program will write a Fibonacci sequence and write a series
         * of numbers where it will take the integer as the input and return the
         * nth number given from the Fibonacci sequence.
         */
        System.out.println("fibonacci");
        System.out.println(results.fibonacci(0)); // 0
        System.out.println(results.fibonacci(1)); // 1
        System.out.println(results.fibonacci(2)); // 1
        System.out.println(results.fibonacci(6)); // 8
        System.out.println(results.fibonacci(7)); // 13
        System.out.println(results.fibonacci(8)); // 21
        System.out.println(results.fibonacci(9)); // 34
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.

        //luckySum
        /**
         * This method program will return a sum from the three given integer
         * values and if a string value has 13 it will not count and also any numbers
         * to the right of it.
         */
        System.out.println("luckySum");
        System.out.println(results.luckySum(1,2,3)); // 6
        System.out.println(results.luckySum(1,2,13)); // 3
        System.out.println(results.luckySum(1,13,3)); // 1
        System.out.println(results.luckySum(13,2,3)); // 0
        System.out.println(results.luckySum(13,13,13)); // 0
        System.out.println(results.luckySum(1,13,13)); // 1
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.

        //hasPalindrome
        /**
         * This program method will write a method called countPalindromes that
         * will take a string as an input and when it returns it will
         * have determined if it is Palindrome or not by giving it an answer
         * of true or false and also A palindrome
         * is a string that reads the same backward as forward so it can still determine
         * if its true or false no matter the string.
         */
        System.out.println("hasPalindrome");
        System.out.println(results.hasPalindrome("level")); // true
        System.out.println(results.hasPalindrome("A man, a plan, a canal: panama!")); // true
        System.out.println(results.hasPalindrome("Radar")); // true
        System.out.println(results.hasPalindrome("Was it a car or a cat I saw?")); // true
        System.out.println(results.hasPalindrome("12321")); // true
        System.out.println(results.hasPalindrome("abcd")); // false
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.

        //powerOfTwo
        /**
         * This program method called powerOfTwo will determine if the string
         * is a power of 2 and return true if it is and false if it is not
         * a number of power of 2 and will use the given string as an input to
         * determine if its part of power of 2.
         */
        System.out.println("powerOfTwo");
        System.out.println(results.powerOfTwo(0)); // false
        System.out.println(results.powerOfTwo(1)); // true
        System.out.println(results.powerOfTwo(2)); // true
        System.out.println(results.powerOfTwo(3)); // false
        System.out.println(results.powerOfTwo(4)); // true
        System.out.println(results.powerOfTwo(7)); // false
        System.out.println(results.powerOfTwo(8)); // true
        System.out.println(""); // I added the code so it would space each of the answers for each program so it could be easier to read.


    }
    public String reverseDoubleChar(String word) {
        String reverseChar = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseChar += word.charAt(i)+ "" + word.charAt(i);
        }
        return reverseChar;
    }

    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }

    public String birthdayName(String name){
        return "Happy Birthday " + name + "!" ;
    }

    public String missingFront(String str){
        return str.substring(3);
    }

    public String swapEnds(String str) {
        if (str.length() <= 1) {
            return str;
        }else{
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            return last + middle + first;
        }
    }

    public String everyOther(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }

    public String nonStart(String a, String b) {
        if (a.length() < 1 || b.length() < 1) {
            return "";
        }
        return a.substring(1) + b.substring(1);
    }

    public int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c;
        if(n == 0){
            return n;
        }else{
            for(int i = 2; i <= n; i++){
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }

    public int luckySum(int a, int b, int c) {
        if(a == 13){
            return 0;
        }else if(b == 13){
            return a;
        }else if(c == 13){
            return a + b;
        }else{
            return a + b + c;
        }
    }

    public boolean hasPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        }else{
            do {
                if(n == 1) {
                    return true;
                }else if(n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (n > 0);
            return false;
        }
    }
}

