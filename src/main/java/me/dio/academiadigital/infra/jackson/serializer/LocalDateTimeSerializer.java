/**
 * 
 */
package me.dio.academiadigital.infra.jackson.serializer;

import java.io.IOException;
import java.time.LocalDateTime;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import me.dio.academiadigital.infra.utils.JavaTimeUtils;

/**
 * @author jgabr
 *
 */
public class LocalDateTimeSerializer extends StdSerializer<LocalDateTime> {

	/**
	 * 
	 */
	@java.io.Serial
	private static final long serialVersionUID = -3370846247109646310L;

	public LocalDateTimeSerializer() {
		super(LocalDateTime.class);
	}

	@Override
	public void serialize(final LocalDateTime value, final JsonGenerator generator, final SerializerProvider provider)
			throws IOException {
		generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_TIME_FORMATTER));
	}

}
