import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Gui {

	private JFrame frame;
	private JPanel contentPane;

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
		frame.setLocationRelativeTo(null);
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		frame.setContentPane(contentPane);

		JLabel lbl1 = new JLabel("Hello!");
		lbl1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 100));
		contentPane.add(lbl1, BorderLayout.CENTER);

		frame.pack();
	}

}
