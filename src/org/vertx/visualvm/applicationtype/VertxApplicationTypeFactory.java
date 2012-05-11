/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vertx.visualvm.applicationtype;

import com.sun.tools.visualvm.application.Application;
import com.sun.tools.visualvm.application.jvm.Jvm;
import com.sun.tools.visualvm.application.type.ApplicationType;
import com.sun.tools.visualvm.application.type.MainClassApplicationTypeFactory;

public class VertxApplicationTypeFactory extends MainClassApplicationTypeFactory {

    @Override
    public ApplicationType createApplicationTypeFor(Application app, Jvm jvm, String mainClass) {

        if ("org.vertx.java.deploy.impl.VertxBoot".equals(mainClass)) {
            return new VertxApplicationType(app.getPid());
        }
        else if ("org.vertx.java.deploy.impl.cli.VertxMgr".equals(mainClass)) {
            return new VertxApplicationType(app.getPid());
        }
        else if ("vert.x-boot.jar".equals(mainClass)) {
            return new VertxApplicationType(app.getPid());
        }
        return null;

    }
}
