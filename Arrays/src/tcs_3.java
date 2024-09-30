import java.util.*;

class MyClass{
    public static void main(String[] args){
        Player[] plyr = new Player[4];
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i<plyr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            String d = sc.nextLine();
            String e = sc.nextLine();

            plyr[i] = new Player(a, b, c, d, e);
        }
        String playerType = sc.nextLine();
        String matchType = sc.nextLine();
        int lowestRun  = findPlayerWithLowestRuns(plyr, playerType);
        if(lowestRun > 0){
            System.out.println(lowestRun);
        }
        else System.out.println("No such player");
        Player[] obj = findPlayerByMatchType(plyr, matchType);
        if(obj != null){
            for(int i = 0; i<obj.length; i++){
                System.out.println(obj[i].getPlayerId());
            }
        }
        else System.out.println("No Player with given matchType");
    }

    public static int findPlayerWithLowestRuns(Player[] plyr, String playerType){
        int lowest = -1;
        int count = 0;
        for(int i = 0; i<plyr.length; i++){
            if(plyr[i].getPlayerType().equals(playerType)){
                if(lowest == -1){
                    lowest = plyr[i].getRuns();
                }
                else if(plyr[i].getRuns() < lowest){
                    lowest = plyr[i].getRuns();
                }
                count++;
            }
        }
        if(count > 0){
            return lowest;
        }
        else return 0;
    }

    public static Player[] findPlayerByMatchType(Player[] arr, String mt){
        Player[] newArr = new Player[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i].getMatchType().equalsIgnoreCase(mt)){
                newArr = Arrays.copyOf(newArr, newArr.length+1);
                newArr[newArr.length-1] = arr[i];
            }
        }
        for(int i = 0; i<newArr.length-1; i++){
            for(int j =0; j<newArr.length-i-1; j++){
                if(newArr[j].getPlayerId() < newArr[j+1].getPlayerId()){
                    Player temp = newArr[j];
                    newArr[j] = newArr[j+1];
                    newArr[j+1] = temp;
                }
            }
        }
        if(newArr.length > 0){
            return newArr;
        }
        else return null;
    }
}

class Player{
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int a, String b, int c, String d, String e){
        this.playerId = a;
        this.playerName = b;
        this.runs = c;
        this.playerType = d;
        this.matchType = e;
    }

    public int getPlayerId(){
        return playerId;
    }
    public String getMatchType(){
        return matchType;
    }
    public int getRuns(){
        return runs;
    }
    public String getPlayerType(){
        return playerType;
    }
    public String getPlayerName(){
        return playerName;
    }
    public void setPlayerId(int id){
        this.playerId = id;
    }
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public void setRuns(int runs){
        this.runs = runs;
    }
    public void setPlayerType(String playerType){
        this.playerType = playerType;
    }
    public void setMatchType(String matchType){
        this.matchType = matchType;
    }
}