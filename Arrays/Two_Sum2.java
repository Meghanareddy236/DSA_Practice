package Arrays;
import java.util.*;

public class Two_Sum2 {
    public static int[] Sum(int arr[],int target){
            int n=arr.length;
           
            int res[]=new int[2];;
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++){
                int diff=target-arr[i];
                if(hm.containsKey(diff)){
                    res[0]=diff;
                    res[1]=arr[i];
                    return res;
                    
                }
                hm.put(arr[i],i);
            }
            return res;
    
                           
    
        }
    
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the no of elements in the array:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.print("Enter the elements in the array:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("Enter the target:");
            int target=sc.nextInt();
            int res[]=Sum(arr,target);

            if(res[0]!=0){
                System.out.println(res[0]+" "+res[1]);
            }else{
                System.out.print("No valid pairs found");
            }
            sc.close();

        
        

    }
    
}
