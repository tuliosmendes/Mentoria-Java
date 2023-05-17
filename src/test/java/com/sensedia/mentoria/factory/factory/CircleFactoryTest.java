package com.sensedia.mentoria.factory.factory;

import com.sensedia.mentoria.factory.service.GeometricShapesService;
import com.sensedia.mentoria.factory.service.CircleServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleFactoryTest {

    @Test
    public void testCreateGeometricShapesService() {
        // Arrange
        CircleFactory factory = new CircleFactory();

        // Act
        GeometricShapesService service = factory.createGeometricShapesService();

        // Assertions
        Assertions.assertNotNull(service);
        Assertions.assertTrue(service instanceof CircleServiceImpl);
    }
}
