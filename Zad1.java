
/** Wskaż i zaproponuj rozwiązanie problemu w kodzie niżej */

public class Button {
    private Font labelFont;
    private String labelText;
    ...
    public void addActionListener(ActionListener listener) {
    ...
    }

    public void paint(Graphics graphics) {
        //narysuj labelText, użwając labelFont w graphics
    }
}

public class BitmapButton extends Button {
    private Bitmap bitmap;

    public void paint(Graphics graphics) {
        //narysuj bitmap w graphics
    }
}