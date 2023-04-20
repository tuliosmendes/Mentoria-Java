package com.sensedia.mentoria.factory.service;

import com.sensedia.mentoria.factory.dto.Area;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;

public interface GeometricShapesService {

    public Area calculateArea(CalculateAreaRequest calculateAreaRequest);
}
