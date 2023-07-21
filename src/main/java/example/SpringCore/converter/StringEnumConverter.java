package example.SpringCore.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

/**
 * @see <a href="https://www.baeldung.com/spring-type-conversions">Guide to Spring Type Conversions</a>
 */
@SuppressWarnings("rawtypes")
public class StringEnumConverter implements ConverterFactory<String, Enum> {

	private static class StringToEnumConverter<T extends Enum> implements Converter<String, T> {

      private Class<T> enumType;

      public StringToEnumConverter(Class<T> enumType) {
          this.enumType = enumType;
      }

      @SuppressWarnings("unchecked")
      public T convert(String source) {
          return (T) Enum.valueOf(this.enumType, source.trim());
      }
  }

  @Override
  public <T extends Enum> Converter<String, T> getConverter(Class<T> targetType) {
      return new StringToEnumConverter<T>(targetType);
  }
  
}