import java.util.*;

public class question_Find_Shortest_Path {

    public static double shortestpath( String path ) {
        int x=0, y=0;
        for (int i=0;i<path.length();i++){
            char dir= path.charAt(i);
            if (dir=='E'){
                x++;
            }
            else if (dir=='W'){
                x--;
            }
            else if (dir=='N'){
                y++;
            }
            else {
                y--;
            }
        }
        int X=x*x;
        int Y=y*y;
        return Math.sqrt(X+Y);

    }

    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println(shortestpath(path));

    }
}
