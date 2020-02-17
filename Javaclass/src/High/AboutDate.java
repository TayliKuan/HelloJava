/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package High;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.MinguoDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author 小官
 */
public class AboutDate {
    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("y");
        String date = sdf.format(new Date()); 
        int TaiwanYear = Integer.valueOf(date)-1911;//民國年
        
        SimpleDateFormat monthday = new SimpleDateFormat("MM-dd EEE,h:mm a MMMMM");
        String MD = monthday.format(new Date());
	System.out.println(TaiwanYear+"-"+MD); 
        
//        Calendar calendar = new GregorianCalendar(Locale.JAPANESE);
//        //System.out.println(calendar.getInstance(Locale.CANADA));
//        System.out.println(calendar.get(GregorianCalendar.DATE));
//        System.out.println(calendar.get(GregorianCalendar.HOUR));
//        System.out.println(calendar.get(GregorianCalendar.MINUTE));      
//        
        
        LocalDateTime TokyoTime = LocalDateTime.now(ZoneId.of("Asia/Tokyo")); 
        System.out.println(TokyoTime);

        LocalDateTime UsaTime = LocalDateTime.now(ZoneId.of("America/Los_Angeles")); 
        System.out.println(UsaTime);
        
        LocalDate T = LocalDate.now();
        MinguoDate TD = MinguoDate.from(T);
        System.out.println(TD);
        System.out.println(T);
        
        LocalDateTime UsaPhoenixTime = LocalDateTime.now(ZoneId.of("America/Phoenix")); 
        System.out.println(UsaPhoenixTime);
        
        //比較兩地時區
        LocalDateTime LDT = LocalDateTime.now();
        System.out.println(LDT);
        ZoneId ZID = ZoneId.of("America/Phoenix");
        ZonedDateTime ZDT = LDT.atZone(ZID);
        System.out.println(ZDT);
    }
}
