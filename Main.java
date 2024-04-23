package va2;

public class Main {

    public static void main(String[] args) {
        GerenciamentoProdutos gp = new GerenciamentoProdutos();
        Produto p1 = new Produto(1, "Anel", 10.0, 5.50);
        Produto p2 = new Produto(2, "Livro", 10.0, 4.00);
        Produto p3 = new Produto(2, "Bola", 5.0, 8.0);
        Gerente g1 = new Gerente(1, "Vinicius", "123456789");
        Gerente g2 = new Gerente(2, "Jorge", "123456785");
        Gerente g3 = new Gerente(3, "Wilson", "123456885");
        gp.adicionarGerente(g1);
        gp.adicionarGerente(g2);
        gp.adicionarGerente(g3);
        gp.buscarGerentePorNome("Vinicius");
        gp.removerGerente(g1);
        gp.listarGerentes();
        //
        gp.adicionarProdutos(p1);
        gp.adicionarProdutos(p2);
        gp.adicionarProdutos(p3);
        gp.buscarProdutoPorNome("Anel");
        gp.removerProdutos(p1);
        gp.listarProdutos();
        
       
        
    }

}
