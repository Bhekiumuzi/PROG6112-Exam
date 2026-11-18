/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mattresssales;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import javax.swing.;
public class MattressSalesSystem {
public static void main(String[] args) {
JFrame f = new JFrame("Mattress Sales");
JTextField name = new JTextField();
JTextField product = new JTextField();
JTextField price = new JTextField();
JTextField vat = new JTextField();
JTextField commission = new JTextField();
 JTextField total = new JTextField();
String[] labels = {
"Customer Name:", "Product Name:", "Price:",
"VAT:", "Commission:", "Total Sale:"
};
JTextField[] fields = {
name, product, price, vat, commission, total
};
for (int i = 0; i < labels.length; i++) {
JLabel l = new JLabel(labels[i]);
l.setBounds(30, 30 + i * 40, 120, 25);
fields[i].setBounds(150, 30 + i * 40, 150, 25);
f.add(l);
f.add(fields[i]);
}
vat.setEditable(false);
commission.setEditable(false);
total.setEditable(false);
JButton calculate = new JButton("Calculate");
calculate.setBounds(40, 290, 120, 30);
calculate.addActionListener(e -> {
try {
double p = Double.parseDouble(price.getText());
double v = p * 0.15;
double c = p * 0.05;
double t = p + v + c;
vat.setText("R " + String.format("%.2f", v));
commission.setText("R " + String.format("%.2f", c));
total.setText("R " + String.format("%.2f", t));
} catch (Exception ex) {
JOptionPane.showMessageDialog(f, "Enter a valid price");
}
});
f.add(calculate);
f.setSize(350, 390);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setLocationRelativeTo(null);
f.setVisible(true);
}
}

    }
    

