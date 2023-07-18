package br.com.inteligate.saida.repository;


import br.com.inteligate.saida.model.Saida;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SaidaRepository extends MongoRepository<Saida, String> {
}
