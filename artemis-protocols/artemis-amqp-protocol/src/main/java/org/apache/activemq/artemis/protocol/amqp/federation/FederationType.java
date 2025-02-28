/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.artemis.protocol.amqp.federation;

/**
 * Enumeration that define the type of federation a policy or resource implements.
 */
public enum FederationType {

   /**
    * Indicates a resource that is handling Address federation
    */
   ADDRESS_FEDERATION("address-federation"),

   /**
    * Indicates a resource that is handling Queue federation
    */
   QUEUE_FEDERATION("queue-federation");

   private final String typeName;

   FederationType(String typeName) {
      this.typeName = typeName;
   }

   @Override
   public String toString() {
      return typeName;
   }
}
