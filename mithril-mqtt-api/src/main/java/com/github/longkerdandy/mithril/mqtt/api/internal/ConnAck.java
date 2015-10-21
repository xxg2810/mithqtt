package com.github.longkerdandy.mithril.mqtt.api.internal;

import io.netty.handler.codec.mqtt.MqttConnectReturnCode;

/**
 * Represent MQTT CONNACK Message's VariableHeader
 */
@SuppressWarnings("unused")
public class ConnAck {

    private MqttConnectReturnCode returnCode;
    private boolean sessionPresent;

    protected ConnAck() {
    }

    public ConnAck(MqttConnectReturnCode returnCode, boolean sessionPresent) {
        this.returnCode = returnCode;
        this.sessionPresent = sessionPresent;
    }

    public MqttConnectReturnCode getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(MqttConnectReturnCode returnCode) {
        this.returnCode = returnCode;
    }

    public boolean isSessionPresent() {
        return sessionPresent;
    }

    public void setSessionPresent(boolean sessionPresent) {
        this.sessionPresent = sessionPresent;
    }
}