package com.company;

import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Diesel VW = new Diesel("VW", "Passat", 2020, "Silver");
        Electric tesla = new Electric("Tesla", "X", 2020, "Silver");
        LPG Dacia = new LPG("Dacia", "Sandero", 2021, "Silver");
        Phone iphone = new Phone("Apple", "ios", 2020, 5.3, 8);
        iphone.installAnApp("gmail");
        iphone.installAnApp("facebook", "v1.01");
        System.out.println("-----------------------------------------------------------");
        List<String> apps = new ArrayList<>();
        apps.add("RiseOfKingdoms");
        apps.add("FarmSimulator");
        apps.add("NeedForSpeed");
        iphone.installAnApp(apps);
        System.out.println("-----------------------------------------------------------");
        System.out.println(VW.oil);
        VW.Refuel();
        System.out.println(VW.oil);
        System.out.println("--------------------------------");
        System.out.println(tesla.capacitance);
        tesla.Refuel();
        System.out.println(tesla.capacitance);
        System.out.println("--------------------------------");
        System.out.println(Dacia.gas);
        Dacia.Refuel();
        System.out.println(Dacia.gas);
    }
}