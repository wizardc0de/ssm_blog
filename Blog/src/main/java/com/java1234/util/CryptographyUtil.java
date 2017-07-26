package com.java1234.util;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * ���ܹ���
 * @author Administrator
 *
 */
public class CryptographyUtil {

	
	/**
	 * Md5����
	 * @param str
	 * @param salt
	 * @return
	 */
	public static String md5(String str,String salt){
		return new Md5Hash(str,salt).toString();
	}
	
	public static void main(String[] args) {
		String password="1234";
		
		System.out.println("   "+CryptographyUtil.md5(password, "java1234"));
	}
}
