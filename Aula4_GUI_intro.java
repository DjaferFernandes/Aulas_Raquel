import javax.swing.*;

public class Aula4_GUI_intro {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null,"Your age is " + age + "years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        JOptionPane.showMessageDialog(null, "Sua altura em cm é: " + height);
    }
}
