package day11;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoDataStreams {
	public static void main(String[] args) {
		File f = new File("Data.txt");
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream(f)))
		{
			out.writeInt(34);
			out.writeFloat(32.4f);
			out.writeUTF("java");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		try(DataInputStream in = new DataInputStream(new FileInputStream(f)))
		{
			System.out.println(in.readInt());
			System.out.println(in.readFloat());
			System.out.println(in.readUTF());
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	}

}
