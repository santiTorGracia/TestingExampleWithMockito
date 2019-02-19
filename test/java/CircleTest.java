import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void testRadiusSmallerOrEqualToZeroThrowsException() {
        try {
            new Circle(0);
            Assertions.fail("Radius 0 doesn't throw exception.");
        } catch (IllegalArgumentException ignored) {}
    }

    @Test
    public void testPerimeterIsProperlyCalculated() {
        Circle c = new Circle(2);

        double p = c.getPerimeter();

        Assertions.assertEquals(12.56, p, 0.01);
    }

    @Test
    public void testOverflowArea() {
        Circle c = new Circle(Integer.MAX_VALUE);

    }

    @Test
    public void testOverflowPerimeter() {
        Circle c = new Circle(Integer.MAX_VALUE);
    }
}
