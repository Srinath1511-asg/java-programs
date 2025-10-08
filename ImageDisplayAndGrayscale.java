package javalab;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageDisplayAndGrayscale {
    
    public static void main(String[] args) {
        // Specify the path to the image file
        String imagePath = "C:\\Users\\srina\\OneDrive\\Pictures\\image.jpg";  // Replace with your image path
        
        try {
            // Load the image
            BufferedImage image = ImageIO.read(new File(imagePath));

            // Convert the image to grayscale
            BufferedImage grayscaleImage = toGrayscale(image);

            // Display the original image
            displayImage("Original Image", image);

            // Display the grayscale image
            displayImage("Grayscale Image", grayscaleImage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to convert the image to grayscale
    public static BufferedImage toGrayscale(BufferedImage original) {
        // Create a new BufferedImage object to store the grayscale version
        BufferedImage grayscale = new BufferedImage(original.getWidth(), original.getHeight(), BufferedImage.TYPE_INT_ARGB);

        // Loop through each pixel and convert to grayscale
        for (int x = 0; x < original.getWidth(); x++) {
            for (int y = 0; y < original.getHeight(); y++) {
                // Get the RGB values of the current pixel
                Color color = new Color(original.getRGB(x, y));

                // Calculate the grayscale value using the formula
                int grayValue = (int)(color.getRed() * 0.3 + color.getGreen() * 0.59 + color.getBlue() * 0.11);

                // Create a new color with the grayscale value
                Color grayColor = new Color(grayValue, grayValue, grayValue);

                // Set the new color to the pixel in the new image
                grayscale.setRGB(x, y, grayColor.getRGB());
            }
        }
        
        return grayscale;
    }

    // Method to display the image in a JFrame
    public static void displayImage(String title, BufferedImage image) {
        // Create a JFrame to display the image
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        // Convert BufferedImage to ImageIcon for displaying in JLabel
        ImageIcon imageIcon = new ImageIcon(image);
        
        // Create a JLabel and add the image to it
        JLabel label = new JLabel(imageIcon);
        frame.add(label);
        
        // Set frame size based on image size
        frame.setSize(image.getWidth(), image.getHeight());
        frame.setVisible(true);
    }
}
