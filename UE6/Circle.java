public class Circle extends Shape {
    private double x, y;
    private double radius;
    public Circle(double x, double y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;

        this.visible=true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format("\nx= %f, y= %f, radius = %f", x,y,radius));
        return sb.toString();
    }
}
