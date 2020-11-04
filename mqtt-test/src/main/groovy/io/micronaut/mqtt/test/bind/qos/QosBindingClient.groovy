/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.mqtt.test.bind.qos

import io.micronaut.mqtt.annotation.Qos
import io.micronaut.mqtt.annotation.Topic

@Topic("test/qos")
@Qos(0)
interface QosBindingClient {

    void argument(@Qos int qos)

    @Qos(2)
    void override()

    void classLevel()
}
