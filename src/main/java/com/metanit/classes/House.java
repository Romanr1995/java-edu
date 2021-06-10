package com.metanit.classes;

public class House {
    String type;
    float square;
    String wallMaterial;
    int price;

    House(String type_,
          float square_,
          String wallMaterial_,
          int price_) {

        type = type_;
        square = square_;
        wallMaterial = wallMaterial_;
        price = price_;
    }
}
