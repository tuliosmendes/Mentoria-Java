package com.sensedia.mentoria.factory.rest;

import com.sensedia.mentoria.factory.dto.Area;
import com.sensedia.mentoria.factory.factory.GeometricShapesFactoryProvider;
import com.sensedia.mentoria.factory.request.CalculateAreaRequest;
import com.sensedia.mentoria.factory.service.GeometricShapesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mentoria-java/example/factory")
public class GeometricShapesController {

    private GeometricShapesService service;

    @PostMapping
    public ResponseEntity<Area> calculateArea(@RequestBody CalculateAreaRequest calculateAreaRequest) {

        service = GeometricShapesFactoryProvider.getFactory(calculateAreaRequest.getGeometricShapes().getGeometricShapesType())
                .createGeometricShapesService();

        return ResponseEntity.ok(service.calculateArea(calculateAreaRequest));
    }

}
