package team.rpgterminal.cliente.game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by NJSilva on 13/07/2017.
 */
public class AsciiMaker {

    private int width;
    private int height;
    private String message;

    public AsciiMaker(int width, int height, String message) {
        this.width = width;
        this.height = height;
        this.message = message;
    }

    public StringBuilder drawTitle() {

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.TRUETYPE_FONT, 15));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString(message, 5, 15);

        try {
            ImageIO.write(image, "png", new File("resources/ascii-art.png"));
        } catch (IOException e) {
            System.err.println("ERROR:" + e.getMessage());
        }

        StringBuilder sb = null;
        for (int y = 0; y < height; y++) {
            sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                sb.append(image.getRGB(x, y) == -16777216 ? " " : ":");

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }
        return sb;
    }

}
