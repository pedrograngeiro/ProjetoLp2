import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

import figures.*;

public class EllipsePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public List<Figure> figs = new LinkedList<Figure>();

    public void addEllipse(Ellipse ellipse){
        figs.add(ellipse);
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        for (Figure e : this.figs) {
            e.paint(g);
        }
    }

}
