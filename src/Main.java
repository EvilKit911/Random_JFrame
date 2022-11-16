import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
   JButton button;
   JLabel label, result;
   JTextField text;
   String glupo;

    public static void main(String[] args) {
        Main s = new Main("G-enerator");// обращаемся к методу Mein s
        s.setVisible(true);// делаем окно видимым
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// метод закрытия всплывающего окна
        s.setSize(235, 150);// метод задающий размер окна (ширина, длинна)
        s.setResizable(false);// метод влияния на размер окна
        s.setLocationRelativeTo(null);// метод положения появления окна

    }
    public Main (String s){
        super(s);
        setLayout(new FlowLayout());
        button = new JButton("Рассчитать");
        label = new JLabel("Введите верхний порог генератора");
        text = new JTextField(10);
        result = new JLabel();
        add(label);
        add(text);
        add(button);
        add(result);


        int a = 100;// верхний диапазон гениратора. изменяемое число.
        int random = (int) (Math.random()*a);  //генератор рандомных чисел
        System.out.println(random);


    }
}
