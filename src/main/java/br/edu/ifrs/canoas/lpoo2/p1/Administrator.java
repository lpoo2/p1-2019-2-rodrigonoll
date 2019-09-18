package br.edu.ifrs.canoas.lpoo2.p1;

public class Administrator extends User {
	
	private String module;
	
	public boolean updateModule(String module) {
		if (module == null) return false;
		
		this.module = module;
		return true;
				
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}
	
	

}
