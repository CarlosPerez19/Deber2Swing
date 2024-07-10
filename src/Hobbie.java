import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbie {
    private JButton volver;
    private JLabel hobbie;
    public JPanel mainHobbie;
    private JLabel image;

    public Hobbie() {

        ImageIcon icon = new ImageIcon("src/JRVRFF65PNAJ5PU4JCRHYFJRP4.jpeg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        image.setIcon(icon);




        volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Volviendo");
                JFrame frame = new JFrame("Biografia");
                frame.setContentPane(new Biografia().biografia);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1024, 768);
                frame.setPreferredSize(new Dimension(1024, 768));
                frame.setMinimumSize(new Dimension(1024, 768));
                frame.pack();
                frame.setVisible(true);

                ((JFrame) SwingUtilities.getWindowAncestor(volver)).dispose();
            }
        });
    }
}
