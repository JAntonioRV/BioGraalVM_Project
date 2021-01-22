package com.msc.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;
import javax.inject.Singleton;

@Introspected
@JsonAutoDetect
@Singleton
public class Transcription {

	@JsonProperty
	private String rna;
	@JsonProperty
	private int codonproteinlen;
	@JsonProperty
	private String[] codons;
	@JsonProperty
	private String[] proteins;

	public Transcription() {
		this.rna = "";
		this.codonproteinlen = 0;
		this.codons = new String[0];
		this.proteins = new String[0];
	}

	@JsonProperty
	public String getRna() {
		return rna;
	}

	public void setRna(String rna) {
		this.rna = rna;
	}

	@JsonProperty
	public int getCodonproteinlen() {
		return codonproteinlen;
	}

	public void setCodonproteinlen(int codonproteinlen) {
		this.codonproteinlen = codonproteinlen;
	}

	@JsonProperty
	public String[] getCodons() {
		return codons;
	}

	public void setCodons(String[] codons) {
		this.codons = codons;
	}

	@JsonProperty
	public String[] getProteins() {
		return proteins;
	}

	public void setProteins(String[] proteins) {
		this.proteins = proteins;
	}
}