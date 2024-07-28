package com.Practice.Selenium072024;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File folder1 = new File("C:\\Users\\shah4\\TextFiles\\abc");
		if (!folder1.exists()) {
			folder1.mkdir();
			System.out.println("New folder created");
		}else {
			System.out.println("Folder already exists");
		}

		File file1 = new File(folder1,"abc.txt");

		if (!file1.exists()) {
			file1.createNewFile();
			System.out.println("Created the new file");
		} else {
			System.out.println("File already exists");
		}

	}

}
