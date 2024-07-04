package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Testes2 {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2024-10-18");
		LocalDateTime d02 = LocalDateTime.parse("2024-10-18T10:30:22");
		Instant d03 = Instant.parse("2024-10-18T10:30:22Z");

		DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter ftm4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter ftm5 = DateTimeFormatter.ISO_INSTANT;


		System.out.println("D01 - " + d01.format(ftm1));
		System.out.println("D01 - " + ftm1.format(d01));

		System.out.println();
		System.out.println("D02 - " + d02.format(ftm1));
		System.out.println("D02 - " + d02.format(ftm2));
		System.out.println("D02 - " + d02.format(ftm4));

		System.out.println();
		System.out.println("D03 - " + ftm3.format(d03));
		System.out.println("D03 - " + ftm5.format(d03));
	}
}
