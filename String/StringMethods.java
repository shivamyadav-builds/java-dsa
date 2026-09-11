public class StringMethods {
    public static void main(String[] args) {

        String str = "  Hello Java World  ";
        String str2 = "hello java world";

        // 1. length() -> returns the number of characters in the string
        System.out.println("1. length(): " + str.length());


        // 2. charAt(index) -> returns the character present at the given index
        System.out.println("2. charAt(): " + str.charAt(2));


        // 3. substring(beginIndex, endIndex) -> returns a part of the string
        System.out.println("3. substring(): " + str.substring(2, 7));


        // 4. contains() -> checks whether a string contains a particular sequence
        System.out.println("4. contains(): " + str.contains("Java"));


        // 5. equals() -> checks whether two strings are exactly equal
        System.out.println("5. equals(): " + str.equals(str2));


        // 6. equalsIgnoreCase() -> checks equality without considering uppercase/lowercase
        System.out.println("6. equalsIgnoreCase(): " + str.equalsIgnoreCase(str2));


        // 7. toUpperCase() -> converts all letters of the string to uppercase
        System.out.println("7. toUpperCase(): " + str.toUpperCase());


        // 8. toLowerCase() -> converts all letters of the string to lowercase
        System.out.println("8. toLowerCase(): " + str.toLowerCase());


        // 9. trim() -> removes spaces from the beginning and end of the string
        System.out.println("9. trim(): " + str.trim());


        // 10. split() -> divides a string into multiple parts using a separator
        String sentence = "Java is easy";
        String[] words = sentence.split(" ");

        System.out.println("10. split():");
        for (String word : words) {
            System.out.println(word);
        }


        // 11. startsWith() -> checks whether the string starts with a particular prefix
        System.out.println("11. startsWith(): " + str.trim().startsWith("Hello"));


        // 12. endsWith() -> checks whether the string ends with a particular suffix
        System.out.println("12. endsWith(): " + str.trim().endsWith("World"));


        // 13. valueOf() -> converts a value of another data type into a String
        int number = 100;
        String numberString = String.valueOf(number);

        System.out.println("13. valueOf(): " + numberString);


        // 14. toCharArray() -> converts the string into a character array
        char[] characters = str.trim().toCharArray();

        System.out.println("14. toCharArray():");
        for (char ch : characters) {
            System.out.print(ch + " ");
        }
        System.out.println();


        // 15. isEmpty() -> checks whether the string has zero characters
        String emptyString = "";
        System.out.println("15. isEmpty(): " + emptyString.isEmpty());


        // 16. isBlank() -> checks whether the string is empty or contains only spaces
        String blankString = "   ";
        System.out.println("16. isBlank(): " + blankString.isBlank());


        // 17. replace() -> replaces all occurrences of one character with another
        String name = "Shivam";
        System.out.println("17. replace(): " + name.replace('a', 'o'));
    }
}