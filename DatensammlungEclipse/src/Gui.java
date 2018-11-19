import java.awt.EventQueue;

import javax.swing.JFrame;

public class Gui {

	private JFrame frame;
	private Information[] informations;

	public static void start(Information[] informations) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui(informations);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private Gui(Information[] infomations) {
		this.informations = informations;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
