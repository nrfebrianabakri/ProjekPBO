package GUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.*;

public class AplikasiProjek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Welcomee welcome = new Welcomee();
            welcome.setVisible(true);

            Timer timer = new Timer(3000, e -> {
                welcome.dispose(); // Menutup halaman welcome
                Login login = new Login(); // Membuka halaman login
                login.setVisible(true);
            });
            
            timer.setRepeats(false); // Timer hanya berjalan sekali
            timer.start();
        });

       
    }
    
}
