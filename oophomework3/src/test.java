
public class test {

    public static void main(String[] args) {
   
        
        Circle crcl=new Circle(10);
        System.out.println(crcl.getArea());
        
        Shape cy=new Cylinder(crcl, 10);
        
        System.out.println( cy.getArea());
        
    }
    
}
