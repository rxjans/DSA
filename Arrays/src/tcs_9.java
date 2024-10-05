import java.util.*;
public class tcs_9 {
    public static void main(String[] args){
        Cinema[] arr = new Cinema[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Cinema(a,b,c,d);
        }
        String director = sc.nextLine();
        int rating = sc.nextInt();
        int budget = sc.nextInt();
        int res = findAvgBudgetByDirector(arr, director);
        if(res > 0){
            System.out.println(res);
        }
        else System.out.println("Sorry - The given director has not yet directed any movie");
        Cinema obj = getMovieByRatingBudget(arr, rating, budget);
        if(obj != null){
            System.out.println(obj.getMovieId());
        }
        else System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
    }

    public static int findAvgBudgetByDirector(Cinema[] arr, String director){
        int count = 0;
        int budget = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i].getDirector().equalsIgnoreCase(director)){
                budget += arr[i].getBudget();
                count++;
            }
        }
        if(count > 0){
            return (budget/count);
        }
        else return 0;
    }

    public static Cinema getMovieByRatingBudget(Cinema[] arr, int rating, int budget){
        if(budget % rating != 0){
            return null;
        }
        for(int i = 0; i< arr.length; i++){
            if(arr[i].getRating() == rating && arr[i].getBudget() == budget){
                return arr[i];
            }
        }
        return null;
    }
}

class Cinema{
    private int movieId;
    private String director;
    private int rating;
    private int budget;

    public Cinema(int movieId, String director, int rating, int budget){
        this.movieId = movieId;
        this.director = director;
        this.rating = rating;
        this.budget = budget;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}