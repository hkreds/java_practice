package tohoho.awt;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest extends Frame {
	public static void main(String[] args) {
		new DialogTest();
	}
	DialogTest() {
		super("DialogTest");
		setSize(500,200);
		MyDialog dlg = new MyDialog(this);
		dlg.show();
		show();
	}
}
class MyDialog extends Dialog implements ActionListener {
	public MyDialog(Frame owner) {
		super(owner);
		setLayout(new FlowLayout());
		Button b1 = new Button("OK");
		b1.addActionListener(this);
		add(b1);
		setTitle("MyDialog");
		setSize(100,100);
	}
	public void actionPerformed(ActionEvent e) {
		hide();
	}
}