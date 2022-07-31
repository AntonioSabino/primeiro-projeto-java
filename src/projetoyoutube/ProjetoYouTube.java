package projetoyoutube;

public class ProjetoYouTube {
    public static void main(String[] args) {
        Video[] videos = new Video[3];
        videos[0] = new Video("Aula 1 de POO");
        videos[1] = new Video("Aula 12 de PHP");
        videos[2] = new Video("Aula 10 de HTML5");

        Gafanhoto[] gafanhoto = new Gafanhoto[2];

        gafanhoto[0] = new Gafanhoto("Sabino", 29, "M", "sabino");
        gafanhoto[1] = new Gafanhoto("Junior", 19, "M", "axterix");

        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(gafanhoto[0], videos[1]);
        vis[0].avaliar(87.0f);
        vis[1] = new Visualizacao(gafanhoto[0], videos[0]);
        vis[1].avaliar();

        System.out.println(vis[0]);
        System.out.println(vis[1]);
    }
}
