/*
 * Copyright 2014 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.netty.handler.codec.mqtt;

import io.netty.util.internal.StringUtil;

/**
 * Contains a topic name and Qos Level.
 * This is part of the {@link MqttSubscribePayload}
 */
public class MqttTopicSubscription {

    protected String topic;
    protected MqttQoS requestedQos;

    private MqttTopicSubscription() {
    }

    public MqttTopicSubscription(String topic, MqttQoS requestedQos) {
        this.topic = topic;
        this.requestedQos = requestedQos;
    }

    public String topic() {
        return topic;
    }

    public MqttQoS requestedQos() {
        return requestedQos;
    }

    @Override
    public String toString() {
        return StringUtil.simpleClassName(this)
                + '['
                + "topic=" + topic
                + ", requestedQos=" + requestedQos
                + ']';
    }
}
