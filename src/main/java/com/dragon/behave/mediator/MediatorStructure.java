package com.dragon.behave.mediator;

/**
 * @date 2022/12/1 14:21
 * TODO 具体中介者类
 */
public class MediatorStructure extends Mediator{

    private Tenant tenant;
    private HouseOwner houseOwner;

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    @Override
    public void contact(String msg, Person person) {
        if(person == houseOwner){
            tenant.getMsg(msg);
        }
        if(person == tenant){
            houseOwner.getMsg(msg);
        }
    }
}
