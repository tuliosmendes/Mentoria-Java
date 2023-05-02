package com.sensedia.mentoria.factory.factory;

import com.sensedia.mentoria.factory.service.CircleServiceImpl;
import com.sensedia.mentoria.factory.service.GeometricShapesService;

public class CircleFactory implements GeometricShapesFactory {
    @Override
    public GeometricShapesService createGeometricShapesService() {
        return new CircleServiceImpl();
    }
}

