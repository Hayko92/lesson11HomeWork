public class MovablePoint implements Movable, Cloneable, Comparable<MovablePoint>{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "("+x+", "+y+") speed = ("+xSpeed+", "+ySpeed+")";
    }

    @Override
    public void moveUp() {
       y+=ySpeed;
    }

    @Override
    public void moveDown() {
      y-=ySpeed;
    }

    @Override
    public void moveLeft() {
    x-=xSpeed;
    }

    @Override
    public void moveRight() {
      x+=xSpeed;
    }

    @Override
    protected MovablePoint clone() throws CloneNotSupportedException {
        return (MovablePoint) super.clone();
    }

    // comparing from left to right, and then from down to up


    @Override
    public int compareTo(MovablePoint o) {
        if(this.getX()!=o.getX()) return this.getX()-o.getX();
        else {
            return   this.getY()-o.getY();
        }
    }
}
