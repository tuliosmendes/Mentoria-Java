package com.sensedia.mentoria.factory.service;

import com.sensedia.mentoria.factory.dto.Area;
import com.sensedia.mentoria.factory.dto.Circle;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CircleServiceImplTest {

    @InjectMocks
    CircleServiceImpl circleService;

    @Test
    void testCalculateArea() {
        CalculateAreaRequest areaRequest = CalculateAreaRequest.builder()
                .geometricShapes(Circle.builder()
                        .radius(5)
                        .build())
                .build();
        Area area = circleService.calculateArea(areaRequest);

        Assertions.assertNotNull(area);
        Assertions.assertEquals(78.54, area.getArea());
    }

}
