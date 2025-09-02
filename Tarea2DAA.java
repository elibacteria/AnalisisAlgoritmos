package tarea2daa;

import java.util.List;

public class Tarea2DAA {

    public static void main(String[] args) {
        List<Integer> n = List.of(0,1,2,3,4,5,6,7,8,9);
        
        System.out.println("Comparaciones: " + buscar(n, 9));
    }
    
    private static int buscar(List a, int b){
        boolean encontrado = false;
        int count = 0;
        while(encontrado == false && count < a.size()){
            if(b == (int)a.get(count)){
                encontrado = true;
            }
            count++;
        }
        return count;
    }
}
