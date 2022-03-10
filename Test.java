/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hamvaphuongthuc;

import static java.lang.Double.sum;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
   public static int solonnhat(int m ,int n,int k ) {
       int max;
       if (n>m && n>k){
           max = n;
       }
       if(k>n &&k>m){
           max= k ; 
       }
       else {
          max= m;
       }
    
       return max;
    
}
           
   public static int sum(int i1,int i2){
       int sum=0;
       for (int i=i1;i<=i2;i++){
           sum+=i;
       }
       return sum;
       
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap i1 va i2");
        int i1= sc.nextInt();
        int i2= sc.nextInt();
        int tong = sum(i1,i2);
 

        System.out.println("Tong la : " + tong);
//        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap n , m , k ");
        int m= sc.nextInt();
        int n= sc.nextInt();
        int k =sc.nextInt();
        int ketqua = solonnhat(n,m,k);
        System.out.println("So lon nhat la : " + ketqua);
    }
        
}
