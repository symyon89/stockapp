package com.stockapp.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@Data
@XmlRootElement(name="Stoc")
public class ProduseDto implements Serializable {
    @XmlElement(name="id_produs")
    private Integer id;
    private String numeProdus;
    private Integer stoc;
}
