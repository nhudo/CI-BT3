public class Vector2D {
    public float x;
    public float y;

    public Vector2D() {
        this.x = 0;
        this.y = 0;

    }

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D addThis(float x, float y) {
        this.x +=x;
        this.y +=y;
        return this;
    }

    public Vector2D substracThis(float x, float y) {
        this.x -=x;
        this.y -=y;
        return this;
    }
    public  Vector2D scaleThis(float rate){
        this.x +=rate;
        this.y +=rate;
        return this;
    }

}