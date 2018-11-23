import java.awt.EventQueue;

import javax.swing.JFrame;

public class Gui {

	private JFrame frame;
	
	@SuppressWarnings("unused")
	private Information[] informations;
	@SuppressWarnings("unused")
	private Category[] categories;
	public static void start(Information[] informations, Category[] categories) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui(informations, categories);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private Gui(Information[] informations, Category[] categories) {
		this.informations = informations;
		this.categories = categories;
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
