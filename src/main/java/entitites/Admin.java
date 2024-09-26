package entitites;

public class Admin extends User {
    
    public Admin() {        
    }

    public Admin(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public void resetPlayerMMR(Player player) {
        player.setMmr(1000);
    }
}
