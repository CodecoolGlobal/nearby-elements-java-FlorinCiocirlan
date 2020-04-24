import java.math.*;
import java.util.*;



class nearbyElements {

    static int[][] multi = new int[][] {
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };

    public static void main(String[] args){
        System.out.println(nearby(1,2,3));
    }

    public static java.lang.String nearby(int x, int y, int range) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        newArray.clear();
        if((y-range >= 0) && (y+range<multi[x].length)){
            for(int i= y-range; i<y; i++){
                newArray.add(multi[x][i]);
            }
            for(int j=y+1; j<= y+range; j++){
                newArray.add(multi[x][j]);
            }
        }
        else if((y-range<=0) || (y+range >=multi[x].length)){
            int i=Math.abs(y-range-1);
            System.out.println("Primul print i = " + i);
            while((y-i >= 0) && (y-i<y)){
                newArray.add(multi[x][y-i]);
                i--;
                System.out.println("Print in while a devenit i = " +i);
            }
            i = 1;
            while((y+i<multi[x].length) && (i<=range)){
                newArray.add(multi[x][y+i]);
                i++;
            }
        }
        int[] listToReturn = new int[newArray.size()];
        for(int i=0; i<newArray.size();i++){
            listToReturn[i]=newArray.get(i);
        }
        return Arrays.toString(listToReturn);
    }
}