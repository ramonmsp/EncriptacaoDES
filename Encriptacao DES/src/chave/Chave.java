/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chave;

/**
 *
 * @author Ricardo
 */
public class Chave {
    
    
    public Chave(){
        
    }
    
   public String permuta(String chave){
       System.out.println("Chave: "+chave);
            chave=bitsTexto(chave);
            System.out.println("Chave Bit: "+chave);
           String saida="";    
        int PI[] = {57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18,
            10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 
            47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53,
            45, 37, 29, 21, 13, 5, 28, 20, 12, 4};

        for(int i = 0; i < 56; i++){
            saida += chave.charAt(PI[i] - 1);
        }
        System.out.println("Chave Perm: "+saida);
        return saida;
    }
 
       private String bitsTexto(String texto){
         byte[] bytes = texto.getBytes();  
        String[] binarios = new String[bytes.length];  
        String saida=""; 
        int cont=0;
        String zero="";        
        // jogando prum array de string  
        for (int i=0; i < bytes.length; i++) {  
            binarios[i] = Integer.toBinaryString(bytes[i]); 
          
            cont=binarios[i].length();
            if (cont<8) {
             while(cont<8){
              zero+="0";
              cont++;
              }
             binarios[i]=zero+""+binarios[i];
             zero="";
        }  
            saida+=binarios[i];
        }
        return saida;
}
       
       
   
}
    
