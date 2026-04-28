import java.awt.Color;

public class Rectangle extends Shape {
    private double x, y;
    private double halfWidth, halfHeigth;

    public Rectangle(double x, double y, double halfWidth, double halfHeigth){
        this.x= x;
        this.y=y;
        this.halfWidth = halfWidth;
        this.halfHeigth= halfHeigth;
        this.visible = true;
        this.color = StdDraw.PRINCETON_ORANGE;
        this.lineWidth=0.005;
    }
    public Rectangle(double x, double y, double halfWidth, double halfHeigth, boolean visible, Color color, double lineWidth){
        this.x= x;
        this.y=y;
        this.halfWidth = halfWidth;
        this.halfHeigth= halfHeigth;
        this.visible = visible;
        this.color =color;
        this.lineWidth=lineWidth;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("\nx = %f, y = %f, half width=%f, half height = %f", x,y,halfWidth, halfHeigth));


        return sb.toString();
    }
    @Override
    public void draw(){
        if(visible){
            super.draw();
            StdDraw.line(x, y, halfWidth, halfHeigth);
        }
    }
}
