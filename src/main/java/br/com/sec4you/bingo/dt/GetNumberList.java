package br.com.sec4you.bingo.dt;

import java.util.HashSet;
import java.util.Set;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GetNumberList {
	public static String NAME = GetNumberList.class.getSimpleName();
	private static Logger LOG = Logger.getLogger(GetNumberList.class.getName());
	
	public static Set<Integer> getNumberList(int id) {
		LOG.entering(NAME, "getNumberList");
		
		Set<Integer> numberList;
		numberList = new HashSet<Integer>();
		
		Database list = new Database();
		String game = list.DBGet(id);
		
		String stringGame = game.substring(1, game.length()-1);
		
		for (String number : stringGame.split(",")) {
	         numberList.add(Integer.parseInt(number));
	    }
		
		// String[] split = list.split(",");
		
		LOG.log(Level.INFO, "Match table: " + numberList);
		
		LOG.exiting(NAME, "getNumberList");
		return numberList;
	}
}