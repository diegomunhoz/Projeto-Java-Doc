package modelo;
/**
 * A classe Filme determina o comportamento dos objetos que <br/>
 * representam os DVDs dispon�veis em nossa <i>Locadora</i>.<br/>
 * <br/>
 * A forma mais simples do seu uso � atrav�s da declara��o e atribui��o:
 * 
 * <pre>
 * Filme filme = new Filme();
 * </pre>
 * 
 * Ser� criada uma inst�ncia de Filme, com o campo c�digo j� preenchido<br/>
 * pela pr�pria classe.<br/>
 * <br/>
 * 
 * @author Fulano
 * 
 */
public class Filme {

	/**
	 * � o c�digo �nico, gerado automaticamente, que representa o DVD.
	 */
	private int codigo;

	/**
	 * � a descri��o completa do filme.
	 */
	private String nome;

	/**
	 * � o valor da loca��o, expressa em reais.
	 */
	private double valor;

	/**
	 * Determina se o filme est� dispon�vel para loca��o (true) ou n�o (false).
	 */
	private boolean disponivel = true;

	/**
	 * Determina se o filme est� com pre�o promocional (true) ou n�o (false).
	 */
	private boolean promocao;

	/**
	 * Se o filme est� com pre�o promocional, este valor � armazenado aqui.
	 */
	private double valorPromocao;

	/**
	 * Reescrita do m�todo toString
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
	 * Configura este DVD para ser alugado com pre�o promocional.<br/>
	 * 
	 * @param valor
	 *            Valor da loca��o durante a promo��o
	 * @param dataFinal
	 *            Data final da promo��o
	 */
	public void entraEmPromocao(double valor, int dataFinal) {

	}

	/**
	 * Configura este DVD para ser alugado pelo pre�o convencional.
	 */
	public void saidaDaPromocao() {

	}

	/**
	 * Efetua a loca��o do filme e caso n�o seja poss�vel, lan�a uma exce��o <br/>
	 * que dever� ser tratada pelo programador que estiver utilizando a classe.
	 * 
	 * @throws Exception
	 *             Se o filme n�o esteja dispon�vel para loca��o.
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
