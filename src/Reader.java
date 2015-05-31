import javax.swing.JOptionPane;
/**
 * Created by asmalouski on 31.5.15.
 */
public class Reader {
    int i, k;
    String n1, n2;
    public void scan(){
        n1 = JOptionPane.showInputDialog("Enter first digit. ");
        n2 = JOptionPane.showInputDialog("Enter second digit. ");
        i = Integer.parseInt(n1);
        k = Integer.parseInt(n2);
    }

}
