package jp.co.fsr.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 本マスタ操作のコントローラ.
 */
@Controller
public class BookMasterController {

    @GetMapping("/init")
    public String index() {
        return "bookmaster.html";
    }        
}


