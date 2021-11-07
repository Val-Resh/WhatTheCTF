import java.time.ZoneId;
import java.time.LocalDateTime;

public class DateFormatting {
    private final ZoneId zoneId = ZoneId.systemDefault();
    private LocalDateTime today = LocalDateTime.now();
    private LocalDateTime nextMonth = today.plusMonths(1);
    public long startDate = today.atZone(zoneId).toEpochSecond();
    public long endDate = nextMonth.atZone(zoneId).toEpochSecond();
}
