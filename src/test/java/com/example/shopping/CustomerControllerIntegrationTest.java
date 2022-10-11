package com.example.shopping;

import com.example.shopping.dto.AddressDto;
import com.example.shopping.dto.CustomerDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.ResourceUtils;

import java.nio.file.Files;
import java.util.Collections;

@SpringBootTest
@AutoConfigureMockMvc
public class CustomerControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void returnSuccessForGetCustomerById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/customers/1"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .json(Files.readString(ResourceUtils
                                .getFile("classpath:testresult/customer-by-id.json").toPath())));
    }

    @Test
    void returnSuccessForAddCustomer() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/customers")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(new ObjectMapper().writeValueAsString(returnCustomerDto())))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .json(Files.readString(ResourceUtils
                                .getFile("classpath:testresult/new-customer.json").toPath())));
    }

    @Test
    void returnSuccessForUpdateCustomer() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/customers/2")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(new ObjectMapper().writeValueAsString(returnCustomerDto())))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .json(Files.readString(ResourceUtils
                                .getFile("classpath:testresult/new-customer.json").toPath())));
    }

    @Test
    void returnFailureForUpdateCustomerDoesntExist() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.put("/customers/100")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(new ObjectMapper().writeValueAsString(returnCustomerDto())))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    private CustomerDto returnCustomerDto() {
        CustomerDto customerDto = CustomerDto.builder()
                .firstName("ABC")
                .lastName("XYZ")
                .emailAddress("adarsh@pk.com")
                .addresses(Collections.singletonList(AddressDto.builder()
                        .streetName("Strasse")
                        .district("Munchen")
                        .country("Deutschland")
                        .pinCode("123").build()))
                .build();
        return customerDto;
    }

}
