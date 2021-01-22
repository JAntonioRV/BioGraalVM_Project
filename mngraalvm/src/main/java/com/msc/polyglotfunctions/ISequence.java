package com.msc.polyglotfunctions;

import io.micronaut.core.annotation.Introspected;
import org.graalvm.polyglot.Value;

@Introspected
public interface ISequence {

	/**
	 * 
	 * @param sequence
	 */
	String run(String sequence);

	/**
	 *
	 * @param sequence
	 */
	Object run_object(String sequence);
}