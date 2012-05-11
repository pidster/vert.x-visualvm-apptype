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

import com.sun.tools.visualvm.application.type.ApplicationType;
import java.awt.Image;
import org.openide.util.ImageUtilities;

public class VertxApplicationType extends ApplicationType {

    protected final int appPID;

    public VertxApplicationType(int pid) {
        appPID = pid;
    }

    @Override
    public String getName() {
        return "vert.x";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String getDescription() {
        return "Application type for vert.x";
    }

    @Override
    public Image getIcon() {
        return ImageUtilities.loadImage("org/vertx/visualvm/applicationtype/vert.x-basic.png", true);
    }
}
