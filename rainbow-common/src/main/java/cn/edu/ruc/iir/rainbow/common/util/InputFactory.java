package cn.edu.ruc.iir.rainbow.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class InputFactory
{
	static private InputFactory instance = null;

	private InputFactory() {}
	
	public static InputFactory Instance()
	{
		if (instance == null)
		{
			instance = new InputFactory();
		}
		return instance;
	}
	
	public BufferedReader getReader (String path) throws FileNotFoundException
	{
		BufferedReader reader = new BufferedReader(new FileReader(path));
		return reader;
	}

	public File[] getFiles (String dirPath)
	{
		File dir = new File(dirPath);
		return dir.listFiles();
	}

}
