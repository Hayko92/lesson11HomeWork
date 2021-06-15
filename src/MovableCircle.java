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
    center.moveUp();
    }

    @Override
    public void moveDown() {
    center.moveDown();
    }

    @Override
    public void moveLeft() {
    center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    protected MovableCircle clone() throws CloneNotSupportedException {
        return (MovableCircle) super.clone();
    }

    @Override
    public int compareTo(MovableCircle o) {
    return this.center.compareTo(o.center);
    }


}

