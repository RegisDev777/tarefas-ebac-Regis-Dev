package Hospital;

import java.util.Scanner;

public class test {
   public static void main(String[] args) {
	
	   
	   Scanner sc = new Scanner(System.in);
	   
	   InfPacienteBuilder p1 = new InfPacienteBuilder();
	   p1.setNome(sc.nextLine());
	   p1.setCpf(sc.nextLine());
	   p1.setIdade(sc.nextLine());
	   p1.setEndereço(sc.nextLine());
	   
	   
	   Paciente paciente = p1.getResultado();
	   
	   System.out.println(paciente.Ficha());
	   
	   sc.close();
	   
   }
}
