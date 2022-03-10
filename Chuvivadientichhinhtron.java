/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hamvaphuongthuc;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Chuvivadientichhinhtron {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh:");
        int bankinh = sc.nextInt();
        System.out.println("Nhap x:");
        int x = sc.nextInt();
        System.out.println("Nhap y :");
        int y= sc.nextInt();
        
        
        Circle htron = new Circle(bankinh, x, y);
        System.out.println("chu vi cua hinh tron la: " + htron.chuvi());
        System.out.println("Dien tich hinh tron la : " + htron.dientich());
        
        
        Hinhchunhat hcn = new Hinhchunhat(x, y);
        System.out.println("Chu vi hinh chu nhat la : " + hcn.tinhchuvi());
        System.out.println("Dien tich hinh chu nhat la : " + hcn.tinhdientich());
    }
}
