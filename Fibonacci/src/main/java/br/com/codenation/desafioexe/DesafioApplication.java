package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
	public static void main(String[] args) {
		fibonacci();
	}

	public static List<Integer> fibonacci() {
		List<Integer> lista = new ArrayList<>();
		lista.add(0);
		lista.add(1);
		lista.add(1);
		while (lista.get(lista.size()-1) <= 350) {
			lista.add(lista.get(lista.size()-1)+lista.get(lista.size()-2));
		}
		return lista;
	}

	public static Boolean isFibonacci(Integer a) {
		return  fibonacci().contains(a);
	}

}