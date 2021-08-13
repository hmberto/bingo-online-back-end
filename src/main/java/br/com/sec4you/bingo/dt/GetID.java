package br.com.sec4you.bingo.dt;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "GetID")
public class GetID {
	public String getId() {
		return ID;
	}
	public void setId(String ID) {
		this.ID = ID;
	}

	String ID;
	
	public GetID() {
	}
}
