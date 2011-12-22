/* This file was generated by SableCC (http://www.sablecc.org/). */

package com.google.clearsilver.jsilver.syntax.node;

import com.google.clearsilver.jsilver.syntax.analysis.*;

@SuppressWarnings("nls")
public final class AHexNumberVariable extends PVariable
{
    private THexNumber _hexNumber_;

    public AHexNumberVariable()
    {
        // Constructor
    }

    public AHexNumberVariable(
        @SuppressWarnings("hiding") THexNumber _hexNumber_)
    {
        // Constructor
        setHexNumber(_hexNumber_);

    }

    @Override
    public Object clone()
    {
        return new AHexNumberVariable(
            cloneNode(this._hexNumber_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAHexNumberVariable(this);
    }

    public THexNumber getHexNumber()
    {
        return this._hexNumber_;
    }

    public void setHexNumber(THexNumber node)
    {
        if(this._hexNumber_ != null)
        {
            this._hexNumber_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._hexNumber_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._hexNumber_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._hexNumber_ == child)
        {
            this._hexNumber_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._hexNumber_ == oldChild)
        {
            setHexNumber((THexNumber) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
