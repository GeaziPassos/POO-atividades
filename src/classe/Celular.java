package classe;

public class Celular {

    String marca;
    String modelo;
    int bateria = 0;

      public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setBateria(int bateria){
        this.bateria = bateria;
    }

    public void getInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
    }
    public void fazerLigacao(String nome){
        System.out.println("Ligando para " + nome);
    }

    public void carregar(int quantidadeBateria){
        bateria += quantidadeBateria;
        System.out.println("A bateria esta em " + bateria);
    }
}
