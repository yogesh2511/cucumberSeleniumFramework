
package com.cucumber.framework.utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 
 * @author bsingh5
 *
 */
public class ResourceHelper {

	public static String getResourcePath(String resource) {
		String path = getBaseResourcePath() + resource;
		return path;
	}
	
	public static String getBaseResourcePath() {
		String path = ResourceHelper.class.getClass().getResource("/").getPath();
		System.out.println(path);
		return path;
	}
	
	public static InputStream getResourcePathInputStream(String resource) throws FileNotFoundException{
		return new FileInputStream(ResourceHelper.getResourcePath(resource));
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(ResourceHelper.getResourcePath("configfile/"+ "config.properties"));	
		
		//getBaseResourcePath() ;
	}
	
}
