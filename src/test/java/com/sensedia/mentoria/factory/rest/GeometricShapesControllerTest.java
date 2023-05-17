package com.sensedia.mentoria.factory.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sensedia.mentoria.factory.utils.MentoriaTestUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GeometricShapesController.class)
public class GeometricShapesControllerTest {
    // https://howtodoinjava.com/spring-boot2/testing/spring-boot-mockmvc-example/

    @Autowired
    private MockMvc mvc;

    @Test
    public void postGeometricShapeSquare() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        String requestJson = objectMapper.writeValueAsString(MentoriaTestUtils.buildCalculateAreaRequestSquare());

        String expectedJson = "{\"area\":25}";

        mvc.perform(MockMvcRequestBuilders
                        .post("/mentoria-java/example/factory")
                        .content(requestJson)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.area").value(25))

                .andExpect(MockMvcResultMatchers.content().json(expectedJson));
    }

    @Test
    public void postGeometricShapeRectangle() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        String requestJson = objectMapper.writeValueAsString(MentoriaTestUtils.buildCalculateAreaRequestRectangle());

        String expectedJson = "{\"area\":20}";

        mvc.perform(MockMvcRequestBuilders
                        .post("/mentoria-java/example/factory")
                        .content(requestJson)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.area").value(20))

                .andExpect(MockMvcResultMatchers.content().json(expectedJson));
    }

}
