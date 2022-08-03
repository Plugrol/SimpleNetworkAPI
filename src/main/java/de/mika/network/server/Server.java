/*
 * Copyright 2022 Mika & Groldi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.mika.network.server;

import de.mika.network.NetworkEntity;
import de.mika.network.socket.DataPacket;

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
