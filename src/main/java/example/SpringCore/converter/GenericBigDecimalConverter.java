package example.SpringCore.converter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;

import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.converter.GenericConverter;

/**
 * @see <a href="https://www.baeldung.com/spring-type-conversions">Guide to Spring Type Conversions</a>
 */
public class GenericBigDecimalConverter implements GenericConverter {

	@Override
	public Set<ConvertiblePair> getConvertibleTypes () {
	   	ConvertiblePair[] pairs = new ConvertiblePair[] {new ConvertiblePair(Number.class, BigDecimal.class), new ConvertiblePair(String.class, BigDecimal.class)};
	   	return Set.of(pairs);
	}
	
	@Override
	public Object convert (Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {

	    if (sourceType.getType() == BigDecimal.class) {
	        return source;
	    }

	    if(sourceType.getType() == String.class) {
	        String number = (String) source;
	        return new BigDecimal(number);
	    } else {
	        Number number = (Number) source;
	        BigDecimal converted = new BigDecimal(number.doubleValue());
	        return converted.setScale(2, RoundingMode.HALF_EVEN);
	    }
	}
	
}