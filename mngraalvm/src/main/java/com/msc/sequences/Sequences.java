package com.msc.sequences;

import com.msc.polyglotfunctions.*;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class Sequences {

	private static Complement pfcomplement = new Complement();
	private static ReverseComplement pfreversecomplement = new ReverseComplement();

	private Sequences() {}

	/**
	 * 
	 * @param sequence
	 */
	public static String complement(String sequence) {
		return pfcomplement.run(sequence);
	}

	/**
	 * 
	 * @param sequence
	 */
	public static String reverse_complement(String sequence) {
		// TODO - implement Sequences.reverse_complement
		throw new UnsupportedOperationException();
	}
}