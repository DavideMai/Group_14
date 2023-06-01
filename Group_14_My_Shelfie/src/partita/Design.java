package partita;

import javax.swing.JFrame;

import java.awt.HeadlessException;
import java.awt.Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;

import javax.imageio.ImageIO;

import javax.swing.JLabel;

public class Design {
	public static JFrame frame;

	/**
	 * @wbp.parser.entryPoint
	 */
	public Design() throws HeadlessException, IOException {
		int primo = 0;
		int secondo = 0;
		initialize(primo, secondo);
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @return
	 * @throws HeadlessException
	 * @throws IOException
	 */

	public static JFrame initialize(int primo, int secondo) throws HeadlessException, IOException {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setIgnoreRepaint(true);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(ImageIO.read(new File("Icon 50x50px.png")));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 11, 400, 187);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 230, 400, 187);
		frame.getContentPane().add(lblNewLabel_1);

		switch (primo) {
		case 0:
			BufferedImage bufferedImage = ImageIO.read(new File("4.jpg"));
			Image image = bufferedImage.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image));
			break;
		case 1:
			BufferedImage bufferedImage1 = ImageIO
					.read(new File("8.jpg"));
			Image image1 = bufferedImage1.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image1));

			break;
		case 2:
			BufferedImage bufferedImage2 = ImageIO
					.read(new File("3.jpg"));
			Image image2 = bufferedImage2.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image2));

			break;
		case 3:
			BufferedImage bufferedImage3 = ImageIO
					.read(new File("1.jpg"));
			Image image3 = bufferedImage3.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image3));

			break;
		case 4:
			BufferedImage bufferedImage4 = ImageIO
					.read(new File("5.jpg"));
			Image image4 = bufferedImage4.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image4));

			break;
		case 5:
			BufferedImage bufferedImage5 = ImageIO
					.read(new File("9.jpg"));
			Image image5 = bufferedImage5.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image5));

			break;
		case 6:
			BufferedImage bufferedImage6 = ImageIO
					.read(new File("11.jpg"));
			Image image6 = bufferedImage6.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image6));

			break;
		case 7:
			BufferedImage bufferedImage7 = ImageIO
					.read(new File("7.jpg"));
			Image image7 = bufferedImage7.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image7));

			break;
		case 8:
			BufferedImage bufferedImage8 = ImageIO
					.read(new File("2.jpg"));
			Image image8 = bufferedImage8.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image8));

			break;
		case 9:
			BufferedImage bufferedImage9 = ImageIO
					.read(new File("10.jpg"));
			Image image9 = bufferedImage9.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image9));

			break;
		case 10:
			BufferedImage bufferedImage10 = ImageIO
					.read(new File("6.jpg"));
			Image image10 = bufferedImage10.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image10));

			break;
		case 11:
			BufferedImage bufferedImage11 = ImageIO
					.read(new File("12.jpg"));
			Image image11 = bufferedImage11.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel.setIcon(new ImageIcon(image11));

			break;
		}

		switch (secondo) {
		case 0:
			BufferedImage bufferedImage = ImageIO
					.read(new File("4.jpg"));
			Image image = bufferedImage.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image));

			break;
		case 1:
			BufferedImage bufferedImage1 = ImageIO
					.read(new File("8.jpg"));
			Image image1 = bufferedImage1.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image1));

			break;
		case 2:
			BufferedImage bufferedImage2 = ImageIO
					.read(new File("3.jpg"));
			Image image2 = bufferedImage2.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image2));

			break;
		case 3:
			BufferedImage bufferedImage3 = ImageIO
					.read(new File("1.jpg"));
			Image image3 = bufferedImage3.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image3));

			break;
		case 4:
			BufferedImage bufferedImage4 = ImageIO
					.read(new File("5.jpg"));
			Image image4 = bufferedImage4.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image4));

			break;
		case 5:
			BufferedImage bufferedImage5 = ImageIO
					.read(new File("9.jpg"));
			Image image5 = bufferedImage5.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image5));

			break;
		case 6:
			BufferedImage bufferedImage6 = ImageIO
					.read(new File("11.jpg"));
			Image image6 = bufferedImage6.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image6));

			break;
		case 7:
			BufferedImage bufferedImage7 = ImageIO
					.read(new File("7.jpg"));
			Image image7 = bufferedImage7.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image7));

			break;
		case 8:
			BufferedImage bufferedImage8 = ImageIO
					.read(new File("2.jpg"));
			Image image8 = bufferedImage8.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image8));

			break;
		case 9:
			BufferedImage bufferedImage9 = ImageIO
					.read(new File("10.jpg"));
			Image image9 = bufferedImage9.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image9));

			break;
		case 10:
			BufferedImage bufferedImage10 = ImageIO
					.read(new File("6.jpg"));
			Image image10 = bufferedImage10.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image10));

			break;
		case 11:
			BufferedImage bufferedImage11 = ImageIO
					.read(new File("12.jpg"));
			Image image11 = bufferedImage11.getScaledInstance(400, 187, Image.SCALE_DEFAULT);
			lblNewLabel_1.setIcon(new ImageIcon(image11));

			break;
		}

		frame.setBounds(100, 100, 439, 477);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		return frame;
	}

}
