package calculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
	private Float numero1;
	private Float numero2;
	private Float resultado;
	private List<String> resultados = new ArrayList<String>();
	
	public Float getnumero1() {
		return numero1;
	}
	public void setnumero1(Float numero1) {
		this.numero1 = numero1;
	}
	public Float getnumero2() {
		return numero2;
	}
	public void setnumero2(Float numero2) {
		this.numero2 = numero2;
	}
	public Float getResultado() {
		return resultado;
	}
	public void setResultado(Float resultado) {
		this.resultado = resultado;
	}
	public List<String> getResultados() {
		return resultados;
	}
	public void setResultados(List<String> resultados) {
		this.resultados = resultados;
	}
	public void somar() {
		resultado = numero1 + numero2;
		resultados.add("["+numero1+"+"+numero2+"="+resultado+"]");
		
	}
	public void subtrair() {
		resultado = numero1 - numero2;
		resultados.add("["+numero1+"-"+numero2+"="+resultado+"]");
	}
	
	public void dividir() {
		resultado = numero1 / numero2;
		resultados.add("["+numero1+"/"+numero2+"="+resultado+"]");
	}
	
	public void multiplicar() {
		resultado = numero1 * numero2;
		resultados.add("["+numero1+"*"+numero2+"="+resultado+"]");
	}	
		
}
