/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Praktikum
 */
public class reverseFibonaci {
            public void calculateFibonaciReverse(int febCount){
       	
        int[] feb = new int[febCount];
        feb[0] = 0; 
        feb[1] = 1;
        for(int i=2; i< febCount; i++){
            feb[i] = feb[i-1] + feb[i-2]; 
        } 
        for(int i=febCount-1; i>=0; i--){
        System.out.print(feb[i] + ","); 
        }
        
        }
}
