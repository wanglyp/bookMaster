package jp.co.fsr.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jp.co.fsr.book.service.BookMasterService;

/**
 * 本マスタ操作のコントローラ.
 */
@Controller
public class BookMasterController {

	@Autowired
	private BookMasterService bookMasterService;
	
    @GetMapping("/init")
    public String index() {
        return "bookmaster.html";
    }        
    
    @PostMapping("/insertBook")
    public String insert(String bookId, String bookTitle, String authorName, String publisher, String year, String month, String day) {
    	
    	try {
	    	bookMasterService.insert(bookId, bookTitle, authorName, publisher, year, month, day);

    	} catch (Exception e) {
    		return "insertFailed.html";
    	}
    	return "insertSuccess.html";
    }
}


