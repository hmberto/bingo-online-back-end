package br.com.sec4you.bingo.dt;

import java.util.Set;
import java.util.logging.Logger;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Generate")
public class Generate {
	public static String NAME = Generate.class.getSimpleName();
	private static Logger LOG = Logger.getLogger(Generate.class.getName());
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Set<Integer> getSequence() {
		return sequence;
	}
	public void setSequence(Set<Integer> sequence) {
		this.sequence = sequence;
	}
	
	int id;
	Set<Integer> sequence;
	
	public Generate() {}
	
	public Generate(int id, Set<Integer> numberList) {
		super();
		
		LOG.entering(NAME, "Generate");

		this.id = id;
		this.sequence = numberList;
		
		LOG.exiting(NAME, "Generate");
  }
  
}
