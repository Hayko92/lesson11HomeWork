import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MovablePoint point1 =  new MovablePoint(1,2,1,5);
        MovablePoint point2 =  new MovablePoint(2,2,1,5);
        MovablePoint point3 =  new MovablePoint(3,1,1,5);
        MovablePoint point4 =  new MovablePoint(1,6,1,5);
        MovablePoint point5 =  new MovablePoint(9,2,1,5);

        List<MovablePoint> points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.add(point5);

        System.out.println(points);

        points.sort((o1, o2) -> {
            if(o1.getX()!=o2.getX()) return o1.getX()-o2.getX();
           else return o1.getY()-o2.getY();
        });
        System.out.println(points);
    }
}
