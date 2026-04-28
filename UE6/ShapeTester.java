import java.awt.Color;
void main(){
    StdDraw.setCanvasSize(1000, 600);
    StdDraw.setXscale(0,1000);
    StdDraw.setYscale(0, 600);
    StdDraw.setTitle("Shapes");
    Shape line = new Line(250, 200, 700, 540, true, StdDraw.BOOK_LIGHT_BLUE, 0.02);
    line.draw();
    Shape rect = new Rectangle(0, 0, 0, 0);
    rect.draw();
}
void test02(){
   StdDraw.setCanvasSize(600, 600);
   StdDraw.setVisible(true);
   StdDraw.line(0.3, 0.2, 0.7, 0.2);
   StdDraw.line(0.7, 0.2, 0.5, 0.75);
   StdDraw.line(0.5, 0.75, 0.3, 0.2);
   StdDraw.setPenColor(Color.CYAN);

   StdDraw.circle(0.5, 0.4, 0.12);
   StdDraw.line(0.5, 0.2, 0.5, 0.75);
}
void test01(){
    Shape[] shapes= new Shape[3];
    shapes[0] = new Line(19, 100, 35, 155);
    shapes[1]= new Rectangle(5, 10, 2, 5);
    shapes[2] = new Circle(5, 5, 15);
    for(Shape shape : shapes){
        shape.describe();
    }
}
