public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private String email;
	private long rg;
	
	public Pessoa(){}
	
	public Pessoa (String nome, String sobrenome, String email, long rg){
		this.nome=nome;
		this.sobrenome=sobrenome;
		this.email=email;
		this.rg=rg;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome= nome;
	}
	
	public String getSobrenome(){
		return this.sobrenome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome= sobrenome;
	}
	
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email= email;
	}
	
	public long getRg(){
		return this.rg;
	}
	public void setRg(long rg){
		this.rg= rg;
	}
	
	
	public void mostraPessoa(){
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ########################################## ");
		System.out.println(" Nome: " + nome + " " + sobrenome);
		System.out.println(" ----------------------------------------- ");
		System.out.println(" RG: " + rg);
		System.out.println(" ----------------------------------------- ");
		System.out.println(" Email: " + email);
		System.out.println(" ########################################## ");
		System.out.println(" ");
		
		
	}
	
	/*@Override
	public String toString(){
		
		String retorno = "";
		retorno = "  ";
		retorno = retorno + " meu nome eh " + nome;
		retorno = retorno + " " + sobrenome;
		retorno = retorno + " meu e-mail eh " + email;
		retorno = retorno + " meu RG eh " + rg;
		
		return retorno;*/
	
	
}