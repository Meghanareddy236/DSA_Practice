package Sorting;
import java.util.Scanner;

public class Bubble_Sort {
    public static int[] sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
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
