package com.company;

import com.company.manager.ManagerCorredors;
import com.company.manager.ManagerCorredors2;
import com.company.manager.ManagerEquips;
import com.company.model.Corredor;
import com.company.model.Equip;
import com.company.view.PantallaMenuPrincipal;

import java.io.FileReader;

public class Main2 {

    public static void main(String[] args) {

//        Equip kk = new Equip("EquipoX");
//        ManagerCorredors2.inscriureCorredor("Sergio", kk);
//        ManagerCorredors2.inscriureCorredor("Raul", kk);

        boolean corredor = ManagerCorredors2.existeixCorredor("Jose");
        System.out.println(corredor);
    }
}
