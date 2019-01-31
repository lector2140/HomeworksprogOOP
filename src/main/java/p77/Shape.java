package p77;

public abstract class Shape {
    abstract double calculatePerimetr();
    abstract double calculateArea();
    public String getName() {
        return this.getClass().getSimpleName();}
}
