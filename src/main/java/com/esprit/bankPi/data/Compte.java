package com.esprit.bankPi.data;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.esprit.bankPi.enums.CompteType;
import com.esprit.bankPi.enums.Currency;

//JPA Annotations
@Table(name = "data_Compte")
@javax.persistence.Entity(name = "data_Compte")
public class Compte {

	private Long numeroCompte;
	private Float solde;
	private Currency currency;
	private CompteType type;
	private CheckBook checkBook;
	private List<BankCarte> bankCartes;
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@javax.persistence.Column(name = "numeroCompte_", unique = true, nullable = false, insertable = true, updatable = false)
	public Long getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(Long numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	
	@javax.persistence.Column(name = "solde_", unique = false, nullable = false, insertable = true, updatable = true)
	public Float getSolde() {
		return solde;
	}
	public void setSolde(Float solde) {
		this.solde = solde;
	}
	
	@javax.persistence.Column(name = "currency_", unique = false, nullable = false, insertable = true, updatable = true)
	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	@javax.persistence.Column(name = "type_", unique = false, nullable = false, insertable = true, updatable = false)
	public CompteType getType() {
		return type;
	}

	public void setType(CompteType type) {
		this.type = type;
	}
	
	@OneToOne(fetch = FetchType.LAZY, optional = true, mappedBy = "compteId")
	@javax.persistence.Column(name = "checkBook_", unique = false, nullable = true, insertable = true, updatable = true)
	public CheckBook getCheckBook() {
		return checkBook;
	}

	public void setCheckBook(CheckBook checkBook) {
		this.checkBook = checkBook;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compteId")
	@javax.persistence.Column(name = "bankCartes_", unique = false, nullable = true, insertable = true, updatable = true)
	public List<BankCarte> getBankCarte() {
		return bankCartes;
	}

	public void setBankCarte(List<BankCarte> bankCartes) {
		this.bankCartes = bankCartes;
	}


	
}
