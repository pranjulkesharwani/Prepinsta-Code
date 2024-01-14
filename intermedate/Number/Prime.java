// import java.util.Scanner;

// public class Prime {
//     public static boolean isPrime(int number) {

//         if(number < 2) 
//             return false;
//          else if(number == 2) 
//             return true;
//          else if(number % 2 == 0 ) {
//             return false;

//             for (int i=3; i<=Math.sqrt(number); i+=2) {
//                 if(number%i == 0) 
//                     return false;

//             }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int number = sc.nextInt();
//         // int num2 = sc.nextInt();

//         if (isPrime(number)) {
//             System.out.println("is prime");
//         } else {
//             System.out.println("Not Prime");
//         }
//     }

// }

import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        // 0 and 1 are not prime numbers
        // negative numbers are not prime
        if (n <= 1)
            return false;
        // special case as 2 is the only even number that is prime
        else if (n == 2)
            return true;
        // Check if n is a multiple of 2, thus all these won't be prime
        else if (n % 2 == 0)
            return false;
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.printf("%d is a prime number.%n", number);
        } else {
            System.out.printf("%d is not a prime number.%n", number);
        }
    }
}
