

/**
 *
 * @author m.salman
 */
public class Cylinder extends Shape{
    private Circle base;
        private double height;

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return  base.getArea()*height;
    }

    
       public double getSize() {
        return  base.getArea()*height;
    }

    @Override
    public double getMuheet() {
    throw new NullPointerException("The cylinder doesnt have muheet");
    
    }

    @Override
    public String printAreaFormula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String printMuheetFormula() {
         return "The cylinder doesnt have muheet";
    }
}
