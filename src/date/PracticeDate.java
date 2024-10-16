package date;

import org.junit.Test;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class PracticeDate {

    private static TemporalAdjuster TWO_DAYS_LATER = TemporalAdjusters.ofDateAdjuster(date -> date.plusDays(2));

    @Test
    public void testDate() {
        Date time = new Date();
        System.out.println(time);

        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String ctime = formatter.format(time);
        System.out.println(ctime);
    }

    @Test
    public void testDate1() throws ParseException {
        Clock clock = Clock.systemDefaultZone();
        System.out.println("clock: " + clock);
        long millis = clock.millis();
        System.out.println("millis: " + millis);
        long systemMillis = System.currentTimeMillis();// GMT
        System.out.println("systemMillis: " + systemMillis);
        // The same as the next
        Instant instant = clock.instant();
        System.out.println(instant);
        Date legacyDate = Date.from(instant);
        System.out.println("legacyDate:  " + legacyDate);
        // The same as the last
        Date dateDisplay = new Date();
        System.out.println("dateDisplay: " + dateDisplay);

        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());
        LocalTime now1 = LocalTime.now(zone1);
        LocalTime now2 = LocalTime.now(zone2);
        System.out.println(now1.isBefore(now2)); // false
        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);
        System.out.println(hoursBetween);
        System.out.println(minutesBetween);// Why 299?

        LocalDate today = LocalDate.now();
        System.out.println("today: " + today);
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        System.out.println(tomorrow);
        LocalDate yesterday = tomorrow.minusDays(2);
        System.out.println(yesterday);
        LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
        System.out.println(independenceDay);
        DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
        System.out.println(dayOfWeek);

        LocalDateTime time = LocalDateTime.of(2015, Month.APRIL, 10, 4, 10, 1);
        System.out.println(time);
        DayOfWeek dayOfWeek1 = time.getDayOfWeek();
        System.out.println(dayOfWeek1);

        Date date = new Date();
        System.out.println("date: " + date);
        Instant instant1 = Instant.ofEpochMilli(date.getTime());
        System.out.println(instant1);
        LocalDateTime ldt = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
        System.out.println(ldt);

        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);
        ZonedDateTime zdt = ldt1.atZone(ZoneId.systemDefault());
        System.out.println(zdt);
        Date date1 = Date.from(zdt.toInstant());
        System.out.println(date1);
        DateFormat dateFormat = new SimpleDateFormat();
        System.out.println(dateFormat.getNumberFormat());

        String pattern = "yyyy-MM-dd HH:mm:ss.SSS a EEEE MMMM";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date2 = simpleDateFormat.format(new Date());
        System.out.println(date2);
        TimeZone zone = TimeZone.getTimeZone("UTC");
        simpleDateFormat.setTimeZone(zone);
        String date3 = simpleDateFormat.format(new Date());
        System.out.println(date3);
    }

    @Test
    public void test3() throws ParseException {
        Date date = new Date();
        System.out.println("date: " + date);
        System.out.println("date.getTime(): " + date.getTime());
        System.out.println("System.currentTimeMillis(): " + System.currentTimeMillis());
        String timeZone = Calendar.getInstance().getTimeZone().getID();
        System.out.println("timeZone: " + timeZone);
        Date local = new Date(date.getTime());
        System.out.println("local: " + local);
        System.out.println("GMT milliseconds: " + date.getTime());
        System.out.println("offSet: " + TimeZone.getTimeZone(timeZone).getOffset(date.getTime()));

        Date now = new Date();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Huang, Hai");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
        StringBuffer date4 = simpleDateFormat1.format(now, stringBuffer, new FieldPosition(0));
        System.out.println("date4: " + date4);

        String pattern1 = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat(pattern1);
        Date date5 = simpleDateFormat4.parse("2018-09-09");
        System.out.println(date5);

        String pattern2 = "EEEEE dd MMMMM yyyy HH:mm:ss.SSSZ";
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(pattern2, new Locale("zh", "CN"));
        String date6 = simpleDateFormat5.format(new Date());
        System.out.println("date6: " + date6);

        String pattern4 = "EEEEE dd MMMMM yyyy HH:mm:ss.SSSZ";
        SimpleDateFormat simpleDateFormat7 = new SimpleDateFormat(pattern4, Locale.CHINA);
        String date8 = simpleDateFormat7.format(new Date());
        System.out.println("date8: " + date8);

        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        dateFormatSymbols.setWeekdays(new String[] { "Unused", "Sad Sunday", "Manic Monday", "Thriving Tuesday", "Wet Wednesday", "Total Thursday", "Fat Friday", "Super Saturday", });
        String pattern3 = "EEEE MMMM yyyy";
        SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat(pattern3, dateFormatSymbols);
        String date7 = simpleDateFormat6.format(new Date());
        System.out.println(date7);

    }

    @Test
    public void test4() {
        // ISO 8601 date format: 2018-09-24T17:48:00
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat yyyy_MM_ddTHHmmssSSSZ1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        String dateString1 = yyyy_MM_ddTHHmmssSSSZ1.format(date);
        System.out.println("dateString1(without timezone): " + dateString1);

        SimpleDateFormat yyyy_MM_ddTHHmmssSSSZ2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String dateString2 = yyyy_MM_ddTHHmmssSSSZ2.format(date);
        System.out.println("dateString2(with timezone): " + dateString2);

    }

    @Test
    public void test5() throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(df.parse("2018-11-29T12:00:00Z").toString());
    }

    @Test
    public void getHoursBetweenDate() throws ParseException {
        String startDate = "3007190820";
        String endDate = "3007190720";
        String format = "ddMMyyHHmm";
        double hours = 0;
        SimpleDateFormat ft = new SimpleDateFormat(format);
        Date date1 = ft.parse(startDate);
        Date date2 = ft.parse(endDate);
        hours = date2.getTime() - date1.getTime();
        hours = hours * 1.0 / 1000 / 60 / 60;
        System.out.println(hours);
    }

    @Test
    public void test9() throws ParseException {
        Date now = new Date();
        System.out.println(now.getTime());
        System.out.println(now.toString());
        System.out.println(now);

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ft.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo"));
        Date tokyoDate = ft.parse("2019-10-7 17:42:15");
        System.out.println(tokyoDate.getTime());

        System.out.println(tokyoDate.getTime() - now.getTime());

        Calendar c = Calendar.getInstance();
        c.setTime(tokyoDate);
        System.out.println(c.getTime().getTime());
    }

    @Test
    public void getFirstDateLastMonth() {
        Date currentDate = new Date();
        Date dateLastMonth = PracticeDate.changeDate(currentDate, 0, -4, 0, 0, 0, 0);
        Calendar c = Calendar.getInstance();
        c.setTime(dateLastMonth);
        c.set(Calendar.DATE, 1);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d = c.getTime();
        System.out.println(d);
    }

    public static Date changeDate(Date date, int yearAdd, int monthAdd, int dateAdd, int hourAdd, int minuteAdd, int secondAdd) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        if (yearAdd != 0) {
            c.add(Calendar.YEAR, yearAdd);
        }
        if (monthAdd != 0) {
            c.add(Calendar.MONTH, monthAdd);
        }
        if (dateAdd != 0) {
            c.add(Calendar.DATE, dateAdd);
        }
        if (hourAdd != 0) {
            c.add(Calendar.HOUR, hourAdd);
        }
        if (minuteAdd != 0) {
            c.add(Calendar.MINUTE, minuteAdd);
        }
        if (dateAdd != 0) {
            c.add(Calendar.SECOND, secondAdd);
        }

        return c.getTime();
    }

    @Test
    public void test6() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        System.out.println(dateFormat.format(cal.getTime()));
    }

    @Test
    public void test7() {
        Date date = new Date();
        System.out.println(date);
        Date dateFormatted = PracticeDate.changeDate(date, 0, 1, -1, 0, 0, 0);
        System.out.println(dateFormatted);
    }

    @Test
    public void test8() throws ParseException {
        String timeStr = "2017-8-24 11:17:10"; // 字面时间
        SimpleDateFormat bjSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        bjSdf.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        Date date = bjSdf.parse(timeStr); // 将字符串时间按北京时间解析成Date对象

        SimpleDateFormat tokyoSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 东京
        tokyoSdf.setTimeZone(TimeZone.getTimeZone("Asia/Tokyo")); // 设置东京时区
        System.out.println("北京时间: " + timeStr + "\n对应的东京时间为:" + tokyoSdf.format(date));
    }

    /**
     * This is to practice Java 8 new date function
     */
    @Test
    public void test10() {
        System.out.println("---------------LocalDate----------------");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        System.out.println(localDate.getYear());// 2020
        System.out.println(localDate.get(ChronoField.YEAR));// 2020
        System.out.println(localDate.getMonth());// JULY
        System.out.println(localDate.getMonthValue());// 7
        System.out.println(localDate.get(ChronoField.MONTH_OF_YEAR));// 7
        System.out.println(localDate.getDayOfYear());// 198
        System.out.println(localDate.get(ChronoField.DAY_OF_YEAR));// 198
        System.out.println(localDate.getDayOfMonth());// 16
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));// 16
        System.out.println(localDate.getDayOfWeek());// THURSDAY, a little difference
        System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));// 4
        System.out.println(localDate.getChronology());// ISO
        System.out.println(localDate.getEra());// CE
        LocalDate getSpecificDate = LocalDate.of(2019, 9, 10);
        System.out.println(getSpecificDate);
        System.out.println(LocalDate.parse("20190910", DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(LocalDate.parse("2019-09-10", DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("---------------LocalTime----------------");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.toString());
        System.out.println(localTime.getHour());
        System.out.println(localTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println(localTime.getMinute());
        System.out.println(localTime.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(localTime.getSecond());
        System.out.println(localTime.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println(localTime.getNano());
        LocalTime getSpecificTime = LocalTime.of(15, 8, 12, 18794879);
        System.out.println(getSpecificTime.toString());
        System.out.println("---------------LocalDateTime----------------");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime.toString(): " + localDateTime.toString());// 2021-07-22T10:51:39
        System.out.println("LocalDateTime.toString(): " + LocalDateTime.of(2021, 3, 4, 12, 56, 34, 245).toString());// 2021-03-04T12:56:34.000000245
        System.out.println("LocalDateTime.toString(): " + LocalDateTime.of(2021, 3, 4, 12, 56).toString());// 2021-03-04T12:56
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getChronology());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());
        System.out.println(localDateTime.plusYears(1));
        System.out.println("localDateTime.plus(1, ChronoUnit.YEARS): " + localDateTime.plus(1, ChronoUnit.YEARS));
        System.out.println(localDateTime.minusMonths(1));
        System.out.println(localDateTime.minus(1, ChronoUnit.MONTHS));
        System.out.println(localDateTime.withYear(2022));
        System.out.println("localDateTime.with(ChronoField.YEAR, 2022): " + localDateTime.with(ChronoField.YEAR, 2022));
        LocalDateTime getSpecificDateTime = LocalDateTime.of(getSpecificDate, getSpecificTime);
        System.out.println(getSpecificDateTime.toString());
        LocalDateTime getSpecificDateTime2 = getSpecificDate.atTime(getSpecificTime);
        System.out.println(getSpecificDateTime2.toString());

        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());

        LocalDate date1 = LocalDate.of(2017, 8, 20);
        LocalDate date2 = LocalDate.of(2018, 10, 3);
        long l = date2.toEpochDay() - date1.toEpochDay();
        System.out.println(l);
        System.out.println(LocalDateTime.parse("2021-07-22T13:36:02", DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(LocalDateTime.parse("0101000000", DateTimeFormatter.ofPattern("ddMMyyHHmm")));
        System.out.println("---------------CompareTo----------------");
        System.out.println(LocalDate.of(2019, 9, 9).compareTo(LocalDate.of(2019, 9, 10)));
        System.out.println(LocalDate.of(2019, 9, 10).compareTo(LocalDate.of(2019, 9, 10)));
        System.out.println(LocalDate.of(2019, 9, 11).compareTo(LocalDate.of(2019, 9, 10)));
        System.out.println(LocalDateTime.of(2019, 9, 9, 12, 34, 50).compareTo(LocalDateTime.of(2019, 9, 9, 12, 34, 56)));
        System.out.println(LocalDateTime.of(2019, 9, 9, 12, 34, 56).compareTo(LocalDateTime.of(2019, 9, 9, 12, 34, 56)));
        System.out.println(LocalDateTime.of(2019, 9, 9, 12, 34, 57).compareTo(LocalDateTime.of(2019, 9, 9, 12, 34, 56)));
        System.out.println("---------------Formatter----------------");
        System.out.println(localDate.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyy");
        System.out.println("localDate.format(dateTimeFormatter): " + localDate.format(dateTimeFormatter));
        System.out.println("localDateTime.format(dateTimeFormatter): " + localDateTime.format(dateTimeFormatter));
        System.out.println("---------------Instant----------------");
        Instant instant = Instant.now();
        System.out.println(instant.toString() + " #Note: the instant is based on UTC#");
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.toEpochMilli());
        System.out.println(instant.atZone(ZoneId.of("UTC")).toLocalDateTime());
        System.out.println(instant.atZone(ZoneId.of("UTC")).toLocalDate());
        System.out.println("---------------Zone----------------");
        ZoneId defaultZoneId = ZoneId.systemDefault();
        System.out.println(defaultZoneId);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime.now(): " + zonedDateTime);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now().plusDays(2);
        System.out.println("ZonedDateTime.now().plusDays(2): " + zonedDateTime2);
        ZonedDateTime specificZoneTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);
        System.out.println(specificZoneTime);
        System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()));
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("America/New_York")));
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York")));
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York")).toLocalDateTime());
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York")).toLocalDateTime().getNano());
        System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime());
        System.out.println("---------------Period----------------");
        LocalDate dateBefore = LocalDate.of(2017, 11, 11);
        LocalDate dateAfter = LocalDate.of(2019, 4, 1);
        Period period = Period.between(dateBefore, dateAfter);
        System.out.println(period.toTotalMonths());
        System.out.println("The two dates are with a offset of: " + period.getYears() + "years, " + period.getMonths() + "months, " + period.getDays() + "days.");
        System.out.println("Period.ofYears: " + Period.ofYears(2));
        System.out.println("Period.of: " + Period.of(1, 2, 3));
        System.out.println("Period.from: " + Period.from(Period.of(20, 10, 5)));
        System.out.println("---------------Date --> Instant----------------");
        Date date = new Date();
        System.out.println(date.toInstant());
        System.out.println("---------------Long --> Date----------------");
        System.out.println(System.currentTimeMillis());
        System.out.println(Instant.ofEpochMilli(System.currentTimeMillis()));
        System.out.println(Instant.ofEpochMilli(System.currentTimeMillis()).atZone(defaultZoneId).toLocalDate());
        System.out.println("---------------First Day vs Last Date----------------");
        System.out.println("TemporalAdjusters.firstDay: " + localDate.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println("TemporalAdjusters.lastDay: " + localDate.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println("TemporalAdjusters.dayOfWeekInMonth: " + localDate.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.TUESDAY)));
        System.out.println("TemporalAdjusters.lastInMonth: " + localDate.with(TemporalAdjusters.lastInMonth(DayOfWeek.TUESDAY)));
        System.out.println("TemporalAdjusters.next: " + localDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println("TemporalAdjusters.nextOrSame: " + localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY)));
        System.out.println("TemporalAdjusters.ofDateAdjuster: " + localDate.with(TWO_DAYS_LATER));
        System.out.println("TemporalAdjusters.previous: " + localDate.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY)));
        System.out.println("TemporalAdjusters.previousOrSame: " + localDate.with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY)));
        System.out.println("---------------How many days of month----------------");
        LocalDate lastDay = localDate.with(TemporalAdjusters.lastDayOfMonth());
        int dayOfMonth = lastDay.getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println("---------------ofEpochSecond() vs ofEpochMilli()----------------");
        Instant now = Instant.now();
        System.out.println(now);
        // 2020-03-27T09:32:18.314Z
        // Remove milli-second
        long lg = now.toEpochMilli() / 1000;
        // Instantiate instant according to Second instead of Milli-Second
        System.out.println(Instant.ofEpochSecond(lg));
        // 2020-03-27T09:32:18Z
        System.out.println("---------------Parse： 2018-12-07T09:33:38+00:00----------------");
        final String stringForZonedDateTime = "2018-12-07T09:33:38+00:00";
        ZonedDateTime parseOfZonedDateTime1 = ZonedDateTime.parse(stringForZonedDateTime);// Using DateTimeFormatter.ISO_OFFSET_DATE_TIME inside
        System.out.println(parseOfZonedDateTime1.toString());
        ZonedDateTime parseOfZonedDateTime2 = ZonedDateTime.parse(stringForZonedDateTime, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println(parseOfZonedDateTime2.toString());
        ZoneId zoneOfZonedDateTime1 = parseOfZonedDateTime1.getZone();
        System.out.println(zoneOfZonedDateTime1);
        ZoneId zoneOfZonedDateTime2 = parseOfZonedDateTime2.getZone();
        System.out.println(zoneOfZonedDateTime2);
        System.out.println("---------------Parse： 2018-12-07T09:33:38Z----------------");
        System.out.println("---------------Way 1: using ZonedDateTime----------------");
        final String stringForZonedDateTime2 = "2018-12-07T09:33:38Z";
        ZonedDateTime parseOfZonedDateTime3 = ZonedDateTime.parse(stringForZonedDateTime2);
        System.out.println(parseOfZonedDateTime3.toString());
        ZoneId zoneOfZonedDateTime3 = parseOfZonedDateTime3.getZone();
        System.out.println(zoneOfZonedDateTime3);
        System.out.println("---------------Way 2: using Instant----------------");
        final String stringForInstant = "2018-12-07T09:33:38Z";
        Instant parseOfInstant = Instant.parse(stringForInstant);
        System.out.println(parseOfInstant);
        System.out.println("---------------Parse： 2018-12-07T09:33:38----------------");
        final String stringForLocalDateTime = "2018-12-07T09:33:38";
        LocalDateTime parseOfLocalDateTime = LocalDateTime.parse(stringForLocalDateTime);
        System.out.println(parseOfLocalDateTime.toString());
        System.out.println("---------------Parse: 2018-12-07-------------------------");
        final String stringForLocalDate = "2018-12-07";
        LocalDate parseOfLocalDate = LocalDate.parse(stringForLocalDate);
        System.out.println(parseOfLocalDate.toString());
    }

    @Test
    public void test12() {
        System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()));
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("America/New_York")));
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("America/New_York")).withZoneSameInstant(ZoneId.of("UTC")));
    }

    @Test
    public void test13() {
        System.out.println(ZonedDateTime.now().withZoneSameInstant((ZoneId.of("UTC"))).toLocalDateTime().minusYears(3));
    }

    /**
     * Parse LocaDateTime into ZonedDateTime
     */
    @Test
    public void localDateTimeToZonedDateTime() {
        final String string = "2018-12-07T09:33:38";
        LocalDateTime parse = LocalDateTime.parse(string);
        ZonedDateTime z1 = ZonedDateTime.of(parse, ZoneId.of("Asia/Shanghai"));
        System.out.println(z1.toString());
        // 2018-12-07T09:33:38+08:00[Asia/Shanghai]

        ZonedDateTime z2 = ZonedDateTime.of(parse, ZoneId.of("Z"));
        System.out.println(z2.toString());
        // 2018-12-07T09:33:38Z

        ZonedDateTime z3 = ZonedDateTime.of(parse, ZoneId.of("UTC"));
        System.out.println(z3.toString());
        // 2018-12-07T09:33:38Z[UTC]

        ZonedDateTime z4 = ZonedDateTime.of(parse, ZoneId.of("UTC+08:00"));
        System.out.println(z4.toString());
        // 2018-12-07T09:33:38+08:00[UTC+08:00]

        ZonedDateTime z5 = ZonedDateTime.of(parse, ZoneId.of("+08:00"));
        System.out.println(z5.toString());
        // 2018-12-07T09:33:38+08:00

        ZonedDateTime z6 = ZonedDateTime.of(parse, ZoneId.of("+00:00"));
        System.out.println(z6.toString());
        // 2018-12-07T09:33:38Z
    }

    @Test
    public void test14() {
        ZonedDateTime actualDay = ZonedDateTime.parse("2021-08-11T08:00:00.000Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        System.out.println(actualDay);
        ZonedDateTime futureDay = ZonedDateTime.now(ZoneId.of("Z")).plusDays(2);
        System.out.println(futureDay);
        System.out.println(actualDay.compareTo(futureDay));
        System.out.println(actualDay.isAfter(futureDay));
        ZonedDateTime hkDateTime = actualDay.withZoneSameInstant(ZoneId.of("+08:00"));
        System.out.println(hkDateTime);
        System.out.println(hkDateTime.toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        ZonedDateTime hkDateTime2 = actualDay.withZoneSameInstant(ZoneId.of("+08:00"));
        System.out.println(hkDateTime2);
        System.out.println(Date.from(actualDay.toLocalDateTime().atZone(ZoneId.systemDefault()).toInstant()));
        System.out.println(Date.from(actualDay.toLocalDateTime().atZone(ZoneId.of("+09:00")).toInstant()));
        ZonedDateTime zonedDateTime = LocalDateTime.now().atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneId.of("Z"));
        System.out.println(zonedDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
    }

    @Test
    public void testZonedDateTimeCompare() {
        ZonedDateTime day1 = ZonedDateTime.parse("2021-11-09T10:10:02.000Z", DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        ZonedDateTime day2 = LocalDateTime.parse("2021-11-09 18:10:02", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).atZone(ZoneId.systemDefault());

        ZonedDateTime futureDay = ZonedDateTime.now(ZoneId.of("Z")).plusDays(2);

        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day1.isEqual(day2));
        System.out.println(day1.isAfter(day2));
        System.out.println(day1.isBefore(day2));
        System.out.println(futureDay);
    }

    @Test
    public void testPeriodAndDuration() {
        // start: 2017/1/14 end:2017/1/15 = Years:0 months:0 days:1
        // start: 2017/1/14 end:2017/2/10 = Years:0 months:0 days:27
        // start: 2017/1/14 end:2017/2/14 = Years:0 months:1 days:0（是 1 个月，而不是 31 天）
        // start: 2017/1/14 end:2017/2/15 = Years:0 months:1 days:1
        // start: 2017/1/14 end:2018/1/10 = Years:0 months:11 days:27
        // start: 2017/1/14 end:2017/1/10 = Years:0 months:0 days:-4
        // start: 2017/1/14 end:2017/1/10 = Years:0 months:-2 days:-4
        LocalDate startDate = LocalDate.of(2017, 1, 14);
        LocalDate endDate = LocalDate.of(2016, 11, 10);

        Period period = Period.between(startDate, endDate);

        System.out.println("Years:" + period.getYears() +
                " months:" + period.getMonths() +
                " days:"+period.getDays());

        System.out.println("Is the period negative? " + period.isNegative());

        Period fromWeeks = Period.ofWeeks(40);
        System.out.println("Years:" + fromWeeks.getYears() +
                " months:" + fromWeeks.getMonths() +
                " days:"+fromWeeks.getDays());
    }

}
