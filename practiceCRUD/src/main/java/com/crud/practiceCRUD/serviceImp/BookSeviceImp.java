package com.crud.practiceCRUD.serviceImp;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.practiceCRUD.entity.Library_management;
import com.crud.practiceCRUD.repository.BookRepository;
import com.crud.practiceCRUD.requestdto.BookRequestDto;
import com.crud.practiceCRUD.service.BookService;

import jakarta.transaction.Transactional;

@Service
public class BookSeviceImp implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Transactional
	public void saveLibrary_management(BookRequestDto bookRequestDto) {
		// TODO Auto-generated method stub
		Library_management library_management=new Library_management();
		BeanUtils.copyProperties(bookRequestDto, library_management);
		bookRepository.save(library_management);
		
	}

}
