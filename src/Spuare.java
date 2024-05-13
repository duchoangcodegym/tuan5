public class Spuare {
    public int size;

    public Spuare(int size) {
        this.size = size;
    }

    public int getArea() {
        return this.size * this.size;
    }

    public int getPerimeter() {
        return (this.size + this.size) * 2;
//    }
    }
}
