package com.sensedia.mentoria.factory.factory;

import com.sensedia.mentoria.factory.dto.GeometricShapesType;

import java.util.Objects;

public class GeometricShapesFactoryProvider {

    public static GeometricShapesFactory getFactory(GeometricShapesType geometricShapesType) {

        String name = geometricShapesType.name().toLowerCase();

        GeometricShapesEnum geometricShapesEnum = GeometricShapesEnum.getFactoryEnum(name);

        if (Objects.isNull(geometricShapesEnum)) {
            throw new RuntimeException();
        }

        return geometricShapesEnum.getFactory();
    }
}
