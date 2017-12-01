package util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {
	public static String geraMD5(String senha) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.out.println("Erro ao criptografar: " + e.getMessage());
		}
		BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
		String senhaCripto = hash.toString(16);
		System.out.println(senhaCripto);
		return senhaCripto;
	}
}
