package com.sensedia.mentoria.factory.factory;

import com.sensedia.mentoria.factory.service.GeometricShapesService;
import com.sensedia.mentoria.factory.service.RectangleServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleFactoryTest {

    @Test
    public void testCreateGeometricShapesService() {
        // Arrange
        RectangleFactory factory = new RectangleFactory();

        // Act
        GeometricShapesService service = factory.createGeometricShapesService();

        // Assertions
        Assertions.assertNotNull(service);
        Assertions.assertTrue(service instanceof RectangleServiceImpl);
    }
}
