/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintablanco;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author DELL
 */
public class GirarImage {

    private BufferedImage image;

    public GirarImage(String ruta) {
        try {
            this.image = ImageIO.read(new File(ruta));
            
            Double grados = Math.toRadians(90);
            Double sin = Math.abs(Math.sin(grados));
            Double cos = Math.abs(Math.cos(grados));
            
            Integer newWidth = (int) Math.floor(image.getWidth() * cos + image.getHeight() * sin);
            Integer newHeight = (int) Math.floor(image.getHeight() * cos + image.getWidth() * sin);
            BufferedImage rotatedImage = new BufferedImage(newWidth, newHeight, image.getType());
            
            AffineTransform at = new AffineTransform();
            at.translate(newWidth / 2, newHeight / 2);
            at.rotate(grados, 0, 0);
            at.translate(-image.getWidth() / 2, -image.getHeight() / 2);
            
            
            AffineTransformOp rotateOp = new AffineTransformOp(at, AffineTransformOp.TYPE_BILINEAR);
            rotateOp.filter(image, rotatedImage);
            
            ImageIO.write(rotatedImage, "jpg", new File("C:\\Users\\DELL\\Desktop\\imagenRotada.jpg"));
            System.out.println("Listo imagen Rotada, se guardo como imagenRotada.jpg");
        } catch (IOException e) {
            System.out.println("No se pudo cargar la imagen" + e.getMessage());
        }
    }

}
