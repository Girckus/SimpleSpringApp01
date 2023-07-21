package example.SpringCore.converter;

import org.springframework.core.convert.converter.Converter;

import example.SpringCore.beans.impl.Employee;

/**
 * @see <a href="https://www.baeldung.com/spring-type-conversions">Guide to Spring Type Conversions</a>
 */
public class EmployeeConverter implements Converter<String, Employee> {

	@Override
    public Employee convert(String from) {
        String[] data = from.split(",");
        
        long id = Long.parseLong(data[0]);
        double salary = Double.parseDouble(data[1]);
        
        return new Employee(id, salary);
    }
}