package models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import play.db.ebean.Model;

@Entity
public class Animal extends Model {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	private String raca;
	private Double peso;
//	private String sexo;
//	private Integer idade;
	private String especie;
//	private String pelagem;
//	private Date dataNascimento;
	private String CPF_proprietario;
	
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the raca
	 */
	public String getRaca() {
		return raca;
	}
	/**
	 * @param raca the raca to set
	 */
	public void setRaca(String raca) {
		this.raca = raca;
	}
	/**
	 * @return the peso
	 */
	public Double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(Double peso) {
		this.peso = peso;
	}
//	/**
//	 * @return the sexo
//	 */
//	public String getSexo() {
//		return sexo;
//	}
//	/**
//	 * @param sexo the sexo to set
//	 */
//	public void setSexo(String sexo) {
//		this.sexo = sexo;
//	}
//	/**
//	 * @return the idade
//	 */
//	public Integer getIdade() {
//		return idade;
//	}
//	/**
//	 * @param idade the idade to set
//	 */
//	public void setIdade(Integer idade) {
//		this.idade = idade;
//	}
	/**
	 * @return the especie
	 */
	public String getEspecie() {
		return especie;
	}
	/**
	 * @param especie the especie to set
	 */
	public void setEspecie(String especie) {
		this.especie = especie;
	}
//	/**
//	 * @return the pelagem
//	 */
//	public String getPelagem() {
//		return pelagem;
//	}
//	/**
//	 * @param pelagem the pelagem to set
//	 */
//	public void setPelagem(String pelagem) {
//		this.pelagem = pelagem;
//	}
//	/**
//	 * @return the dataNascimento
//	 */
//	public Date getDataNascimento() {
//		return dataNascimento;
//	}
//	/**
//	 * @param dataNascimento the dataNascimento to set
//	 */
//	public void setDataNascimento(Date dataNascimento) {
//		this.dataNascimento = dataNascimento;
//	}
	/**
	 * @return the cPF_proprietario
	 */
	public String getCPF_proprietario() {
		return CPF_proprietario;
	}
	/**
	 * @param cPF_proprietario the cPF_proprietario to set
	 */
	public void setCPF_proprietario(String cPF_proprietario) {
		CPF_proprietario = cPF_proprietario;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
