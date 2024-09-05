/***
        *   Question: All the basic string assingment
        *   Owner name: Dikshant Goswami
        *   brief explaination:- enter instruction according to code and get the desire operation for every instruction you get an
 *                               different operations
        *   Date: 5-9-2024
        */


import java.util.Scanner;


class StringMethods
{
    static String outputString = "";

    //Appends the newString provided by the user to the existing string.
    //Example:
    //String currentString = "Hello";
    //append(" World"); // Result: "Hello World"
    //append(" Java"); // Result: "Hello World Java"

    public void append()
    {
        System.out.println(Constants.ENTER_STRING);
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        outputString = outputString + inputString + " ";
        System.out.println(outputString);

    }

    // Counts the total number of words in the current string.
    // for example:-
    // String text = "Hello World from Codeup";
    // int wordCount = countWords(); // Result: 4
    // if you give the input hello sir you will get the 2 because you entered the two wrods
    public void countWord()
    {
        System.out.println(Constants.ENTER_STRING);
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        int count = 1;
        for (int i = 0; i < inputString.length(); i++)
        {
            if (inputString.charAt(i) == ' ')
            {
                count++;
            }
        }
        System.out.println(Constants.WORD_COUNT + count);
    }
    //Checks if the current string is a palindrome. A palindrome is a word,
    //phrase, or sequence that reads the same backward as forward.
    //for example:- String text = "madam";
    //boolean isPal = isPalindrome(); // Result: true

    public boolean isPalindrome(String name)
    {
        int length = name.length();
        name = name.toLowerCase(); // Convert to lowercase manually
        for (int i = 0, j = length - 1; i <= j; i++, j--)
        {
            if (name.charAt(i) != name.charAt(j))
            {
                return false;
            }
        }
        return true;
    }

    public static int maximum(int i, int j)
    {
        return (i > j) ? i : j;
    }

    //enter the String and get the character that appears the most frequently in the
    //current string.
    //for example:-String text = "success";
    //char maxChar = maxRepeat(); // Result:
    //'s' -> 3
    public void maxFrequency()
    {
        Scanner input = new Scanner(System.in);
        System.out.print(Constants.FREQUENCY_GET);
        String name = input.nextLine();

        int max = 0;
        char maxChar = '\0';

        for (int i = 0; i < name.length(); i++)
        {
            int count = 0;
            for (int j = 0; j < name.length(); j++)
            {
                if (name.charAt(i) == name.charAt(j))
                {
                    count++;
                }
            }
            if (count > max)
            {
                max = count;
                maxChar = name.charAt(i);
            }
        }

        if (max > 1)
        {
            System.out.println(maxChar + " -> " + max);
        } else
        {
            System.out.println(Constants.NO_REPEATED_CHARACTERS);
        }
    }

    //Replaces all occurrences of character a with character b in the current
    //string.
    //enter the first character you want to replace
    //enter the second character with whom you want to replace
    //for example:- String text = "Java Programming";
    //replace('a', 'o'); // Result: "Jovo Progromming"
    //replace('ava', 'o'); // Result: "Jo Progromming"

    public  void replace(String string, String oldSubstring, String newSubstring) {
        String output = "";
        int i = 0;
        int length = oldSubstring.length();

        while (i <= string.length() - length) {
            if (string.substring(i, i + length).equals(oldSubstring)) {
                output += newSubstring;
                i += length;
            } else {
                output += string.charAt(i);
                i++;
            }
        }
        output += string.substring(i);

        System.out.println(output);
    }


