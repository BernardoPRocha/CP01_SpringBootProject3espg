package br.com.fiap3espg.spring_boot_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Health-Check")
public class HealthCheckController {

    @GetMapping()
    public String HealthCheck() {
        return "API 3ESPG OK!";
    }
}
