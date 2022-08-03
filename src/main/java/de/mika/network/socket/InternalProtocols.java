package de.mika.network.socket;

public enum InternalProtocols
{
    LOGIN,
    RESPONSE;

    @Override
    public String toString() {
        return "__" + name() + "__";
    }
}
