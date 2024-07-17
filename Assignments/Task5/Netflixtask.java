package Task5;

public class Netflixtask {
    static String[] top10Movies = {"Inception", "The Dark Knight", "Interstellar", "Parasite", "Joker", "Avengers: Endgame", "The Godfather", "Pulp Fiction", "Fight Club", "Forrest Gump"};
    static String[] englishMovies = {"Inception", "The Dark Knight", "Interstellar", "Pulp Fiction", "Fight Club", "Forrest Gump", "The Matrix", "Gladiator", "The Shawshank Redemption", "Titanic"};
    static String[] kannadaMovies = {"KGF Chapter 1", "KGF Chapter 2", "Kirik Party", "Ugramm", "Rangitaranga", "Lucia", "Ulidavaru Kandanthe", "Avane Srimannarayana", "Tagaru", "Mufti"};
    static String[] hindiMovies = {"3 Idiots", "Dangal", "Lagaan", "Sholay", "DDLJ", "Gully Boy", "PK", "Chak De India", "Zindagi Na Milegi Dobara", "Barfi!"};
    static String[] koreanSeries = {"Squid Game", "Crash Landing on You", "Itaewon Class", "Kingdom", "Vincenzo", "Descendants of the Sun", "My Love from the Star", "Goblin", "The Heirs", "Signal"};

    public static void main(String[] args) {
        
        for(int index=0;index<top10Movies.length;index++){
            System.out.println(top10Movies[index]);
        }
        System.out.println("-----------------------------------------------------------------------");
        for(String english:englishMovies){
            System.out.println(english);
        }
        System.out.println("-----------------------------------------------------------------------");
        for(String kannada:kannadaMovies){
            System.out.println(kannada);

    }
    System.out.println("-----------------------------------------------------------------------");
    for(String hindi:hindiMovies){
        System.out.println(hindi);

}
System.out.println("-----------------------------------------------------------------------");
for(String korean:koreanSeries){
    System.out.println(korean);

}
    }
}

