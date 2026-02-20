package classe;

public class Moto extends Veiculo{
    int cilindradas;

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    public void getCilindradas(){
        System.out.println("Cilindradas: " + cilindradas);
    }

    public void getInfo(){
        System.out.println("Placa: " + placa);
        System.out.println("Cilindradas: " + cilindradas);
    }

}
