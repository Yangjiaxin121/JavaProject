package GUI;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

class Layout extends Frame{ 
	public Layout(String title) {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		this.setLayout(layout);
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 1;
		this.addComponent("btn1",layout,c);
		this.addComponent("btn2", layout, c);
		this.addComponent("btn3", layout, c);
		c.gridwidth = GridBagConstraints.REMAINDER;//本行最后一个组件
		this.addComponent("btn4", layout, c);
		c.weightx = 0;
		c.weighty = 0;
		addComponent("btn5",layout,c);
		c.gridwidth = 1;
		this.addComponent("btn6", layout, c);
		c.gridwidth = GridBagConstraints.REMAINDER;
		this.addComponent("btn7", layout, c);
		c.gridheight = 2;
		c.gridwidth = 1;
		c.weightx = 2;
		c.weighty = 2;
		this.addComponent("btn8", layout, c);
		c.gridwidth = GridBagConstraints.REMAINDER;
		c.gridheight = 1;
		this.addComponent("btn9", layout, c);
		this.addComponent("btn10", layout, c);
		this.pack();
		this.setVisible(true);
	}

	private void addComponent(String name, GridBagLayout layout, GridBagConstraints c) {
		// TODO Auto-generated method stub
		Button bt = new Button(name);
		layout.setConstraints(bt, c);
		this.add(bt);
	}
}

public class Example11 {
	public static void main(String[] args) {
		new Layout("GridBagLayout");
	}

}
