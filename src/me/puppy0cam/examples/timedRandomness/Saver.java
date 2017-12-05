package me.puppy0cam.examples.timedRandomness;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Saver {
	public File file;
	public Saver(String path) {
		file = new File(path);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			outputStream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
    public FileOutputStream outputStream;
	private void write(long l) throws IOException {
		String item = Long.toString(l)+"\n";
	    byte[] strToBytes = item.getBytes();
	    outputStream.write(strToBytes);
	}
	public void add(long l) {
		try {
			write(l);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void onDisable() {
		try {
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
