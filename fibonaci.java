/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

/**
 *
 * @author Praktikum
 */
public class fibonaci {
    

    public void calculateFibonaci(int febCount){
       	int abc = 200;
        int[] feb = new int[febCount];
        feb[0] = 0; 
        feb[1] = 1;
        for(int i=2; i< febCount; i++){
            feb[i] = feb[i-1] + feb[i-2]; 
        } 
        for(int i=0; i< febCount; i++){
        System.out.print(feb[i] + ","); 
        } 
    } 
    
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
        
        

    public void makeDiamond(int a){
            for (int i = 1; i < a; i += 2) {
      for (int j = 0; j < a - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }

    for (int i = 7; i > 0; i -= 2) {
      for (int j = 0; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }
    }
    
    
    public  void jumlah_deret(int a){
        int temp=0;
        for (int i = 0; i <= a; i++) {
            temp = i+temp;
            System.out.println(temp);
        }
        //System.out.println(temp);
    }
    
}


