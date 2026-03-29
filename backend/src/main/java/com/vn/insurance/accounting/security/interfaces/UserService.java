package com.vn.insurance.accounting.security.interfaces;

import com.vn.insurance.accounting.security.model.User;

public interface UserService {
	User findByUsername(String username);
}
