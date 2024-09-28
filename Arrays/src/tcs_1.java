import java.util.*;
class Solution1{
    public static void main(String[] args){
        Medicine[] arr = new Medicine[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< arr.length; i++){
            String a = sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Medicine(a, b, c, d);
        }
        String disease = sc.nextLine();
        int[] res = getPriceByDisease(arr, disease);
        for(int i = 0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }
    public static int[] getPriceByDisease(Medicine[] arr, String disease){
        int[] res = new int[0];
        int k = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i].getDisease().equalsIgnoreCase(disease)){
                res = Arrays.copyOf(res, res.length+1);
                res[k++] = arr[i].getPrice();
            }
        }
        for(int i = 0; i<res.length; i++){
            for(int j = i; j<res.length-i-1; j++){
                if(res[j] > res[j+1]){
                    int temp = res[j];
                    res[j] = res[j+1];
                    res[j+1] = temp;
                }
            }
        }
        return res;
    }

}




class Medicine{
    private String medicineName;
    private String batch;
    private String disease;
    private int price;

    public Medicine(String medicineName, String batch, String disease, int price){
        this.medicineName = medicineName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getMedicineName(){
        return medicineName;
    }
    public String getBatch(){
        return batch;
    }
    public String getDisease(){
        return disease;
    }
    public int getPrice(){
        return price;
    }
    public void setMedicineName(String med){
        this.medicineName = med;
    }
    public void setBatch(String bat){
        this.batch = bat;
    }
    public void setDisease(String dis){
        this.disease = dis;
    }
    public void setPrice(int pr){
        this.price = pr;
    }
}
