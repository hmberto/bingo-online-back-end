package br.com.sec4you.bingo.dt;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenerateNumberList {
	public static String NAME = GenerateNumberList.class.getSimpleName();
	private static Logger LOG = Logger.getLogger(GenerateNumberList.class.getName());
	
	public Set<Integer> getNumberList(int size) {
		LOG.entering(NAME, "getNumberList");
		
		Set<Integer> numberList;
		numberList = new HashSet<Integer>();
		  	  
		while(numberList.size() < size) {
			Random random = new Random();
			int number = random.nextInt(75);
			  
			if(number > 0) 
				numberList.add(number);
		}
		
		LOG.log(Level.INFO, "Generated table: " + numberList);
		
		LOG.exiting(NAME, "getNumberList");
		return numberList;
	  }
}