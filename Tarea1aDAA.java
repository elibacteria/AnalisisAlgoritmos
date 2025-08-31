package tarea1adaa;

import java.util.HashSet;

public class Tarea1aDAA {

    public static void main(String[] args) {
        
        boolean encontrado = false; //Se declara encontrado como falsa
        int[] arreglo = new int[]{3, 5, 4, 2, 8, 1, 6, 7, 10, 11}; //arreglo de números
        int k = 18; //número que queremos encontrar si da la suma
        
        HashSet<Integer> vistos = new HashSet<>(); //Hash
        
        for(int num : arreglo){
            int complemento = k - num;
            
            if(vistos.contains(complemento)){
                encontrado = true;
                System.out.println("Los numeros son: " + num + " + " + complemento + " = " + k);
                break;
            }
            
            vistos.add(num);
        }
        
        if(encontrado){
            System.out.println("Si existe un par que sume " + k);
        } else{
            System.out.println("No existe nungún par que sume " + k);
        }
    }  
}
