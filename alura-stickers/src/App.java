import java.io.InputStream;

import java.net.URL;
import java.util.List;


public class App {
    
    public static void main(String[] args) throws Exception {
     

        String url = "https://alura-memes-api.herokuapp.com/meme";
        ExtratorDeConteudo extrator = new ExtratorDeConteudoMemes();
        
        var http = new ClientHttp();
        String json = http.buscaDados(url);

  
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new GeradoraDeFigurinhas();

        for (int i = 0; i < 11; i++) {

            Conteudo conteudo = conteudos.get(i);

            

            

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();

            String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

            geradora.cria(inputStream, nomeArquivo);

            System.out.println("Name: " + conteudo.getTitulo());

   
        }

    }

}
