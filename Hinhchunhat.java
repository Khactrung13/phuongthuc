/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hamvaphuongthuc;

/**
 *
 * @author Admin
 */
public class Hinhchunhat {
    private int x;
    private int y;

    public Hinhchunhat() {
    }

    public Hinhchunhat(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double  tinhchuvi(){
        double ketqua = 2*(this.x+this.y);
        return ketqua;
        
    }
    public double tinhdientich(){
        double ketqua = this.x*this.y;
        return ketqua;
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
    
}
