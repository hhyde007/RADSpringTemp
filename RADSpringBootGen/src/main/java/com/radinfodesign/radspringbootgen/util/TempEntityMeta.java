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


/**
 *  Wrapper class for EntityMeta for transient purposes depending on the context of the same or different EntityMeta
 * @author Howard Hyde
 *
 */
public class TempEntityMeta {
  EntityMeta entityMeta;
  boolean xReferenced = false;
  boolean isThirdEntity = false;
  
  public TempEntityMeta (EntityMeta entityMeta) {
    this.entityMeta = entityMeta;
  }

  public boolean isXReferenced() {
    return xReferenced;
  }

  public void setXReferenced(boolean xReferenced) {
    this.xReferenced = xReferenced;
  }

  public boolean isThirdEntity() {
    return isThirdEntity;
  }

  public void setThirdEntity(boolean isThirdEntity) {
    this.isThirdEntity = isThirdEntity;
  }

  public EntityMeta getEntityMeta() {
    return entityMeta;
  }
  
  public boolean isEmbeddedPkInfo() {
    return this.entityMeta.isEmbeddedPkInfo();
  }


}
