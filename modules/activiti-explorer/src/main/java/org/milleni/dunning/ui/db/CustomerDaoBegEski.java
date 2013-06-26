package org.milleni.dunning.ui.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.ProcessEngines;
import org.activiti.engine.impl.ProcessEngineImpl;
import org.activiti.engine.impl.context.Context;
import org.activiti.engine.impl.db.DbSqlSession;
import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.apache.ibatis.session.SqlSession;

public class CustomerDaoBegEski {

	public static Connection getCurrentDatabaseConnection() {
		return Context.getCommandContext().getDbSqlSession().getSqlSession()
				.getConnection();
	}

	public ResultSet executeSelectSqlQuery(String sql) throws Exception {
		Connection connection = getCurrentDatabaseConnection();
		Statement select = connection.createStatement();
		return select.executeQuery(sql);
	}

	public List<Customer> getCustomers() {
		List<Customer> customerList = (List<Customer>) ((ProcessEngineImpl) ProcessEngines
				.getDefaultProcessEngine()).getProcessEngineConfiguration()
				.getCommandExecutorTxRequired().execute(new Command<Object>() {
					public Object execute(CommandContext commandContext) {
						try {
							List<Customer> customerList = new ArrayList<Customer>();
							try {
								ResultSet rs = executeSelectSqlQuery("SELECT id, customer_name, customer_group , status  FROM customer");
								while (rs.next()) {
									Customer customer = new Customer();
									customer.setMusteriAdi(rs.getString("customer_name"));
									customer.setMusteriNo(rs.getLong("id"));
									customerList.add(customer);
								}

							} catch (Exception e) {
								e.printStackTrace();
							}
							return customerList;
						} catch (Exception e) {
							e.printStackTrace();
						}
						return null;
					}
				});

		return customerList;
	}
	
	
	public List<Invoice> getCustomerInvoices(final String customerId) {
		List<Invoice> invoiceList = (List<Invoice>) ((ProcessEngineImpl) ProcessEngines
				.getDefaultProcessEngine()).getProcessEngineConfiguration()
				.getCommandExecutorTxRequired().execute(new Command<Object>() {
					public Object execute(CommandContext commandContext) {
						try {
							List<Invoice> invoiceList = new ArrayList<Invoice>();
							try {
								ResultSet rs = executeSelectSqlQuery("SELECT id, due_date,total,invoice_status  FROM invoice where invoice.customer_id = "+customerId);
								while (rs.next()) {
									Invoice inv = new Invoice();
									inv.setDueDate(rs.getDate("due_date"));
									inv.setTotal(rs.getLong("total"));
									inv.setStatus(rs.getInt("invoice_status"));
									inv.setId(rs.getLong("id"));
									invoiceList.add(inv);
								}

							} catch (Exception e) {
								e.printStackTrace();
							}
							return invoiceList;
						} catch (Exception e) {
							e.printStackTrace();
						}
						return null;
					}
				});

		return invoiceList;
	}

}
