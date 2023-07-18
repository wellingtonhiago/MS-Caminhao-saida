package br.com.inteligate.saida.service;

import br.com.inteligate.saida.model.Saida;
import br.com.inteligate.saida.repository.SaidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public
class SaidaService {

    @Autowired
    private SaidaRepository saidaRepository;

    public Saida save(Saida saida) {
        saida.setDataHora(LocalDateTime.now());
        return saidaRepository.save(saida);
    }

    public List<Saida> findAll() {
        return saidaRepository.findAll();
    }

    public Saida findByPlaca(String placa) {
        return saidaRepository.findById(placa).orElse(null);
    }

    public void delete(String placa) {
        saidaRepository.deleteById(placa);
    }
}
