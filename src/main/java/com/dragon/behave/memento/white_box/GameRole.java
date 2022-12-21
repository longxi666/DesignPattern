package com.dragon.behave.memento.white_box;

/**
 * @date 2022/12/4 16:48
 * TODO 发起人角色 -- 游戏角色
 */
public class GameRole {
    private int vit;
    private int atk;
    private int def;

    //初始化状态方法
    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }
    //战斗
    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }
    //存档
    public RoleStateMemento save(){
        return new RoleStateMemento(vit,atk,def);
    }
    //读档
    public void reload(RoleStateMemento save){
        this.vit = save.getVit();
        this.atk = save.getAtk();
        this.def = save.getDef();
    }
    //查看状态
    public void showStatus(){
        System.out.println("角色vit:"+vit+" 角色atk："+atk+" 角色def:"+def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

}
