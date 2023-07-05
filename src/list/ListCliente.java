package list;

//importação necessária para a manipulação da lista

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
 

public class ListCliente {
	
	public static void main(String[] args) 
	
	{
		
		List<String> clientes = Arrays.asList("Matheus", "Joao", "Fernando", "Rodrigo", "Batman");
		
			// formas de representação da lista
		
		System.out.println("\n ESTRUTURA PADRAO ");
		
		
		for (int i = 0; i<clientes.size(); i++)  //size() -> retorna o tamanho da lista (dinamica)
		{
			System.out.println(clientes.get(i)); //get () -> acesso aos valores
			
		}
		
		System.out.println("\n ESTRUTURA: FOREACH ");

		
		for (String nome: clientes) 
		{
			System.out.println(nome);
		}
		
		
		System.out.println("\n ESTRUTURA: ITERATOR ");

		
		Iterator<String> itr = clientes.iterator();
		
		while(itr.hasNext()) //hasNext() -> enquanto tiver proximo 
				
		{
			System.out.println(itr.next()); //imprime o próximo
			
		}
		
		System.out.println("\n ESTRUTURA: STREAM ");
		

		Stream<String> stream = clientes.stream();
		stream.forEach(System.out::println);

		
	}

}
