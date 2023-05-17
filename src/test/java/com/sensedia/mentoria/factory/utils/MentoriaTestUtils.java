package com.sensedia.mentoria.factory.utils;

import com.sensedia.mentoria.factory.dto.GeometricShapes;
import com.sensedia.mentoria.factory.dto.GeometricShapesType;
import com.sensedia.mentoria.factory.dto.Rectangle;
import com.sensedia.mentoria.factory.dto.Square;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;

public class MentoriaTestUtils {

    public static CalculateAreaRequest buildCalculateAreaRequestSquare(){
        CalculateAreaRequest reqBody = new CalculateAreaRequest();
        GeometricShapes shape = new Square();
        Square square = (Square) shape;
        square.setSide(5);
        reqBody.setGeometricShapes(square);
        return reqBody;
    }

    public static CalculateAreaRequest buildCalculateAreaRequestRectangle(){

        GeometricShapes shape = new Rectangle();
        Rectangle rectangle = (Rectangle) shape;
        rectangle.setHeight(2);
        rectangle.setBase(10);
        return CalculateAreaRequest.builder().geometricShapes(rectangle).build();
    }

}
