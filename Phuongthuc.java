/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hamvaphuongthuc;

/**
 *
 * @author Admin
 */
public class Phuongthuc {
    public static void main(String[] args) {
       baitap1.Person ps = new baitap1.Person("nguyen van a", 1);
        System.out.println("Ho ten: " + ps.getHovaten() + " , Gioi tinh: " + ps.getGioitinh());
        
        baitap1.Student sinhvien = new baitap1.Student();
        sinhvien.setHovaten("nguyen van b");
        sinhvien.setTruonghoc("Dai hoc KHoa HOC");
        sinhvien.setGioitinh(1);
        sinhvien.setDiachilienhe("Hue");
        System.out.println("Ho ten : " + sinhvien.getHovaten() + ",Truong hoc: "+ 
                sinhvien.getTruonghoc()+ ",Dia chi lien he:" + sinhvien.getDiachilienhe()
        + ", Gioi tinh : " + sinhvien.getGioitinh());
        
        baitap1.Worker wk = new baitap1.Worker();
        wk.setCongti("Cong ty");
        wk.setHovaten("Nguyen van c" );
        wk.setGioitinh(1);
        wk.setSodienthoai("01597222");
        System.out.println("Cong ty : " + wk.getCongti() + ",Hovaten :" + wk.getHovaten()
        + ",Gioi tinh : " + wk.getGioitinh() + ", SO dien thoai : " + wk.getSodienthoai() );
    }
        
}
