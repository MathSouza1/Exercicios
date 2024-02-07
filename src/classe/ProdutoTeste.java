package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Product p1 = new Product("Notebook", 4356.89);

        var p2 = new Product();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;

        Product.desconto = 0.50;

        System.out.println(p1.nome + " " + p1.precoComDesconto());
        System.out.println(p2.nome + " " + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }
}
