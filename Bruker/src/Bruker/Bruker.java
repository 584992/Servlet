package Bruker;

public class Bruker {
	
	private String fornavn;
	private String etternavn;
	
	
	public Bruker() {}


	public Bruker(String fornavn, String etternavn) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}


	public String getFornavn() {
		return fornavn;
	}


	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}


	public String getEtternavn() {
		return etternavn;
	}


	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	
	
	
	
	
}
