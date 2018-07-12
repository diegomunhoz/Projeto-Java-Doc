package modelo;
/**
 * A classe Filme determina o comportamento dos objetos que <br/>
 * representam os DVDs disponíveis em nossa <i>Locadora</i>.<br/>
 * <br/>
 * A forma mais simples do seu uso é através da declaração e atribuição:
 * 
 * <pre>
 * Filme filme = new Filme();
 * </pre>
 * 
 * Será criada uma instância de Filme, com o campo código já preenchido<br/>
 * pela própria classe.<br/>
 * <br/>
 * 
 * @author Fulano
 * 
 */
public class Filme {

	/**
	 * É o código único, gerado automaticamente, que representa o DVD.
	 */
	private int codigo;

	/**
	 * É a descrição completa do filme.
	 */
	private String nome;

	/**
	 * É o valor da locação, expressa em reais.
	 */
	private double valor;

	/**
	 * Determina se o filme está disponível para locação (true) ou não (false).
	 */
	private boolean disponivel = true;

	/**
	 * Determina se o filme está com preço promocional (true) ou não (false).
	 */
	private boolean promocao;

	/**
	 * Se o filme está com preço promocional, este valor é armazenado aqui.
	 */
	private double valorPromocao;

	/**
	 * Reescrita do método toString
	 */
	public String toString(){
		String texto = "Dados do Filme\n";
		texto += "Codigo....: " + this.getCodigo() + "\n";
		texto += "Nome......: " + this.getNome() + "\n";
		texto += "Valor.....: " + this.getValor() + "\n";
		texto += "Disponivel: " + (disponivel?"SIM":"NAO") + "\n\n";
		return texto;
	}
	
	/**
	 * Configura este DVD para ser alugado com preço promocional.<br/>
	 * 
	 * @param valor
	 *            Valor da locação durante a promoção
	 * @param dataFinal
	 *            Data final da promoção
	 */
	public void entraEmPromocao(double valor, int dataFinal) {

	}

	/**
	 * Configura este DVD para ser alugado pelo preço convencional.
	 */
	public void saidaDaPromocao() {

	}

	/**
	 * Efetua a locação do filme e caso não seja possível, lança uma exceção <br/>
	 * que deverá ser tratada pelo programador que estiver utilizando a classe.
	 * 
	 * @throws Exception
	 *             Se o filme não esteja disponível para locação.
	 */
	public void retirar() throws Exception {

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

	public double getValorPromocao() {
		return valorPromocao;
	}

	public void setValorPromocao(double valorPromocao) {
		this.valorPromocao = valorPromocao;
	}
}
