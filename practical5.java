import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.TimeZone;
import java.util.Date;


public class practical5 {

    public static void main(String[] args) {
    //for exercise1
     	boolean r1 = sameLetterPattern("ABAB", "CDCD");
        boolean r2 = sameLetterPattern("ABCBA", "BCDCB");
        boolean r3 = sameLetterPattern("FFGG", "CDCD");
        boolean r4 = sameLetterPattern("FFFF", "ABCD");

        System.out.println(r1); // Output: true
        System.out.println(r2); // Output: true
        System.out.println(r3); // Output: false
        System.out.println(r4); // Output: false
    
    System.out.println("__________________________________________________");
    
    //for exercise2
      	String lt1 = spiderVsFly("H3", "E2");
        String lt2 = spiderVsFly("A4", "B2");
        String lt3 = spiderVsFly("A4", "C2");

        System.out.println(lt1); // Output: H3-H2-H1-A0-E1-E2
        System.out.println(lt2); // Output: A4-A3-A2-B2
        System.out.println(lt3); // Output: A4-A3-A2-B2-C2
        
    System.out.println("__________________________________________________");
    
    //for exercise3
      	int rt1 = digitsCount(4666);
        int rt2 = digitsCount(544);
        int rt3 = digitsCount(121317);
        int rt4 = digitsCount(0);
        int rt5 = digitsCount(12345);
        int rt6 = digitsCount(1289396387328L);

        System.out.println(rt1); // Output: 4
        System.out.println(rt2); // Output: 3
        System.out.println(rt3); // Output: 6
        System.out.println(rt4); // Output: 1
        System.out.println(rt5); // Output: 5
        System.out.println(rt6); // Output: 13
    
        System.out.println("__________________________________________________");
        
        
       //for exercise4
      	String[] guessedWords1 = {"cat", "create", "sat"};
        String scrambledWord1 = "caster";
        int rlt1 = totalPoints(guessedWords1, scrambledWord1);

        String[] guessedWords2 = {"trance", "recant"};
        String scrambledWord2 = "recant";
        int rlt2 = totalPoints(guessedWords2, scrambledWord2);

        String[] guessedWords3 = {"dote", "dotes", "toes", "set", "dot", "dots", "sted"};
        String scrambledWord3 = "tossed";
        int rlt3 = totalPoints(guessedWords3, scrambledWord3);

        System.out.println(rlt1); // Output: 2
        System.out.println(rlt2); // Output: 108
        System.out.println(rlt3); // Output: 13
    
    System.out.println("__________________________________________________");
    
    
    //for exercise5
        int[] arr1 = {1, 2, 3, 4, 5};
        List<int[]> relt1 = sumsUp(arr1);

        int[] arr2 = {1, 2, 3, 7, 9};
        List<int[]> relt2 = sumsUp(arr2);

        int[] arr3 = {10, 9, 7, 2, 8};
        List<int[]> relt3 = sumsUp(arr3);

        int[] arr4 = {1, 6, 5, 4, 8, 2, 3, 7};
        List<int[]> relt4 = sumsUp(arr4);

        System.out.println(listToString(relt1));
        System.out.println(listToString(relt2));
        System.out.println(listToString(relt3));
        System.out.println(listToString(relt4));
    
       System.out.println("__________________________________________________");
       
    
    //for exercise6
        String[] classmates1 = {"95%", "83%", "90%", "87%", "88%", "93%"};
        String resu1 = takeDownAverage(classmates1);
        System.out.println(resu1);  // Output: "54%"

        String[] classmates2 = {"10%"};
        String resu2 = takeDownAverage(classmates2);
        System.out.println(resu2);  // Output: "0%"

        String[] classmates3 = {"53%", "79%"};
        String resu3 = takeDownAverage(classmates3);
        System.out.println(resu3);  // Output: "51%"
    
    System.out.println("__________________________________________________");
    
    
    //for exercise7
        String encodeResult = caesarCipher("encode", "hello world", 3);
        System.out.println(encodeResult);  // Output: "KHOOR ZRUOG"

        String decodeResult = caesarCipher("decode", "almost last task!", 4);
        System.out.println(decodeResult);  // Output: "EPQSWX PEWX XEWO!"
    
        System.out.println("__________________________________________________");
        
        
     //for exercise8
     	int setups1 = setSetup(5, 3);
        int setups2 = setSetup(7, 3);

        System.out.println(setups1); // Output: 60
        System.out.println(setups2); // Output: 210   
        
        System.out.println("__________________________________________________");
        
     
     //for exercise9
     	String timeDiff1 = timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra");
        String timeDiff2 = timeDifference("London", "July 31, 1983 23:01", "Rome");
        String timeDiff3 = timeDifference("New York", "December 31, 1970 13:40", "Beijing");

        System.out.println(timeDiff1); // Output: "2011-4-2 17:23"
        System.out.println(timeDiff2); // Output: "1983-8-1 00:01"
        System.out.println(timeDiff3); // Output: "1971-1-1 02:40"
     
       System.out.println("__________________________________________________");
       
       
       //for exercise10
        boolean isNew1 = isNew(3);
        System.out.println(isNew1);  // Output: true

        boolean isNew2 = isNew(30);
        System.out.println(isNew2);  // Output: true

        boolean isNew3 = isNew(321);
        System.out.println(isNew3);  // Output: false
        
           
        boolean isNew4 = isNew(123);
        System.out.println(isNew4);  // Output: true
        
        
        
    
    
    }
    
    
    
    
    //exercise1
        public static boolean sameLetterPattern(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (map.containsKey(char1)) {
                if (map.get(char1) != char2) {
                    return false;
                }
            } else {
                map.put(char1, char2);
            }
        }

