package org.jruby.ir.operands;

import org.jruby.ir.IRVisitor;
import org.jruby.ir.transformations.inlining.CloneInfo;

import java.util.List;

// Represents the StandardError object -- this operand used in rescue blocks
// for when the rescue block doesn't specify an exception object class
public class StandardError extends Operand {
    public StandardError() {
        super();
    }

    @Override
    public OperandType getOperandType() {
        return OperandType.STANDARD_ERROR;
    }

    @Override
    public String toString() {
        return "StandardError";
    }

    @Override
    public void addUsedVariables(List<Variable> l) {
        /* Nothing to do */
    }

    @Override
    public Operand cloneForInlining(CloneInfo ii) {
        return this;
    }

    @Override
    public void visit(IRVisitor visitor) {
        visitor.StandardError(this);
    }
}
