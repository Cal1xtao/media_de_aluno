package media;
import java.util.Scanner;
public class media {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		float ac1,ac2,ag,af,opa;
		//Perguntando se tem alunos
		System.out.print("Existem alunos nessa materia, digite 0 para nao e 1 para sim:\n");
	    opa=ler.nextInt();
	    if (opa==0)
	    	//Constatou que n�o existem alunos
	    	System.out.print("Fim do programa, nao tem alunos");
	    else	    
		//Pedindo nota da AC1
		System.out.print("Digite a nota da AC1 do aluno(a):\n");
		ac1=ler.nextInt();
		
		//Pedindo nota da AC2
		System.out.print("Digite a nota da AC2 do aluno(a):\n");
		ac2=ler.nextInt();
		
		//Pedindo nota da AG
		System.out.print("Digite a nota da AG do aluno(a):\n");
		ag=ler.nextInt();
		
		//Pedindo nota da AF
		System.out.print("Digite a nota da AF do aluno(a):\n");
		af=ler.nextInt();
		double m;
		//Form�la utilizada
		m=(ac1*1.5+ac2*3+ag+af*4.5)/4;
		//Calculando a m�dia do(a) aluno(a)
		System.out.printf("A soma de todas as notas e %f", m);	
		//Decis�o para ver se passou ou n�o
		if (m>=5)
			System.out.print("\nAprovado\n");
		else if (m<5)
			System.out.print("\nReprovado\n");
		
	}
}
