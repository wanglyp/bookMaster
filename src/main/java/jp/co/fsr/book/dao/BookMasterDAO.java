package jp.co.fsr.book.dao;

import java.sql.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookMasterDAO {
	void insert(@Param("bookId") String bookId, @Param("bookTitle") String bookTitle, @Param("authorName") String authorName, @Param("publisher") String publisher, @Param("publicationDay") Date publicationDay);
}
