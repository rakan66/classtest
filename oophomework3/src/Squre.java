
public class Squre extends Shape{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Squre(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
       return height*height;
    }

    @Override
    public double getMuheet() {
        return 4*height;
    }

    @Override
    public String printAreaFormula() {
        return "";
    }

    @Override
    public String printMuheetFormula() {
        return "";
    }
        
}
