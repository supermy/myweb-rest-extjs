package com.supermy.rest.util.extjs;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JSON 反序列化日期格式采用 ISO format, like 2010-07-01T15:30:00.
 */
public class ExtDateDeserializer extends JsonDeserializer<Date> {

    private final Logger logger = LoggerFactory.getLogger(ExtDateSerializer.class);

    // the date format to use
    private final static String FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    //private final static String FORMAT = "yyyy-MM-dd";

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

        String val = jsonParser.getText();

        DateFormat formatter = new SimpleDateFormat(FORMAT);
        Date date = null;
        try {
            date = formatter.parse(val);

        } catch(ParseException pex) {
            logger.error("Failed to parse date " + val, pex);
        }

        return date;
    }
}
