package simsons;
import com.sun.corba.se.spi.activation.ActivatorOperations;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Bart extends JFrame {
/*
    private JLabel txt1;

    public Bart(){
        super("Это заголовок окна");
        setLayout(new FlowLayout());
        txt1 = new  JLabel("Не корми енота в туалете");
        txt1.setToolTipText("Это не шутка!");
        add(txt1);
    }
*/
    private JTextField pole1;
    private JTextField pole2;
    private JTextField pole3;
    private JPasswordField pass;


    public Bart (){
        super("Название окна");
        setLayout(new FlowLayout());
        pole1 = new JTextField(10);
        add(pole1);
        pole2 = new JTextField("Ввелите тут свой текст");
        add(pole2);
        add(pole3 = new JTextField("Не редактируемое поле!!!", 20));
        pole3.setEnabled(false);
        add(pass = new JPasswordField("Мой пароль"));
        Obrabotka obrabotka = new Obrabotka();
        pole1.addActionListener(obrabotka);
        pole2.addActionListener(obrabotka);
        pole3.addActionListener(obrabotka);
        pass.addActionListener(obrabotka);


    }

    private class Obrabotka implements ActionListener {

        public void actionPerformed(ActionEvent event){
            String string = "";
            if(event.getSource() == pole1){
                string = String.format("Pole 1: %s", event.getActionCommand());
            } else if (event.getSource() == pole2){
                string = String.format("Pole 2: %s", event.getActionCommand());
            }else if (event.getSource() == pole3){
                string = String.format("Pole 3: %s", event.getActionCommand());
            }else if (event.getSource() == pass){
                string = String.format("Pass: %s", event.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, string);

        }

    }


}


