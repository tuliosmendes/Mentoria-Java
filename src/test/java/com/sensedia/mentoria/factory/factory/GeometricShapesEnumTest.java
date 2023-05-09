package com.sensedia.mentoria.factory.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GeometricShapesEnumTest {
    @Test
    public void testGetFactoryEnum() {
        Assertions.assertEquals(GeometricShapesEnum.TRIANGLE, GeometricShapesEnum.getFactoryEnum("triangle"));
        Assertions.assertEquals(GeometricShapesEnum.RECTANGLE, GeometricShapesEnum.getFactoryEnum("rectangle"));
        Assertions.assertEquals(GeometricShapesEnum.SQUARE, GeometricShapesEnum.getFactoryEnum("square"));
        Assertions.assertEquals(GeometricShapesEnum.CIRCLE, GeometricShapesEnum.getFactoryEnum("circle"));
        Assertions.assertNull(GeometricShapesEnum.getFactoryEnum("invalidName"));
    }

    @Test
    public void testGetFactory() {
        Assertions.assertTrue(GeometricShapesEnum.TRIANGLE.getFactory() instanceof TriangleFactory);
        Assertions.assertTrue(GeometricShapesEnum.RECTANGLE.getFactory() instanceof RectangleFactory);
        Assertions.assertTrue(GeometricShapesEnum.SQUARE.getFactory() instanceof SquareFactory);
        Assertions.assertTrue(GeometricShapesEnum.CIRCLE.getFactory() instanceof CircleFactory);
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals(GeometricShapesEnum.TRIANGLE.getName(),"triangle");
        Assertions.assertEquals(GeometricShapesEnum.RECTANGLE.getName(),"rectangle");
        Assertions.assertEquals(GeometricShapesEnum.SQUARE.getName(),"square");
        Assertions.assertEquals(GeometricShapesEnum.CIRCLE.getName(),"circle");
    }
}
