package userinterface;

import javax.swing.*;
import java.awt.event.*;
public class ComboBoxExample {
JFrame f;
void ComboBoxExam(){
    f=new JFrame("HOME PAGE");
    final JLabel label = new JLabel();
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setSize(400,100);
    JButton b=new JButton("Show");
    b.setBounds(600,100,75,20);
    String languages[]={"Dr. Rajbir Kaur","Dr. Mukesh Jadon","Dr. Sunil Kumar"};
    final JComboBox cb=new JComboBox(languages);
    cb.setBounds(500, 100,90,20);
    f.add(cb); f.add(label); f.add(b);
    f.setLayout(null);
    f.setSize(350,350);
    f.setVisible(true);
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
String data = "Data Selected: "
   + cb.getItemAt(cb.getSelectedIndex());
label.setText(data);
}
});
JButton b2=new JButton("Show");
b2.setBounds(700,200,75,20);
String language[]={"First Year","Second Year","Third Year","Fourth Year"};
final JComboBox cb2=new JComboBox(language);
String courses[]={"CSE","CCE","ECE","Mechanical"};
final JComboBox cb3=new JComboBox(courses);
cb2.setBounds(500, 200,90,20);
cb3.setBounds(600, 200,90,20);
JButton b3=new JButton("Main Timetable");
b3.setBounds(550,300,150,40);
f.add(cb2);f.add(cb3);  f.add(b2);f.add(b3);
f.setLayout(null);
f.setSize(350,350);
f.setVisible(true);
b2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
String data = "Data Selected: "
+ cb2.getItemAt(cb2.getSelectedIndex())+cb3.getItemAt(cb3.getSelectedIndex());
label.setText(data);
}
});
}

public static void main(String[] args) {
    ComboBoxExample b=new ComboBoxExample();
    b.ComboBoxExam();

}
}