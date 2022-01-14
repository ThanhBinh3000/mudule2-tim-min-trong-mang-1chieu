package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("nhập kích thước của mảng 1 chiều");
        int size=input.nextInt();
        do {
            if (size>20){
                System.out.println("fill size again");
            }
        }while (size>20);
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Nhập giá trị của mảng ở vị trí "+i);
            arr[i]=input.nextInt();
        }
        System.out.print("array={");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("}");
        int index = minValue(arr);
        System.out.println("phần tử nhỏ nhất trong mảng là: " + arr[index]);

    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}