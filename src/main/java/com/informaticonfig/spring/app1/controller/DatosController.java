

package com.informaticonfig.spring.app1.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DatosController {

    @GetMapping("/datos")
    public ResponseEntity<Map<String, String>> enviarJson() {
        Map<String, String> datos = new HashMap<>();
        datos.put("mensaje", "Hola, Carlos");
        datos.put("status", "success");

        return ResponseEntity.ok(datos);
    }
}
 