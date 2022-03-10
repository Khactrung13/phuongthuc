/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hamvaphuongthuc;

/**
 *
 * @author Admin
 */
public class Person {
    private String hovaten;
        private int Gioitinh;
      

    public Person() {
    }

    public Person(String hovaten, int Gioitinh) {
        this.hovaten = hovaten;
        this.Gioitinh = Gioitinh;
 
    }

    

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public int getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(int Gioitinh) {
        this.Gioitinh = Gioitinh;
    }
}
