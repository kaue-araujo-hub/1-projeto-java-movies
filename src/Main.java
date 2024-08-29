
public class Main {
    public static void main(String[] args) {
        System.out.printf("Vamos falar de filme?");

        //Invoca a classe, nomear a classe e criar objeto
        movies juventude = new movies("Juventude Transviada",1955, "Drama", true);
        movies milagre = new movies("À Espera de um Milagre", 1999, "Drama", false);
        movies sonho = new movies("Um Sonho de Liberdade", 1994, "Drama", true);
        movies perfume = new movies("Perfume de Mulher", 1992, "Drama", true);
        movies rocky = new movies("Rocky: Um Lutador", 1976, "Drama", true);

        System.out.println(juventude.exibir());
        System.out.println(milagre.exibir());
        System.out.println(sonho.exibir());
        System.out.println(perfume.exibir());
        System.out.println(rocky.exibir());
    }
}