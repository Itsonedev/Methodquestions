package questions;

import java.util.Arrays;

public class Main {
    //Question 1
    public static int getLastIndex(String[] names) {
        return  names.length - 1 ;
    }
    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }
    //Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }
    //Question 4
    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }
    //Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }
    //Question 6
    public static int getSum(int[] ints) {
       // return Arrays.stream(ints).sum();
        int sum = 0;
        for(int i = 0; i < ints.length; i++){
            sum += ints[i];
        } return sum;
    }
    //Question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for(int i = 0; i < ints.length; i++){
            sum += ints[i];
        } return sum / ints.length;
    }
    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        StringBuilder result = new StringBuilder();

        for (int num : numbers) {
            if (num % 2 != 0) {
                result.append(num).append(" ");
            }
        }
        return result.toString();
    }
    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        StringBuilder result = new StringBuilder();

        for (int num : numbers) {
            if (num % 2 == 0) {
                result.append(num).append(" ");
            }
        }
        return result.toString();
    }
    //Question 10
    public static boolean contains(String[] names, String element) {
        for (String name : names) {
            if (name.equals(element)) {
                return true; // Element found, return true
            }
        }
        return false; // Element not found in the array
    }
    //Question 11
    public static int getIndexByElement(String[] names, String element) {
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(element)) {
                    return i; // Element found, return its index
                }
            }
            // Element not found in the array
            return -1;
    }
    //Question 12
    private static void printOddNumbersInRange(int start, int end){
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String repeated = "";

        for (int i = 0; i < n; i++) {
            repeated += str;
        }
        return repeated;
    }

    //Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThreeLetters = str.substring(0, 3); // Get the first three characters
        String repeated = "";

        for (int i = 0; i < n; i++) {
            repeated += firstThreeLetters;
        }
        return repeated;
    }

    //Question 15
    // Write a java method to count all the words in a string
    public static int wordsInAStringCounter(String str){
        String[] words = str.split("\\s+"); // Split the string by whitespace
        return words.length; // Return the count of words
    }
    //Question 16

   // A, E, I, O, U, and sometimes Y



    public static int VowelsCounter(String[] names1){

        int vowelCount = 0;

        for (String name : names1) {
            String lowerCaseName = name.toLowerCase();
            for (char ch : lowerCaseName.toCharArray()) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowelCount++;
                }
            }
        }

        return vowelCount;
    }

    //Question 17
    //Swap the first element in an array with the last element in an array and return

    public static void swapFirstToLast(String[] stringArray) {
        String temp = stringArray[0];
        stringArray[0] = stringArray[stringArray.length - 1];
        stringArray[stringArray.length - 1] = temp;
    }


    //Question 18

    /**

     * Given the following legend

     *

     * f >> 7

     * s >> $

     * 1 >> !

     * a >> @

     *

     * your method should replace any character represented by a key in the legend, with its corresponding value.

     * Input = "The Farmer went to the store to get 1 dollar's worth of fertilizer"

     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"

     *

     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer

     */

    public static String replaceCharacters(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words){
            StringBuilder modifiedWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++){
                char currentChar = word.charAt(i);
                char lowerCaseChar = Character.toLowerCase(currentChar);
                if (lowerCaseChar == 'f'){
                    modifiedWord.append('7');
                } else if (lowerCaseChar == 's') {
                    modifiedWord.append('$');
                }else if (lowerCaseChar == '1'){
                    modifiedWord.append('!');
                }else if (lowerCaseChar == 'a'){
                    modifiedWord.append('@');
                }else{
                    modifiedWord.append(currentChar);
                }
            }
            result.append(modifiedWord).append(" ");
        }
        return result.toString().trim();
    }

    //Question 19

           // " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "

    public static String replaceWuTangTwoThreeDivisible(String input) {

        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if ((i + 1) % 2 == 0) {
                words[i] = "Wu";
            } else if ((i + 1) % 3 == 0) {
                words[i] = "Tang";
            }
        }
        return String.join(" ", words);
    }

    //Question 20

    public static String createStringOfFibonnaciUpToMax(int maxNumber) {
        String builder = "";
        int previousNum = 1;
        int nextNum = 1;
        //the sum of the next number is the addition of the previous two.
        for (int i = 1; i <= maxNumber; i++) {
            builder += previousNum + " ";
            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
        }
        return builder;
    }

    public static void main(String[] args) {
        String[] names = {"Devon", "Kobe", "MJ", "Lebron"};
        int[] intList = {8, 11, 24, 48};
        String[] names1={"Victoria","James","Simon","Julius"};

        //Questions 1-5
        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));

        //Questions 6-9
        System.out.println(getSum(intList));
        System.out.println(getAverage(intList));
        System.out.println(extractAllOddNumbers(intList));
        System.out.println(extractAllEvenNumbers(intList));

        //Questions 10-15
        System.out.println(contains(names, "jordan"));
        System.out.println(getIndexByElement(names, "MJ"));
        printOddNumbersInRange(3, 28);
        System.out.println("\n");
        System.out.println(printGivenStringTimesNumberGiven("Blanca", 4));
        System.out.println(repeatFirstThreeLetters("Devon",5));
        System.out.println(wordsInAStringCounter("How many words are in this string"));

        //Questions 16-20
        System.out.println(VowelsCounter(names1));
        System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));
        swapFirstToLast(names);
        System.out.println(Arrays.toString(names));
        System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
        System.out.println(createStringOfFibonnaciUpToMax(6));

    }
}
