package com.dragon.behave.mediator;

import sun.awt.SubRegionShowable;

/**
 * @date 2022/12/1 14:23
 */
public class Client {
    public static void main(String[] args) {

        MediatorStructure mediatorStructure = new MediatorStructure();
        HouseOwner houseOwner1 = new HouseOwner("Dragon" ,mediatorStructure);
        Tenant tenant1 = new Tenant("Wish", mediatorStructure);

        mediatorStructure.setHouseOwner(houseOwner1);
        mediatorStructure.setTenant(tenant1);

        tenant1.contact("I need a big house.");

        houseOwner1.contact("I have a choice for you!");
    }
}
