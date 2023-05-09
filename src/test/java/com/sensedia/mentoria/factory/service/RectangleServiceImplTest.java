package com.sensedia.mentoria.factory.service;

import com.sensedia.mentoria.factory.dto.Area;
import com.sensedia.mentoria.factory.dto.Rectangle;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class RectangleServiceImplTest {

    @InjectMocks
    RectangleServiceImpl rectangleService;

    @Test
    void testCalculateArea() {
        CalculateAreaRequest areaRequest = CalculateAreaRequest.builder()
                .geometricShapes(Rectangle.builder()
                        .base(5)
                        .height(6)
                        .build())
                .build();
        Area area = rectangleService.calculateArea(areaRequest);
        Assertions.assertNotNull(area);
        Assertions.assertEquals(30, area.getArea());
    }

}
