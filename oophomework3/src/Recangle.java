
public class Recangle  extends Shape{
    private double width;
          private double height;
    public Recangle(double width, double height) {
        this.width = width;
        this.height = height;
        
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
   
          
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getMuheet() {
        return 2*(width+height);
    }

    @Override
    public String printAreaFormula() {
     return "width*height";
    }

    @Override
    public String printMuheetFormula() {
        return "2*(width+height)";
    }
    
}
