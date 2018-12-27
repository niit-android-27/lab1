/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android27_lab1;

import java.util.Scanner;

/**
 *
 * @author Lrandom
 */
public class Android27_Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Bai tap tinh VAT
        /*
        //Nhap vao so tien
        System.out.println("Nhap vao so tien");
        Scanner scanner = new Scanner(System.in);
        float price = scanner.nextFloat();
        
        //tinh vat 
        float afterVat = price+(price*10)/100;
        
        //in ra 
        System.out.println("Gia sau thue la "+afterVat);*/
        
        //Bai tap chuyen doi cm-inch && inch-cm
        /*Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
                case 1:
                    //doi cm - inch 
                    System.out.println("Ban chon doi tu cm-inch");
                    System.out.println("Nhap vao cm");
                    float cm= scanner.nextFloat();
                    float inch = (float)(cm/2.54);
                    System.out.println("So inch sau chuyen doi la"+inch);
                    break;
                
                case 2:
                    //doi inch - cm 
                    System.out.println("Ban chon doi tu inch-cm");
                    System.out.println("Nhap vao inch");
                    float inch1= scanner.nextFloat();
                    float cm1 = (float)(inch1*2.54);
                    System.out.println("So cm sau chuyen doi la"+cm1);
                    break;
        }*/
        //tao menu 
        do{
            System.out.println("Moi ban chon");
            System.out.println("1. Them moi nv");
            System.out.println("2. List danh sach nv");
            System.out.println("3. Tim kiem nv theo id");
            System.out.println("4. Xoa nv theo id");
            System.out.println("5. Tinh luong trung binh");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    // code them moi nv go here
                    break;
                    
                case 2:
                    //code list danh sach nv go here
                    break;
                    
                case 3:
                    //code tim kiem nv theo id go here
                    break;
                    
                case 4:
                    //code xoa nv theo id go here
                    break;
                
                case 5:
                    //code tinh luong tb nv go here
                    break;
                
                default:
                    System.exit(0);
                    break;
            }
        }while(true);
        
    }
}
