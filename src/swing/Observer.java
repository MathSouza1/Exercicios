package swing;

import javax.swing.*;
import java.awt.*;

public class Observer {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // Centralizar na Tela!

        JButton button = new JButton("Clicar!");
        janela.add(button);

        button.addActionListener(e -> {
            System.out.println("Evento ocorreu!!!");
        });

        janela.setVisible(true);
    }
}
