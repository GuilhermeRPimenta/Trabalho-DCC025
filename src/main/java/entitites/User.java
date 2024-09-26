package entitites;

public abstract class User {
    protected String nome;
    protected String email;
    protected String senha;
    
    public User() {        
    }

    public User(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}
