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

package de.mika.network;

import de.mika.network.pipeline.ChannelHandler;

import java.net.InetSocketAddress;

/**
 * This is the bare type of entity, it holds the basic information about the entity.
 *
 * @author mika
 */
public interface NetworkEntity
{

    InetSocketAddress getAddress();

    boolean isClient();

    ChannelHandler getChannelHandler();


    /**
     * This method lets the server / client start up
     */
    void run();

    /**
     * This method lets the server / client shutdown
     */
    void shutdown();


    //COMING UP: void setNetworkProcessingType();

}
