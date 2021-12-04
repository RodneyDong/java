import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.john.swing.DisplayImageOnLabel;

public class DisplayImageOnButton extends JFrame{
	static final String FOLDER = "/Users/12818/workspace/Rodney/java/john/bin/com/john/swing/";
	static final String FILE_NAME = "diamondK.gif";
	Toolkit t = Toolkit.getDefaultToolkit(); // get instance of Toolkit
	
	public DisplayImageOnButton() {
		initFrame();
		init();
	}
	
	private void initFrame() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Display Image on Button");
	}


	public static void main(String[] args) {
		DisplayImageOnButton frame = new DisplayImageOnButton();
		frame.setVisible(true);
	}

	
	private void init() {
		ImageIcon icon = new ImageIcon(FOLDER+FILE_NAME);
		JButton btn = new JButton(icon);
		add(btn);
	}

}
