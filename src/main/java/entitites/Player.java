package entitites;

public class Player extends User{
    private int mmr;
    
    public Player() {        
    }
    
    public Player(String nome, String email, String senha) {
        super(nome, email, senha);
        this.mmr = 1000;
    }
    
    public Player(String nome, String email, int mmr) {
        this.nome = nome;
        this.email = email;
        this.mmr = mmr;
    }

    public int getMmr() {
        return mmr;
    }

    public void setMmr(int mmr) {
        this.mmr = mmr;
    }
}
