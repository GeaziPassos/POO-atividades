package classe;

public class Termometro {

    private Double temperaturaAtual = null;

    public void setTemperaturaAtual(double temperatura){
        if (temperatura >= -273.15){
            this.temperaturaAtual = temperatura;
        }else{
            System.out.println("Não é possivel definir uma temperatura abaixo do zero absoluto (-273.15°C)");
        }
    }

    public Double getTemperaturaAtual(){
        return temperaturaAtual;
    }

}
