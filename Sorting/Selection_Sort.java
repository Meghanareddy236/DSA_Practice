package Sorting;

import java.util.Scanner;


public class Selection_Sort {
    public static int[] sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int small_ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[small_ind]){
                    small_ind=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[small_ind];
            arr[small_ind]=temp;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of elements in the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res[]=sort(arr);
        System.out.print("The Sorted Array is:");
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
        sc.close();
    }
    
}
