package de.mika.network.client;

import de.mika.network.socket.DataPacket;
import de.mika.network.socket.LoginPacket;
import de.mika.network.NetworkEntity;

public abstract class Client implements NetworkEntity
{
    @Override public final boolean isClient()
    {
        return true;
    }

    abstract void login(LoginPacket loginPacket) throws RejectLoginException;

    /**
     * The method sends a packet to all clients
     *
     * @param dataPacket can set any serializable data type
     */
    abstract void sendPacket(DataPacket dataPacket);

    abstract boolean isConnected();
}
