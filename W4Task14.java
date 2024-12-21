package S3Workshop_4;

public class W4Task14 {
    private int length;
    private int width;

    public W4Task14(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }
}
