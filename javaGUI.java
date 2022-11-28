import javax.swing.JOptionPane;
public class javaGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your Name ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age"));
    JOptionPane.showMessageDialog(null , "You are "+ age +" years old .");

    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
    JOptionPane.showMessageDialog(null , "You are "+height +" m tall .");
    int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter your Weight in kilogram"));
    JOptionPane.showMessageDialog(null , "You are "+weight +" kgs .");
    
    JOptionPane.showMessageDialog(null , "Your bmi is "+(weight/(height*height)));
  
  if (weight/(height*height)<=24.9)  {
    JOptionPane.showMessageDialog(null , name +" You are fit !!");
  }
 else if  (18.5>=weight/(height*height)){
    JOptionPane.showMessageDialog(null , name+" You are  fit !!");
 }
  else {
    JOptionPane.showMessageDialog(null , name +"You are not fit :(");
  }
}

}
