/**
 * Copyright (c) 2009-2011 VMware, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.springsource.insight.plugin.jmx;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.springsource.insight.idk.test.AbstractExposedIdkPuginsTestSupport;

/**
 * Makes sure that the exposed singletons are indeed visible 
 */
@ContextConfiguration(locations={ "classpath:META-INF/insight-plugin-jmx.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExposedJmxPluginSpringBeanTest
		extends AbstractExposedIdkPuginsTestSupport<JmxPluginRuntimeDescriptor> {
    /* NOTE: all beans are autowired with required=false since we want
     * to have specific tests for each and we don't want to fail ALL the
     * tests if one bean is missing
     */
	@Autowired(required=false) protected JmxPluginRuntimeDescriptor	jmxPluginRuntimeDescriptor;
	@Autowired(required=false) protected JmxInvocationEndPointAnalyzer	jmxInvocationEndPointAnalyzer;

	public ExposedJmxPluginSpringBeanTest() {
		super(JmxPluginRuntimeDescriptor.class);
	}
}
