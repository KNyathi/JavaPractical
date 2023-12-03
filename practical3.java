import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;


public class practical3 {

    public static void main(String[] args) {
      //for exercise1
        String result1 = replaceVowels("apple");
        String result2 = replaceVowels("Even if you did this task not by yourself, you have to understand every single line of code.");
        System.out.println(result1); // Output: "ppl"
        System.out.println(result2);
            	
    	System.out.println("__________________________________________________");
    	
    	
    //for exercise2	
        String resut1 = stringTransform("hello");
        String resut2 = stringTransform("bookkeeper");
        System.out.println(resut1); // Output: "heDoubleLo"
    	System.out.println(resut2); 
    
	System.out.println("__________________________________________________");
	
    
    //for exercise3
        boolean resul1 = doesBlockFit(1, 3, 5, 4, 5);
        boolean resul2 = doesBlockFit(1, 8, 1, 1, 1);
        boolean resul3 = doesBlockFit(1, 2, 2, 1, 1);
        
        System.out.println(resul1); // Output: true
        System.out.println(resul2);
        System.out.println(resul3);
        
    	System.out.println("__________________________________________________");
    	
    	
    //for exercise4
        boolean res1 = numCheck(243);
        boolean res2 = numCheck(52);

        System.out.println(res1); // Output: true
        System.out.println(res2); // Output: false
        
    	System.out.println("__________________________________________________");
    	
    	
    //for exercise5
        int[] coefficients1 = {1, -3, 2};
        int[] coefficients2 = {2, 5, 2};
        int[] coefficients3 = {1, -6, 9};

        System.out.println(countRoots(coefficients1)); // Output: 2
        System.out.println(countRoots(coefficients2)); // Output: 2
        System.out.println(countRoots(coefficients3)); // Output: 1
    	
    	System.out.println("__________________________________________________");
    	
    	
   //for exercise6
        String[][] data1 = {
                {"Apple", "Shop1", "Shop2", "Shop3", "Shop4"},
                {"Banana", "Shop2", "Shop3", "Shop4"},
                {"Orange", "Shop1", "Shop3", "Shop4"},
                {"Pear", "Shop2", "Shop4"}
        };

        String[][] data2 = {
                {"Fridge", "Shop2", "Shop3"},
                {"Microwave", "Shop1", "Shop2", "Shop3", "Shop4"},
                {"Laptop", "Shop3", "Shop4"},
                {"Phone", "Shop1", "Shop2", "Shop3", "Shop4"}
        };

        //System.out.println(salesData(data1)); // Output: [Apple]
        //System.out.println(salesData(data2)); // Output: [Microwave, Phone]
    	
    	System.out.println("__________________________________________________");
    	
    	
   //for exercise7
        boolean ret1 = validSplit("apple eagle egg goat");
        boolean ret2 = validSplit("cat dog goose fish");

        System.out.println(ret1); // Output: true
        System.out.println(ret2); // Output: false
   
   	System.out.println("__________________________________________________");
    	
    	
    //for exercise8
        int[] sequence1 = {3, 1, 4, 2, 7, 5};
        int[] sequence2 = {1, 2, 3, 4, 5};
        int[] sequence3 = {1, 2, -6, 10, 3};

        System.out.println(waveForm(sequence1)); // Output: true
        System.out.println(waveForm(sequence2)); // Output: false
        System.out.println(waveForm(sequence3)); // Output: true
        
	System.out.println("__________________________________________________");
	
	
    //for exercise9
        char rult1 = commonVowel("Hello world");
        char rult2 = commonVowel("An Action speak louder than words.");

        System.out.println(rult1); // Output: 'o'
        System.out.println(rult2); // Output: 'a'
    
        System.out.println("__________________________________________________");
        
        
    //for exercise10
        int[][] da1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 29, 10},
                {5, 5, 5, 5, 35},
                {7, 4, 3, 14, 2},
                {1, 0, 11, 10, 1}
        };

        int[][] da2 = {
                {6, 4, 19, 0, 0},
                {81, 25, 3, 1, 17},
                {48, 12, 60, 32, 14},
                {91, 47, 16, 65, 217},
                {5, 73, 0, 4, 21}
        };

        dataScience(da1);
        dataScience(da2);

        for (int[] row : da1) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        for (int[] row : da2) {
            System.out.println(Arrays.toString(row));
        }
  
  
    }
    
    
    
    
    
    
    //exercise 1
    public static String replaceVowels(String input) {
        return input.replaceAll("[aeiouAEIOU]", "*");
    }
    
    
    //exercise 2
    public static String stringTransform(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                result.append("Double");
            } else {
                result.append(chars[i]);
            }
        }

        return result.toString();
    }
    
    
    //exercise 3 //to do a container
   public static boolean doesBlockFit(int a, int b, int c, int w, int h) {
        return (a <= w && b <= h) || (a <= h && b <= w) || (a <= w && c <= h) ||
               (a <= h && c <= w) || (b <= w && c <= h) || (b <= h && c <= w);
    }
    
    
    //exercise 4
   public static boolean numCheck(int num) {
        int sumOfSquares = 0;
        int orignum = num;
        
        while (num != 0) {
            int digit = num % 10;
            sumOfSquares += digit * digit;
            num /= 10;
        }
        return sumOfSquares % 2 == orignum % 2;
    }
    
    
    //exercise 5 //should give 2, 1, 1
   public static int countRoots(int[] coefficients) {
        int discriminant = coefficients[1] * coefficients[1] - 4 * coefficients[0] * coefficients[2];

        if (discriminant > 0) {
            return 2;
        } else if (discriminant == 0) {
            return 1;
        } else {
            return 0;
        }
    }


     //exercise 6
     public static List<String> salesData(String[][] sales) {
        Set<String> productsInAllShops = new HashSet<>(Arrays.asList(sales[0]).subList(1, sales[0].length));

        for (int i = 1; i < sales.length; i++) {
            Set<String> currentShopProducts = new HashSet<>(Arrays.asList(sales[i]).subList(1, sales[i].length));
            productsInAllShops.retainAll(currentShopProducts);
        }

        List<String> result = new ArrayList<>();
        for (String product : productsInAllShops) {
            boolean productExistsInAllShops = true;
            for (int i = 1; i < sales.length; i++) {
                if (!Arrays.asList(sales[i]).subList(1, sales[i].length).contains(product)) {
                    productExistsInAllShops = false;
                    break;
                }
            }
            if (productExistsInAllShops) {
                result.add(product);
            }
        }

        return result;
    }
    

     //exercise 7
 public static boolean validSplit(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length < 2)
            return false;

        for (int i = 1; i < words.length; i++) {
            String prevWord = words[i - 1];
            String currWord = words[i];

            if (prevWord.charAt(prevWord.length() - 1) != currWord.charAt(0))
                return false;
        }
        return true;
    }
    
    
     //exercise 8
    public static boolean waveForm(int[] sequence) {
        if (sequence.length < 2) {
            return true;
        }

        boolean increasing = sequence[1] > sequence[0];

        for (int i = 1; i < sequence.length; i++) {
            int diff = sequence[i] - sequence[i - 1];

            if ((diff > 0 && !increasing) || (diff < 0 && increasing)) {
                return false;
            }

            increasing = !increasing;
        }

        return true;
    }

    
    
    //exercise 9   
         public static char commonVowel(String sentence) {
        String vowels = "aeiouAEIOU";
        Map<Character, Integer> vowelCounts = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                char lowercaseChar = Character.toLowerCase(c);
                vowelCounts.put(lowercaseChar, vowelCounts.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

        char mostCommonVowel = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : vowelCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostCommonVowel = entry.getKey();
            }
        }

        return mostCommonVowel;
    }

    
    
    //exercise 10
     public static void dataScience(int[][] arr) {
        int n = arr.length;

        for (int col = 0; col < n; col++) {
            int sum = 0;
            for (int row = 0; row < n; row++) {
                sum += arr[row][col];
            }
            int mean = sum / n;

            arr[col][col] = mean;
        }
    }
    
    
    
}
