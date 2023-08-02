package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[] users = { "Yash", "Shivam", "Lavanya", "Sanjeev", "Namrat" };
		for (String user : users) {
			if (user.equals(username))
				throw new NameExistsException("Name Already Exists!");
		}
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooLongException, TooShortException {
		if (password.length() < 6)
			throw new TooShortException("Password Must contains atleast 6 characters!");
		if (password.length() > 15)
			throw new TooLongException("Password should be less than 15 characters!");
		return true;
	}

}
