public class Temperature {
        private double celsius;

        public Temperature(double celsius) {
            this.celsius = celsius;
        }

        public double getCelsius() {
            return celsius;
        }

        public void setCelsius(double celsius) {
            this.celsius = celsius;
        }

        public double getFahrenheit() {
            return celsius * 9 / 5 + 32;
        }

        public void setFahrenheit(double fahrenheit) {
            this.celsius = (fahrenheit - 32) * 5 / 9;
        }

        public static void main(String[] args) {
            // Tạo một đối tượng Temperature với nhiệt độ Celsius là 25
            Temperature temp = new Temperature(25);

            // In ra nhiệt độ Celsius và Fahrenheit tương ứng
            System.out.println("Celsius: " + temp.getCelsius());
            System.out.println("Fahrenheit: " + temp.getFahrenheit());

            // Đặt nhiệt độ theo Fahrenheit là 77
            temp.setFahrenheit(77);

            // In ra nhiệt độ Celsius sau khi đặt lại
            System.out.println("Celsius after setting Fahrenheit: " + temp.getCelsius());
        }
    }

