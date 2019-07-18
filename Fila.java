
package fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

    public static void main(String[] args) {
        
        List<Integer> fila = new LinkedList();
        
        fila.add(34);
        fila.add(90);
        fila.add(45);
        fila.add(8);
        fila.add(3);
        fila.add(61);
        
        System.out.println("Próximo item:");
        System.out.println(fila.get(0));
        fila.remove(0);
        
        System.out.println("Próximo item:");
        System.out.println(fila.get(0));
        fila.remove(0);
        
        System.out.println("Próximo item:");
        System.out.println(fila.get(0));
        fila.remove(0);
    }
    
}
