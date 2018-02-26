/*
 * La clase para guardar los marcianos.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Gonsaez
 */
public class Marciano {

    public Image imagen = null;
    public Image imagen2 = null;

    public int x = 0;
    public int y = 0;

    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;

    private int anchoPantalla;

    public boolean direccion = false; //si es false es que se mueve a la izquierda

    public Marciano(int _anchoPantalla) {
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/marcianito1.png"));
            imagen2 = ImageIO.read(getClass().getResource("/imagenes/marcianito2.png"));

        } catch (IOException e) {
        }
        anchoPantalla = _anchoPantalla;
    }

    //método para mover la nave
    public void mueve() {
        if (direccion) {
            if (x < anchoPantalla - imagen.getWidth(null)) {
                x++;
            }
        } else {
            if (x > 0) {
                x--;
            }
        }

    }
}
