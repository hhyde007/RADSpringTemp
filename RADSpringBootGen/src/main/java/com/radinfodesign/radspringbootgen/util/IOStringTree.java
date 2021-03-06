/* 
 * Copyright 2018 by RADical Information Design Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package com.radinfodesign.radspringbootgen.util;
import static java.lang.System.out;

import java.util.StringTokenizer;

/**
 * Intermediate abstract parent class for hierarchical trees upon which code generation is based.
 * @author Howard Hyde
 *
 */
abstract class IOStringTree extends StringTree {
  protected boolean built = false;
  
  public IOStringTree(String topValue) {
    super(topValue);
  }

  public IOStringTree() {
  }

  /**
   * 
   * @return True if the tree is complete and ready for traversing, processing and/or outputting.
   */
  public boolean isBuilt () {return this.built;}
  
  /**
   * Instructs the tree to build itself.
  */
  public abstract void build();
  
 }

