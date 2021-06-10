public class MovableCircle implements Movable, Cloneable, Comparable<MovableCircle>{
    private int radius;
    private  MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius  = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "("+center.getX()+", "+center.getY()+") speed = ("+center.getxSpeed()+", "+center.getySpeed()+"), radius = "+ radius;
    }

    @Override
    public void moveUp() {
     center.setY(center.getY()+ center.getySpeed());
    }

    @Override
    public void moveDown() {
  center.setY(center.getY()- center.getySpeed());
    }

    @Override
    public void moveLeft() {
   center.setX(center.getX()- center.getxSpeed());
    }

    @Override
    public void moveRight() {
        center.setX(center.getX()+ center.getxSpeed());
    }

    @Override
    protected MovableCircle clone() throws CloneNotSupportedException {
        return (MovableCircle) super.clone();
    }

    @Override
    public int compareTo(MovableCircle o) {
        if(this.center.getX()!=o.center.getX()) return this.center.getX()-o.center.getX();
        else {
            return   this.center.getY()-o.center.getY();
        }
    }


}

