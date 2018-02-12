package calculadoraa;

public class Calculadora {

    protected float x;
    private float y;
    private float r;

    void sumar() {
        r = x + y;
    }

    void restar() {
        if (x < y) {
            float a;
            a = x;
            x = y;
            y = a;
        }
        if (x < 0) {
            x = -x;
            y = -y;
        }
        r = x - y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getR() {
        return r;
    }
}
