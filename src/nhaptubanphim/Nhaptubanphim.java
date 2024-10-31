/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhaptubanphim;

import java.util.Scanner;

public class Nhaptubanphim {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten cua ban : ");
        String name = sc.nextLine();
        System.out.println("Tuoi");
        int age = sc.nextInt();
        System.out.println("Gioi tinh");
        String sex = sc.nextLine();
        sc.nextLine();
        System.out.println("Chuyen nganh dang theo hoc : ");
        String nganh = sc.nextLine();
        System.out.println("GPA : ");
        float mark = sc.nextFloat();
        System.out.println("Que quan : ");
        String hometown = sc.nextLine();
        sc.nextLine();
//bai3
        System.out.println("day la so nguyen : ");
        boolean songuyen = sc.hasNextInt();
        System.out.println(songuyen);
//bai2
        System.out.println("Nhap vao chuoi : ");
        boolean chuoi = sc.hasNext();
        String a = chuoi ? sc.next() : null ;
        System.out.println("chuoi "+ (chuoi ? a : " chuoi khong hop le "));
        

    }

}
