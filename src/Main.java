import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    long a = 0;// самая важная часть кода =)
   JButton button, delitb; //создаю элементы который будут в окне
   JLabel label, label2 , result;
   JTextField text;
   Lisener lisener = new Lisener();// ссылка на слушатель
    public static void main(String[] args) {
        Main s = new Main("G-enerator");// обращаемся к методу Mein s
        s.setVisible(true);// делаем окно видимым
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// метод закрытия всплывающего окна
        s.setSize(235, 170);// метод задающий размер окна (ширина, длинна)
        s.setResizable(false);// метод влияния на размер окна
        s.setLocationRelativeTo(null);// метод положения появления окна
    }
    public Main (String s){
        super(s);// суперкласс берёт все методы одноимённого класса
        setLayout(new FlowLayout());// всплывающее окно
        button = new JButton("Рассчитать");// элементы что расположу на окне
        delitb = new JButton("DEL");
        label = new JLabel("Введите верхний порог генератора");
        text = new JTextField(10);// 10 это длинна поля ввода
        label2 = new JLabel();
        result = new JLabel();
        add(label);// добавляю элементы на окно( последовательность важна )
        add(text);
        add(button);
        add(delitb);
        add(label2);
        add(result);
        button.addActionListener(lisener); // определили слушателю кнопку
        delitb.addActionListener(lisener); // определили слушателю кнопку
    }
    public class Lisener implements ActionListener{// новый класс слушатель
        public void actionPerformed(ActionEvent e) {// метод считывающий действиие (действие выполнено)

            try {// если по причине кривых рук пользователя код не запускается то catch
                if (e.getSource() == button) { // если источник нашего события равен(произошел) в кнопке
                a = Integer.parseInt(text.getText());
                long random = (int) (Math.random() * a) + 1;//генератор рандомных чисел
                label2.setText("    И ваше случайное число равно   ");// меняем информацию в лейблах
                result.setText(String.valueOf(random)); // меняем информацию в лейблах
            }
                if (e.getSource() == delitb) { // если нажать на DEL все вернёться к исходному состаянию
                text.setText(null);
                label2.setText(null);
                result.setText(null);
            }
            }catch (Exception bag){JOptionPane.showMessageDialog(null, "Введите в поле число до 9999999999 ");}
        }
    }
}
