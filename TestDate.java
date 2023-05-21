public class TestDate {
    public static void main(String[] args) {
        Date date = new Date(21, 5, 2023);
        System.out.println(date.toString());

        date.setDay(22);
        date.setMonth(6);
        date.setYear(2024);
        System.out.println(date.toString());

        date.setDate(12, 3, 2025);
        System.out.println(date.toString());
    }
}
