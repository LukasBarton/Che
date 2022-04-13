import javax.swing.*;

public class che4 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        JLabel lab = new JLabel();
        JLabel lab2 = new JLabel();
        ImageIcon img = new ImageIcon("C:\\Users\\Majitel\\Documents\\GitHub\\Che\\img\\Alshrek.jpg");

        lab.setText("Lable");
        lab2.setIcon(img);

        lab.setBounds(500,50,100,20);

        fr.setSize(1000,750);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(3);

        fr.add(lab);
        fr.add(lab2);

    }
}
