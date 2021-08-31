/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pintablanco;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author DELL
 */
public class PintarImage {

    private BufferedImage img;
    private Integer ancho;
    private Integer alto;

    private AffineTransform at;

    public PintarImage(String ruta, Integer cuadrante) {
        try {
            this.img = ImageIO.read(new File(ruta));
            this.ancho = img.getWidth();
            this.alto = img.getHeight();
            pintarCuadrante(cuadrante);            
            ImageIO.write(img, "jpg", new File("C:\\Users\\DELL\\Desktop\\imagenCambiada.jpg"));
            System.out.println("Tu imagen se guardo como imagenCambiada.jpg");

        } catch (IOException e) {
            System.out.println("No se pudo cargar la imagen" + e.getMessage());
        }
    }

    private void pintarCuadrante(Integer cuadrante) {
        System.out.println("Cargando");
        switch (cuadrante) {
            case 1:
                for (int i = 0; i < ancho / 2; i++) {
                    for (int j = 0; j < alto / 2; j++) {
                        Color newColor = new Color(255, 255, 255);
                        img.setRGB(i, j, newColor.getRGB());
                        //System.out.print(".");
                    }
                    //System.out.println();
                }
                //System.out.println("Listo Imagen cambiada");
                break;
            case 2:
                for (int i = ancho / 2; i < ancho; i++) {
                    for (int j = 0; j < alto / 2; j++) {
                        Color newColor = new Color(255, 255, 255);
                        img.setRGB(i, j, newColor.getRGB());
                        //System.out.print(".");
                    }
                    //System.out.println();
                }
                //System.out.println("Listo Imagen cambiada");
                break;
            case 3:
                for (int i = 0; i < ancho / 2; i++) {
                    for (int j = alto / 2; j < alto; j++) {
                        Color newColor = new Color(255, 255, 255);
                        img.setRGB(i, j, newColor.getRGB());
                        //System.out.print(".");
                    }
                    //System.out.println();
                }
                //System.out.println("Listo Imagen cambiada");
                break;
            case 4:
                for (int i = ancho / 2; i < ancho; i++) {
                    for (int j = alto / 2; j < alto; j++) {
                        Color newColor = new Color(255, 255, 255);
                        img.setRGB(i, j, newColor.getRGB());
                        //System.out.print(".");
                    }
                    //System.out.println();
                }
                break;
            default:
                break;
        }
        System.out.println("Listo Imagen cambiada");
    }

}
