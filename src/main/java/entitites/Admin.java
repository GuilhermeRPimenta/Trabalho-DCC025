//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

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
