package com.sensedia.mentoria.factory.service;

import com.sensedia.mentoria.factory.dto.Area;
import com.sensedia.mentoria.factory.dto.Square;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SquareServiceImplTest {

    @InjectMocks
    SquareServiceImpl squareService;

    @Test
    void testCalculateArea() {
        CalculateAreaRequest areaRequest = CalculateAreaRequest.builder()
                .geometricShapes(Square.builder()
                        .side(5)
                        .build())
                .build();
        Area area = squareService.calculateArea(areaRequest);

        Assertions.assertNotNull(area);
        Assertions.assertEquals(25, area.getArea());
    }

}
