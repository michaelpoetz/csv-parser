package de.michaelpoetz.csvparser;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import com.google.common.collect.Collections2;

public class CSVParseTest {

	public CSVParseTest(String filename) throws IOException {
		final File file = new File(filename);
		final CSVFormat format = CSVFormat.newFormat('|');
		final Charset charset = Charset.defaultCharset();
		final CSVParser parser = CSVParser.parse(file, charset, format);
		final CSVMapper mapRecord = new CSVMapper();
		final Collection<MappedCSVRecord> records = Collections2.transform(parser.getRecords(), mapRecord);
		for (final MappedCSVRecord record : records) {
			System.out.println(record.toString());
		}
	}

	public static void main(String[] args) throws IOException {
		new CSVParseTest("csvfile");
	}

}
