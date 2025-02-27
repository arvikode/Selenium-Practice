import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

public class CurrentDataTime {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        // Get Local Date plus its time
        Date dt = new Date();
        Timestamp ts = new Timestamp(dt.getTime());
        System.out.println(ts);
    }

    public static void method2() {
        LocalDateTime LDT = LocalDateTime.now();
        System.out.println(LDT);
    }
}
