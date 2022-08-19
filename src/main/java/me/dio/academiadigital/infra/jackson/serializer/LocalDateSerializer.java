/**
 * 
 */
package me.dio.academiadigital.infra.jackson.serializer;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import me.dio.academiadigital.infra.utils.JavaTimeUtils;

/**
 * @author jgabr
 *
 */
public class LocalDateSerializer extends StdSerializer<LocalDate> {

	/**
	 * 
	 */
	@java.io.Serial
	private static final long serialVersionUID = -6092410886863631729L;

	public LocalDateSerializer() {
		super(LocalDate.class);
	}

	@Override
	public void serialize(final LocalDate value, final JsonGenerator generator, final SerializerProvider provider)
			throws IOException {
		generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_FORMATTER));
	}

}
