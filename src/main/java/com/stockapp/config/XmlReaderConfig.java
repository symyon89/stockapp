package com.stockapp.config;


import com.stockapp.dto.ProduseListDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileReader;
import java.io.IOException;

@Configuration
public class XmlReaderConfig {
    @Bean
        public ProduseListDto unmarshall() throws JAXBException, IOException {
            JAXBContext context = JAXBContext.newInstance(ProduseListDto.class);
            return (ProduseListDto) context.createUnmarshaller()
                    .unmarshal(new FileReader("STOCURI_NOI/stocuri_noi.xml"));
    }
}
