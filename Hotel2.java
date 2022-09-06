/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coba;

import java.util.Scanner;

/**
 *
 * @author moklet gaming
 */
public class Hotel2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.println("masukan nama kamar :     (duku/jeruk/alpukat/jambu/durian/melon/belimbing/mangga/kedondong/barrack)");
        String kamar = input.nextLine();
        System.out.println("masukan hari :        (Weekday/Weekend/Holiday)");
        String hari = input.nextLine();
        
        System.out.println("masukan jumlah orang :");
        int orang = input.nextInt();
      
        int harga = 0;
        
         if (kamar.equals("duku")) {
          if(orang <=2){
           if(hari.equals("weekday")) {
                harga = 915000;
            }else if(hari.equals("weekend")) {
                harga = 1025000;
            }else if(hari.equals("holiday")) {
                harga = 1225000;
           }else {
            harga = 0;
            }
         }else {
              System.out.println("kuota melebihi batas");
          }
         }
         
           if (kamar.equals("jeruk")) {
          if(orang <=2){
           if(hari.equals("weekday")) {
                harga = 915000;
            }else if(hari.equals("weekend")) {
                harga = 1025000;
            }else if(hari.equals("holiday")) {
                harga = 1225000;
           }else {
            harga = 0;
            }
         }else {
              System.out.println("kuota melebihi batas");
          }
         }
             
        if (kamar.equals("alpukat")) {
          if(orang <=1){
           if(hari.equals("weekday")) {
                harga = 575000;
            }else if(hari.equals("weekend")) {
                harga = 695000;
            }else if(hari.equals("holiday")) {
                harga = 895000;
           }else {
            harga = 0;
            }
         }else {
              System.out.println("kuota melebihi batas");
          }
         }
        
         if (kamar.equals("durian")) {
          if(orang <=2){
           if(hari.equals("weekday")) {
                harga = 595000;
            }else if(hari.equals("weekend")) {
                harga = 715000;
            }else if(hari.equals("holiday")) {
                harga = 915000;
           }else {
            harga = 0;
            }
         }else {
              System.out.println("kuota melebihi batas");
          }
         }
         
          if (kamar.equals("melon")) {
          if(orang <=2){
           if(hari.equals("weekday")) {
                harga = 595000;
            }else if(hari.equals("weekend")) {
                harga = 715000;
            }else if(hari.equals("holiday")) {
                harga = 915000;
           }else {
            harga = 0;
            }
         }else {
              System.out.println("kuota melebihi batas");
          }
         }
          
          if (kamar.equals("belimbing")) {
          if(orang <=2){
           if(hari.equals("weekday")) {
                harga = 495000;
            }else if(hari.equals("weekend")) {
                harga = 575000;
            }else if(hari.equals("holiday")) {
                harga = 755000;
           }else {
            harga = 0;
            }
         }else {
              System.out.println("kuota melebihi batas");
          }
         }
          
          if (kamar.equals("mangga")) {
          if(orang <=2){
           if(hari.equals("weekday")) {
                harga = 495000;
            }else if(hari.equals("weekend")) {
                harga = 575000;
            }else if(hari.equals("holiday")) {
                harga = 755000;
           }else {
            harga = 0;
            }
         }else {
              System.out.println("kuota melebihi batas");
          }
         }
          
          if (kamar.equals("kedondong")) {
          if(orang <=2){
           if(hari.equals("weekday")) {
                harga = 495000;
            }else if(hari.equals("weekend")) {
                harga = 575000;
            }else if(hari.equals("holiday")) {
                harga = 755000;
           }else {
            harga = 0;
            }
         }else {
              System.out.println("kuota melebihi batas");
          }
         }
          
          if (kamar.equals("barrack")) {
          if(orang >=0){
           if(hari.equals("weekday")) {
                harga = 25000*orang;
            }else if(hari.equals("weekend")) {
                harga = 25000*orang;
            }else if(hari.equals("holiday")) {
                harga = 35000*orang;
           }else {
            harga = 0;
            }
         }else {
              System.out.println("kuota kurang dari batas");
          }
         }
        
    
          
            
         
            
            
            
        System.out.println("Harga kamar " + kamar + " dengan jumlah orang " + orang + " pada " + hari + " = " + harga);
    
    
    
    }    
}
