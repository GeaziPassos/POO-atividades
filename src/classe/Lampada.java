package classe;

public class Lampada {

    String tipo;
    boolean estarLigada;

    public void interruptor(){
        if (estarLigada){
            estarLigada = false;
        }else {
            estarLigada = true;
        }
    }

    public void mostrarEstado(){
        if (estarLigada){
        }else{
            System.out.printf("Lampada desligada");
        }
    }

}
