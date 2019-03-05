
/**
 * Dylan Klingensmith
 * NCAA Tournament
 * AP Computer Science
 * 2/22/19
 */

import java.util.Random;
import java.util.ArrayList;

public class Predictor {

    public static void main(String[] args) {

        //Establish ArrayList for the Final Four
        ArrayList<Team> finalFour = new ArrayList(4);

        //Establish ArrayList for the East region and add teams
        ArrayList<Team> eastRoundOne = new ArrayList();
        eastRoundOne.add(new Team("Villanova", 1, 5));
        eastRoundOne.add(new Team("Radford", 16, 1));
        eastRoundOne.add(new Team("Virginia Tech", 8, 2));
        eastRoundOne.add(new Team("Alabama", 9, 6));
        eastRoundOne.add(new Team("West Virginia", 5, 5));
        eastRoundOne.add(new Team("Murray St.", 12, 1));
        eastRoundOne.add(new Team("Wichita St.", 4, 5));
        eastRoundOne.add(new Team("Marshall", 13, 1));
        eastRoundOne.add(new Team("Florida", 6, 3));
        eastRoundOne.add(new Team("St. Bonaventure", 11, 0));
        eastRoundOne.add(new Team("Texas Tech", 3, 5));
        eastRoundOne.add(new Team("S.F. Austin", 14, 1));
        eastRoundOne.add(new Team("Arkansas", 7, 3));
        eastRoundOne.add(new Team("Butler", 10, 3));
        eastRoundOne.add(new Team("Purdue", 2, 4));
        eastRoundOne.add(new Team("CSU Fullerton", 15, 1));

        //Establish ArrayList for the West region and add teams
        ArrayList<Team> westRoundOne = new ArrayList();
        westRoundOne.add(new Team("Xavier", 1, 4));
        westRoundOne.add(new Team("NC Central", 16, 1));
        westRoundOne.add(new Team("Missouri", 8, 2));
        westRoundOne.add(new Team("Florida St.", 9, 2));
        westRoundOne.add(new Team("Ohio St.", 5, 4));
        westRoundOne.add(new Team("Dakota St.", 12, 1));
        westRoundOne.add(new Team("Gonzoga", 4, 5));
        westRoundOne.add(new Team("UNCG", 13, 1));
        westRoundOne.add(new Team("Houston", 6, 4));
        westRoundOne.add(new Team("San Diego St.", 11, 1));
        westRoundOne.add(new Team("Michigan", 3, 7));
        westRoundOne.add(new Team("Montana", 14, 1));
        westRoundOne.add(new Team("Texas A&M", 7, 6));
        westRoundOne.add(new Team("Providence", 10, 3));
        westRoundOne.add(new Team("North Carolina", 2, 7));
        westRoundOne.add(new Team("Lipscomb", 15, 1));

        //Establish ArrayList for the Midwest region and add teams
        ArrayList<Team> midwestRoundOne = new ArrayList();
        midwestRoundOne.add(new Team("Kansas", 1, 8));
        midwestRoundOne.add(new Team("Penn", 16, 1));
        midwestRoundOne.add(new Team("Seton Hall", 8, 2));
        midwestRoundOne.add(new Team("NC St.", 9, 2));
        midwestRoundOne.add(new Team("Clemson", 5, 5));
        midwestRoundOne.add(new Team("New Mexico St.", 12, 3));
        midwestRoundOne.add(new Team("Auburn", 4, 3));
        midwestRoundOne.add(new Team("Charleston", 13, 1));
        midwestRoundOne.add(new Team("TCU", 6, 4));
        midwestRoundOne.add(new Team("Syracuse", 11, 5));
        midwestRoundOne.add(new Team("Michigan St.", 3, 8));
        midwestRoundOne.add(new Team("Bucknell", 14, 1));
        midwestRoundOne.add(new Team("Rhode Island", 7, 0));
        midwestRoundOne.add(new Team("Oklahoma", 10, 5));
        midwestRoundOne.add(new Team("Duke", 2, 89));
        midwestRoundOne.add(new Team("Iona", 15, 67));

        //Establish ArrayList for the South region and add teams
        ArrayList<Team> southRoundOne = new ArrayList();
        southRoundOne.add(new Team("Virginia", 1, 54));
        southRoundOne.add(new Team("UMBC", 16, 23));
        southRoundOne.add(new Team("Creighton", 8, 64));
        southRoundOne.add(new Team("Kansas St.", 9, 2));
        southRoundOne.add(new Team("Kentucky", 5, 21));
        southRoundOne.add(new Team("Davidson", 12, 6));
        southRoundOne.add(new Team("Arizona", 4, 23));
        southRoundOne.add(new Team("Buffalo", 13, 4));
        southRoundOne.add(new Team("Miami (FL)", 6, 34));
        southRoundOne.add(new Team("Loyola (FL)", 11, 62));
        southRoundOne.add(new Team("Tennessee", 3, 123));
        southRoundOne.add(new Team("Wright St.", 14, 6));
        southRoundOne.add(new Team("Nevada", 7, 83));
        southRoundOne.add(new Team("Texas", 10, 23));
        southRoundOne.add(new Team("Cincinatti", 2, 4));
        southRoundOne.add(new Team("Georgia St.", 15, 245));

        //Compare the rankings of each pair of East teams and determine the 
        //final team
        for (int x = 8; x > 2; x /= 2) {
            
            for (int y = 0; y < x; y += 2)  {
                
               eastRoundOne.remove(compareTeams(eastRoundOne.get(y),
                        eastRoundOne.get(y + 1)));
                        
            }                  
            
        }
        
        
        eastRoundOne.trimToSize();      
        finalFour.add(eastRoundOne.get(0));
       
        //Compare the rankings of each pair of West teams and determines the
        //final team
        for (int x = 8; x > 2; x /= 2) {
            
            for (int y = 0; y < x; y += 2)  {
                
               westRoundOne.remove(compareTeams(westRoundOne.get(y),
                        westRoundOne.get(y + 1)));
                        
            }                  
            
        }
        
        westRoundOne.trimToSize();
        finalFour.add(westRoundOne.get(0));
        
        //Compare the rankings of each pair of South teams and determines the
        //final team
        for (int x = 8; x > 2; x /= 2) {
            
            for (int y = 0; y < x; y += 2)  {
                
               southRoundOne.remove(compareTeams(southRoundOne.get(y),
                        southRoundOne.get(y + 1)));
                        
            }
                        
        }
        
        southRoundOne.trimToSize();
        finalFour.add(southRoundOne.get(0));
        
        //Compare the rankings of each pair of South teams and determines the
        //final team
        for (int x = 8; x > 2; x /= 2) {
            
            for (int y = 0; y < x; y += 2)  {
                
               midwestRoundOne.remove(compareTeams(midwestRoundOne.get(y),
                        midwestRoundOne.get(y + 1)));
                        
            }
            
        }
          
        midwestRoundOne.trimToSize();
        finalFour.add(midwestRoundOne.get(0));
    
        //Print the names of the teams in the Final Four
        for (int x = 0; x < 4; x++) {
            
            System.out.println(finalFour.get(x).getName());
            
        }
       
    }

    //The compareTeams method returns the team with the lesser power ranking
    //If the rankings are tied, the method generates a random number for each
    //team and returns the team with the lower number
    public static Team compareTeams(Team team1, Team team2) {

        if (team1.getPowerRanking() > team2.getPowerRanking()) {

            return team2;

        } else if (team2.getPowerRanking() > team1.getPowerRanking()) {

            return team1;

        } else {

            Random randomizer = new Random();

            int number1 = randomizer.nextInt(100);
            int number2 = randomizer.nextInt(100);

            if (number1 > number2) {

                return team2;

            } else {

                return team1;

            }

        }

    }

}
