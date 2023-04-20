package com.sensedia.mentoria.factory.service;

import com.sensedia.mentoria.factory.dto.Area;
import com.sensedia.mentoria.factory.dto.Rectangle;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;

public class RectangleServiceImpl implements GeometricShapesService {

    @Override
    public Area calculateArea(CalculateAreaRequest calculateAreaRequest) {

        Rectangle rectangle = (Rectangle) calculateAreaRequest.getGeometricShapes();
        double area = rectangle.getBase() * rectangle.getHeight();

        return Area.builder()
                .area(area)
                .build();
    }
}
