package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.MonthlyMess.Customer;

public interface IOUtils {

	static void store(String filename, HashMap<Integer, Customer> Mess) throws IOException {

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(Mess);

		}
	}

	
	@SuppressWarnings("unchecked")
	static HashMap<Integer,Customer> read(String filename) throws IOException,ClassNotFoundException {

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			return(HashMap<Integer,Customer>)in.readObject();

		}catch (Exception e) {
			//in case of any errs : return empty map to the caller
			System.out.println(e);
			return new HashMap<>();
			
		}
	}
	
}
