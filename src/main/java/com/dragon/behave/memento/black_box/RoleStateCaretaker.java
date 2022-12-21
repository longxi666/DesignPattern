package com.dragon.behave.memento.black_box;

/**
 * @date 2022/12/4 16:57
 * TODO 备忘录对象管理角色
 */
public class RoleStateCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento Memento) {
        this.memento = Memento;
    }
}
