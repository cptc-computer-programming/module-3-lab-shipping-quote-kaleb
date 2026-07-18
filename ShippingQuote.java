public class ShippingQuote {
    public static void main(String[] args) {
        double height = 20;
        double length = 15;
        double width = 10;
        double weight = 20;
        double baseCost = 5;
        calculateVolume(length, width, height);
        calculateWeightCost(weight);
        calculateSurfaceArea(length, width, height);
        calculateShippingCost(weight, length, width, height);
        printQuote(baseCost, weight, length, width, height, calculateVolume(length, width, height), calculateSurfaceArea(length, width, height), calculateShippingCost(weight, length, width, height));
    }

    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static double calculateWeightCost(double weight) {
        return weight * 0.50;
    }

    public static double calculateSurfaceArea(double length, double width, double height) {
        return 2 * (length * width + length * height + width * height);
    }

    public static double calculateShippingCost(double weight, double length, double width, double height) {
        return weight + length + width + height;
    }

    public static void printQuote(double base, double weight, double length, double width, double height, double volume, double sizeFactor, double shippingCost) {
    System.out.println("weight: " + weight + " lbs");
    System.out.println("length: " + length + " in");
    System.out.println("width: " + width + " in");
    System.out.println("height: " + height + " in");
    System.out.println("volume: " + volume + " in");
    System.out.println("size factor: " + sizeFactor);
    System.out.println("estimated shipping cost: " + shippingCost + base);
}
}
