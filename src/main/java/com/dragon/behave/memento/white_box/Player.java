package com.dragon.behave.memento.white_box;

/**
 * @date 2022/12/4 16:58
 */
public class Player {
    public static void main(String[] args) {
        System.out.println("打BOSS前：");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.showStatus();
        //存档
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(gameRole.save());

        gameRole.fight();
        System.out.println("打不过BOSS：");
        gameRole.showStatus();

        System.out.println("退档重打");
        RoleStateMemento roleStateMemento = caretaker.getRoleStateMemento();
        gameRole.reload(roleStateMemento);
        gameRole.showStatus();

    }
}
