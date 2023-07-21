package example.SpringCore.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;

@Controller("bigDecimalService")
public class BigDecimalService {

	@Autowired
	private ConversionService conversionService;

	public BigDecimal getBigDecimal(Object number) {
		return conversionService.convert(number, BigDecimal.class);
	}
	
}