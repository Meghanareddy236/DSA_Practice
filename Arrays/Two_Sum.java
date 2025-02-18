package Arrays;
import java.util.*;

public class Two_Sum{
    public static int[] Sum(int arr[] , int target){
        
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array:");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element:");
        int target=sc.nextInt();

        int res[]=Sum(arr,target);

        if(res[0]!=-1){
            System.out.println(arr[res[0]]+ " "+arr[res[1]]);
        }
        else{
            System.out.println("No valid pair found");
        }
        sc.close();

    }

}
