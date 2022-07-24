package br.com.alura.memes.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemesController {

   @Autowired
    private MemesRepository repositorio;

    @GetMapping("/meme")
    public List<Memes> obterMemes()
    {
        return repositorio.findAll();
    }

    @PostMapping("/meme")
    public Memes cadastrarMeme(@RequestBody Memes meme)
    {
        return repositorio.save(meme);
    }
}