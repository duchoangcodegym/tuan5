public class xaydunglopdate {

        private int day;
        private int month;
        private int year;

        public xaydunglopdate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return String.format("%02d/%02d/%04d", day, month, year);
        }

        public static void main(String[] args) {
            xaydunglopdate date = new xaydunglopdate(13, 5, 2024);
            System.out.println("Today's date is: " + date);
        }
    }


