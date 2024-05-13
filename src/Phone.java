public class Phone {
    private String brand;
    private String model;
    private String color;
    private double screenSize;
    private int batteryCapacity;

    public Phone(String brand, String model, String color, double screenSize, int batteryCapacity) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public static void main(String[] args) {
        // Tạo một đối tượng điện thoại
        Phone myPhone = new Phone("Iphone", "15 Pro Max ", "Blu", 6.2, 4447);

        // In ra thông tin về điện thoại
        System.out.println("My phone:");
        System.out.println("Brand: " + myPhone.getBrand());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Color: " + myPhone.getColor());
        System.out.println("Screen size: " + myPhone.getScreenSize() + " inches");
        System.out.println("Battery capacity: " + myPhone.getBatteryCapacity() + " mAh");
    }
}



