package jp.co.fsr.book.service;

public interface BookMasterService {
	void insert(String bookId, String bookTitle, String authorName, String publisher, String year, String month, String day);
}
