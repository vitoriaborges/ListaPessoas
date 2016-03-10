import java.util.Scanner;
import java.util.ArrayList;
public class Cadastro{
	public static void main(String args[]){
		ArrayList<String> Pessoa = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		Pessoa pe = null;
		for(int i=0; i<1; i++){
			System.out.println("Informe os dados da pessoa: " + i);
			pe = new Pessoa();
			
			System.out.println("NOME: ");
			pe.setNome(sc.next());
			
			System.out.println("SOBRENOME: ");
			pe.setSobrenome(sc.next());
			
			System.out.println("E-MAIL: ");
			pe.setEmail(sc.next());
			
			System.out.println("RG: ");
			pe.setRg(sc.nextLong());

		}
		
		 pe.mostraPessoa();
		
		
	}
}