        return true;
    }
    
    
    
    
    
    
    
    //exercise2 to fix this code
    
 
    public static double calculateAngle(char spiderRing, char flyRing) {
        // Calculate the angle based on ASCII values
        int asciiDifference = Math.abs(spiderRing - flyRing);
        double angle = asciiDifference * 45.0;

        // Find the shortest angle (between angle and its complement)
        double complementAngle = 360.0 - angle;
        return Math.min(angle, complementAngle);
    }

    public static String spiderVsFly(String spider, String fly) {

        // Extract coordinates of the spider and the fly
        char spiderRing = spider.charAt(0);
        int spiderRadial = Character.getNumericValue(spider.charAt(1));
        char flyRing = fly.charAt(0);
        int flyRadial = Character.getNumericValue(fly.charAt(1));

        double angle = calculateAngle(spiderRing, flyRing);
      
        StringBuilder path = new StringBuilder();
        
        
        if (angle == 135 || angle == 180) {
            // Move diagonally towards the center point (A0)
              
            while (spiderRadial > 0) {
                path.append(spiderRing).append(spiderRadial).append("-");
                spiderRadial--;
            }

            // Assemble the result
            path.append("A0-");
            
           int complFlyRadial = 1;
           while (complFlyRadial < flyRadial) {
                path.append(flyRing).append(complFlyRadial).append("-");
                complFlyRadial++;
            }
            
            path.append(fly);
            
            return path.toString();
            
            
        } else {
        
            while (spiderRadial > flyRadial) {
            path.append(spiderRing).append(spiderRadial).append("-");
            spiderRadial--;
             }

            while (spiderRadial < flyRadial) {
              path.append(spiderRing).append(spiderRadial).append("-");
              spiderRadial++;
            }

            
            // movement on the ring
            while (spiderRing > flyRing) {
                path.append(spiderRing).append(spiderRadial).append("-");
                spiderRing--;
            }

            while (spiderRing < flyRing) {
                path.append(spiderRing).append(spiderRadial).append("-");
                spiderRing++;
            }

            // Сollecting the result
            path.append(flyRing).append(flyRadial);

            return path.toString();

        } 
   			 
          
    }
    
    
    
    
   
    
    
    //exercise3
        public static int digitsCount(long num) {
        if (num == 0) {
            return 1;
        }
        if (num < 0) {
            num = -num;
        }
        return countDigitsRecursive(num);
    }

    private static int countDigitsRecursive(long num) {
        if (num < 10) {
            return 1;
        }
        return 1 + countDigitsRecursive(num / 10);
    }
    
    
    
    //exercise4
    public static int totalPoints(String[] guessedWords, String scrambledWord) {
        int totalPoints = 0;
        for (String word : guessedWords) {
            if (isValidWord(scrambledWord, word)) {
                totalPoints += calculateWordPoints(word);
            }
        }
        return totalPoints;
    }

    private static boolean isValidWord(String scrambledWord, String guessedWord) {
        int[] scrambledWordCount = new int[26];
        int[] guessedWordCount = new int[26];

        for (char c : scrambledWord.toCharArray()) {
            scrambledWordCount[c - 'a']++;
        }

        for (char c : guessedWord.toCharArray()) {
            guessedWordCount[c - 'a']++;
            if (guessedWordCount[c - 'a'] > scrambledWordCount[c - 'a']) {
                return false;
            }
        }

        return true;
    }

    private static int calculateWordPoints(String word) {
        int wordLength = word.length();
        if (wordLength == 3) {
            return 1;
        } else if (wordLength == 4) {
            return 2;
        } else if (wordLength == 5) {
            return 3;
        } else {
            return 4 + 50; // 4 points for a 6-letter word + 50 points bonus
}
}

    
    //exercise5
    
    public static List<int[]> sumsUp(int[] arr) {
        List<int[]> pairs = new ArrayList<>();
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = 8 - arr[i];
            if (indexMap.containsKey(complement)) {
                int j = indexMap.get(complement);
                int smaller = Math.min(arr[i], arr[j]);
                int larger = Math.max(arr[i], arr[j]);
                pairs.add(new int[]{smaller, larger});
            }

            // Store the index of the current element for future lookups
            if (!indexMap.containsKey(arr[i])) {
                indexMap.put(arr[i], i);
            }
        }

        return pairs;
    }

    public static String listToString(List<int[]> list) {
        StringBuilder sb = new StringBuilder("[");
        for (int[] pair : list) {
            sb.append(Arrays.toString(pair)).append(", ");
        }
        if (!list.isEmpty()) {
            sb.setLength(sb.length() - 2);  // Remove the trailing ", "
        }
        sb.append("]");
        return sb.toString();
    }
    
    
    //exercise6
     public static String takeDownAverage(String[] classmates) {
        int[] averages = new int[classmates.length];

        for (int i = 0; i < classmates.length; i++) {
            String score = classmates[i].replace("%", "");
            averages[i] = Integer.parseInt(score);
        }

        int sum = 0;
        for (int average : averages) {
            sum += average;
        }

        if (averages.length > 1) {
            int newAverage = (sum / averages.length);
            int reducedAverage = (int) (newAverage - 0.05 * newAverage);
            return reducedAverage + "%";
        } else {
            return "0%";
        }
    }
    
    
    //exercise7
     public static String caesarCipher(String operation, String message, int shift) {
        if ("encode".equals(operation)) {
            return shiftMessage(message, shift).toUpperCase(); // Convert to uppercase
        } else if ("decode".equals(operation)) {
            return shiftMessage(message, shift).toUpperCase(); // Convert to uppercase
        }
        return message.toUpperCase(); // Convert the original message to uppercase
    }

    public static String shiftMessage(String message, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : message.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                result.append((char) (base + (ch - base + shift + 26) % 26));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
    
    
    //exercise8
        public static int setSetup(int totalPeople, int groupSize) {
        if (groupSize == 1) {
            return totalPeople;
        } else {
            return totalPeople * setSetup(totalPeople - 1, groupSize - 1);
        }
    }
    
    
    
   //exercise9
       public static String timeDifference(String city1, String time1, String city2) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        try {
            Date date1 = sdf.parse(time1);
            long time1InMs = date1.getTime();

            String offset1 = getCityOffset(city1);
            long offset1InMs = parseOffset(offset1);

            String offset2 = getCityOffset(city2);
            long offset2InMs = parseOffset(offset2);

            long time2InMs = time1InMs + (offset2InMs - offset1InMs);
            Date date2 = new Date(time2InMs);

            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-M-d HH:mm");
            outputFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

            return outputFormat.format(date2);
        } catch (ParseException e) {
            return "Invalid date";
        }
    }

    private static long parseOffset(String offset) {
        // Parse offset like "+01:00" or "-07:00" into milliseconds
        int hours = Integer.parseInt(offset.substring(0, 3));
        int minutes = Integer.parseInt(offset.substring(4, 6));
        long totalMinutes = hours * 60 + minutes;
        return totalMinutes * 60 * 1000;
    }

    private static String getCityOffset(String city) {
        switch (city) {
            case "Los Angeles":
                return "-08:00";
            case "Canberra":
                return "+10:00";
            case "London":
                return "+00:00";  // Corrected the offset for London
            case "Rome":
                return "+01:00";  // Corrected the offset for Rome
            case "New York":
                return "-05:00";
            case "Beijing":
                return "+08:00";
            default:
                return "Unknown";
        }
    }
    
    
    //exercise10
    public static boolean isNew(int number) {
        String numberStr = String.valueOf(number);
        
        if (numberStr.contains("0")) {
            return true; // If the number contains a zero, it's a new number
        }
        
        char firstDigit = numberStr.charAt(0);
        for (int i = 1; i < numberStr.length(); i++) {
            if (firstDigit > numberStr.charAt(i)) {
                return false; // If the first digit is greater than any remaining digit, it's not a new number
            }
        }
        
        return true; // If none of the above conditions are met, it's a new number
    }
    
    
    
    
    }
