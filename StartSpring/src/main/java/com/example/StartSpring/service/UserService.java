package com.example.StartSpring.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class UserService {
	
	public byte[] generateSalt() {
		SecureRandom rnd = new SecureRandom();
		byte[] salt = new byte[16];
		rnd.nextBytes(salt);
		return salt;
	}
	
	public byte[] digestPass(String password, byte[] salt) {
		MessageDigest md;
		byte[] hashedPass = null;
		try {
			md = MessageDigest.getInstance("SHA-512");
			md.update(salt);
			
			hashedPass = md.digest(password.getBytes(StandardCharsets.UTF_8));
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return hashedPass;
	}
}
