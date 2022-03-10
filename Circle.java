/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hamvaphuongthuc;

/**
 *
 * @author Admin
 */
public class Circle {
    private int bankinh;
    private int x,y;
    
    public Circle(){// alt+ insert
    
}

    public Circle(int bankinh, int x, int y) { // alt+ insert
        this.bankinh = bankinh;
        this.x = x;
        this.y = y;
    }

   
    public double chuvi(){
        double ketqua =  2*Math.PI*this.bankinh;
        return ketqua;
    }
    public double dientich(){
        double ketqua = Math.PI*this.bankinh*this.bankinh;
        return ketqua;
    }

    public int getBankinh() {
        return bankinh;
    }

    public void setBankinh(int bankinh) {
        this.bankinh = bankinh;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public static void main(String[] args) {
        
    }
}
    
