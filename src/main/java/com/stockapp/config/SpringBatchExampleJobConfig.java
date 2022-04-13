package com.stockapp.config;


import com.stockapp.dto.ComenziDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SpringBatchExampleJobConfig {

    @Bean
    public ItemReader<ComenziDto> itemReader() {
        Jaxb2Marshaller stocMarshaller = new Jaxb2Marshaller();
        stocMarshaller.setClassesToBeBound(ComenziDto.class);

        return new StaxEventItemReaderBuilder<ComenziDto>()
                .name("studentReader")
                .resource(new ClassPathResource("STOCURI_NOI/stocuri_noi.xml"))
                .addFragmentRootElements("Stoc")
                .unmarshaller(stocMarshaller)
                .build();
    }
}
