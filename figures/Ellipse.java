package figures;

import java.awt.*;

public class Ellipse extends Figure {
    public Ellipse (int x, int y, int w, int h) {
        super(x,y, w,h);
    }

    public void print () {
        System.out.format("Ellipse de tamanho (%d,%d) na posicao (%d,%d).\n",
            this.w, this.h, this.x, this.y);
    }

    public void paint (Graphics g) {
        // Graphics2D g2d = (Graphics2D) g;
        // g2d.draw(new Ellipse2D.Double(this.x,this.y, this.w,this.h));
        g.fillOval(x, y, 24, 24);
    }

    
}