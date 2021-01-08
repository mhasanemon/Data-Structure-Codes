package com.company;

import java.util.*;

class Main {
    static Scanner input = new Scanner(System.in);

    static void mergeSort(int array[],int left,int right){
        int mid = (left+right)/2;

        if(left<right){
            //Sort the left part
            mergeSort(array,left,mid);

            //Sort the right part
            mergeSort(array,mid+1,right);

            //Merge  the two sorted parts
            Merge(array, left, mid, right);
        }
    }

    static void Merge(int array[],int left,int mid,int right){
        //Temporary array to store the sorted half
        int temp[] = new int[right+left+1];

        int pos = 0,lpos = left,rpos = mid+1;
        while (lpos<=mid && rpos<= right){
            if(array[lpos]<array[rpos]){
                temp[pos++] = array[lpos++];
            }

            else
            {
                temp[pos++] = array[rpos++];
            }
        }

        while (lpos<=mid){
            temp[pos++] = array[lpos++];
        }

        while (rpos<=right){
            temp[pos++] = array[rpos++];
        }

        //copy the sorted array to main array

        for(int i=0;i<pos;i++){
            array[i+left] = temp[i];
        }
    }

    static void PrintArray(int array[]){
        for(int i=0;i<array.length;i++)
            System.out.printf("%d ",array[i]);
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("Enter the number of elements:");
        int numOfelement = input.nextInt();

        int array[] = new int[numOfelement];

        System.out.println("Enter the elements one by one");

        for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
        }

        System.out.println("The given array is:\n");
        PrintArray(array);

        mergeSort(array,0,numOfelement-1);

        System.out.println("The Sorted array is:\n");
        PrintArray(array);
    }
}