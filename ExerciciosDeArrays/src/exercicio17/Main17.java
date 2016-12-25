package exercicio17;

import java.util.ArrayList;
import java.util.Scanner;

public class Main17 {
    
    int numero, media = 0, soma = 0;
    Scanner s;
    
    public Main17(){
        ArrayList<Integer> arrayNumeros = new ArrayList<>();
        
        System.out.println("Introduza 2 números inteiros à escolha");
        
        for (int i = 0; i < 10; i++){
            numero = s.nextInt();
            arrayNumeros.add(numero);
            soma = soma + arrayNumeros.get(i);
        }
        
        for(int i = 0; i < arrayNumeros.size(); i++){
            for(int n = 0; n < i; n++){
                if(arrayNumeros.get(i)>arrayNumeros.get(n)){
                    System.out.println("MAIOR NUMERO INTRODUZIDO: "+arrayNumeros.get(i));
                }
                else{
                    System.out.println("MAIOR NUMERO INTRODUZIDO: "+arrayNumeros.get(n));
                }
            }
        }
        
        media = soma/arrayNumeros.size();
        
        System.out.println("MÉDIA: "+media);
    }
    
}
