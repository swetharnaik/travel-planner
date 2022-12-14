package com.example.shopping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.ResourceUtils;

import java.nio.file.Files;

@SpringBootTest
@AutoConfigureMockMvc
public class OrderControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void returnSuccessForGetOrderById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/orders/111"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .json(Files.readString(ResourceUtils
                                .getFile("classpath:testresult/order-by-id.json").toPath())));
    }

    @Test
    void returnSuccessForGetOrderByItemSize() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/orders?itemSize=2"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .json(Files.readString(ResourceUtils
                                .getFile("classpath:testresult/order-by-item-count.json").toPath())));
    }

}
