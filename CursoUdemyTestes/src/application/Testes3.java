package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Testes3 {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2024-10-18");
		LocalDateTime d02 = LocalDateTime.parse("2024-10-18T10:30:22");
		Instant d03 = Instant.parse("2024-10-18T01:30:22Z");

		System.out.println("D01 dia - " + d01.getDayOfMonth());
		System.out.println("D01 dia - " + d01.getDayOfYear());

		System.out.println();
		System.out.println("D02 mês - " + d02.getMonthValue());
		System.out.println("D02 mês - " + d02.getMonth());

		System.out.println();

		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);

		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);

		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

		System.out.println();
		System.out.println(pastWeekLocalDateTime);
		System.out.println(nextWeekLocalDateTime);

		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);

		System.out.println();
		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);

		Duration t1 = Duration.between(d02, pastWeekLocalDateTime);
		Duration t2 = Duration.between(d01.atTime(0,0 ), pastWeekLocalDate.atStartOfDay());
		Duration t3 = Duration.between(d03, nextWeekInstant);

		System.out.println();
		System.out.println(t1.toHours());

		System.out.println();
		System.out.println(t2.toDays());

		System.out.println();
		System.out.println(t3.toMinutes());

	}
}
