package classe;

public class Produto {

    private int quantidade;

    public void adicionarEstoque(int quantidade){
        if (quantidade >= 0){
        this.quantidade += quantidade;
    }else{
            System.out.println("Não é possivel adicionar um valor negativo ao estoque");
        }

    }
}
