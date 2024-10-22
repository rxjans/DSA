import java.util.Arrays;
import java.util.Scanner;

public class tcs_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        Bill[] arr = new Bill[n];
        for(int i = 0; i< n; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            Boolean e = sc.nextBoolean();sc.nextLine();

            arr[i] = new Bill(a,b,c,d,e);
        }
        Boolean param = sc.nextBoolean();sc.nextLine();
        String conn = sc.nextLine();
        Bill[] newArr = findBillWithMaxBillAmountBasedOnStatus(arr, param);
        if(newArr != null){
            for(int i = 0; i<newArr.length; i++){
                System.out.println(newArr[i].getBillNo()+"#"+newArr[i].getName());
            }
        }
        else System.out.println("There are no bill with the given status");
        int count = getCountWithTypeOfConnection(arr, conn);
        if(count>0){
            System.out.println(count);
        }
        else System.out.println("There are no bills with given type of connection");
    }

    public static Bill[] findBillWithMaxBillAmountBasedOnStatus(Bill[] arr, Boolean param){
        Bill[] newArr = new Bill[0];
        double max = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i].getStatus().equals(param)){
                if(arr[i].getBillAmount() > max) {
                    max = arr[i].getBillAmount();
                }
            }
        }
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i].getBillAmount() == max && arr[i].getStatus().equals(param)){
                newArr = Arrays.copyOf(newArr, newArr.length+1);
                newArr[newArr.length-1] = arr[i];
            }
        }
        if(newArr.length > 0){
            for(int i = 0; i< newArr.length-1; i++){
                for(int j = 0; j< newArr.length-i-1; j++){
                    if(newArr[j].getBillNo() > newArr[j+1].getBillNo()){
                        Bill temp = newArr[j];
                        newArr[j] = newArr[j+1];
                        newArr[j+1] = temp;
                    }
                }
            }
            return newArr;
        }
        return null;
    }
    public static int getCountWithTypeOfConnection(Bill[] arr, String conn){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i].getTypeOfConnection().equalsIgnoreCase(conn)){
                count++;
            }
        }
        return count;
    }
}

class Bill{
    private int billNo;
    private String name;
    private String typeOfConnection;
    private double billAmount;
    private Boolean status;

    public Bill(int a, String b, String c, double d, Boolean e){
        this.billNo = a;
        this.name = b;
        this.typeOfConnection = c;
        this.billAmount = d;
        this.status = e;
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfConnection() {
        return typeOfConnection;
    }

    public void setTypeOfConnection(String typeOfConnection) {
        this.typeOfConnection = typeOfConnection;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
