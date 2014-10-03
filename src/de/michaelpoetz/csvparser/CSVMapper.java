package de.michaelpoetz.csvparser;

import org.apache.commons.csv.CSVRecord;

import com.google.common.base.Function;

class CSVMapper implements Function<CSVRecord, MappedCSVRecord> {

	@Override
	public MappedCSVRecord apply(CSVRecord t) {
		try {
			checkConsistency(t);
		} catch (final CSVParsingException e) {
			e.printMessage();
			return new MappedCSVRecord();
		}
		final MappedCSVRecord mapped = new MappedCSVRecord();
		mapped.setName(t.get("name"));
		mapped.setAddress(t.get("address"));
		mapped.setAge(Integer.parseInt(t.get("age")));
		return mapped;
	}

	private void checkConsistency(CSVRecord record) throws CSVParsingException {
		if (!record.isConsistent()) {
			throw new CSVParsingException("Record " + record.getRecordNumber() + " does not match the given header.");
		}
	}
}