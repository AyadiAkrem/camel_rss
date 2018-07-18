package be.cetic.rssfeed.router;

import org.apache.camel.Exchange;
import org.apache.camel.TypeConverter;

/**
 *
 * @author EXG503
 */
public class RSSTypeConvertor implements TypeConverter {

    @SuppressWarnings("unchecked")
    public <T> T convertTo(Class<T> type, Object value) {
        // converter from value to the MyOrder bean
        MyPOJO order = new MyPOJO(String.valueOf(value));
        return (T) order;
    }

    public <T> T convertTo(Class<T> type, Exchange exchange, Object value) {
        // this method with the Exchange parameter will be preferred by Camel to invoke
        // this allows you to fetch information from the exchange during conversions
        // such as an encoding parameter or the likes
        return convertTo(type, value);
    }

    public <T> T mandatoryConvertTo(Class<T> type, Object value) {
        return convertTo(type, value);
    }

    public <T> T mandatoryConvertTo(Class<T> type, Exchange exchange, Object value) {
        return convertTo(type, value);
    }

    @Override
    public boolean allowNull() {
        return false;
    }

    @Override
    public <T> T tryConvertTo(Class<T> type, Object value) {
        return convertTo(type, value);
    }

    @Override
    public <T> T tryConvertTo(Class<T> type, Exchange exchange, Object value) {
        return convertTo(type, value);
    }
}
