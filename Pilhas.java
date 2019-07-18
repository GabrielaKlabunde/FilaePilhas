
package pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {

    public static void main(String[] args) {
    
        List<Integer> pilha = new LinkedList();
        
        pilha.add(10);
        pilha.add(20);
        pilha.add(30);
        pilha.add(40);
        pilha.add(50);
        pilha.add(60);
        
        System.out.println("Array correto: "+pilha);
        
        System.out.println("A lista ao contrário: ");
        int ultimoNum = pilha.size()-1;
        System.out.println(pilha.get(ultimoNum));
        pilha.remove(ultimoNum);
        
        ultimoNum = pilha.size()-1;
        System.out.println(pilha.get(ultimoNum));
        pilha.remove(ultimoNum);
      
        ultimoNum = pilha.size()-1;
        System.out.println(pilha.get(ultimoNum));
        pilha.remove(ultimoNum);
        
        ultimoNum = pilha.size()-1;
        System.out.println(pilha.get(ultimoNum));
        pilha.remove(ultimoNum);
 
        ultimoNum = pilha.size()-1;
        System.out.println(pilha.get(ultimoNum));
        pilha.remove(ultimoNum);
        
        ultimoNum = pilha.size()-1;
        System.out.println(pilha.get(ultimoNum));
        pilha.remove(ultimoNum);
           
        }
    }
   
