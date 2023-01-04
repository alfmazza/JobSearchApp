package com.alpi.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

public interface APIFunctions {


    static <T> T buildAPI(Class<T> clazz, String domain, String path) {
            String url = String.format("%s/%s", domain, path);
            return Feign.builder()
                    .decoder(new GsonDecoder())
                    .encoder(new GsonEncoder()) //verificar
                    .target(clazz, url);
        }
}
