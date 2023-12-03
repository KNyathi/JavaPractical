import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;



public class practical6 {

    public static void main(String[] args) {
    
    //for exercise1
      	String result1 = findHiddenAnagram("My world evolves in a beautiful space called Tesh.", "sworn love lived");
	String result2 = findHiddenAnagram("An old west action hero actor", "Clint Eastwood");
	String result3 = findHiddenAnagram("Mr. Mojo Rising could be a song title", "Jim Morrison");
	String result4 = findHiddenAnagram("Banana? margaritas", "ANAGRAM");
	String result5 = findHiddenAnagram("D  e b90it->?$ (c)a r...d,,#~", "bad credit");
	String result6 = findHiddenAnagram("Bright is the moon", "Bongo mirth");

	System.out.println(result1); // "worldevolvesin"
	System.out.println(result2); // "noldwestactio"
	System.out.println(result3); // "mrmojorisin"
	System.out.println(result4); // "anamarg"
	System.out.println(result5); // "debitcard"
	System.out.println(result6); // "notfound"

    	System.out.println("__________________________________________________");
    
    
  //for exercise 2
        String word1 = "intercontinentalisationalism";
        String word2 = "strengths";
        String word3 = "pneumonoultramicroscopicsilicovolcanoconiosis";

        List<String> res1 = collect(word1, 6);
        List<String> res2 = collect(word2, 3);
        List<String> res3 = collect(word3, 15);

        for (String sub : res1) {
            System.out.print(sub + " ");
        }
        System.out.println();

        for (String sub : res2) {
            System.out.print(sub + " ");
        }
        System.out.println();

        for (String sub : res3) {
            System.out.print(sub + " ");
        }
        System.out.println(); 
    
    System.out.println("__________________________________________________");
    
    
    //for exercise3
    	System.out.println(nicoCipher("myworldevolvesinhers", "tesh")); // "yowmledrovlvsnieesrh"
        System.out.println(nicoCipher("andiloveherso", "tesha")); // "lnidaevheo s or"
        System.out.println(nicoCipher("mubashirhassan", "crazy")); // "bmusarhiahass n"
        System.out.println(nicoCipher("edabitisamazing", "matt")); // "deabtiismaaznig "
        System.out.println(nicoCipher("iloveher", "612345")); // "lovehir    e"
    
        System.out.println("__________________________________________________");
        
    
    //for exercise4
            int[] arr1 = {1, 2, 3, 9, 4, 5, 15};
        int n1 = 45;
        int[] rt1 = twoProduct(arr1, n1);
        System.out.println(Arrays.toString(rt1)); // [9, 5]

        int[] arr2 = {1, 2, 3, 9, 4, 15, 3, 5};
        int n2 = 45;
        int[] rt2 = twoProduct(arr2, n2);
        System.out.println(Arrays.toString(rt2)); // [3, 15]

        int[] arr3 = {1, 2, -1, 4, 5, 6, 10, 7};
        int n3 = 20;
        int[] rt3 = twoProduct(arr3, n3);
        System.out.println(Arrays.toString(rt3)); // [4, 5]

        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n4 = 10;
        int[] rt4 = twoProduct(arr4, n4);
        System.out.println(Arrays.toString(rt4)); // [2, 5]

        int[] arr5 = {100, 12, 4, 1, 2};
        int n5 = 15;
        int[] rt5 = twoProduct(arr5, n5);
        System.out.println(Arrays.toString(rt5)); // []
    
     System.out.println("__________________________________________________");
    
    
    //for exercise5
        System.out.println(Arrays.toString(isExact(6)));    // [6, 3]
        System.out.println(Arrays.toString(isExact(24)));   // [24, 4]
        System.out.println(Arrays.toString(isExact(125)));  // []
        System.out.println(Arrays.toString(isExact(720)));  // [720, 6]
        System.out.println(Arrays.toString(isExact(1024))); // []
        System.out.println(Arrays.toString(isExact(40320))); // [40320, 8]
    
    
     System.out.println("__________________________________________________");
    
    //for exercise6
   	System.out.println(fractions("0.(6)"));      // ➞ "2/3"
        System.out.println(fractions("1.(1)"));      // ➞ "10/9"
        System.out.println(fractions("3.(142857)")); // ➞ "22/7"
        System.out.println(fractions("0.19(2367)"));  // ➞ "5343/27775"
        System.out.println(fractions("0.1097(3)"));   // ➞ "823/7500"
    
     System.out.println("__________________________________________________");
    
    
  //for exercise7
     	System.out.println(pilish_string("33314444"));  // "333 1 4444"
        System.out.println(pilish_string("TOP"));       // "TOP"
        System.out.println(pilish_string("X"));         // "XXX"
        System.out.println(pilish_string(""));          // ""  
    
     System.out.println("__________________________________________________");
    
    
    //for exercise8
          try {
            System.out.println(evaluateExpression("3 + 5 * (2 - 6)")); // -17.0
            System.out.println(evaluateExpression("6 - 18 / (0-1 + 4)")); // 0.0
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    
    System.out.println("__________________________________________________");
    
    
    //for exercise9
    	System.out.println(isValid("aabbcd")); // "NO"
        System.out.println(isValid("aabbccddeefghi")); // "NO"
        System.out.println(isValid("abcdefghhgfedecba")); // "YES"
    
    System.out.println("__________________________________________________");
    
    
    //for exercise10
       	System.out.println(findLCS("abcd", "bd")); // "bd"
        System.out.println(findLCS("aggtab", "gxtxamb")); // "gtab"
    
    
    }
    
    
    
    
    //exercise1
    
    
     public static String cleanString(String s) {
        // Clean the string from punctuation and spaces, and convert to lowercase
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return s;
    }

    public static boolean isAnagram(String s1, String s2) {
        // Check if two strings are anagrams
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static String findHiddenAnagram(String s1, String s2) {
        // Clean both strings
        s1 = cleanString(s1);
        s2 = cleanString(s2);

        // Search for the hidden anagram
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            String substring = s1.substring(i, i + s2.length());
            if (isAnagram(substring, s2)) {
                return substring;
            }
        }

        // If no anagram is found
        return "notfound";
    }
    
    
    
  //exercise2
      public static List<String> collect(String word, int n) {
        Set<String> substrings = new HashSet<>();

        if (word.length() < n) {
            return new ArrayList<>(substrings);
        }

     
        String substring = word.substring(0, n);
        substrings.add(substring);

        List<String> restSubstrings = collect(word.substring(n), n);
        substrings.addAll(restSubstrings);

        String[] sortedArray = substrings.toArray(new String[0]);
        Arrays.sort(sortedArray);
        
        return new ArrayList<>(Arrays.asList(sortedArray));
    }
  
  
  
  //exercise3
	 public static String nicoCipher(String message, String key) {
	    // Step 1: Assign numbers to sorted letters from the key
	    int[] keyNumbers = new int[key.length()];
	    for (int i = 0; i < key.length(); i++) {
		keyNumbers[i] = key.charAt(i) - 'a' + 1;
	    }

	    // Step 2: Assign numbers to the letters of the given message
	    int numRows = (int) Math.ceil((double) message.length() / key.length());
	    char[][] grid = new char[numRows][key.length()];
	    int messageIndex = 0;

	    for (int i = 0; i < numRows; i++) {
		for (int j = 0; j < key.length(); j++) {
		    if (messageIndex < message.length()) {
		        grid[i][j] = message.charAt(messageIndex);
		    } else {
		        grid[i][j] = ' ';
		    }
		    messageIndex++;
		}
	    }

	    // Step 3: Sort the columns according to the assigned numbers
	    for (int i = 0; i < key.length(); i++) {
		int minIndex = i;
		for (int j = i + 1; j < key.length(); j++) {
		    if (keyNumbers[j] < keyNumbers[minIndex]) {
		        minIndex = j;
		    }
		}
		if (minIndex != i) {
		    // Swap columns according to the key
		    keyNumbers[i] = keyNumbers[i] ^ keyNumbers[minIndex];
		    keyNumbers[minIndex] = keyNumbers[i] ^ keyNumbers[minIndex];
		    keyNumbers[i] = keyNumbers[i] ^ keyNumbers[minIndex];

		    for (int k = 0; k < numRows; k++) {
		        char temp = grid[k][i];
		        grid[k][i] = grid[k][minIndex];
		        grid[k][minIndex] = temp;
		    }
		}
	    }

	    // Step 4: Return the encoded message row by row
	    StringBuilder encodedMessage = new StringBuilder();
	    for (int i = 0; i < numRows; i++) {
		for (int j = 0; j < key.length(); j++) {
		    encodedMessage.append(grid[i][j]);
		}
	    }

	    return encodedMessage.toString();
	}
	  
  
  //exercise4
    public static int[] twoProduct(int[] arr, int n) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            
            if (n % current == 0) {
                int complement = n / current;
                if (numToIndex.containsKey(complement) && numToIndex.get(complement) < i) {
                    result[0] = complement;
                    result[1] = current;
                    return result;
                }
            }

            numToIndex.put(current, i);
        }

