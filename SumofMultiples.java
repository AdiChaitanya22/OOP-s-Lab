public class SumofMultiples {
    public static void main(String[] args) {
        int start = 10;
        int end = 950;
        int sum = 0;

        
        for (int i = start; i <= end; i++) {
            if (i % 18 == 0) {
                sum += i;
            }
        }

       
        System.out.println("The sum of all integers between 10 and 950 that are divisible by both 6 and 9 is: " + sum);
    }
}
