import processing.core.*;
public class App extends PApplet{
    public static PApplet processingRef;

    public void settings() {
        size(2000, 1000);
    }

    public void setup() {

    }

    public void draw() {

    }

    public static void main(String[] args) {
        //PApplet.main("App");
        Orto orto = new Orto();
        orto.orthogonolize();
//        Polynomial poly = new Polynomial(new double[] {0,1});
    }
}
