package va2;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoProdutos {

    private List<Produto> produtos = new ArrayList<>();
    private List<Gerente> gerentes = new ArrayList<>();

    public GerenciamentoProdutos() {
    }

    public void adicionarProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProdutos(Produto produto) {
        this.produtos.remove(produto);
    }

    public void listarProdutos() {
        produtos.forEach(produto -> {
            System.out.println(produto);
        });
    }

    public void adicionarGerente(Gerente gerente) {
        this.gerentes.add(gerente);
    }

    public void removerGerente(Gerente gerente) {
        gerentes.remove(gerente);
    }

    public void listarGerentes() {
        for(Gerente gerente : gerentes){
            System.out.println(gerente);
        }
    }
    public String buscarProdutoPorNome(String nome){
       for (int i = 0; i < produtos.size(); i++) {
            if (produtos.contains(nome)){
                System.out.println(nome);
           }
        }
        return null;
    }
    public String buscarGerentePorNome(String nome){
       for (int i = 0; i < gerentes.size(); i++) {
            if (gerentes.contains(nome)){
                System.out.println(nome);
           }
        }
        return null;
        
    }
    
}
