package com.sensedia.mentoria.factory.service;

import com.sensedia.mentoria.factory.dto.Area;
import com.sensedia.mentoria.factory.dto.Square;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;

public class SquareServiceImpl implements GeometricShapesService {

    @Override
    public Area calculateArea(CalculateAreaRequest calculateAreaRequest) {

        Square square = (Square) calculateAreaRequest.getGeometricShapes();
        double area = square.getSide() * square.getSide();

        return Area.builder()
                .area(area)
                .build();
    }
}
