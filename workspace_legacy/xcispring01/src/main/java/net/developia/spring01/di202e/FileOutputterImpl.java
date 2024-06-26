package net.developia.spring01.di202e;

import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("net/developia/spring01/di202e/system.properties")
public class FileOutputterImpl implements FileOutputter {
	private String fileName;
	
	public FileOutputterImpl(@Value("${fileName}")String fileName) {
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
