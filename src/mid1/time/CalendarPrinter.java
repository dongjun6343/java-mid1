package mid1.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * 달력 만들기
 */
public class CalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요.");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요.");
        int month = scanner.nextInt();

        printCalender(year, month);

    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        System.out.println("firstDayOfMonth = " + firstDayOfMonth);

        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
        System.out.println("firstDayOfNextMonth = " + firstDayOfNextMonth);

        // 월요일 = (1%7=1) ... 일요일 = (7%7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Tr Sa ");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIter = firstDayOfMonth;
        while (dayIter.isBefore(firstDayOfNextMonth)) {

            System.out.printf("%2d ", dayIter.getDayOfMonth()); // 칸을 2칸 차지해서 오른쪽 정렬

            if (dayIter.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIter = dayIter.plusDays(1);
        }
    }
}
