/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author kal mes
 */
public class JavaApplication4 extends controler{ 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controler c =new controler();
       System.out.println("<-------------- WELLCOME -------------->");
       System.out.println("you can order multiple things");
       Scanner input = new Scanner(System.in);
       System.out.println("Today's menu : \n enter 1 for salad $32 \n enter 2 for juice $23 \n enter 3 for chicken $66 \n enter 4 for softDrinks $16");
       System.out.println("please order ");
       String number = input.next();    
        switch (number){
            case "1":c.first();break;
               
            case "2":c.second();break;
                
            case "3":c.fourth();break;
                
            case "4":c.fifth();break;
                
            case "1 2":c.sixth();break;
             case "1 3":c.seventh();break;
             case "1 4":c.eighth();break;
             case "2 3":c.ninth();break;
              case "2 4":c.tenth();break;
             case "3 4":c.eleventh();break;
              case "1 2 3":c.twelvth();break;
             case "2 3 4":c.efr();break;
             case "1 3 4":c.fourtin();break;
              case "1 2 3 4":c.fiftin();
                                      
                                          
        }
    }

}
