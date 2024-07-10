import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia {
    public JPanel biografia;
    private JLabel Biografia;
    private JButton aceptar;

    public Biografia() {

        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Presentacion");
                JOptionPane.showMessageDialog(null, "Mi nombre es Carlos Perez \n" +
                        "Tengo 29 años y decidi estudiar desarrollo de software por que siempre gusto todo lo que se relaciona con la tecnologia");


                JFrame frame = new JFrame("Hobbie");
                frame.setContentPane(new Hobbie().mainHobbie);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1024, 768);
                frame.setPreferredSize(new Dimension(1024, 768));
                frame.setMinimumSize(new Dimension(1024, 768));
                frame.pack();
                frame.setVisible(true);

                ((JFrame) SwingUtilities.getWindowAncestor(aceptar)).dispose();
            }
        });
    }
}
