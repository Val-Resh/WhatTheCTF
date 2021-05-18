import java.time.ZoneId;
import java.time.LocalDateTime;

public class DateFormatting {
    private static final ZoneId zoneId = ZoneId.systemDefault();
    private static LocalDateTime today = LocalDateTime.now();
    private static LocalDateTime nextMonth = today.plusMonths(1);
    public static long startDate = today.atZone(zoneId).toEpochSecond();
    public static long endDate = nextMonth.atZone(zoneId).toEpochSecond();
}
