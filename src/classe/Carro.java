package classe;

public class Carro extends Veiculo {

    int quantidadePortas;

    public void setQuantidadePortas(int quantidadePortas){
        this.quantidadePortas = quantidadePortas;
    }

    public void getQuantidadePortas(){
        System.out.println("Quantidade de portas: " + quantidadePortas);
    }
}
