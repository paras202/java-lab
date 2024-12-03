import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageAppletReplacement extends JFrame {
    private Image img;

    public ImageAppletReplacement() {
        // Set up the JFrame
        setTitle("Image Viewer");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Load the image
        try {
            URL imageUrl = getClass().getResource("example.jpg");
            if (imageUrl != null) {
                img = new ImageIcon(imageUrl).getImage();
            } else {
                System.out.println("Image not found!");
            }
        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (img != null) {
            // Draw the image at position (50, 50)
            g.drawImage(img, 50, 50, this);
            g.drawString("Image loaded successfully!", 50, 150);
        } else {
            g.drawString("Error: Image not loaded", 50, 150);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ImageAppletReplacement frame = new ImageAppletReplacement();
            frame.setVisible(true);
        });
    }
}
