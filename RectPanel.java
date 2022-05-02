import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JPanel;

import figures.*;

public class RectPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public List<Figure> figs = new LinkedList<Figure>();

    public void addRect(Rect rect){
        figs.add(rect);
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        for (Figure r : this.figs) {
            r.paint(g);
        }
    }
}
