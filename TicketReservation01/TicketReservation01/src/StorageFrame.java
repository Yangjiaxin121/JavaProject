import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class StorageFrame extends JFrame{
	public StorageFrame() {
		this.setTitle("机票存储界面");
		this.setSize(600,400);
		this.setLocation(300, 100);
		this.setLayout(null);
		
		JLabel label = new JLabel("机票存储系统欢迎你",JLabel.CENTER);
		label.setFont(new Font("宋体",Font.PLAIN,20));
		label.setBounds( 200, 10, 200, 80);
		this.add(label);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
