/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.hyracks.algebricks.data;

import org.apache.hyracks.api.dataflow.value.IBinaryHashFunctionFactory;

/**
 * Ideally, {@code IBinaryHashFunctionFactoryProvider} should be stateless and thread-safe. Also, it should be made into
 * a singleton. However, this is implementation-dependent.
 */
public interface IBinaryHashFunctionFactoryProvider {

    /**
     * Whether a singleton factory instance is returned or a new factory instance is created is implementation-specific.
     * Therefore, no assumption should be made in this regard.
     * TODO: some existing implementations create a new factory instance
     *
     * @param type the type of the data that will be hashed.
     *
     * @return a {@link IBinaryHashFunctionFactory} instance.
     */
    IBinaryHashFunctionFactory getBinaryHashFunctionFactory(Object type);
}
