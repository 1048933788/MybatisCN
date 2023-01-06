/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.reflection;

/**
 * 工厂接口
 * ps：主要用来生产Reflector对象，之所以使用此工厂来创建，个人认为主要是提供了缓存来提高创建的性能
 */
public interface ReflectorFactory {
  // ps:类是否开启缓存，默认为true
  boolean isClassCacheEnabled();

  void setClassCacheEnabled(boolean classCacheEnabled);

  /**
   * 根据 type 生产Reflector对象
   * @param type
   * @return
   */
  Reflector findForClass(Class<?> type);
}