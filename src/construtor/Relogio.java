package construtor;

public class Relogio {
        String hora;
        String minuto;

        public Relogio(){
            hora = "00";
            minuto = "00";
        }

        public Relogio(String hora, String minuto){
            this.hora = hora;
            this.minuto = minuto;
        }
}
