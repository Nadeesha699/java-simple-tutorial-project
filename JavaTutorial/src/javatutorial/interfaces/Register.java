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
public class Register {

    String ruser;
    int rnpass, rcpass;
    int s = 1;

    public void register() {
        try{
        Scanner r = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("__REGISTER__\n");
        System.out.print("new user name    :- ");
        ruser = r.next();
        while (s != 0) {
            System.out.print("new password     :- ");
            rnpass = r.nextInt();
            System.out.print("confirm password :- ");
            rcpass = r.nextInt();
            if (rnpass == rcpass) {
                System.out.println("\n");
                System.out.print("register success");
                Login obj = new Login();
                s = 0;
                obj.login(ruser, rcpass);
            } else {
               s = 1;
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
