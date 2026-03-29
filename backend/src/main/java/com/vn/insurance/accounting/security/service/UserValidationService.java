package com.vn.insurance.accounting.security.service;

import org.springframework.stereotype.Service;

import com.vn.insurance.accounting.security.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserValidationService {

	private final UserRepository userRepository;
}
