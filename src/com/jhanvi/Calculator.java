package com.jhanvi;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Stops by entering 'x' or 'X'
        int ans=0;
        while(true){
            System.out.println("Enter the operator:");
            char op=sc.next().trim().charAt(0);
            if (op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                //input 2 numbers
                System.out.println("Enter the first number:");
                int a=sc.nextInt();
                System.out.println("Enter the second number:");
                int b=sc.nextInt();

                if(op=='+'){
                    ans=a+b;
                }
                if(op=='-'){
                    ans=a-b;
                }
                if(op=='*'){
                    ans=a*b;
                }
                if(op=='/'){
                    if(b!=0){
                        ans=a/b;
                    }
                }
                if(op=='%'){
                    ans=a%b;
                }
            }else if(op=='x'||op=='X'){
                break;
            }else{
                System.out.println("Invalid operation!!!");
            }
            System.out.println(ans);
        }


    }

}
