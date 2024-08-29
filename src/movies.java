
public class movies {
    //Atributos publicos de um filme
    String name;
    int year_pub;
    String cat;
    boolean isClassic;

    //Contrutor de um objeto
    public movies (String name, int year_pub, String cat, boolean isClassic) {
        this.name = name;
        this.year_pub = year_pub;
        this.cat = cat;
        this.isClassic = isClassic;
    }


    public String exibir(){
        return "Nome" + name + "Ano" + year_pub + "Categoria" + cat + "É um classico? " + isClassic;
    }

}



