import java.util.*;
public class tcs_6 {
    public static void main(String[] args){
        Laptop[] arr = new Laptop[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble(); sc.nextLine();
            int e = sc.nextInt(); sc.nextLine();

            arr[i] = new Laptop(a, b, c, d, e);
        }
        String brand = sc.nextLine();
        String osType = sc.nextLine();
        int count = countOfLaptopsByBrand(arr, brand);
        if(count > 0){
            System.out.println(count);
        }
        else System.out.println("The given brand is not available");

        Laptop[] newArr = searchLaptopByOsType(arr, osType);
        if(newArr != null){
            for(int i = 0; i<newArr.length; i++){
                System.out.println(newArr[i].getLaptopId());
                System.out.println(newArr[i].getRating());
            }
        }
        else System.out.print("The given os is not available");
    }


    public static int countOfLaptopsByBrand(Laptop[] arr, String brand){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i].getBrand().equals(brand) && arr[i].getRating() > 3){
                count++;
            }
        }
        return count;
    }

    public static Laptop[] searchLaptopByOsType(Laptop[] arr, String os){
        Laptop[] newArr = new Laptop[0];
        for(int i =0; i<arr.length; i++){
            if(arr[i].getOsType().equalsIgnoreCase(os)){
                newArr = Arrays.copyOf(newArr, newArr.length+1);
                newArr[newArr.length-1] = arr[i];
            }
        }

        for(int i = 0; i<newArr.length-1; i++){
            for(int j = 0; j<newArr.length-i-1; j++){
                if(newArr[j].getLaptopId() < newArr[j+1].getLaptopId()){
                    Laptop temp = newArr[j];
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

class Laptop{
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop(int a, String b, String c, double d, int e){
        this.laptopId = a;
        this.brand = b;
        this.osType = c;
        this.price = d;
        this.rating = e;
    }

    public int getLaptopId(){
        return laptopId;
    }
    public String getBrand(){
        return brand;
    }
    public String getOsType(){
        return osType;
    }
    public double getPrice(){
        return price;
    }
    public int getRating(){
        return rating;
    }
}