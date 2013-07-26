/* Copyright (c) 2007-2013 Amazon.com, Inc.  All rights reserved. */

package com.amazon.ion;

/**
 * Common functionality of Ion <code>string</code> and <code>symbol</code>
 * types.
 */
public interface IonText
    extends IonValue
{
    /**
     * Gets the characters of this text value.
     *
     * @return the text of this Ion value, or <code>null</code> if
     * <code>this.isNullValue()</code>.
     *
     * @throws UnknownSymbolException if this is a symbol with unknown text.
     *
     * @see IonSymbol#symbolValue()
     */
    public String stringValue();

    /**
     * Changes the content.
     *
     * @param value the new value of this text value;
     * may be <code>null</code> to make this an Ion null value.
     *
     * @throws EmptySymbolException if this is an {@link IonSymbol} and
     * <code>value</code> is the empty string.
     */
    public void setValue(String value)
        throws EmptySymbolException;

    public IonText clone()
        throws UnknownSymbolException;
}
