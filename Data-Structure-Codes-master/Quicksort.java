package com.company;

import java.util.*;


class Main{
    static Scanner input = new Scanner(System.in);
    static ArrayList<Integer> arrayList = new ArrayList<>();

    static void Quicksort(ArrayList<Integer> arrayList,int left,int right){
        int i=left;
        int j = right;
        int temp;
        int pivot = arrayList.get((left+right)/2);

        while (i<=j){
            while (arrayList.get(i)<pivot){
                i++;
            }
            while (arrayList.get(j)>pivot){
                j--;
            }
            if(i<=j){
                temp = arrayList.get(i);
                arrayList.set(i,arrayList.get(j));
                arrayList.set(j,temp);
                i++;
                j--;
            }
        }
        if(left<j)
            Quicksort(arrayList,left,j);
        if(i<right)
            Quicksort(arrayList,i,right);
    }





    public static void main(String[] args) {

        System.out.println("Enter the number of element:");
        int numOfelement = input.nextInt();
        System.out.printf("Enter the values:\n");

        for(int i=0;i<numOfelement;i++){
            int value = input.nextInt();
            arrayList.add(value);
        }

        Quicksort(arrayList,0,arrayList.size()-1);

        System.out.println("The sorted elements are:");
        for(int i=0;i<numOfelement;i++){
            System.out.printf("%d ",arrayList.get(i));
        }
    }
}

