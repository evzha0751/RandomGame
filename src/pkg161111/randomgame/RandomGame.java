/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg161111.randomgame;

import java.util.*;
public class RandomGame {

    
    public static void main(String[] args) {
    
        
    int Max = 5,score;
    int[] numArray = new int[9];
    
  
    for(int i=0;i<9;i++){
    numArray[i]=(int)(Math.random()*5+1);
        System.out.print("[ "+numArray[i]+" ]   ");
        if(i==2||i==5||i==8){
            System.out.println("");
        }
    }

    
    
      
    
}
}
