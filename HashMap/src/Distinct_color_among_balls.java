import java.util.HashMap;

public class Distinct_color_among_balls {
    class Solution {
        public int[] queryResults(int limit, int[][] queries) {
            HashMap<Integer, Integer> ballM = new HashMap<>();
            HashMap<Integer, Integer> colorM = new HashMap<>();
            int n = queries.length;
            int[] res = new int[n];

            for(int i = 0; i<n; i++){
                int ball = queries[i][0];
                int color = queries[i][1];

                if(!ballM.containsKey(ball)){
                    ballM.put(ball, color);
                    colorM.put(color, colorM.getOrDefault(color, 0)+1);
                }
                else{
                    int prevColor = ballM.get(ball);
                    colorM.put(prevColor, colorM.getOrDefault(prevColor, 0)-1);
                    if(colorM.get(prevColor) == 0){
                        colorM.remove(prevColor);
                    }
                    ballM.put(ball, color);
                    colorM.put(color, colorM.getOrDefault(color, 0)+1);
                }
                res[i] = colorM.size();
            }
            return res;
        }
    }
}
