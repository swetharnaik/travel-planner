package com.example.planner;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void returnSuccessForGetCountryById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/countries/1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().json("{\n" +
                        "  \"countryKey\": {\n" +
                        "    \"id\": 1,\n" +
                        "    \"alpha2Code\": \"DE\"\n" +
                        "  },\n" +
                        "  \"name\": \"USA\",\n" +
                        "  \"capital\": null,\n" +
                        "  \"capitalCity\": {\n" +
                        "    \"id\": 10,\n" +
                        "    \"name\": \"New York\"\n" +
                        "  }\n" +
                        "}"));
    }
}
