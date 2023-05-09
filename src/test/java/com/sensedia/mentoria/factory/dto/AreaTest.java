package com.sensedia.mentoria.factory.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaTest {

    @Test
    public void testArea() {
        double expectedArea = 10.0;
        Area area = Area.builder().area(expectedArea).build();
        Assertions.assertEquals(area.getArea(),expectedArea);
    }
}
