package me.dio.academiadigital.infra.jackson.deserializer;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import me.dio.academiadigital.infra.utils.JavaTimeUtils;

public class LocalDateTimeDeserializer extends StdDeserializer<LocalDateTime> {

	/**
	 * 
	 */
	@java.io.Serial
	private static final long serialVersionUID = -1407475380177571533L;

	public LocalDateTimeDeserializer() {
		super(LocalDateTime.class);
	}

	@Override
	public LocalDateTime deserialize(final JsonParser parser, final DeserializationContext context) throws IOException {
		return LocalDateTime.parse(parser.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER);
	}

}
