/*
 * Copyright 2014 Red Hat Inc. and/or its affiliates and other contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.switchyard.component.common.knowledge.config.manifest;

import org.kie.api.runtime.Environment;
import org.kie.services.client.api.command.RemoteConfiguration;
import org.switchyard.component.common.knowledge.config.builder.RemoteConfigurationBuilder;

/**
 * RemoteManifest.
 *
 * @author David Ward &lt;<a href="mailto:dward@jboss.org">dward@jboss.org</a>&gt; &copy; 2014 Red Hat Inc.
 */
public final class RemoteManifest extends Manifest {

    private final RemoteConfigurationBuilder _remoteConfigurationBuilder;

    /**
     * Creates a new RemoteManifest.
     * @param remoteConfigurationBuilder the RemoteConfigurationBuilder
     */
    public RemoteManifest(RemoteConfigurationBuilder remoteConfigurationBuilder) {
        _remoteConfigurationBuilder = remoteConfigurationBuilder;
    }

    /**
     * Builds the RemoteConfiguration.
     * @return the RemoteConfigurationBuilder
     */
    public RemoteConfiguration buildConfiguration() {
        return _remoteConfigurationBuilder.build();
    }

    /**
     * Removes a RemoteManifest from the Environment.
     * @param environment the Environment
     * @return the RemoteManifest
     */
    public static RemoteManifest removeFromEnvironment(Environment environment) {
        return Manifest.removeFromEnvironment(environment, RemoteManifest.class);
    }

}
