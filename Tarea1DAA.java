package tarea1daa;

public class Tarea1DAA {

    public static void main(String[] args) {
    
        boolean encontrado = false; //Se declara encontrado como falsa
        int[] arreglo = new int[]{3, 5, 4, 2, 8, 1, 6, 7, 10, 11}; //arreglo de números
        int k = 18; //número que queremos encontrar si da la suma
        int n = arreglo.length; //tamaño del arreglo
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(arreglo[i] + arreglo[j] == k){
                    encontrado = true;
                    System.out.println("Los numeros son: " + arreglo[i] + " + " + arreglo[j] + " = " + k);
                    break;
                }
                
            }
            
            if(encontrado){
                break;
            }
        }
        
        if(encontrado){
            System.out.println("Si existe un par que sume " + k);
        } else{
            System.out.println("No existe nungún par que sume " + k);
        }
    }
}
