/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitdemo;

/**
 *
 * @author Oktawian
 */
public class BitDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int bitmask = 0x0F0F;
        int val = 0x2222;
        
        System.out.println(val & bitmask);
    }
    
}
