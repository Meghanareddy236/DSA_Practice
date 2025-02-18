package Basics;

public class Loops {
    public static void main(String[] args){
        System.out.println("Illustration of if-else loop");
        int age=18;
        if(age<18){
            System.out.print("Not eligible to vote.");
        }
        else{
            System.out.println("You are eligible to vote");
        }

        System.out.println("Illustration of for loop");
        int n=5;
        for(int i=1;i<n;i++){
            System.out.println(i+" ");
        }
        System.out.println("Illustration of while loop");
        int i=1;
        while(i<5){
            System.out.println(i);
            i++;
        }

        //switch case
        System.out.println("Illustration of switch case");
        int day=1;
        switch(day){
            case 1:System.out.print("Monday");
            break;
            case 2:System.out.print("Tuesday");
            break;
            default:System.out.print("Default Day");

        }
    }
    
}
