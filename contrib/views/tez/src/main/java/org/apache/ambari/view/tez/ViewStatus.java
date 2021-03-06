/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ambari.view.tez;

import java.util.HashMap;
import java.util.Map;

/**
 * Class to represent the public-facing properties of the tez View that any user is allowed to see.
 */
public class ViewStatus {

  private Map<String, String> parameters = new HashMap<String, String>();

  /**
   * @return Get all of the public properties
   */
  public Map<String, String> getParameters() {
    return parameters;
  }

  /**
   * @param parameters Parameters to save
   */
  public void setParameters(Map<String, String> parameters) {
    this.parameters = parameters;
  }
}
