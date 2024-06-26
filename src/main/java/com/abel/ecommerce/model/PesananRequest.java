package com.abel.ecommerce.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class PesananRequest {
    private BigDecimal ongkir;
    private String alamatPengirim;
    private List<KeranjangRequest> items;
}
