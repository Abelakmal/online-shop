package com.abel.ecommerce.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestexeption extends RuntimeException {

    public BadRequestexeption(String message) {
        super(message);
    }
}
