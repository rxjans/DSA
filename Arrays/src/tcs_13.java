import java.util.Arrays;

public class tcs_13 {
    public static void main(String[] args) {

    }
    public static headset secondMinPrice(){
        headset[] newArr = new headset[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i].isAvailable()){
                newArr = Arrays.copyOf(newArr, newArr.length+1);
                newArr[newArr.length-1] = arr[i];
            }
        }

        for(int i = 0; i<newArr.length; i++){
            for(int j = 0; j<newArr.length-i-1; j++){
                headset temp = newArr[j];
                newArr[j] = newArr[j+1];
                newArr[j+1] = temp;
            }
        }
        if(newArr.length > 0){
            return newArr[1];
        }
    }
}
