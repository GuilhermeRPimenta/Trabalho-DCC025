//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

package com.mycompany.chess.swingComponents.contentPanel.adminPanel;

import entitites.camposInvalidosException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JPanel;

public class AdminField extends JPanel {

    private String adminEmail;

    public AdminField() {
    }

    public boolean loginAdmin(String n, String p) throws camposInvalidosException {
        String path = "";

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = "src\\main\\resources\\userData\\adminData.csv";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            path = "src/main/resources/userData/adminData.csv";
        }

        boolean userFound = false;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");

                String fileName = fields[0];
                String filePassword = fields[2];
                String fileEmail = fields[1];

                if (fileName.equals(n) && filePassword.equals(p)) {
                    userFound = true;
                    adminEmail = fileEmail;
                    break;
                }

                line = br.readLine();

            }

            if (!userFound) {
                throw new camposInvalidosException("Usuário não é admin !");
            }

            return true;
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return false;
    }

    public String getAdminEmail() {
        return adminEmail;
    }
}
