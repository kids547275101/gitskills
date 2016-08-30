package org.buzheng.demo.esm.util;

public class AppHelper {
	
	/**
	 * 将密码加密
	 * @param passwordSource
	 * @return
	 */
	public static String encryptPassword(String passwordSource) {
		int a=1;
		String s="s";
		return EncryptUtils.encryptByMD5(passwordSource);
	}
}
