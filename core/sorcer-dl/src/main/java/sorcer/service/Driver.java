/*
 * Copyright 2013 the original author or authors.
 * Copyright 2013 SorcerSoft.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sorcer.service;

 /**
 * The driver class is the abstract controller type defining a control strategy
 * for services for examples as Analyzer, Explorer, Supervisor, Hypervisor
 * declared in input service contexts to be injected at runtime for
 * controlling execution of services. Tey can be declared directly
 * in contexts as Java lambda expressions or by fee controllers or
 * service signatures that reference static methods (builders) of
 * classes that provide relevant implementation of the declared Controllers.
 *
 * Created by Mike Sobolewski on 12/26/22.
 */
public interface Driver extends Controlling {

}
