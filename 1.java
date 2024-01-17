//Write a program to find the sum, difference, product, quotient and remainder of two numbers passed as command line argument.
    public static void main(String args[]) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Sum = "+(num1+num2));
        System.out.println("Difference = "+(num1-num2));
        System.out.println("Product = "+(num1*num2));
        System.out.println("Quotient = "+(num1/num2));
        System.out.println("Reminder = "+(num1%num2));
    }
}
