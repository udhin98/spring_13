package com.example.es13.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {
    @GetMapping
    public OffsetDateTime currentDateTime () {
        return OffsetDateTime.now();
    }
}
