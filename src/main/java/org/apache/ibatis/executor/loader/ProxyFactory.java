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
package org.apache.ibatis.executor.loader;

import java.util.List;
import java.util.Properties;

import org.apache.ibatis.reflection.factory.ObjectFactory;
import org.apache.ibatis.session.Configuration;

/**
 * 代理工厂接口，用于创建需要延迟加载属性的结果对象
 * @author Eduardo Macarron
 */
public interface ProxyFactory {

  void setProperties(Properties properties);

  /**
   * 创建代理对象
   * @param target 被代理的对象
   * @param lazyLoader ResultLoader对象的集合（映射）
   * @param configuration 配置对象
   * @param objectFactory object factory 创建object 的工厂
   * @param constructorArgTypes 构造函数参数类型列表
   * @param constructorArgs 构造函数参数列表
   * @return 创建的代理对象
   */
  Object createProxy(Object target, ResultLoaderMap lazyLoader, Configuration configuration, ObjectFactory objectFactory, List<Class<?>> constructorArgTypes, List<Object> constructorArgs);
  
}
