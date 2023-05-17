package com.sensedia.mentoria.factory.factory;

import com.sensedia.mentoria.factory.service.SquareServiceImpl;
import com.sensedia.mentoria.factory.service.GeometricShapesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareFactoryTest {

    @Test
    public void testCreateGeometricShapesService() {
        // Arrange
        SquareFactory factory = new SquareFactory();

        // Act
        GeometricShapesService service = factory.createGeometricShapesService();

        // Assertions
        Assertions.assertNotNull(service);
        Assertions.assertTrue(service instanceof SquareServiceImpl);
    }
}
