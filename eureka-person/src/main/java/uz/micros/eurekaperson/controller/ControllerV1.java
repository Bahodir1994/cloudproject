package uz.micros.eurekaperson.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route_v2")
public class ControllerV1 {

    @Value("${eureka.instance.instance-id}")
    private String port;

    @GetMapping("/test2")
    public String getData1(){
        return port;
    }
}
