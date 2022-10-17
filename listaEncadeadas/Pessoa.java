package listaEncadeadas;

import javax.swing.JOptionPane;

public class Pessoa {

	public String nome;
	public int idade;
	private Pessoa proximaPessoa;

	public Pessoa() {
		setNome();
		setIdade();
		this.proximaPessoa = null;
	}

	public void setNome() {
		this.nome = JOptionPane.showInputDialog("Digite o nome da pessoa: ");
	}

	public void setIdade() {
		this.idade = parseintMensagem("Digite a idade de " + this.nome + ": ");
	}
	
	private int parseintMensagem(String mensagem) {
		return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
	}

	public String toString() {
		return "[ " + this.nome + ", " + this.idade + " ]";
	}	

	public void imprimirTodaLista() {
		if (this != null) {
			JOptionPane.showMessageDialog(null, this.toString());
			if (this.proximaPessoa!= null) {
				this.proximaPessoa.imprimirTodaLista();
			}
			
		}
	}

	public void adicionarPessoa(Pessoa novaPessoa) {
		if (this.proximaPessoa != null) {

			if (this.proximaPessoa.proximaPessoa == novaPessoa) {
				this.proximaPessoa.proximaPessoa = novaPessoa.proximaPessoa;
			}
			testePessoaRepetida(this, novaPessoa);
		}
		novaPessoa.proximaPessoa = this.proximaPessoa;
		this.proximaPessoa = novaPessoa;
	}

	private static void testePessoaRepetida(Pessoa pessoaVericar, Pessoa pessoaAlvo) {
		if (pessoaVericar.proximaPessoa == pessoaAlvo) {
			pessoaVericar.proximaPessoa = null;
		} else {
			if (pessoaVericar.proximaPessoa != null) {
				testePessoaRepetida(pessoaVericar.proximaPessoa, pessoaAlvo);
			}
		}
	}

	public void adicionarNovaPessoaLista(Pessoa novaPessoa) {
		adicionarNovaPessoaLista(this, novaPessoa);
	}

	private void adicionarNovaPessoaLista(Pessoa listaPessoa, Pessoa novaPessoa) {
		if (listaPessoa.proximaPessoa == null) {
			listaPessoa.adicionarPessoa(novaPessoa);
		} else {
			adicionarNovaPessoaLista(listaPessoa.proximaPessoa, novaPessoa);
		}
	}
	
	
	public void criarListaPessoas() {
		int numeroPessoas = parseintMensagem("Digite o numero de pessoas");
		for (int i = 0; i < numeroPessoas; i++) {
			this.adicionarNovaPessoaLista(new Pessoa());
		}
	}
	
	public void pesquisarPessoa() {		
		pesquisarPessoa(this, parseintMensagem("Digite o numero da pessoa a ser pesquisada"));
	}
	
	private void pesquisarPessoa(Pessoa listaPessoa,int contador) {
		if (listaPessoa!=null) {
			if (contador == 0) {
				JOptionPane.showMessageDialog(null, listaPessoa.toString());
			} else {
				pesquisarPessoa(listaPessoa.proximaPessoa, contador - 1);
			}
			
		}else {
			JOptionPane.showMessageDialog(null, "Pessoa não encontrada");
		}
		
	}
	
	public void adicionarPessoaLocal() {
		adicionarPessoaLocal(parseintMensagem("Digite em que posição adicionar a nova pessoa"));
	}
	private void adicionarPessoaLocal(int contador) {
		if (this != null) {
			if (contador == 0) {
				this.adicionarPessoa(new Pessoa());;
			} else {
				if (this.proximaPessoa == null) {
					JOptionPane.showMessageDialog(null,"Pessoa não encontrada, criando nova pessoa "+contador+" antes do indicado");
					this.adicionarPessoa(new Pessoa());
				} else {
					this.proximaPessoa.adicionarPessoaLocal(contador-1);
				}
				
			}
		}		
	}

}
