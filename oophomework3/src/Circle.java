
public class Circle extends Shape{
    private double r;
    

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }
    

    @Override
    public double getArea() {
        return Math.PI * r*r;
    }

    @Override
    public double getMuheet() {
        return 2* Math.PI * r;
    }

    @Override
    public String printAreaFormula() {
       return  "PI*r^2";
    }

    @Override
    public String printMuheetFormula() {
             return  "2*PI*r";
    }
    
}
