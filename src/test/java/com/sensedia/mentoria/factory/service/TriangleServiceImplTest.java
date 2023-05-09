package com.sensedia.mentoria.factory.service;

import com.sensedia.mentoria.factory.dto.Area;
import com.sensedia.mentoria.factory.dto.Triangle;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TriangleServiceImplTest {

    @InjectMocks
    TriangleServiceImpl triangleService;

    @Test
    void testCalculateArea() {
        CalculateAreaRequest areaRequest = CalculateAreaRequest.builder()
                .geometricShapes(Triangle.builder()
                        .base(5)
                        .height(6)
                        .build())
                .build();
        Area area = triangleService.calculateArea(areaRequest);

        Assertions.assertNotNull(area);
        Assertions.assertEquals(15, area.getArea());
    }

}
