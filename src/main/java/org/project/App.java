package org.project;

import java.util.Scanner;

class chocolates{
    int cadbury=8;
    int perk=4;
    int crunch=1;
    int arr[]=new int[4];
    int[] pack_chocolates(int number) {
        /* position 0 defines no of crunch;
           position 1 defines no of perk;
           position 2 defines no of cadbury;
         */
        while (number != 0) {
            if (number >= 8) {
                arr[2]++;
                number -= cadbury;
            } else if (number >= 4) {
                arr[1]++;
                number -= perk;
            } else {
                arr[0]++;
                number -= crunch;
            }
        }
        return arr;
    }
}

class sweets{
    int total_candy;
    int candy=1;
    int ladoo=5;
    int barfi=7;
    int gulab_jamun=10;
    int arr[]=new int[4];
    int[] pack_sweets(int number){
        /* position 0 defines no of candy;
           position 1 defines no of laddo;
           position 2 defines no of barfi;
           position 3 defines no of gulab_jamun;
         */
        while(number!=0)
        {
            if(number>=10)
            {arr[3]++;number-=gulab_jamun;}
            else if(number>=7)
            {arr[2]++;number-=barfi;}
            else if(number>=5)
            {arr[1]++;number-=ladoo;}
            else
            {arr[0]++;number-=candy;}
        }
        total_candy+=arr[0];
        return arr;
    }


}

class childrens_gift{
    Scanner sc=new Scanner(System.in);
    int total_weight;
    int collect_gift()
    {
        System.out.println("Enter the no of gift : ");
        int temp_gift= sc.nextInt();
        total_weight+=temp_gift;
        return temp_gift;
    }

}

public class App
{
    static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println("Enter the no of Children : ");
        int n=sc.nextInt();
        childrens_gift obj=new childrens_gift();
        chocolates obj2=new chocolates();
        sweets obj3=new sweets();
        for(int i=0;i<n;i++)
        {
            System.out.println("Sorting cholates and sweets for child "+(i+1)+" :");
            int temp=obj.collect_gift();
            int chocolate []= obj2.pack_chocolates(temp/2);
            int sweet []= obj3.pack_sweets(temp/2);
            System.out.println();
            System.out.println("------------Chocolates-------------");
            System.out.println("No of cadbury    :  "+chocolate[2]);
            System.out.println("No of perks      :  "+chocolate[1]);
            System.out.println("No of crack      :  "+chocolate[0]);
            System.out.println();
            System.out.println("-------------Sweets---------------");
            System.out.println("No of gulab jamun:  "+sweet[3]);
            System.out.println("No of barfi      :  "+sweet[2]);
            System.out.println("No of ladoo      :  "+sweet[1]);
            System.out.println("No of candy      :  "+sweet[0]);
            System.out.println();
        }
        System.out.println("Total no of candy collected : "+obj3.total_candy);
        System.out.println("Total no of gift collected : "+obj.total_weight);
    }
}