    //Sorts the characters of the current string in alphabetical order.
    //for example:- String text = "program";
    //String sortedText = sort(); // Result: "agmnoprr"
    public void toSortAlphabets(char[] name, int length)
    {
        for (int i = 0; i < length - 1; i++)
        {
            for (int j = i + 1; j < length; j++)
            {
                if (name[i] > name[j])
                {
                    char temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println(Constants.SORTED_STRING + new String(name));
    }

    //Splits the current string into an array of words.
    // this will help to split an whole sentence into words
    //for example:- String text = "Codeup ACE Academy";
    //String[] words = split(“ “); // Result: ["Codeup", "ACE", "Academy"]
    public void Split()
    {
        System.out.println(Constants.ENTER_STRING);
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        String[] arr = inputString.split(" ");
        for (String word : arr)
        {
            System.out.println(word);
        }
    }



    public static void toReverseString(char[] name, int length)
    {
        // Reversing the string by swapping characters from the ends
        for (int i = length - 1, j = 0; i > j; i--, j++)
        {
            char temp = name[i];
            name[i] = name[j];
            name[j] = temp;
        }
        // Output the reversed string
        System.out.println(name);
    }

    //Removes a substring from the current string starting at index start and of
    //length.
    // for example:- String text = "Academy";
    //splice(2, 2); // Result: "Acemy"
    public void Splice()
    {
        Scanner input = new Scanner(System.in);
        System.out.println(Constants.ENTER_STRING);
        String inputString = input.nextLine();
        System.out.println(Constants.ENTER_START_INDEX);
        int start = input.nextInt();
        System.out.println(Constants.ENTER_END_INDEX);
        int end = input.nextInt();
        String out="";
        for(int i=0;i<inputString.length();i++){
            if(start<0 || end>inputString.length()){
                System.out.println(Constants.INVALID_INDEX);
                break;
            }
            if(i>=start && i<=end-1+start ) continue;
            else out=out+inputString.charAt(i);
        }
        System.out.println(out);
    }

    // this will reverse the string in 3 part
    // 1:-> from start index to our selected end by user
    // 2:-> from end to the length of the string
    // 3:-> from start to length of string
    public static void toReverse(char[] name, int start, int end)
    {
        while (start < end)
        {
            char temp = name[start];
            name[start] = name[end];
            name[end] = temp;
            start++;
            end--;
        }
    }
    // Moves the first n characters from the start to the end of the current string.
    // for example:- String text = "abcdef";
    //shift(2); // Result: "efabcd"
    public static void toShift(char[] name, int length)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(Constants.ENTER_SHIFT_AMOUNT);
        int shift = input.nextInt();

        if (shift > length)
        {
            System.out.println(Constants.LENGTH_WARN);
            return;
        }

        toReverse(name, 0, shift - 1);
        toReverse(name, shift, length - 1);
        toReverse(name, 0, length - 1);

        System.out.println(Constants.SHIFTED_STRING + new String(name));
    }
}


public class StringFunctions {
    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods();
        Scanner input = new Scanner(System.in);
        String str = "";

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println(Constants.ENTER_STRING_OPERATION);
            System.out.println(Constants.OPTION_APPEND);
            System.out.println(Constants.OPTION_SPLIT);
            System.out.println(Constants.OPTION_REPLACE);
            System.out.println(Constants.OPTION_SPLICE);
            System.out.println(Constants.OPTION_REVERSE);
            System.out.println(Constants.OPTION_SHIFT);
            System.out.println(Constants.OPTION_SORT);
            System.out.println(Constants.OPTION_COUNT);
            System.out.println(Constants.OPTION_PALINDROME);
            System.out.println(Constants.OPTION_MAX_FREQUENCY);

            if (!input.hasNextInt()) {
                System.out.println(Constants.PLEASE_ENTER_INTEGER);
                input.nextLine();
                continue;
            }

            int choice = input.nextInt();
            input.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    stringMethods.append();
                    break;
                case 2:
                    stringMethods.Split();
                    break;
                case 3:
                    System.out.println(Constants.ENTER_STRING);
                    str = input.nextLine();
                    System.out.println(Constants.ENTER_OLD_SUBSTRING);
                    String oldSubstring = input.nextLine();
                    System.out.println(Constants.ENTER_NEW_SUBSTRING);
                    String newSubstring = input.nextLine();
                    stringMethods.replace(str, oldSubstring, newSubstring);
                    break;
                case 4:
                    stringMethods.Splice();
                    break;
                case 5:
                    System.out.println(Constants.ENTER_REVERSE_STRING);
                    String strReverse = input.nextLine();
                    int length = strReverse.length();
                    stringMethods.toReverseString(strReverse.toCharArray(), length);
                    break;
                case 6:
                    System.out.println(Constants.ENTER_STRING);
                    str = input.nextLine();
                    stringMethods.toShift(str.toCharArray(), str.length());
                    break;
                case 7:
                    System.out.println(Constants.ENTER_STRING);
                    str = input.nextLine();
                    stringMethods.toSortAlphabets(str.toCharArray(), str.length());
                    break;
                case 8:
                    stringMethods.countWord();
                    break;
                case 9:
                    System.out.println(Constants.OPTION_PALINDROME);
                    str = input.nextLine();
                    boolean isPalindrome = stringMethods.isPalindrome(str);
                    System.out.println(Constants.IS_PALINDROME + isPalindrome);
                    break;
                case 10:
                    stringMethods.maxFrequency();
                    break;
                default:
                    System.out.println(Constants.INVALID_CHOICE);
            }

            System.out.println(Constants.EXIT_PROMPT);
            String exitChoice = input.next().toLowerCase();
            if (exitChoice.equals("yes") || exitChoice.equals("y")) {
                continueProgram = false;
            }
        }

        input.close();
    }
}
