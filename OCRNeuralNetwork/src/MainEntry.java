import java.awt.Graphics;

public class MainEntry extends java.applet.Applet
{
    public void init()
    {
        // TODO: Initialization things here.
    }
    
    /**
     * This is where things will get drawn to the screen within your applet.
     */
    public void paint(Graphics g)
    {
        // Draw our hello world
        g.drawString("Selamat datang!", 50, 25);
    }

    
}






