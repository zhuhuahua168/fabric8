/**
 *  Copyright 2005-2015 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package io.fabric8.gateway.handlers.detecting.protocol.openwire.command;

/**
 * The Command Pattern so that we can send and receive commands on the different
 * transports
 * 
 * @version $Revision: 1.7 $
 */
public interface Command extends DataStructure {

    void setCommandId(int value);

    /**
     * @return the unique ID of this request used to map responses to requests
     */
    int getCommandId();

    void setResponseRequired(boolean responseRequired);

    boolean isResponseRequired();

    boolean isResponse();

    boolean isMessageDispatch();

    boolean isBrokerInfo();

    boolean isWireFormatInfo();

    boolean isMessage();

    boolean isMessageAck();

    boolean isMessageDispatchNotification();

    boolean isShutdownInfo();

}