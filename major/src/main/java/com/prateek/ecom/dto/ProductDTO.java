package com.prateek.ecom.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private long id;

    private int categoryId;

    private String name;

    private double price;

    private double weight;

    private String description;

    private String imageName;
}
