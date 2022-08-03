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

import java.net.Socket;

public class ClientNotValidException extends NullPointerException
{
    private final Socket SOCKET;

    public ClientNotValidException(Socket socket)
    {
        this.SOCKET = socket;
    }

    public Socket getSocket() {
        return SOCKET;
    }
}
