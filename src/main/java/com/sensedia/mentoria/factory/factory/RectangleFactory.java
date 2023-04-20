package com.sensedia.mentoria.factory.factory;

import com.sensedia.mentoria.factory.service.GeometricShapesService;
import com.sensedia.mentoria.factory.service.RectangleServiceImpl;

public class RectangleFactory implements GeometricShapesFactory {
    @Override
    public GeometricShapesService createGeometricShapesService() {
        return new RectangleServiceImpl();
    }
}
