package com.msc.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

import javax.inject.Singleton;
import java.io.Serializable;

@Introspected
@JsonAutoDetect
@Singleton
public class ResultSequence implements Serializable {

	@JsonProperty
	private String complement;
	@JsonProperty
	private String reversecomplement;
	@JsonProperty
	private String error;
	@JsonProperty
	private boolean ok;

	public ResultSequence() {
		this.complement = "";
		this.reversecomplement = "";
		this.error = "";
		this.ok = false;
	}

	@JsonProperty
	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	@JsonProperty
	public String getReversecomplement() {
		return reversecomplement;
	}

	public void setReversecomplement(String reversecomplement) {
		this.reversecomplement = reversecomplement;
	}

	@JsonProperty
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@JsonProperty
	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}
}