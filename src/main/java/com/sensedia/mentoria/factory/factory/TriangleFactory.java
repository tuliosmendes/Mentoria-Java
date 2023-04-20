package com.sensedia.mentoria.factory.factory;

import com.sensedia.mentoria.factory.service.GeometricShapesService;
import com.sensedia.mentoria.factory.service.TriangleServiceImpl;

public class TriangleFactory implements GeometricShapesFactory {
    @Override
    public GeometricShapesService createGeometricShapesService() {
        return new TriangleServiceImpl();
    }
}

