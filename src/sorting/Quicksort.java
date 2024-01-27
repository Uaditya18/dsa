package sorting;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class Quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        quicksort(arr,0,arr.length-1);
        for (int k=0;k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }

    public  static  int[] quicksort(int[] arr,int lb,int ub){
        if(lb<ub)
        {
            int mid = partition(arr,lb,ub);
            quicksort(arr,lb,mid-1);
            quicksort(arr,mid+1,ub);

        }

     return arr;
    }

    public static int partition(int[] arr,int lb,int ub){
//        int pivot = arr[lb];
//        int left = lb;
//        int right = ub;
//
//        while (left<right){
//            while(arr[left]<pivot){
//                left++;
//            }
//            while(arr[right]>pivot){
//                right--;
//            }
//            int temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//        }
//
//        int temp= arr[left];
//        arr[left]=arr[lb];
//        arr[lb]=temp;
//        return lb;



        int pivot = arr[ub];
        int i=lb-1;

        for(int j=lb;j<=ub-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }

        }
        int temp = arr[i+1];
        arr[i+1] = arr[ub];
        arr[ub]=temp;

        return i+1;
    }
}
