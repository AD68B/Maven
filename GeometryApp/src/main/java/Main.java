import com.geometry.figures.Circle;
import com.geometry.figures.Rectangle;
import com.geometry.three_dimensional.figures.Cube;
import com.geometry.three_dimensional.figures.Sphere;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        Cube cube = new Cube(3.0);
        Sphere sphere = new Sphere(2.5);

        System.out.println("Площадь круга: " + circle.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());

        System.out.println("Объем куба: " + cube.calculateVolume());
        System.out.println("Площадь поверхности сферы: " + sphere.calculateSurfaceArea());
    }
}

