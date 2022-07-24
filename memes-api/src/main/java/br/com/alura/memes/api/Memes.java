package br.com.alura.memes.api;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "memes")
public class Memes {

    @Id
    private String id;
    private String name;
    private String image;

    
    
    public Memes(String name, String image) {
        this.name = name;
        this.image = image;
    }
    public Memes(){

    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getImage() {
        return image;
    }
    
    
}
