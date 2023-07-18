package br.com.inteligate.saida.controller;

import br.com.inteligate.saida.model.Saida;
import br.com.inteligate.saida.service.SaidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saida")
public class Controller {

    @Autowired
    private SaidaService saidaService;

    @PostMapping
    public void registrarSaida(@RequestBody Saida placa) {
        saidaService.save(placa);
    }

    @GetMapping("/{placa}")
    public Saida findByPlaca(@RequestParam("placa") String placa) {
        return saidaService.findByPlaca(placa);
    }

    @GetMapping
    public List<Saida> findAll() {
        return saidaService.findAll();
    }

    @DeleteMapping("/{placa}")
    public void delete(@PathVariable("placa") String placa) {
        saidaService.delete(placa);
    }

}
