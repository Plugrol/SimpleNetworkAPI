package de.mika.network.server;

import de.mika.network.socket.DataPacket;
import de.mika.network.NetworkEntity;

public abstract class Server implements NetworkEntity
{

    @Override public final boolean isClient()
    {
        return false;
    }

    /**
     * Manages the period in which it is checked whether the connection is still alive.
     *
     * @param interval interval is the number of the period, this is worked in milliseconds
     */
    abstract void setInterval(int interval);

    /**
     * This method sets whether further connections are accepted
     *
     * @param authorization sets whether connections are accepted
     */
    abstract void setIgnoreConnections(boolean authorization);

    /**
     * This method sets whether further packets are accepted
     *
     * @param authorization sets whether packets are accepted
     */
    abstract void setIgnorePackets(boolean authorization);

    /**
     * The method sends a packet to a specified client.
     *
     * @param clientId specifies the client to which the packet is sent
     * @param packet can set any serializable data type
     */
    abstract void sendPacket(String clientId, DataPacket packet);

    /**
     * The method sends a packet to a specified group.
     *
     * @param group specifies the group to which the packet is sent
     * @param packet can set any serializable data type
     */
    abstract void broadcastPacket(String group, DataPacket packet);

    /**
     * The method sends a packet to all clients
     *
     * @param dataPacket can set any serializable data type
     */
    abstract void broadcastPacket(DataPacket dataPacket);
}
