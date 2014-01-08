/**
 * 
 */
package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

/**
 * @author Leonardo
 *
 */
@SuppressWarnings("serial")
@Entity
public abstract class Funcionario extends Model {

	@Id
	@Required
	private String CPF;
	private String RG;
	private char sexo;
	private Date dataNascimento;
	private String endereco;
	private ArrayList<String> telefone;
	private String email;
	
	public Funcionario(String nome, String email, String endereco, ArrayList<String> telefones, String CPF, String RG, char sexo, Date dataN) {
		this.CPF = CPF;
		this.RG = RG;
		this.sexo = sexo;
		this.dataNascimento = dataN;
		this.endereco = endereco;
		this.telefone = telefones;
		this.email = email;
	}
	
	/**
	 * @return the cPF
	 */
	public String getCPF() {
		return CPF;
	}
	/**
	 * @param cPF the cPF to set
	 */
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	/**
	 * @return the rG
	 */
	public String getRG() {
		return RG;
	}
	/**
	 * @param rG the rG to set
	 */
	public void setRG(String rG) {
		RG = rG;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<String> getTelefone() {
		return telefone;
	}

	public void setTelefone(ArrayList<String> telefones) {
		this.telefone = telefones;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
