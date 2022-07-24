package br.com.alura.memes.api;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemesRepository extends MongoRepository<Memes, String> {
    
}
