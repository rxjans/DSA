import java.util.*;
class Solution {
        public static void main(String[] args) {
            Player[] plyr = new Player[4];
            Scanner sc = new Scanner(System.in);
            for(int i=0; i<plyr.length; i++){
                int a = sc.nextInt();
                sc.nextLine();
                String b = sc.nextLine();
                String c = sc.nextLine();
                int d = sc.nextInt();
                sc.nextLine();

                plyr[i] = new Player(a, b, c, d);
            }
            String skillReq = sc.nextLine();
            String levelReq = sc.nextLine();
            int res = findPointsForGivenSkill(plyr, skillReq);
            if(res != 0){
                System.out.println(res);
            }
            else System.out.print("The given Skill is not available");
            Player[] res2 = findPlayerBasedOnLevel(skillReq, levelReq, plyr);
            if(res2 != null){
                System.out.print(res2[0].getPlayerId());
            }
            else System.out.print("No player is available with specified level, skill and eligibility points");
        }
        public static int findPointsForGivenSkill(Player[] plyr, String skillReq){
            int sum = 0;
            for(int i = 0; i< plyr.length; i++){
                if(plyr[i].getSkill().equalsIgnoreCase(skillReq)){
                    sum = sum + plyr[i].getPoints();
                }
            }
            return sum;
        }

        public static Player[] findPlayerBasedOnLevel(String skill, String level, Player[] plyr){
            Player[] pet = new Player[0];
            for(int i=0; i<plyr.length; i++){
                if(plyr[i].getSkill().equalsIgnoreCase(skill) && plyr[i].getLevel().equalsIgnoreCase(level) && plyr[i].getPoints() >= 20){
                    pet = Arrays.copyOf(pet, pet.length+1);
                    pet[pet.length-1]= plyr[i];
                }
            }
            if(pet.length > 0){
                return pet;
            }
            else return null;
        }
    }

    class Player{
        private int playerId, points;
        private String skill, level;

        public Player(int id, String skill, String level, int points){
            this.playerId = id;
            this.points = points;
            this.skill = skill;
            this.level = level;
        }

        public int getPlayerId(){
            return playerId;
        }
        public void setPlayerId(int id){
            this.playerId = id;
        }
        public void setPoints(int points){
            this.points = points;
        }
        public int getPoints(){
            return points;
        }
        public void setSkill(String skill){
            this.skill = skill;
        }
        public String getSkill(){
            return skill;
        }
        public void setLevel(String level){
            this.level = level;
        }
        public String getLevel(){
            return level;
        }
    }

