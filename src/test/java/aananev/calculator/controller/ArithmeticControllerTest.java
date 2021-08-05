package aananev.calculator.controller;

import aananev.calculator.dto.request.ArithmeticRequestDto;
import aananev.calculator.util.Utility;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@AutoConfigureMockMvc
@SpringBootTest
public class ArithmeticControllerTest {

    private String addEndPoint = "/arithmetic/add";
    private String subtractEndPoint = "/arithmetic/subtract";
    private String multiplyEndPoint = "/arithmetic/multiply";
    private String divideEndPoint = "/arithmetic/divide";

    @Autowired
    private MockMvc mockMvc;

    private ArithmeticRequestDto requestDto;

    @BeforeEach
    public void setUp() {
        requestDto = ArithmeticRequestDto.builder().a(4).b(2).build();
    }

    @Test
    public void addTest() throws Exception {
        mockMvc.perform(post(addEndPoint).content(Utility.convertToJsonString(requestDto))
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));
    }

    @Test
    public void subtractTest() throws Exception {
        mockMvc.perform(post(subtractEndPoint).content(Utility.convertToJsonString(requestDto))
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));
    }

    @Test
    public void multiplyTest() throws Exception {
        mockMvc.perform(post(multiplyEndPoint).content(Utility.convertToJsonString(requestDto))
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));
    }

    @Test
    public void divideTest() throws Exception {
        mockMvc.perform(post(divideEndPoint).content(Utility.convertToJsonString(requestDto))
                .contentType("application/json"))
                .andExpect(MockMvcResultMatchers.status().is(HttpStatus.OK.value()));
    }
}
