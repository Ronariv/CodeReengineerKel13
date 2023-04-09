public class app {
    public void calc(string ShapeType, int side, int width) {

        int area = 0;
    

        if (ShapeType == "Square") {
            area = side * side;
        } else if (ShapeType == "Rectangle") {
            area = side * width;
        } else if (ShapeType == "Circle") {
            area = 3.14 * side * side;
        }
    

        System.out.println("Area of " + ShapeType + " : " + area);
    }
    
    class Main {
        public static void main(String[] args) {

            int squareSide = 7;
            int rectangleWidth = 8;
            int rectangleHeight = 3;
            int circleRadius = 10;
    

            calc(1, squareSide, 0);
            calc(2, rectangleWidth, rectangleHeight);
            calc(3, circleRadius, 0);
        }
    }
}
