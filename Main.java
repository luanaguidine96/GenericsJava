public class Main {
    public static void main(String[] args) {

        Cart<Alimento> carrinho = new Cart<>();

        Maca m = new Maca("Fazenda do Brasil", 2026, 2025, "Verde");
        Maca m1 = new Maca("Fazenda do Japao", 2026, 2024, "Vermelha");
        carrinho.adicionarCoisas(m);
        carrinho.adicionarCoisas(m1);
         Banana b = new Banana("Fazenda da India", 2027, 2022, "Verde");
        Banana b1 = new Banana("Fazenda da Argentina", 2028, 2021, "Amarela");
        carrinho.adicionarCoisas(b);
        carrinho.adicionarCoisas(b1);



        m.come();
        m.come();
        m.come();
        b.come();
          System.out.println("Carrinho ");
           System.out.println("---------------------------------------------------------------------------------------------------");
    carrinho.mostrar();
     System.out.println("---------------------------------------------------------------------------------------------------");
  
        System.out.println("Sustento de comida: " + (m.comida() + b.comida()));
        System.out.println("Total de produtos: " + carrinho.total());
    }
}