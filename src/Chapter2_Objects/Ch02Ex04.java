/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2_Objects;

/**
 *
 * @author IX Hero
 */
class DataOnly {
    
    int num;
    double dnum;
    char ch;
    
}

public class Ch02Ex04 {
    public static void main(String[] args) {
        
        DataOnly dataOnly = new DataOnly();
        int num = dataOnly.num = 15;
        double dnum = dataOnly.dnum = 0.1;
        char ch = dataOnly.ch = 'a';
        
        System.out.println(num);
        System.out.println(dnum);
        System.out.println(ch);
        
    }
}
