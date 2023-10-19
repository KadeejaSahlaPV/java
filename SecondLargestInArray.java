public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 6, 72, 19, 30, 56, 88, 47, 32};

        if (numbers.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int largest = Integer.MIN_VALUE; // Initialize with the smallest possible value
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
