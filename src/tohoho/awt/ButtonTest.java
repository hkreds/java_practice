package tohoho.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ButtonTest extends Frame {
	public static void main(String[] args) {
		new ButtonTest();
	}
	ButtonTest() {
		super("ButtonTest");
		setSize(500,200);
		setLayout(new FlowLayout());
		Button b1 = new Button("OK");
		add(b1);
		show();
	}
}
