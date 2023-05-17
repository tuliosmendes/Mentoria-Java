package com.sensedia.mentoria.factory.factory;

import com.sensedia.mentoria.factory.service.TriangleServiceImpl;
import com.sensedia.mentoria.factory.service.GeometricShapesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleFactoryTest {

    @Test
    public void testCreateGeometricShapesService() {
        // Arrange
        TriangleFactory factory = new TriangleFactory();

        // Act
        GeometricShapesService service = factory.createGeometricShapesService();

        // Assertions
        Assertions.assertNotNull(service);
        Assertions.assertTrue(service instanceof TriangleServiceImpl);
    }
}
