package net.developia.spring01.di102e;

import java.io.FileWriter;

public class FileOutputterImpl implements FileOutputter {
	private String fileName;
	
	
	public FileOutputterImpl(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void output(String msg) throws Exception {
		FileWriter fw = new FileWriter(fileName);
		fw.write(msg);
		fw.flush();
		fw.close();
	}
	
}
