package exercicio4;

import java.util.ArrayList;

public class Main4 {
    
    ArrayList<Integer> arrayNumeros;
    int soma = 0;
    
    public Main4(){
        
        arrayNumeros = new ArrayList<>();
        
        arrayNumeros.add(3);
        arrayNumeros.add(5);
        arrayNumeros.add(6);
        arrayNumeros.add(1);
        
        for (int i=0; i<arrayNumeros.size(); i++){
            soma = soma + arrayNumeros.get(i);
        }
        
        System.out.println("TOTAL: "+soma);
    }
}
