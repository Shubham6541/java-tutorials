package com.nklkarthi.web;
import com.nklkarthi.domain.Book;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;

/**
 * = BooksCollectionThymeleafController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Book.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class BooksCollectionThymeleafController {
}
