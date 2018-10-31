import java.util.ArrayList;

public class GetPath {
    /*
    The arguments r, c specify the destination spot. 
    The method returns true and the path, if such a path can be found, or false if such a path cannot be found.
    Path if an ArrayList of the form [(0,0), (0,1), (1,1), (2,1), (2,2), (3,2)]. (row, column)
    Grid specify which spots are blocked and which aren't. 
    */
    
    public static boolean getPath (int r, int c, ArrayList<Point> path, final int [][] grid) {

        Point destination = new Point (r,c);
        Point current = new Point (0,0);

        //check blocked (destination))
        if (grid[r][c] == 1){
            return false;
        }

        return tryPath(current, destination, path, grid);

    }

    private static boolean tryPath (Point current, Point destination, ArrayList<Point> path, final int [][] grid){
        path.add(current);

        //check reached destination
        if (current.x == destination.x && current.y == destination.y){
            return true;
        } 
        //check overshot
        else if (current.x > destination.x || current.y > destination.y){
            path.remove(current);
            return false;
        }
        
        //check blocked (current grid)
        else if (grid[current.x][current.y]==1){
            path.remove(current);
            return false;
        }
        

        Point right = new Point(current.x, current.y+1);
        Point down = new Point(current.x+1, current.y);

        if (tryPath(right, destination, path, grid)){
            return true;
        } else if (tryPath(down, destination, path, grid)){
            return true;
        } else {        //check no path
            path.remove(current);
            return false;
        }

    }

}






