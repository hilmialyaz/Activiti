/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.activiti.spring.test.process.fl421;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.ActivitiException;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.test.Deployment;
import org.activiti.spring.impl.test.SpringActivitiTestCase;
import org.springframework.test.context.ContextConfiguration;


/**
 * Test limiting the exposed beans in expressions.
 * 
 * @author Frederik Heremans
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class FL421ProcessTest extends SpringActivitiTestCase {

  @Deployment(resources = "FL421_HobimMektupGenarator.bpmn20.xml")
  public void testLimitedBeansExposed() throws Exception {
    // Start process, which has a service-task which calls 'bean1', which is exposed
	Map<String,Object> variables = new HashMap<String, Object>();
	variables.put("letterType", "BFM");
    ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("FL421_HobimMektupGenarator",variables);
    
    String beanOutput = (String) runtimeService.getVariable(processInstance.getId(), "beanOutput");
    assertNotNull(beanOutput);
    
    Task task = taskService.createTaskQuery().processInstanceId(processInstance.getId()).singleResult();
    assertNotNull(task);
    
    try {
      taskService.complete(task.getId());
      fail("Exception should have been thrown");
    } catch(ActivitiException ae) {
      assertTextPresent("Unknown property used in expression", ae.getMessage());
    }
  }
}
