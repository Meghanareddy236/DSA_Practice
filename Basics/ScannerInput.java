package Basics;
import java.util.*;
public class ScannerInput{
    public static void main(String[] args){
        System.out.print("Enter Your Name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        
        System.out.print("Enter your marks:");
        int marks=sc.nextInt();

        System.out.print("My name is"+" "+name+"."+"I got"+" "+marks+" marks.");

        sc.close();
    }

}