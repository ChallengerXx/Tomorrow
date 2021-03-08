package com.controller.config.converter;

import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;

import java.io.IOException;
import java.lang.reflect.Type;

public class TemplateJackson2HttpMessageConverter extends MappingJackson2CborHttpMessageConverter {
    @Override
    protected void writeInternal(Object object, Type type, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        super.writeInternal(object, type, outputMessage);
    }
}
