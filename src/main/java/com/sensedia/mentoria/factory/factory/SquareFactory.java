package com.sensedia.mentoria.factory.factory;

import com.sensedia.mentoria.factory.service.GeometricShapesService;
import com.sensedia.mentoria.factory.service.SquareServiceImpl;

public class SquareFactory implements GeometricShapesFactory {
    @Override
    public GeometricShapesService createGeometricShapesService() {
        return new SquareServiceImpl();
    }
}

