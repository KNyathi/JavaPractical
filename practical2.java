import java.util.Arrays;

import java.security.SecureRandom;


public class practical2 {

    public static void main(String[] args) {
    //for exercise1
        System.out.println(hasDuplicateChars("Donald")); // Returns true
        System.out.println(hasDuplicateChars("orange")); // Returns false
         	
    	System.out.println("__________________________________________________");
    
    
    //for exercise2
       System.out.println(getInitials("Ryan Gosling")); // Вернет "RG"
       System.out.println(getInitials("Barack Obama")); // Вернет "BA"
    
       System.out.println("__________________________________________________");
       
    
    //for exercise3
       int[] arr1 = {44, 32, 86, 19};
       System.out.println(differenceEvenOdd(arr1)); // Returns 143
        
       int[] arr2 = {22, 50, 16, 63, 31, 55};
       System.out.println(differenceEvenOdd(arr2)); // Returns 61
    
       System.out.println("__________________________________________________");
       
    
    //for exercise4
        int[] ar1 = {1, 2, 3, 4, 5};
        System.out.println(equalToAvg(ar1)); // Returns true
        
        int[] ar2 = {1, 2, 3, 4, 6};
        System.out.println(equalToAvg(ar2)); // Returns false
        
        System.out.println("__________________________________________________"); 
        
     
     //for exercise5
        int[] a1 = {1, 2, 3};
        int[] result1 = indexMult(a1);
        System.out.println(Arrays.toString(result1)); // Выводит [0, 2, 6]
        
        int[] a2 = {3, 3, -2, 408, 3, 31};
        int[] result2 = indexMult(a2);
        System.out.println(Arrays.toString(result2)); // Выводит [0, 3, -4, 1224, 15, 186] 
        
        System.out.println("__________________________________________________"); 
        
        
        
     //for exercise 6
        String str1 = "Hello World";
        String reversedStr1 = reverse(str1);
        System.out.println(reversedStr1); // Выводит "dlroW olleH"
        
        String str2 = "The quick brown fox.";
        String reversedStr2 = reverse(str2);
        System.out.println(reversedStr2); // Выводит ".xof nworb kciuq ehT"
    
        System.out.println("__________________________________________________"); 
        
    
    
    //for exercise 7
        System.out.println(Tribonacci(7)); // Выводит 7
        System.out.println(Tribonacci(11)); // Выводит 81
    
     	System.out.println("__________________________________________________"); 
     	
     	
     	
    //for exercise 8	
        System.out.println(pseudoHash(5)); // Выводит квази-хэш длиной 5 символов
        System.out.println(pseudoHash(10)); // Выводит квази-хэш длиной 10 символов
        System.out.println(pseudoHash(0)); // Выводит пустую строку
    
       	System.out.println("__________________________________________________"); 
       	
       	
    //for exercise 9
        System.out.println(botHelper("Hello, I’m under the water, please help me")); // Выводит "Calling for a staff member"
        System.out.println(botHelper("Two pepperoni pizzas please helper")); // Выводит "Keep waiting"
       		
       	System.out.println("__________________________________________________"); 
       	

   //for exercise 10
   	System.out.println(isAnagram("listen", "silent")); // Выводит true
        System.out.println(isAnagram("eleven plus two", "twelve plus one")); // Выводит true
        System.out.println(isAnagram("hello", "world")); // Выводит false

   
    }
    
    
    
    
    
    
    //exercise 1
     public static boolean hasDuplicateChars(String input) {
        // Create a boolean array to track character occurrences
        boolean[] charSet = new boolean[256]; // Assuming ASCII characters
        
        // Iterate through the characters in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // If the character is already encountered, return true
            if (charSet[currentChar]) {
                return true;
            }
            
            // Mark the character as encountered
            charSet[currentChar] = true;
        }
        
        // If no duplicates are found, return false
        return false;
    }
    
    
    
    //exercise 2
    public static String getInitials(String fullName) {
        // Разделяем строку на слова
        String[] words = fullName.split(" ");
        
        // Создаем пустую строку для хранения инициалов
        StringBuilder initials = new StringBuilder();
        
        // Итерируем по словам
        for (String word : words) {
            // Если слово не пустое, добавляем первую букву к инициалам
            if (!word.isEmpty()) {
                initials.append(word.charAt(0));
            }
        }
        
        // Преобразуем инициалы в строку и возвращаем
        return initials.toString();
    }
    
    
    //exercise 3
     public static int differenceEvenOdd(int[] arr) {
        int evenSum = 0;  // Initialize sum of even numbers
        int oddSum = 0;   // Initialize sum of odd numbers
        
        // Iterate through the elements of the array
        for (int num : arr) {
            if (num % 2 == 0) {
                // If the number is even, add it to the even sum
                evenSum += num;
            } else {
                // If the number is odd, add it to the odd sum
                oddSum += num;
            }
        }
        
        // Return the difference between the sum of even and odd numbers
        return Math.abs(evenSum - oddSum);
    }
    
    
    
    //exercise 4
     public static boolean equalToAvg(int[] arr) {
        // Calculate the arithmetic mean of all elements in the array
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = sum / arr.length;
        
        // Check if there is at least one element equal to the average
        for (int num : arr) {
            if (num == average) {
                return true;
            }
        }
        
        // If the loop completes and no matches are found, return false
        return false;
    }
    
    
    
    //exercise 5
        public static int[] indexMult(int[] arr) {
        int[] result = new int[arr.length]; // Создаем новый массив для результатов
        
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * i; // Умножаем элемент на его индекс и сохраняем в результате
        }
        
        return result;
    }
    
    
    
    //exercise 6
    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        
        // Итерируем по строке в обратном порядке и добавляем символы в StringBuilder
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        
        return reversed.toString();
    }
    
 
 
    //exercise 7
     public static int Tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        
        int[] tribonacci = new int[n + 1];
        tribonacci[0] = 0;
        tribonacci[1] = 1;
        tribonacci[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }
        
        return tribonacci[n];
    }
    
    
    
    //exercise 8
     public static String pseudoHash(int length) {
        if (length <= 0) {
            return "";
        }
        
        // Символы, которые могут использоваться в квази-хэше
        String characters = "0123456789abcdef";
        
        StringBuilder pseudoHash = new StringBuilder();
        SecureRandom random = new SecureRandom();
        
        // Генерируем случайные символы для заданной длины
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            pseudoHash.append(randomChar);
        }
        
        return pseudoHash.toString();
    }
    
    
    //consider a case where a user inputs "helper" You need to differentiate. Use equals
    //exercise 9

    public static String botHelper(String input) {
    // Convert the input to lowercase for case-insensitive comparison
    	String lowerCaseInput = input.toLowerCase();
    
    // Check if the input contains "help"
   	 if (lowerCaseInput.contains("help")) {
        // Split the input into words
        	String[] words = lowerCaseInput.split(" ");
        
        // Check if any word is exactly "help"
        	for (String word : words) {
            		if (word.equals("help")) {
                		return "Calling for a staff member";
            		}
        	}
    	}
    
    // If no exact match for "help" is found, or "help" is not contained, return "Keep waiting"
    	return "Keep waiting";
	}
    
    
 
    //exercise 10
     public static boolean isAnagram(String str1, String str2) {
        // Приводим строки к нижнему регистру и удаляем пробелы
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");
        
        // Если длины строк разные, они не могут быть анаграммами
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Преобразуем строки в массивы символов и сортируем их
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Сравниваем отсортированные массивы символов
        return Arrays.equals(charArray1, charArray2);
    }
    
    
    
}
