package Hashing;
import java.util.HashMap;

public class Hashmap {
    
    public static void main(String[] args){
        int arr[]={2 , 3, 5,2,2,1};
        HashMap<Integer,Integer> hp=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(hp.containsKey(arr[i])){
                hp.put(arr[i],hp.get(arr[i])+1);
            }else{
                hp.put(arr[i],1);
            }
        }
        for(int i:hp.keySet()){
            if(hp.get(i)>2){
                System.out.print("The Majority element is:"+i);
            }
        }
        
        
    }
    
}
