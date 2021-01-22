package com.msc.sequences;

import com.msc.polyglotfunctions.*;
import io.micronaut.core.annotation.Introspected;

@Introspected
public class Sequences {

	private static Complement pfcomplement = new Complement();
	private static ReverseComplement pfreversecomplement = new ReverseComplement();
	private static Transcription pftranscription = new Transcription();

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
		return pfreversecomplement.run(sequence);
	}

	/**
	 *
	 * @param sequence
	 */
	public static com.msc.model.Transcription transcription(String sequence) {
		return (com.msc.model.Transcription)pftranscription.run_object(sequence);
	}
}