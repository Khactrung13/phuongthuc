/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hamvaphuongthuc;

/**
 *
 * @author Admin
 */
public class Worker extends baitap1.Person {
    private String Congti;
    private String sodienthoai;

    public Worker() {
    }

    public Worker(String Congti, String sodienthoai, String hovaten, int Gioitinh) {
        super(hovaten, Gioitinh);
        this.Congti = Congti;
        this.sodienthoai = sodienthoai;
    }

  

    public String getCongti() {
        return Congti;
    }

    public void setCongti(String Congti) {
        this.Congti = Congti;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    
    
}