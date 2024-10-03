import java.util.*;
class tcs_7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Hotel[] arr = new Hotel[4];
        for(int i = 0; i< arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            double f = sc.nextDouble(); sc.nextLine();

            arr[i] = new Hotel(a, b, c, d, e, f);
        }
        String month = sc.nextLine();
        String wifi = sc.nextLine();
        int res = noOfRoomsBookedInGivenMonth(arr, month);
        if(res > 0){
            System.out.println(res);
        }
        else System.out.println("No rooms booked in the given month");
        Hotel obj = searchHotelByWifiOption(arr, wifi);
        if(obj != null){
            System.out.println(obj.getHotelId());
        }
        else System.out.println("No such option available");
    }

    public static int noOfRoomsBookedInGivenMonth(Hotel[] arr, String month){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            String[] date = arr[i].getDateOfBooking().split("-");
            if(date[1].equalsIgnoreCase(month)){
                count += arr[i].getNoOfRoomsBooked();
            }
        }
        return count;
    }

    public static Hotel searchHotelByWifiOption(Hotel[] arr, String wifi){
        Hotel[] newArr = new Hotel[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i].getWifiFacility().equalsIgnoreCase(wifi)){
                newArr = Arrays.copyOf(newArr, newArr.length + 1);
                newArr[newArr.length - 1 ] = arr[i];
            }
        }
        for(int i = 0; i<newArr.length-1; i++){
            for(int j = 0; j<newArr.length-i-1; j++){
                if(newArr[j].getTotalBill() < newArr[j+1].getTotalBill()){
                    Hotel temp = newArr[j];
                    newArr[j] = newArr[j+1];
                    newArr[j+1] = temp;
                }
            }
        }
        if(newArr.length>0){
            return newArr[1];
        }
        else return null;
    }
}

class Hotel{
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int a, String b, String c, int d, String e, double f){
        this.hotelId = a;
        this.hotelName = b;
        this.dateOfBooking = c;
        this.noOfRoomsBooked = d;
        this.wifiFacility = e;
        this.totalBill = f;
    }

    public int getHotelId(){
        return hotelId;
    }
    public String getHotelName(){
        return hotelName;
    }
    public String getDateOfBooking(){
        return dateOfBooking;
    }
    public int getNoOfRoomsBooked(){
        return noOfRoomsBooked;
    }
    public String getWifiFacility(){
        return wifiFacility;
    }
    public double getTotalBill(){
        return totalBill;
    }
}
