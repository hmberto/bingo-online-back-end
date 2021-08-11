package br.com.sec4you.bingo.dt;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenerateID {
	public static String NAME = GenerateID.class.getSimpleName();
	private static Logger LOG = Logger.getLogger(GenerateID.class.getName());
	
	public int getId(int size) {
		LOG.entering(NAME, "getId");
		String newIdString = "";
	  
		while(newIdString.length() < size) {
			Random random = new Random();
			int number = random.nextInt(9);
		  
			if(number > 0)
				newIdString = newIdString + number;
		}
	
		LOG.log(Level.INFO, "Generated id: " + newIdString);
		
		LOG.exiting(NAME, "getId");
		return Integer.parseInt(newIdString);
	}
}