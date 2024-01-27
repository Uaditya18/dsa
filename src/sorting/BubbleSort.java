package sorting;

import java.util.Scanner;

public class BubbleSort {
    public String hello;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of items");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements ");

        for (int i=0;i<n;i++) {
         arr[i]= sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++)
            {
                if(arr[j+1]<arr[j]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }

}

// with the time complexcity O(n2)