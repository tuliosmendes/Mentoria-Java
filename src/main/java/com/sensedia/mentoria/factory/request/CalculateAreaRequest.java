package com.sensedia.mentoria.factory.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.sensedia.mentoria.factory.dto.GeometricShapes;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class CalculateAreaRequest {
    private GeometricShapes geometricShapes;
}
