package jp.co.fsr.book.util;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * 日付処理のユーティリティクラス.
 */
public class DateUtil {

    /**
     * 日付の年・月・日を個別にするの処理.
     * 
     * @param date 日付の値
     * @param format フォーマット
     * @return
     */
    public static String[] splitDate(Date date, String format) {
        String[] dateStr = new SimpleDateFormat(format).format(date).split("-");

        return dateStr;
    }

    /**
     * 年・月・日を日付型の文字列に変更する処理.
     * 
     * @param year 年
     * @param month 月
     * @param day 日
     * @return
     */
    public static Date joinDate(String year, String month, String day) {
        String dateStr = year + "-" + month + "-" + day;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setLenient(false);
        try {
            simpleDateFormat.parse(dateStr);
            Date date = Date.valueOf(dateStr);

            return date;
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 現在時間の取得処理.
     * 
     * @return
     */
    public static Timestamp getCurrentTime() {
        return new Timestamp(System.currentTimeMillis());
    }
}
