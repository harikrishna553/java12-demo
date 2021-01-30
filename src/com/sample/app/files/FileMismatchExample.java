package com.sample.app.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileMismatchExample {

	private static void writeToFile(Path path, String content) throws IOException {
		Files.write(path, content.getBytes());
	}

	public static void main(String args[]) throws IOException {
		File file1 = File.createTempFile("file1", ".txt");
		File file2 = File.createTempFile("file2", ".txt");
		File file3 = File.createTempFile("file3", ".txt");

		String str1 = "Hello World";
		String str2 = "Helloworld";

		Path path1 = file1.toPath();
		Path path2 = file2.toPath();
		Path path3 = file3.toPath();

		writeToFile(path1, str1);
		writeToFile(path2, str1);
		writeToFile(path3, str2);

		long offset = Files.mismatch(path1, path2);
		if (offset == -1l) {
			System.out.println(path1 + " and " + path2 + " has same content");
		} else {
			System.out.println(path1 + " and " + path2 + " do not have same content. Mismatch found at byte " + offset);
		}

		offset = Files.mismatch(path1, path3);
		if (offset == -1l) {
			System.out.println(path1 + " and " + path3 + " has same content");
		} else {
			System.out.println(path1 + " and " + path3 + " do not have same content. Mismatch found at byte " + offset);
		}

	}

}
