package com.sensedia.mentoria.factory.factory;

import lombok.Getter;

@Getter
public enum GeometricShapesEnum {

    TRIANGLE("triangle", new TriangleFactory()),
    RECTANGLE("rectangle", new RectangleFactory()),
    SQUARE("square", new SquareFactory());

    private String name;
    private GeometricShapesFactory factory;

    GeometricShapesEnum(String name, GeometricShapesFactory factory) {
        this.name = name;
        this.factory = factory;
    }

    public static GeometricShapesEnum getFactoryEnum(String name) {

        for (GeometricShapesEnum g : GeometricShapesEnum.values()) {
            if (String.valueOf(g.name).equalsIgnoreCase(name)) {
                return g;
            }
        }
        return null;
    }

    public GeometricShapesFactory getFactory() {
        return factory;
    }

}
