package sorting;

import java.util.Scanner;

public class Mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        mergesort(arr,0,arr.length-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void mergesort(int[] arr,int lb,int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergesort(arr, lb, mid);
            mergesort(arr, mid + 1, ub);
            merge(arr, lb, ub, mid);

        }
    }
    public static void merge(int[] arr, int lb,int ub,int mid ) {
      int n1 = mid -lb+1;
      int n2 = ub-mid;

      int [] l = new int[n1+1];
      int [] r = new int[n2+1];
      for(int i=0;i<n1;i++){
          l[i]=arr[lb+i];
      }
      for(int i=0;i<n2;i++)
      {
          r[i]=arr[mid+i+1];
      }
      l[n1]=9999; r[n2]=9999;

      int i=0;
      int j=0;
      for(int k=lb;k<=ub;k++){
          if(l[i]<=r[j]){
              arr[k]=l[i];
              i++;
          }
          else  {
              arr[k] = r[j];
              j++;

          }
      }
    }
    }

