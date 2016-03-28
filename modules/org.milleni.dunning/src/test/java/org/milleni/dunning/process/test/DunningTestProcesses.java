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

package org.milleni.dunning.process.test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.impl.history.HistoryLevel;
import org.activiti.engine.impl.test.PluggableActivitiTestCase;
import org.activiti.engine.impl.util.CollectionUtil;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.activiti.engine.test.Deployment;
import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * @author Tom Baeyens
 */
public class DunningTestProcesses extends PluggableActivitiTestCase {

	@Deployment(resources = { "org/activiti/dunning/test/DunningTestProcesses.testSureArtirim.bpmn20.xml" })
	public void testSureArtirim() {
		ProcessInstance pi = runtimeService
				.startProcessInstanceByKey("sureArtirim");

		Task task = taskService.createTaskQuery().singleResult();
		assertNotNull(task.getId());
		assertEquals("User Task", task.getName());
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, -3);
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("odemeTaahhutTarihi1", c.getTime());
		taskService.complete(task.getId(), variables);

		Map<String, Object> variab = runtimeService.getVariables(pi.getId());
		boolean sureArttir = (Boolean) runtimeService.getVariable(pi.getId(),
				"sureArtir");
		System.out.println("test");
		// assertTrue(sureArttir);
		Task task2 = taskService.createTaskQuery().singleResult();

		taskService.complete(task2.getId());

		Task atask2 = taskService.createTaskQuery().singleResult();
		System.out.println(atask2);

		// assertEquals(false,sureartir);

	}

	@Deployment(resources = { "org/activiti/dunning/test/BPMEngineTestProcesses.aysonuAdjusmentUzat.bpmn20.xml" })
	public void testAysonuArtirim() {
		ProcessInstance pi = runtimeService
				.startProcessInstanceByKey("aysonunaSetle");
		Task task = taskService.createTaskQuery().singleResult();
		// historyService.createHistoricTaskInstanceQuery().orderByHistoricTaskInstanceStartTime().asc().list();
		taskService.complete(task.getId());
		/*
		HistoricProcessInstance historicProcessInstance = historyService
				.createHistoricProcessInstanceQuery()
				.processInstanceId(pi.getProcessInstanceId())
				.orderByProcessInstanceStartTime().asc().singleResult();

		Calendar cal = Calendar.getInstance();
		cal.setTime(historicProcessInstance.getStartTime());
		cal.add(Calendar.MONTH, 2);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		cal.add(Calendar.DATE, -1);
		System.out.println(cal.getTime());
		*/
		Map<String, Object> variab = runtimeService.getVariables(pi.getId());
		System.out.println(variab);
		// assertEquals(false,sureartir);

	}

	private static void dateDiff() {

		System.out.println("Calculate difference between two dates");
		System.out
				.println("=================================================================");

		DateTime startDate = new DateTime(new Date());

		DateTime endDate = new DateTime();

		Days d = Days.daysBetween(startDate, endDate);
		int days = d.getDays();

		System.out.println("  Difference between " + endDate);
		System.out.println("  and " + startDate + " is " + days + " days.");

	}

}
