package com.spring.bootapi.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class SampleResponse {
    private int id;
    private String message;
}
