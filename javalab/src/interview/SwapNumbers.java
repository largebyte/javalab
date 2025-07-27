package interview;

/*Write a Java Program to swap two numbers without using the third
variable.*/
public class SwapNumbers {
    public String swapNumbersWithoutThirdVariable(int a, int b) {
        // Using arithmetic operations to swap without a third variable
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract the new value of 'a' with 'b' to get original 'a'
        a = a - b; // Step 3: Subtract the new value of 'b' from 'a' to get original 'b'

        return "Swapped Numbers are: a = " + a + ", b = " + b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println(new SwapNumbers().swapNumbersWithoutThirdVariable(num1, num2));
    }
}
