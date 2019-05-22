/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.util.Random;

/**
 *
 * @author Fernando Cota
 */
public class logica3 {
    public int[] getCardNumbers3() {
        
        int[] numbers = new int[20];
        int count = 0;
        
        while(count < 20) {
            Random r = new Random();
            int na = r.nextInt(10) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 20; i++) {
                if(numbers[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numbers[count] = na;
                count++;
            }//fin
            
        }
        
        
        return numbers;
    }
}
