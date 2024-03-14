package poo.construtores.domain;

public class Filme {
    private String movie;
    private String genre;
    private int year;
    private String plataform;


    public Filme(String movie, String genre, int year){
        this.movie = movie;
        this.genre = genre;
        this.year = year;
    }

    public Filme(String movie, String genre, int year, String plataform){
        this(movie, genre, year);
        this.plataform = plataform;
    }

    public void imprime(){
        System.out.println(this.movie);
        System.out.println(this.genre);
        System.out.println(this.year);
        System.out.println(this.plataform);
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
