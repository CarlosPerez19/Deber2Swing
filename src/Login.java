import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public JPanel mainPanel;
    private JTextField usuario;
    private JPasswordField contrasena;
    private JButton login;

    public Login() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = "Java";
                String password = "123456";
                String user_1 = usuario.getText();
                String password_1 = contrasena.getText();

                if (user.equals(user_1) && password.equals(password_1)) {
                    JOptionPane.showMessageDialog(null,"Inicio correcto");
                    JFrame frame = new JFrame("Biografia");
                    frame.setContentPane(new Biografia().biografia);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(1024, 768);
                    frame.setPreferredSize(new Dimension(1024, 768));
                    frame.setMinimumSize(new Dimension(1024, 768));
                    frame.pack();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Datos Incorrectos");
                }
            }
        });
    }
}
