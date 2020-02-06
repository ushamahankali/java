package test.com.ektha.filemax.fileprocess;

import java.io.FileNotFoundException;

import main.com.ektha.filemax.fileprocess.service.FileService;

public class DemoFileMax {

	public static void main(String[] args) throws FileNotFoundException {

		FileService fileService = new FileService();

		fileService.processFileDate();

	}

}
