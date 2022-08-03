package de.mika.network.socket;

import java.io.Serializable;

public class LoginPacket extends DataPacket
{

    public LoginPacket(Sign sign, Serializable... serializable)
    {
        super(InternalProtocols.LOGIN.toString(), sign, serializable);
    }

}
