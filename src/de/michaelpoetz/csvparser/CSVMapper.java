package de.michaelpoetz.csvparser;

import org.apache.commons.csv.CSVRecord;

import com.google.common.base.Function;

class CSVMapper implements Function<CSVRecord, MappedCSVRecord> {

	@Override
	public MappedCSVRecord apply(CSVRecord t) {
		final MappedCSVRecord mapped = new MappedCSVRecord();
		mapped.setName(t.get(0));
		mapped.setAddress(t.get(1));
		mapped.setAge(Integer.parseInt(t.get(2)));
		return mapped;
	}
}