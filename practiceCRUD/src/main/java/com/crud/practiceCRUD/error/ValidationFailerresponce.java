package com.crud.practiceCRUD.error;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.Setter;

@Component
@PropertySource("classpath:MessagesAndCodes.properties")
@Getter
@Setter
public class ValidationFailerresponce {

	@Value("${code.success.common}")
	private String commonSuccessCode;

	@Value("${code.failure.common}")
	private String failureCode;

	// Validation code for Designation
	@Value("${code.validation.book.alreadyExists}")
	private String bookAlreadyExists;

	@Value("${message.success.save.book}")
	private String saveBookSuccessMessage;

	@Value("${message.validation.book.alreadyExists}")
	private String validationBookAlreadyExists;
}
