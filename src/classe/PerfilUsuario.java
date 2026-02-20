package classe;

public class PerfilUsuario {

    private long id = 91110293810L;
    private String senha;

    public void setSenha(String senha){
        this.senha = senha;
    }

    public long getId(){
        return id;
    }

    public String getSenha(){
        return senha;
    }
}
