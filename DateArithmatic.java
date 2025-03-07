import java.time.LocalDate;

public class DateArithmatic {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 3, 7); // Example input date
        LocalDate resultDate = inputDate
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println("Input Date: " + inputDate);
        System.out.println("Result Date: " + resultDate);
    }
}
