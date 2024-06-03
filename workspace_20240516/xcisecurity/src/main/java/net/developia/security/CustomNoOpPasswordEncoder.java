package net.developia.security;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.extern.java.Log;

@Log
public class CustomNoOpPasswordEncoder implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		log.info("before encode: "+rawPassword);
		return rawPassword.toString();
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		log.info("matches: "+rawPassword+" : "+encodedPassword);
		return rawPassword.toString().equals(encodedPassword);
	}

}
