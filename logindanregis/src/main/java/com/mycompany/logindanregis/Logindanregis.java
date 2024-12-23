/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.logindanregis;

/**
 *
 * @author D-11
 */
public class Logindanregis {

    public static void main(String[] args) {
        Register reg = new Register();
        reg.setVisible(true);
        
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(Register.EXIT_ON_CLOSE);
    }
}
