package jp.co.fsr.book.dto;

import java.sql.Date;
import java.sql.Timestamp;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import jp.co.fsr.book.util.DateUtil;
import jp.co.fsr.book.entity.BookEntity;
import lombok.Data;

/**
 * 本マスタ画面のフォームのモデルクラス.
 */

@Data
public class BookMasterDto {

    /** 本ID. */
    @NotNull
    private String bookId;

    /** 本タイトル. */
    @NotNull
    private String bookTitle;

    /** 著者名. */
    @NotNull
    private String authorName;

    /** 出版社. */
    @NotNull
    private String publisher;

    /** 出版年月日. */
    @Past
    private Date publicationDay;

    /** 出版年. */
    @Pattern(regexp = "[0-9]{4}")
    private String year;

    /** 出版月. */
    @Pattern(regexp = "([1-9]|0[1-9]|1[0-2])")
    private String month;

    /** 出版日. */
    @Pattern(regexp = "([1-9]|0[1-9]|[12][0-9]|3[01])")
    private String day;

    /** 登録日. */
    private Timestamp insertDay;

    /** 更新日. */
    private Timestamp updateDay;

    /** 年月日の分割処理. */
    public void splitDate() {
        String[] pubDate = DateUtil.splitDate(publicationDay, "yyyy-MM-dd");
        this.year = pubDate[0];
        this.month = pubDate[1];
        this.day = pubDate[2];
    }

    /**
     * 年月日の結合処理.
     */
    public Date joinDate() {
        return DateUtil.joinDate(this.year, this.month, this.day);
    }
}
