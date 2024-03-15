/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatutorial.interfaces;

import java.util.Scanner;

/**
 *
 * @author HP
 */

//Inheritence
public class Home extends HomeOld {


    public void javaLove() {
        try{
        Scanner r = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("__TYPE AND MAGIC__");
        System.out.println("\n");
        javaOldLove();
        System.out.println("\n");
        while (x != 0) {
            System.out.print("enter the expression ? ");
            a[c] = r.next();
            System.out.println("\n");
            System.out.print("do you want to continue ? (yes(press 1) / no(press 0))");
            System.out.println("\n");
            int v = r.nextInt();
            if (v == 1) {
                x = 1;
                c++;
            } else {
                while (w <= c) {
                    System.out.print(a[w] + " ");
                    w++;
                    x = 0;
                }
                String end = "END THE JOURNEY";
                javaLove(end);
            }
        }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    
    //Polymophism
    public void javaLove(String end){
      System.out.println(end);
      javaLove("*****","***");
    }
    
    public void javaLove(String a,String b){
      System.out.println(a);
      System.out.println(b);
    }
}
