package cristovaoperez.repositories;

import org.springframework.data.repository.CrudRepository;

import cristovaoperez.models.Jogo;

public interface JogoRepository extends CrudRepository<Jogo, Integer> {
    
}