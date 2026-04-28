import java.awt.Color;
public abstract class Shape {
    protected boolean visible;
    protected Color color;
    protected double lineWidth;
    public Shape(){
        this.visible=false;
        this.color = StdDraw.TRANSPARENT;
        this.lineWidth = 0.0;

        
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()+": ");
        sb.append(color+ ", with line with of: "+lineWidth);
        sb.append((visible?"visible":"invisible"));

        // TODO Auto-generated method stub
        return sb.toString();
    }
    public void draw(){
        StdDraw.setPenColor(color);
        StdDraw.setPenRadius(lineWidth);
    }
    public void describe(){
        IO.println(this.toString());
    }
    public boolean getVisible(){
        return this.visible;
    }
    public void setVisible(boolean visible){
        this.visible=visible;
    }
     public Color getColour(){
        return this.color;
    }
    public void setColour(Color color){
        this.color=color;
    } 
    public double getLineWidth(){
        return this.lineWidth;
    }
    public void getLineWidth(double lineWidth){
        this.lineWidth=lineWidth;
    }
    
}
