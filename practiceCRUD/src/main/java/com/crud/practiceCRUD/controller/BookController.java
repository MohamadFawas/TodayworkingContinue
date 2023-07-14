package com.crud.practiceCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.practiceCRUD.common.responce.BaseResponse;
import com.crud.practiceCRUD.error.ValidationFailerresponce;
import com.crud.practiceCRUD.requestdto.BookRequestDto;
import com.crud.practiceCRUD.service.BookService;

@RestController
@CrossOrigin
public class BookController {

	@Autowired
	private BookService bookService;
	// private static final Logger logger
	// =LoggerFactory.getLogger(BookController.class);

	@Autowired
	private ValidationFailerresponce validationFailerresponce;
	// @Autowired
	// private Statuses statuses;

	@PostMapping("/post")
	public ResponseEntity<Object> saveLibrary_management(@RequestBody BookRequestDto bookRequestDto) {
		bookService.saveLibrary_management(bookRequestDto);
		return ResponseEntity.ok(new BaseResponse(validationFailerresponce.getSaveBookSuccessMessage(),
				validationFailerresponce.getCommonSuccessCode()));
	}

}
