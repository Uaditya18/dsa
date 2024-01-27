package sorting;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }



        for(int i=0;i<n;i++){
            int min =i;
            int j=i+1;
            while (j<n){
                if(arr[min]>arr[j]){
                    min=j;
                }
                j++;
            }
            if(min!=i){
                int temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
