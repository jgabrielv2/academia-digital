package me.dio.academiadigital.infra.jackson.deserializer;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import me.dio.academiadigital.infra.utils.JavaTimeUtils;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

	/**
	 * 
	 */
	@java.io.Serial
	private static final long serialVersionUID = -998157921194142040L;

	public LocalDateDeserializer() {
		super(LocalDate.class);
	}

	@Override
	public LocalDate deserialize(final JsonParser parser, final DeserializationContext context) throws IOException {
		return LocalDate.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_FORMATTER);
	}

}
