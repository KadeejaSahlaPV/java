/*
 3.Read an array of 10 or more numbers and write a program to find the
 1.Smallest element in the array
 2.Largest element in the array
 3.Second largest element in the array*/


import java.util.Scanner;

public class ArrayAnalysis {
    public static void main(String[] args) {
        int i,j,temp;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers :");
        for(i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array :");
        for(i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<10;i++){
            for(j=i;j<10;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\nSmallest element :"+arr[0]);
        System.out.println("Largest element : "+arr[9]);
        System.out.println("Second Largest element : "+arr[8]);
    }
}
