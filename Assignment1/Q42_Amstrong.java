/*
42. Armstrong Numbers Between 100–500 
Scenario: Print all Armstrong numbers between 100 and 500. 

Output: 
153 
370 
371 
407 
*/

class Q42_Amstrong {
    public static void main(String[] args) {
        for (int num = 100; num <= 500; num++) {
            int sum = 0, temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}
/*
C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>javac Q42_Amstrong.java

C:\Users\Rushikesh Temkar\Desktop\Rushikesh\CDAC\Material\M2_OOPs\OOPJ_Assignment1>java Q42_Amstrong
153
370
371
407
*/