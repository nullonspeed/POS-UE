import java.awt.Color;

public class Line extends Shape{
    double x1, x2 ,y1 ,y2;
    public Line(double x1, double x2, double y1, double y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;

        this.visible=true;
        this.lineWidth=0.005;
        this.color=StdDraw.BOOK_LIGHT_BLUE;

    }
    public Line(double x1, double x2, double y1, double y2, boolean visible, Color color, double lineWidth){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;

        this.visible=visible;
        this.lineWidth=lineWidth;
        this.color=color;

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("\n x1 = %f, x2 = %f, y1 = %f, y2 = %f ", x1, x2, y1, y2));
        return sb.toString();
    }
    @Override
    public void draw(){
        if(visible){
            super.draw();
            StdDraw.line(x1, x2, y1, y2);
        }
    }
}