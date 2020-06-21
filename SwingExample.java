 import javax.swing.*;
 import java.awt.event.*;
 public class SwingExample extends JFrame
 {
 	JLabel j1, j2, j3, j4, j5, j6, j7, j8;
 	JTextField t1, t2;
 	JButton b1;

 	public SwingExample()
 	{

 	}

 	public SwingExample(String s)
 	{
 		super(s);
 	}

 	public void setComponents()
 	{
 		j1 = new JLabel("Magic Trick using a number");
 		j2 = new JLabel("Enter a number (1-100)");
 		j3 = new JLabel("Enter your Name: ");
 		j4 = new JLabel();
 		t1 = new JTextField();
 		t2 = new JTextField();
 		b1 = new JButton("Perform");
 		j5 = new JLabel();
 		j6 = new JLabel();
 		j7 = new JLabel();
 		j8 = new JLabel();
 		setLayout(null);
 		j1.setBounds(100, 50, 300, 20);
 		j2.setBounds(50, 80, 350, 20);
 		t1.setBounds(200, 80, 100, 20);
 		j3.setBounds(50, 130, 300, 20);
 		t2.setBounds(200, 130, 100, 20);
		b1.setBounds(130, 180, 100, 20);
		j4.setBounds(100, 220, 400, 40);
		j5.setBounds(100, 245, 400, 40);
		j6.setBounds(100, 270, 400, 40);
		j7.setBounds(100, 295, 400, 40);
		j8.setBounds(100, 320, 400, 40);
		b1.addActionListener(new Handler());
 		add(j1);
 		add(j2);
 		add(t1);
 		add(j3);
 		add(t2);
 		add(b1);
 		add(j4);
 		add(j5);
 		add(j6);
 		add(j7);
 		add(j8);

 	}
           
 	class Handler implements ActionListener
 	{
 		public void actionPerformed(ActionEvent e)
 		{
 			int a = Integer.parseInt(t1.getText());
 			j4.setText("You entered number "+a);
 			j5.setText("But it doesnt even matter");
 			j6.setText("Because,");
 			j7.setText("All I want to say is");
 			j8.setText("I Love You, Vidhi!!!");

 		}
 	}

 	public static void main(String[] args)
 	{
 		SwingExample jf = new SwingExample("Magic App");


 		jf.setComponents();
 		jf.setSize(350,450);
 		jf.setVisible(true);
 		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}
 }