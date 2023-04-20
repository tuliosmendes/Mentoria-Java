package com.sensedia.mentoria.factory.service;

import com.sensedia.mentoria.factory.dto.Area;
import com.sensedia.mentoria.factory.dto.Triangle;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;

public class TriangleServiceImpl implements GeometricShapesService {

    @Override
    public Area calculateArea(CalculateAreaRequest calculateAreaRequest) {

        Triangle triangle = (Triangle) calculateAreaRequest.getGeometricShapes();
        double area = (triangle.getBase() * triangle.getHeight()) / 2;

        return Area.builder()
                .area(area)
                .build();
    }
}
