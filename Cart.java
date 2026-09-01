import java.util.ArrayList;
import java.util.List;

public class Cart<T> {

    private List<T> carrinho;

    public Cart() { //construtor de carrinho
        this.carrinho = new ArrayList<>();
    }

    public void adicionarCoisas(T coisa) { // como adiciono
        carrinho.add(coisa);
    }

    public void mostrar() { // laço para exibir carrinho
        for (T coisa : carrinho) {
            System.out.println(coisa);
            
          
        }
    }

     public int total() {
        
          return carrinho.size();
            
        
    }
}