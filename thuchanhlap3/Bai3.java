/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class Bai3 {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> sv;     public Bai3() {sv = new ArrayList<>();}

    class SinhVien {        
        String ma, hoTen;       int namSinh;
        public SinhVien() { }
        public SinhVien(String ma, String hoTen, int namSinh) {
            this.ma = ma;   this.hoTen = hoTen;    this.namSinh = namSinh; }
        public String getMa() { return ma; }
        public String getHoTen() { return hoTen; }
        public int getNamSinh() { return namSinh; }
        void nhapTTSV() {
            System.out.println("Nhập mã sinh viên: "); ma=sc.nextLine();
            System.out.println("Nhập họ tên sinh viên: "); hoTen=sc.nextLine();
            System.out.println("Nhập năm sinh sinh viên: "); namSinh=sc.nextInt(); }
        void xuatTT() {
            System.out.println("Mã\tHọ Tên\tNăm Sinh"); }
        void xuatTTSV() {
            System.out.println(getMa()+"\t"+getHoTen()+"\t\t\t\t"+getNamSinh()); }
        void xuatDSSV() {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            for(SinhVien x: sv) { x.xuatTT();}
            System.out.println("------------------------------------------------------------");
            for(SinhVien x: sv) { x.xuatTTSV();}
            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"); }
        }
        void them1SV(SinhVien s) {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
            System.out.println("Nhập thêm 1 sinh viên: \n");
            if(s instanceof SinhVien) { s=new SinhVien();       s.nhapTTSV(); }
            sv.add(s);
            System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"); }
        void xoaSV(String ma) { for(SinhVien x: sv) { if(x instanceof SinhVien) { sv.remove(x); } } }
        void suaSV(String ma) {
            for(SinhVien x: sv) {
                if(x instanceof SinhVien) { 
                    System.out.println("Sửa:");
                    System.out.println("Nhập họ tên sinh viên: "); x.hoTen=sc.nextLine();
                    System.out.println("Nhập năm sinh sinh viên: "); x.namSinh=sc.nextInt(); } } }
        void timKiemMa() {
            System.out.println("Nhập mã sinh viên muốn tìm: ");
            // ...
        }
        void timKiemTen() {
            System.out.println("Nhập họ tên sinh viên muốn tìm: "); 
            // ...
        }
        void SapXepMaTangDan() {
            // ...
        }
        void menu() {
            System.out.println("\n________________Menu Chức Năng________________");
            System.out.println("1: Thêm 1 sinh viên");
            System.out.println("2: Xóa 1 sinh viên");
            System.out.println("3: Sửa 1 sinh viên");
            System.out.println("4: Tìm kiếm sinh viên theo mã");
            System.out.println("5: Tìm kiếm sinh viên theo tên");
            System.out.println("6: Sắp xếp sinh viên tăng dần theo mã");
            System.out.println("7: Kết thúc chương trình");
            System.out.println("______________________________________________\n"); }
        
    class main {
        public static void main(String[] args) {
            
        }
    }
}