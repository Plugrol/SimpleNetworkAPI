package de.mika.network.socket;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class DataPacket extends ArrayList<Serializable>
{

    @Getter private final String ID;
    private final Sign SIGN;
    @Getter @Setter
    private boolean reply;

    public DataPacket(String id, Sign sign, Serializable... content)
    {
        this.ID = id;
        this.SIGN = sign;
        this.reply = true;
        this.addAll(Arrays.asList(content));
    }

    public Sign getSign()
    {
        return SIGN;
    }
}
