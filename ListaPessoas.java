import java.util.Scanner;
import java.util.ArrayList;
public class ListaPessoas {	
	public static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	public static Pessoa pe = null;
	public static Scanner sc = new Scanner (System.in);
	public static void main(String args[]){
		pe = new Pessoa();
		for(int i=0; i<2; i++){
			System.out.println("Informe seus dados: " + i);
			pe = new Pessoa();
			
			System.out.println("Nome: ");
			pe.setNome(sc.next());
			
			System.out.println("Sobrenome: ");
			pe.setSobrenome(sc.next());
			
			System.out.println("E-MAIL: ");
			pe.setEmail(sc.next());
			
			System.out.println("RG: ");
			pe.setRg(sc.nextLong());
		
			listaPessoas.add(pe);
		}
		mostraPessoas();
		buscaPessoas();
	}
	
	public static void mostraPessoas(){
		for(Pessoa p: listaPessoas){
			p.mostraPessoa();
		}
		
	}
	
	public static void buscaPessoas(){
		System.out.println(" Informe um email para pesquisa: ");
		String busca = sc.next();
		for(Pessoa p: listaPessoas){
			if(busca.equalsIgnoreCase(p.getEmail())){
				System.out.println(" Encontrei o email que voce procurava! ");
				p.mostraPessoa();
			}
		}
	}
	
	
	
	
}