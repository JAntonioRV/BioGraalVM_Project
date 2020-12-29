package com.msc.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.micronaut.core.annotation.Introspected;

import javax.inject.Singleton;
import java.io.Serializable;

@Introspected
@JsonAutoDetect
@Singleton
public class Result implements Serializable {

	@JsonProperty
	private String result;
	@JsonProperty
	private String error;
	@JsonProperty
	private boolean ok;

	public Result() {
		this.result = "";
		this.error = "";
		this.ok = false;
	}

	@JsonProperty
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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