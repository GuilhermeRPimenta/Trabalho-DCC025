//Victor Wingert de Almeida         - 202335036
//Guilherme Roldão dos Reis Pimenta - 202365085A
//Bruno Nascimento Rodrigues        - 202065114A
//Pablo Novaes Costa                - 202335031

package com.mycompany.chess.swingComponents.contentPanel.gamePanel.loginScreen;

import java.util.HashSet;
import java.util.Set;

public class SessionManager {

    private static Set<String> activeUsers = new HashSet<>();

    public static boolean isUserLoggedIn(String username) {
        return activeUsers.contains(username);
    }

    public static void loginUser(String username) {
        activeUsers.add(username);
    }

    public static void logoutUser(String username) {
        activeUsers.remove(username);
    }
}
