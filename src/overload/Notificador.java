package overload;

public class Notificador {
    public void enviar(String mensagem){
        System.out.println(mensagem);
    }

    public void enviar(String mensagem, String prioridade){
        System.out.println(
                "--" + prioridade + "--" +
                "/n" + mensagem
        );
    }
}
