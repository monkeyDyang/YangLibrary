package yy.memento;

public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    /* 存储状态 */
    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    /* 获取保存的状态 */
    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
