package jp.co.fsr.book.entity;

import java.sql.Date;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;


/**
 * データベースと連結するBookEntity.
 * 
 * @author cheng.yupeng
 */
@Data
@Builder
@Entity
@Table(name = "mt_book")
public class BookEntity {

    /** 本ID. */
    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(name = "book_id")
    private String bookId;

    /** 本タイトル. */
    @Column(name = "book_title")
    private String bookTitle;

    /** 著者名. */
    @Column(name = "author_name")
    private String authorName;

    /** 出版社. */
    @Column(name = "publisher")
    private String publisher;

    /** 出版年月日. */
    @Column(name = "publication_day")
    private Date publicationDay;

    /** 登録年月日. */
    @Column(name = "insert_day")
    private Timestamp insertDay;

    /** 更新年月日. */
    @Column(name = "update_day")
    private Timestamp updateDay;
}
