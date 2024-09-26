package day10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
	public static void writeToFile(File f)
	{
		String s="This file is wrritten usign a byte stream";
		try(FileOutputStream fos = new FileOutputStream(f);
				BufferedOutputStream bos = new BufferedOutputStream(fos))
		{
			bos.write(s.getBytes());
			bos.flush();
		}
		catch(IOException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
	public static void readFile(File f)
	{
		try(FileInputStream fis = new FileInputStream(f);
				BufferedInputStream bis = new BufferedInputStream(fis))
		{
			byte[] b = new byte[fis.available()];
			while(bis.read() != -1)
			{
				System.out.println(new String(b));
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		File f = new File("abc.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(f);
			fos = new FileOutputStream(f);
			fos.write('a');
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				
			}
			catch(Exception e){
				
			}
		}
		
	}
}
