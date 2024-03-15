/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatutorial.interfaces;

import java.util.Scanner;
import javatutorial.data.JData;

/**
 *
 * @author HP
 */
public class Login {

    String lname;
    int lpass;
    int k = 1;

    public void login(String a, int b) {
        try {
            Scanner r = new Scanner(System.in);
            JData obj = new JData();
            obj.setName(a);
            obj.setPassword(b);
            System.out.println("WELCOME JAVA WORLD\n\n");
            System.out.println("__LOGIN__\n");
            while (k != 0) {
                System.out.print("user name :- ");
                lname = r.next();
                System.out.print("password  :- ");
                lpass = r.nextInt();
                if ("Ruwa".equals(lname) || lname.equals(obj.getName())) {
                    if (lpass == 12345 || lpass == obj.getPassword()) {
                        System.out.println("login success");
                        Home obj2 = new Home();
                        obj2.javaLove();
                        k = 0;
                    } else {
                        System.out.println("\n");
                        System.out.print("register now (ok(press 1)/ cancel(press 0)) :- ");
                        int x = r.nextInt();
                        if (x == 1) {
                            Register obj1 = new Register();
                            obj1.register();
                        } else {
                            k = 1;
                        }
                    }
                } else {
                    System.out.println("\n");
                    System.out.print("register now (ok(press 1)/ cancel(press 0)) :- ");
                    int x = r.nextInt();
                    if (x == 1) {
                        Register obj1 = new Register();
                        obj1.register();
                    } else {
                        k = 1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }

}
