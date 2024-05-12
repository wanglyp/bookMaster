package jp.co.fsr.book.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.fsr.book.dao.BookMasterDAO;
import jp.co.fsr.book.util.DateUtil;

@Service
@Transactional
public class BookMasterServiceImpl implements BookMasterService{
	
	@Autowired
	private BookMasterDAO bookMasterDAO;
	
	@Override
	public void insert(String bookId, String bookTitle, String authorName, String publisher, String year, String month, String day) {
		
		Date publicationDay = DateUtil.joinDate(year, month, day);
		bookMasterDAO.insert(bookId, bookTitle, authorName, publisher, publicationDay);
		
	}

}
