package project.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import project.bank.PersonInfo;

public class fileDao {
	 public static boolean saveToFileWithFileName(PersonInfo person,String fileName)
	    {
	        try
	        {
	            Gson gson = new Gson();
	            File file = new File("\resouces\\" + fileName);
	            String content = gson.toJson(person);

	            if (!file.exists()) {
	                file.createNewFile();
	            }

	            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
	            BufferedWriter bw = new BufferedWriter(fw);
	            bw.newLine();
	            bw.write(content);
	            bw.close();

	            return true;
	        }

	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        return false;
	    }
}
