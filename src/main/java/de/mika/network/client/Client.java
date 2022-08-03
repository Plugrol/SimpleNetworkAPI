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

package de.mika.network.client;

import de.mika.network.NetworkEntity;
import de.mika.network.socket.DataPacket;
import de.mika.network.socket.LoginPacket;

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
