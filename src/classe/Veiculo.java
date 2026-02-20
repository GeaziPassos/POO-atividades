package classe;

public class Veiculo {

    String placa;
    int ano;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void getPlaca(){
        System.out.printf("Placa: " + placa);
    }

    public void getAno(){
        System.out.printf("Ano: " + ano);
    }

}
