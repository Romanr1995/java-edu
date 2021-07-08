package com.metanit;

import com.metanit.zadaniya.ElectronicsShop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElectronicsShopTest {

    @Test
    void первыйСлучай() {
        int b = 10;
        int[] n = {3,1};
        int[] m = {5,2,8};

        assertEquals(9, ElectronicsShop.choosingElectronics(b,n,m));
    }

    @Test
    void второйСлучай() {
        int b = 60;
        int[] n = {40,50,60};
        int[] m = {5,8,12};

        assertEquals(58, ElectronicsShop.choosingElectronics(b,n,m));
    }

    @Test
    void случайКогдаБюджетаНетДажеДляМинимальнойПокупки() {
        int b = 5;
        int[] n = {4};
        int[] m = {5};

        assertEquals(-1, ElectronicsShop.choosingElectronics(b,n,m));
    }

    @Test
    void случайКогдаПокупкаРавнаБюджету() {
        int b = 20;
        int[] n = {23,15,6};
        int[] m = {5,2,10};

        assertEquals(20, ElectronicsShop.choosingElectronics(b,n,m));
    }
}
