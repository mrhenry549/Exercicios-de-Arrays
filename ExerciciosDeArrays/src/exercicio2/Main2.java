/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Main2 {
    char caracter;
    int inc = 0;
    Scanner s = new Scanner(System.in);
    ArrayList<Character> arrayChars;
    
    public Main2(){
        arrayChars = new ArrayList<>();
        
        System.out.println("Introduza 5 caracteres à escolha");
        
        for (int i = 0; i < 5; i++){
            caracter = s.next().charAt(0);
            arrayChars.add(caracter);
        }
        
        for(int i = 0; i < arrayChars.size(); i++){
            if(arrayChars.get(i)=='0' ||
                    arrayChars.get(i)=='1' ||
                    arrayChars.get(i)=='2' ||
                    arrayChars.get(i)=='3' ||
                    arrayChars.get(i)=='4' ||
                    arrayChars.get(i)=='5' ||
                    arrayChars.get(i)=='6' ||
                    arrayChars.get(i)=='7' ||
                    arrayChars.get(i)=='8' ||
                    arrayChars.get(i)=='9'){
                inc++;
            }
        }
        System.out.println("Nº de caracteres compreendidos entre 0 e 9: "+inc);
    }
}
