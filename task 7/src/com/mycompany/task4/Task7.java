package com.mycompany.task4;
import java.util.Scanner;

public class Task7
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int[] arr1=new int[5];
        int[] arr2=new int[5];

        int greater;
        int choice;

        //get input
        System.out.println("Enter 5 integer elements : ");
        for (int i=0;i<arr1.length;i++)
        {
            System.out.print("enter the element no " + (i+1) );
            arr1[i] = input.nextInt();
        }
        System.out.println();

        //number ordering algorithm
        for(int i=0;i<arr1.length;i++)
        {
            greater=0;
            for(int k=0;k<arr1.length;k++)
            {
                if(arr1[i]>arr1[k])
                {
                    greater++;
                }
            }
            arr2[greater]=arr1[i];
        }

        //ask if ascending or descending
        System.out.print("Display order :\n 1 - Ascending\n 2 - Descending\n Enter your choice : ");
        choice = input.nextInt();

        //output the numbers based on choice
        if(choice==1) //if the user entered a not A it's okay
        {
            for(greater=0;greater<arr2.length;greater++)
            {
                System.out.print(arr2[greater]+" ");
            }
        }
        else if(choice==2)
        {
            for(greater=9;greater>-1;greater--)
            {
                System.out.print(arr2[greater]+" ");
            }
        }
    }
}