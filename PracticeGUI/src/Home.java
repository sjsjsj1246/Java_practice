import javax.swing.*;

public class Home extends JFrame{

	JPanel jp = new JPanel();
	JButton jb = new JButton("��ư");
	JLabel jl = new JLabel("���̺�");
	JTextField tf = new JTextField(10);
	
	public Home() {
		super("Home");
		
		jp.add(jb);
		jp.add(jl);
		jp.add(tf);
		
		add(jp);
		
		setSize(400,300);
		setLocation(200, 400);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}