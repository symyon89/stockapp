package com.stockapp.dto;

import com.stockapp.model.StatusComanda;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ComenziDto implements Serializable {
    private Integer id;
    private List<ProduseDto> produse;
    private StatusComanda statusComanda;
}
