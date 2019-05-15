package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nhapchuoi = "nguyenngocbang";
        char kytu;
        System.out.println("Nhap ky tu can dem");
        kytu = scanner.next().charAt(0);
        int count=0;
        for (int i=0;i<nhapchuoi.length();i++){
            if (nhapchuoi.charAt(i)==kytu){
                count++;
            }
        }
        System.out.println("ky tu "+"'"+kytu+"'"+" xuat hien "+count);
    }
}
