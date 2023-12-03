public class practical1 {

    public static void main(String[] args) {
    //for exercise1
    	System.out.println(convert(5));
    	System.out.println(convert(3));
    	System.out.println(convert(8));
    	
    	System.out.println("__________________________________________________");
    	
    //for exercise2	
    
    	int calories1 = fitCalc(15, 1);
        int calories2 = fitCalc(24, 2);
        int calories3 = fitCalc(41, 3);

        System.out.println("fitCalc(15, 1) = " + calories1);
        System.out.println("fitCalc(24, 2) = " + calories2);
        System.out.println("fitCalc(41, 3) = " + calories3);
    	
    	System.out.println("__________________________________________________");
    	
    //for exercise3
	int res1 = containers(3, 4, 2);
        int res2 = containers(5, 0, 2);
        int res3 = containers(4, 1, 4);

        System.out.println("containers(3, 4, 2) = " + res1);
        System.out.println("containers(5, 0, 2) = " + res2);
        System.out.println("containers(4, 1, 4) = " + res3);
        
        System.out.println("__________________________________________________");
    	
   //for exercise4
   	System.out.println("triangleType(5, 5, 5) = " + triangleType(5, 5, 5));
        System.out.println("triangleType(5, 4, 5) = " + triangleType(5, 4, 5));
        System.out.println("triangleType(3, 4, 5) = " + triangleType(3, 4, 5));
        System.out.println("triangleType(5, 1, 1) = " + triangleType(5, 1, 1));
        
        System.out.println("__________________________________________________");
	 
   //for exercise5
        int result1 = ternaryEvaluation(8, 4);
        int result2 = ternaryEvaluation(1, 11);
        int result3 = ternaryEvaluation(5, 9);

        System.out.println("ternaryEvaluation(8, 4) = " + result1);
        System.out.println("ternaryEvaluation(1, 11) = " + result2);
        System.out.println("ternaryEvaluation(5, 9) = " + result3);
        
        System.out.println("__________________________________________________");
        
    //for exercise6
        int re1 = howManyItems(22, 1.4, 2);
        int re2 = howManyItems(45, 1.8, 1.9);
        int re3 = howManyItems(100, 2, 2);

        System.out.println("howManyItems(22, 1.4, 2) = " + re1);
        System.out.println("howManyItems(45, 1.8, 1.9) = " + re2);
        System.out.println("howManyItems(100, 2, 2) = " + re3);
        
        System.out.println("__________________________________________________");
        
    //for exercise7
        int number1 = 3;
        int number2 = 5;
        int number3 = 7;

        long factorial1 = factorial(number1);
        long factorial2 = factorial(number2);
        long factorial3 = factorial(number3);

        System.out.println("factorial(3) = " + factorial1);
        System.out.println("factorial(5) = " + factorial2);
        System.out.println("factorial(7) = " + factorial3);    
        
        System.out.println("__________________________________________________");
        
    //for exercise8
        int rlt1 = gcd(48, 18);
        int rlt2 = gcd(52, 8);
        int rlt3 = gcd(259, 28);

        System.out.println("gcd(48, 18) = " + rlt1);
        System.out.println("gcd(52, 8) = " + rlt2);
        System.out.println("gcd(259, 28) = " + rlt3);
        
    //for exercise9
	int rt1 = ticketSaler(70, 1500);
        int rt2 = ticketSaler(24, 950);
        int rt3 = ticketSaler(53, 1250);

        System.out.println("ticketSaler(70, 1500) = " + rt1);
        System.out.println("ticketSaler(4, 950) = " + rt2);
        System.out.println("ticketSaler(53, 1250) = " + rt3);
        System.out.println("__________________________________________________");
     
     //for exercise10
        int r1 = tables(5, 2);
        int r2 = tables(31, 20);
        int r3 = tables(13, 58);

        System.out.println("tables(5, 2) = " + r1);
        System.out.println("tables(31, 0) = " + r2);
        System.out.println("tables(13, 58) = " + r3);
        
	}
	
		 
//exercise 1	 
    public static double convert(int gallons) {
        double liters = gallons * 3.78541;
        return liters;
        }
    
//exercise 2        
    public static int fitCalc(int durationMinutes, int intensity) {
        int caloriesBurned = durationMinutes * intensity;
        return caloriesBurned;
    }
    
//exercise 3
   public static int containers(int boxes, int bags, int crates) {
        int totalItems = (boxes * 20) + (bags * 50) + (crates * 100);
        return totalItems;
    }
    
//exercise 4
   public static String triangleType(int X, int Y, int Z) {
        if (X <= 0 || Y <= 0 || Z <= 0 || X + Y <= Z || X + Z <= Y || Y + Z <= X) {
            return "not a triangle";
        } else if (X == Y && Y == Z) {
            return "equilateral";
        } else if (X == Y || Y == Z || X == Z) {
            return "isosceles";
        } else {
            return "different-sided";
        }
	}
	
//exercise5
    public static int ternaryEvaluation(int a, int b) {
        int result = (a > b) ? a : b;
        return result;
    }
    
//exercise6
    public static int howManyItems(double fabricLengthMeters, double itemWidthMeters, double itemCount) {
        double fabricNeededMeters = itemWidthMeters * itemCount;
        int rollsNeeded = (int) Math.ceil(fabricLengthMeters/fabricNeededMeters);
        return rollsNeeded;      
    }
    
//exercise7
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
            result *= i;
            }
            return result;
        }
        }

//exercise8     
     public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    
}

//exercise9
  public static int ticketSaler(int numberOfTickets, int ticketPrice) {
        int commission = 50; // Фиксированная комиссия
        int totalRevenue = numberOfTickets * (ticketPrice - commission);
        return totalRevenue;
    }


//exercise10
  public static int tables(int students, int desks) {
        int tablesNeeded = (students + 1) / 2; // Rounding up to account for two students per table
        int tablesShortage = Math.max(0, tablesNeeded - desks);
        return tablesShortage;
    }
    
    
    
}
