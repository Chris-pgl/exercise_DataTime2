import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    public static void main(String[] args) {
        LocalDateTime data = LocalDateTime.now();

        //Month mese = data.getMonth();
        //Year yy = Year.of(data.getYear()%100);

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd MMMM yy HH:mm");
        System.out.println(data.format(f1));

        System.out.println(ZonedDateTime.now());






    }
}