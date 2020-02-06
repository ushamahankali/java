package main.com.ektha.filemax.fileprocess.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import main.com.ektha.filemax.fileprocess.dao.FileDAO;
import main.com.ektha.filemax.fileprocess.entity.Customer;

public class FileService {

	FileDAO fileDAO = new FileDAO();

	public void processFileDate() throws FileNotFoundException {

		Customer cust = new Customer();

		File file = new File("C:\\bootcampjan2019\\development\\CoreJava\\FileMax\\src\\resources\\customer.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file));) {
			String strLine;

			while ((strLine = br.readLine()) != null) {

				String[] tokens = strLine.split(" ");

				cust.setFirstName(tokens[0]);

				cust.setLastName(tokens[1]);

				cust.setEmailId(tokens[2]);

				cust.setPhoneNumber(tokens[3]);

				fileDAO.saveCustomer(cust);
			}
			br.close();

		} catch (Exception ex) {
		}

	}
}
