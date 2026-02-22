import classe.ContaCorrente;
import classe.Produto;
import classe.Termometro;
import Static.Socio;
import composição.Casa;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        Termometro termometro = new Termometro();
        ContaCorrente conta = new ContaCorrente();

        Casa casa = new Casa();
        casa.quarto.area = 10;
        casa.cozinha.pia = "quatro portas";
    }
}