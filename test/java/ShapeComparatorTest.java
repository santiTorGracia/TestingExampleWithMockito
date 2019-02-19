import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ShapeComparatorTest {
    @Test
    public void testPerimeterFigure1GreaterThanFigure2ReturnsValueGreaterThan0() throws IOException {
        Shape s1 = mock(Shape.class);
        Shape s2 = mock(Shape.class);

        when(s1.getPerimeter()).thenReturn(10.0);
        when(s2.getPerimeter()).thenReturn(1.0);

        double value = ShapeComparator.comparePerimeter(s1, s2);

        Assertions.assertTrue(value > 0);
    }
}
