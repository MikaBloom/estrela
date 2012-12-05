package br.com.caelum.cap11.banco.model;

import java.math.BigDecimal;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cliente c = new Cliente();
	
		c.setDp(new DadosPessoais());
		
		c.setNome("John Smith");
		
		c.setEndereco("Avenida Paulista, 1009");
		
		c.setCpf("123123123-00");
		
		c.setRg("21123123-99");
		
		c.setDataNascimento(01, 06, 1990);
		
		System.out.println(c);
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.setCliente(c);
		
		cc.setNumero("1000");
		
		System.out.println(cc.toString());
		
		
		
		BigDecimal valor = new BigDecimal(1000);
		BigDecimal valor2 = new BigDecimal(1000);
		
		
		System.out.println(valor.add(valor2));
		
		//cc.deposita(valor);
		
		
		
	}

}
