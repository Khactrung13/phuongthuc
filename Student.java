/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hamvaphuongthuc;
/**
 *
 * @author Admin
 */
public class Student extends Person{
     private String truonghoc;
    private String diachilienhe;

    public Student() {
    }

    public Student(String truonghoc, String diachilienhe, String hovaten, int Gioitinh) {
        super(hovaten, Gioitinh);
        this.truonghoc = truonghoc;
        this.diachilienhe = diachilienhe;
    }

    

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    public String getDiachilienhe() {
        return diachilienhe;
    }

    public void setDiachilienhe(String diachilienhe) {
        this.diachilienhe = diachilienhe;
    }
}
