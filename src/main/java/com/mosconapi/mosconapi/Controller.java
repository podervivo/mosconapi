package com.mosconapi.mosconapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/holamundo")
    public String holamundo() {
        return "hola mundo feliz";
    }

}
