package com.sensedia.mentoria.factory.service;

import com.sensedia.mentoria.factory.dto.Area;
import com.sensedia.mentoria.factory.dto.Circle;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;

public class CircleServiceImpl implements GeometricShapesService {

    @Override
    public Area calculateArea(CalculateAreaRequest calculateAreaRequest) {

        Circle circle = (Circle) calculateAreaRequest.getGeometricShapes();
        double area = Math.PI * Math.pow(circle.getRadius(),2);

        return Area.builder()
                .area(area)
                .build();
    }
}
