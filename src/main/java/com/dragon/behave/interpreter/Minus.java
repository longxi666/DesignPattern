package com.dragon.behave.interpreter;

/**
 * @date 2022/12/12 11:42
 * TODO 减法表达式类
 */
public class Minus extends AbstractExpression{

    //左边的表达式
    private AbstractExpression left;

    //右边的表达式
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {

        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "Minus{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
