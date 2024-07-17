package Task5;

public class SportsManiaTask {
    static String[] iplTeams = {"RCB", "CSK", "MI", "GT", "LSG", "DC", "SRH", "KKR", "PBKS"};
    static String[] topBatsmen = {"Babar Azam", "Virat Kohli", "Steve Smith", "Kane Williamson", "Joe Root", "David Warner", "Rohit Sharma", "Ross Taylor", "Quinton de Kock", "Aaron Finch"};
    static String[] iccTeamRankings = {"India", "Australia", "New Zealand", "England", "Pakistan", "South Africa", "Bangladesh", "Sri Lanka", "West Indies", "Afghanistan"};
    public static void main(String[] args) {
        for(int i=0;i<iplTeams.length;i++){
            System.out.println(iplTeams[i]);

        }
        System.out.println("--------------------------------------------------------------");
        for(String topbatsman:topBatsmen){
            System.out.println(topbatsman);
        }
        System.out.println("------------------------------------------------------------------");
        for(String icc:iccTeamRankings){
            System.out.println(icc);
        }
    }
}

