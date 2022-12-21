package com.dragon.behave.responsibility;

/**
 * @date 2022/11/28 10:03
 * TODO 抽象处理者
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    //定义该领导责任区间
    private int numStart;
    private int numEnd;
    //声明上级领导
    private Handler nextHandler;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    //设置上级领导
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //处理假条
    protected abstract void handlerLeave(LeaveRequest request);

    //上交请假条
    public final void submit(LeaveRequest request){
        if(0 == request.getNum()){
            System.out.println("0天不叫假");
            return;
        }

        //自己先审批
        this.handlerLeave(request);
        //自己权限不够
        if(null != this.nextHandler && request.getNum() > this.numEnd){
            //上交领导审批
            System.out.println("  " + this.getClass() + "无权限！已上交上级领导继续审批。");
            this.nextHandler.submit(request);
        }else {
            System.out.println( "准假！");
        }
    }
}
