package entitites;

public class Player extends User{
    private int mmr;
    
    public Player() {        
    }
    
    public Player(String nome, String email, String senha) {
        super(nome, email, senha);
        this.mmr = 1000;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getMmr() {
        return mmr;
    }

    public void setMmr(int mmr) {
        this.mmr = mmr;
    }
}
