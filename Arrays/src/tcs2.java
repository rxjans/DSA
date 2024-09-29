import java.util.*;
public class tcs2 {
    public static void main(String[] args){
        Flowers[] arr = new Flowers[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            int c = sc.nextInt(); sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();

            arr[i] = new Flowers(a, b, c, d, e);
        }
        String type = sc.nextLine();
        Flowers res = findMinPriceByType(arr, type);
        if(res != null){
            System.out.println(res.getFlowerId());
        } else System.out.println("There is no flower with given type.");
    }

    public static Flowers findMinPriceByType(Flowers[] arr, String type){
        Flowers[] res = new Flowers[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i].getRating() > 3 && arr[i].getType().equals(type)){
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length-1]= arr[i];
            }
        }

        for(int i = 0; i<res.length-1; i++) {
            for (int j = 0; j < res.length - i - 1; j++) {
                if (res[j].getPrice() > res[j + 1].getPrice()) {
                    Flowers temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                }
            }
        }
        if(res.length > 1 ){
            return res[0];
        }
        return null;
    }

}

class Flowers{
    private int flowerId;
    private String flowerName;
    private int price;
    private int rating;
    private String type;

    public Flowers(int flowerId, String flowerName, int price, int rating, String type){
        this.flowerId = flowerId;
        this.flowerName = flowerName;
        this.price = price;
        this.rating = rating;
        this.type = type;
    }

    public int getFlowerId() {
        return flowerId;
    }

    public void setFlowerId(int flowerId) {
        this.flowerId = flowerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
