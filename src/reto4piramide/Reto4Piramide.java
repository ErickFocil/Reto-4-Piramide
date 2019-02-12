package reto4piramide;

import java.util.Scanner;

public class Reto4Piramide {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String lectura, espacios = "", asteriscos = "*";
        int pirTam;
        
        System.out.println("Idique el tamaño de la piramide: ");
        lectura = entrada.next();
        pirTam = Integer.parseInt(lectura);
        
        for(int i = 0; i < pirTam; i++){
            
            for(int j = 0; j < pirTam - i; j++){
                espacios += " ";
            }
            
            for(int j = 0; j < i; j++){
                asteriscos += "**";
            }
            
            System.out.println(espacios + asteriscos);
            
            espacios = "";
            asteriscos = "*";
        }
        
        
    }
    
}