        return new int[0]; // Return an empty array if a match is not found
    }
  
  
  
  //exercise5
      public static int findFactorial(int n, int current, int factorial) {
        if (factorial == n) {
            return current;
        }
        if (factorial > n) {
            return -1; // No exact upper bound
        }
        return findFactorial(n, current + 1, factorial * (current + 1));
    }

    public static int[] isExact(int n) {
        int result = findFactorial(n, 0, 1);
        if (result != -1) {
            return new int[]{n, result};
        }
        return new int[0]; // Return an empty array if there's no exact upper bound
    }
  
  
  
  //exercise6
      public static String fractions(String decimal) {
        int decimalPointIndex = decimal.indexOf(".");
        String wholePart = decimal.substring(0, decimalPointIndex);
        String nonRepeatingPart = decimal.substring(decimalPointIndex + 1, decimal.indexOf("("));
        String repeatingPart = decimal.substring(decimal.indexOf("(") + 1, decimal.indexOf(")"));

        int nonRepeatingLength = nonRepeatingPart.length();
        int repeatingLength = repeatingPart.length();

        long denominator = (long) Math.pow(10, nonRepeatingLength + repeatingLength) - (long) Math.pow(10, nonRepeatingLength);
        long numerator = Long.parseLong(wholePart + nonRepeatingPart + repeatingPart) - Long.parseLong(wholePart + nonRepeatingPart);

        long gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        return numerator + "/" + denominator;
    }

    public static long findGCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
  
  
  
  //exercise7
    public static String pilish_string(String txt) {
        String piDigits = "314159265358979";
        StringBuilder result = new StringBuilder();

        int piIndex = 0;
        int txtIndex = 0;

        while (piIndex < piDigits.length() && txtIndex < txt.length()) {
            int currentPiDigit = Character.getNumericValue(piDigits.charAt(piIndex));
            int wordLength = currentPiDigit;

            if (txtIndex + wordLength > txt.length()) {
                // If the word would exceed the length of txt, repeat the last letter
                int remainingLength = txt.length() - txtIndex;
                result.append(txt.substring(txtIndex, txtIndex + remainingLength));
                txtIndex += remainingLength;
                while (wordLength > remainingLength) {
                    result.append(txt.charAt(txtIndex - 1));
                    wordLength--;
                }
            } else {
                // Add the word to the result
                result.append(txt.substring(txtIndex, txtIndex + wordLength));
                txtIndex += wordLength;
            }

            // Add space if there are more digits in pi
            if (piIndex < piDigits.length() - 1) {
                result.append(" ");
            }

            piIndex++;
        }

        return result.toString();
    }
    
    
    
    //exercise8
     public static int evaluateExpression(String expression) {
        try {
            String cleanedExpression = cleanExpression(expression);
            String postfix = infixToPostfix(cleanedExpression);
            return evaluatePostfix(postfix);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid expression: " + e.getMessage());
        }
    }

    private static String cleanExpression(String expression) {
        // Remove spaces and handle negative numbers within parentheses
        expression = expression.replaceAll(" ", "");
        expression = expression.replaceAll("\\(-", "(0-");
        return expression;
    }

    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Not enough operands for operator: " + token);
                }
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = applyOperator(operand1, operand2, token);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return stack.pop();
    }

    public static String infixToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Stack<String> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c) || c == '.') {
                int j = i;
                while (j < expression.length() && (Character.isDigit(expression.charAt(j)) || expression.charAt(j) == '.')) {
                    j++;
                }
                postfix.append(expression.substring(i, j)).append(" ");
                i = j - 1;
            } else if (isOperator(String.valueOf(c))) {
                while (!operators.isEmpty() && hasHigherPrecedence(operators.peek(), String.valueOf(c)) && !operators.peek().equals("(")) {
                    postfix.append(operators.pop()).append(" ");
                }
                operators.push(String.valueOf(c));
            } else if (c == '(') {
                operators.push("(");
            } else if (c == ')') {
                while (!operators.isEmpty() && !operators.peek().equals("(")) {
                    postfix.append(operators.pop()).append(" ");
                }
                if (!operators.isEmpty() && operators.peek().equals("(")) {
                    operators.pop();
                } else {
                    throw new IllegalArgumentException("Unmatched closing parenthesis");
                }
            }
        }

        while (!operators.isEmpty()) {
            if (operators.peek().equals("(")) {
                throw new IllegalArgumentException("Unmatched opening parenthesis");
            }
            postfix.append(operators.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static boolean hasHigherPrecedence(String op1, String op2) {
        if (op1.equals("(")) {
            return false;
        }
        if ((op1.equals("+") || op1.equals("-")) && (op2.equals("*") || op2.equals("/"))) {
            return false;
        }
        return true;
    }

    private static int applyOperator(int operand1, int operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new IllegalArgumentException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    
    
    //exercise9
        public static String isValid(String str) {
        // Create a map to count the frequency of characters
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Populate the map with frequencies
        for (char c : str.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Create a map to count the frequency of frequencies (meta-frequency)
        Map<Integer, Integer> frequencyFrequency = new HashMap<>();

        // Populate the meta-frequency
        for (int freq : charFrequency.values()) {
            frequencyFrequency.put(freq, frequencyFrequency.getOrDefault(freq, 0) + 1);
        }

        // If there is only one type of frequency or if there are two types of frequencies
        // and one of them can be reduced to a frequency of 1 while the other remains the same, the string is valid
        if (frequencyFrequency.size() == 1 || (frequencyFrequency.size() == 2 && (frequencyFrequency.containsValue(1) && (Math.abs(frequencyFrequency.keySet().toArray(new Integer[0])[0] - frequencyFrequency.keySet().toArray(new Integer[0])[1]) == 1 || frequencyFrequency.containsValue(1) && frequencyFrequency.get(1) == 1)))) {
            return "YES";
        }

        // In all other cases, the string is not valid
        return "NO";
    }
    
    
    //exercise10
      public static String findLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Fill the dynamic programming table
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Now we need to reconstruct the LCS from the table
        int index = dp[m][n];
        char[] lcs = new char[index];

        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs[index - 1] = s1.charAt(i - 1);
                i--;
                j--;
                index--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return new String(lcs);
    }
    
    
    }
