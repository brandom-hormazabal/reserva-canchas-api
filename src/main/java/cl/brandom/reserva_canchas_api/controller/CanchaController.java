package cl.brandom.reserva_canchas_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/canchas")
public class CanchaController {

    @GetMapping
    public List<String> listar() {
        return List.of("Cancha 1",  "Cancha 2", "Cancha 3");
    }

}
