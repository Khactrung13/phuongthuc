/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hamvaphuongthuc;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhapNsonguyentubanphim {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i=0; i<n; i++){
            System.out.printf("nhap a[%d]: ",i+1);
            a.add(sc.nextInt());
           
    }
        System.out.println(a);
      
}
}