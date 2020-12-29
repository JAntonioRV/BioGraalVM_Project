package com.msc.polyglotfunctions;

import io.micronaut.core.annotation.Introspected;

@Introspected
public interface ISequence {

	/**
	 * 
	 * @param sequence
	 */
	String run(String sequence);

}