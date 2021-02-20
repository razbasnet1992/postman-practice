package com.spring.bootapi.model;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Data
@NoArgsConstructor
@Component
public class PostMessage {

    private int id;
    @NotNull
    private String subject;
   @NonNull
    private String message;

}
