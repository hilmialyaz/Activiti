package org.milleni.dunning.datamodel.util;

public interface Constants {
	
	String applicationName = "Dunning";
	String user = "User";
	
	String OVERDUE = "OVERDUE";
	String SMS_HATIRLATMA = "SMS_HATIRLATMA";
	String COA_HATIRLATMA = "COA_HATIRLATMA";
	String USER_TASK = "USER_TASK";
	String OUTBOUND_HATIRLATMA = "OUTBOUND_HATIRLATMA";
	String SMS_HATKAPAMA = "SMS_HATKAPAMA";
	String SMS = "SMS";

	String PROCESS_STATUS = "PROCESS_STATUS";
	String PROCESS_STATUS_DESC = "PROCESS_STATUS_DESC";

	String RUNNING = "R";
	String INITIAL = "I";
	String SUCCESS = "S";
	String ERROR = "E";
	String WARNING = "W";
	String NOTIFICATION = "N";
	String PAID_AND_FINISHED = "P";
	String MANUAL_FINISHED = "MF";
	String SKIPPED = "SK";
	
	String DROOLS_URL = "dunning.path.link.drools";
	/*
	 * Detail status
	 */

	String PROCESS_STEP_DESC_FESIH_MEKTUBU="Fesih&Yasal Uyari Mektubu";
	String PROCESS_STEP_BIR_FESIH_MEKTUBU="BIR_FESIH_MEKTUBU";
	String PROCESS_STEP_KUR_FESIH_MEKTUBU="KUR_FESIH_MEKTUBU";
	String PROCESS_STEP_BIR_YASAL_UYARI_MEKTUBU="BIR_YASAL_UYARI_MEKTUBU";
	String PROCESS_STEP_KUR_YASAL_UYARI_MEKTUBU="KUR_YASAL_UYARI_MEKTUBU";
	String mailBody = "mailBody";
	
	
	
	String PAID = "Y";
	String UNPAID = "N";
	
	String VAR = "Y";
	String TAKIP_DISI = "T";
	String YOK = "N";
	
	String AKTIF="a";
	String SUSPEND="s";
	String NOT_CHECK_STATUS="notCheckStatus";
	
	String BIREYSEL="bireysel";
	String KURUMSAL="kurumsal";

	String customerId = "customerId";
	String dunningProcessMaster = "dunningProcessMaster";
	String dunningProcessDetail = "dunningProcessDetail";
	
	String processStep = "processStep";
	String processStepName = "processStepName";
	String preDefinedProcessStep = "preDefinedProcessStep";
	String processStartDate = "processStartDate";
	String deaktifseAtla = "deaktifseAtla";
	String stepStartDateTime = "stepStartDateTime";
	
	String userSelectedProcessStep = "userSelectedProcessStep";
	String processWaitTime = "processWaitTime";
	String loopCount = "loopCount";
	String processStartStep = "processStartStep";
	String firstStepNext = "firstStepNext";
	String lastCompletedTaskUserName = "lastCompletedTaskUserName";
	String taskStatusFinans = "taskStatusFinans";
	String takipDisiBirak = "takipDisiBirak";
	

	// ErrorCodes
	String paymentReceived = "paymentReceived";
	String CUSTOMER_IS_NOT_ACTIVE= "Musteri Aktif Degil";
	String CUSTOMER_HAS_RUNNING_INSTANCE = "Musterinin hali hazirda dunning sureci var";
	String CUSTOMER_HAS_MASTER_BUT_NO_BPM_FOUND = "Musterinin mevcutta processi var.";
	String CUSTOMER_IS_IN_LEGAL = "Musteri Yasal Takipte";
	String CUSTOMER_HAS_MORE_THAN_ONE_INITIAL_INSTANCE = "Musterinin initial statete kaydi var";
	String RETRY_ERROR = "retryError";
	String NOT_RETRY_ERROR = "notRetryError";
	String TASK_ERROR = "taskError";
	String CUSTOMER_ID_NOT_FOUND = "Müşteri Bulunanadi";
	String BPM_PROCESS_NOT_FOUND = "Bpm Processi Bulunamadi";
	String CUSTOMER_MUST_NOT_IN_DUNNING = "Musteri Dunning Surecine Giremez";
	String USER_DEFINED_PROCESS_NOT_ASSIGNABLE = "Kullanıcı Tarafından Seçilen Process Uygun Degil";
	String PROCESS_STEP_NOT_FOUND = "Process Step Bulunamadi";
	String DUNNING_PROCESS_MASTER_NOT_FOUND = "DUNNING PROCESS MASTER bulunamadi";
	String CUSTOMER_DOESNOT_MATCH_RULE = "Musteri Kurala Uymadi";
	String PAYMENT_RECEIVED = "paymentReceived";
	String CRM_DEACTIVATION_FAILED = "CrmDeactivationFailed";
	String SUSPENSION_POSTPONE = "ERR_SUSP";
	String SUSPENSION_POSTPONE_DESC = "Abone borcu limitin aldında suspend edilemez.";
	String WARNING_NO_UNPAID_INVOICE= "Musteri Faturasi Yok veya 10TL den Az";
	String CrmAccountNotFound = "ACCOUNT_NOT_FOUND";

	// UI
	String CUSTOMER_ID = "main.menu.customers.customer_id";
	String CUSTOMER_NAME = "main.menu.customers.customer_name";
	String CUSTOMER_TYPE = "main.menu.customers.customer_type";
	String CUSTOMER_GROUP = "main.menu.customers.customer_group";
	String CUSTOMER_STATUS = "main.menu.customers.status";
	String CUSTOMER_DEBIT = "main.menu.dunning.totaldebit";
	String CUSTOMER_STATUS_DESC = "main.menu.customers.status_desc";
	String CUSTOMER_DUNNING_PROCESSES = "main.menu.customers.dunning_processes";
	String DUNNING_STATUS = "main.menu.dunning.status";
	String DUNNING_START_DATE = "main.menu.dunning.startdate";
	String DUNNING_END_DATE = "main.menu.dunning.enddate";
	String DUNNING_NEXT_STEP = "main.menu.dunning.nextStep";
	
	String DUNNING_NEXT_STEP_DATE = "main.menu.dunning.nextStepDate";
	String DUNNING_NEXT_STEP_DATE_START = "main.menu.dunning.nextStepDateStart";
	String DUNNING_NEXT_STEP_DATE_END = "main.menu.dunning.nextStepDateEnd";
	String DUNNING_PROCESS_DATE_START = "main.menu.dunning.processDateStart";
	String DUNNING_PROCESS_DATE_END = "main.menu.dunning.processDateEnd";
	String DUNNING_PROCESS_STATUS_DATE_START = "main.menu.dunning.processStatusDateStart";
	String DUNNING_PROCESS_STATUS_DATE_END = "main.menu.dunning.processStatusDateEnd";
	String DUNNING_INVOICE_DATE_START = "main.menu.dunning.invoiceDateStart";
	String DUNNING_INVOICE_DATE_END = "main.menu.dunning.invoiceStatusDateEnd";
	
	
	
	
	String DUNNING_CURRENT_STEP = "main.menu.dunning.currentStep";
	String DUNNING_LAST_STEP = "main.menu.dunning.lastStep";
	String DUNNING_CURRENT_DEBIT = "main.menu.dunning.currentdebit";
	String DUNNING_BPM_RPOCESS_ID = "main.menu.dunning.bpmprocessid";	
	String DUNNING_DETAIL_LOG_KEY = "main.menu.dunning.detail.log.key";
	String DUNNING_DETAIL_LOG_MESSAGE = "main.menu.dunning.detail.log.message";
	String DUNNING_DETAIL_LOG_STEP = "main.menu.dunning.detail.log.step";
	String DUNNING_INVOICE_LIST = "main.menu.dunning.invoicelist";
	String DUNNING_INVOICE_STATUS = "main.menu.dunning.invoice.durum";	
	String DUNNING_INVOICE_SOT = "main.menu.dunning.invoice.sot";
	String DUNNING_INVOICE_DATE= "main.menu.dunning.invoice.date";
	String DUNNING_INVOICE_PAYMENT_ID = "main.menu.dunning.invoice.paymentid";
	String DUNNING_INVOICE_AMOUNT = "main.menu.dunning.invoice.tutar";
	String DUNNING_INVOICE_PAID = "main.menu.dunning.invoice.odendi";
	String DUNNING_INVOICE_UNPAID = "main.menu.dunning.invoice.odenmedi";
	String DUNNING_INVOICE_UNPAID_TOTAL_SOT = "main.menu.dunning.invoice.unpaid.debit";
	String DUNNING_PROCESSES= "main.menu.customers.dunning_process_running";
	String DUNNING_PROCESS_STEPS= "main.menu.customers.dunning_process_steps";

	String DUNNING_POLICY_TYPE = "main.menu.customers.dunning_policy";
	String DUNNING_POLICY_STEP = "main.menu.customers.dunning_policy_step";
	String DUNNING_POLICY_LAST_STEP = "main.menu.customers.dunning_policy_laststep";
	String DUNNING_POLICY_CURRENT_STEP = "main.menu.customers.dunning_policy_currentstep";
	String DUNNING_PROCESS_STATUS = "main.menu.customers.dunning_process_status";
	String DUNNING_PROCESS_STEP_STATUS = "main.menu.customers.dunning_process_step_status";
	
	String DUNNING_PROCESS_STEP_START = "main.menu.customers.dunning_step_start";
	String DUNNING_PROCESS_STEP_START_END = "main.menu.customers.dunning_step_start_end";
	String DUNNING_PROCESS_STEP_STOP = "main.menu.customers.dunning_step_stop";
	String DUNNING_PROCESS_STEP_STOP_END = "main.menu.customers.dunning_step_stop_end";
	


	String RULES_PROCESS_STEP = "org.milleni.dunning.datamodel.processsteprules";
	String RULES_VALIDATION = "org.milleni.dunning.datamodel.validationrules";
	String RULES_PROCESS_STARTUP = "org.milleni.dunning.datamodel.startuprules";
	String RULES_INVOICE_PAYMENT = "org.milleni.dunning.datamodel.invoicepayment";
	String RULES_SUSPENSION = "org.milleni.dunning.datamodel.suspensionrules";
	String RULES_DEACTIVATION = "org.milleni.dunning.datamodel.deactivationrules";
	String RULES_FINANCE_TRANSFER = "org.milleni.dunning.datamodel.financetransfer";
	
	String ExecutionResult = "ExecutionResult";
	

	String WS_COA_ENDPOINT = "dunning.ws.endpoint.coa";
	String WS_TICKLER_ENDPOINT = "dunning.ws.endpoint.tickler";
	String WS_MILLENIWS_ENDPOINT = "dunning.ws.endpoint.milleniws";
	String WS_ONLINETAHSILAT_ENDPOINT = "dunning.ws.endpoint.onlinetahsilat";
	String WS_CUSTOMER_INFO_ENDPOINT = "dunning.ws.endpoint.customerinfo";
	String WS_SMSGW_ENDPOINT = "dunning.ws.endpoint.smsgw";
	String WS_CUSTOMERSTATUS_ENDPOINT = "dunning.ws.endpoint.customerstatus";
	String WS_MILLDESK_ENDPOINT = "dunning.ws.endpoint.milldesk";
	String WS_CALLCENTER_ENDPOINT = "dunning.ws.endpoint.callcenter";
	String WS_CRM_ACCOUNT_ENDPOINT = "dunning.ws.endpoint.crmaccount";
	String WS_CRM_FREEZE_ENDPOINT = "dunning.ws.endpoint.crmfreeze";
	String WS_CRM_CONTACT_ENDPOINT = "dunning.ws.endpoint.crmcontact";
	
	String WS_SETTINGS_SMS_APPLICATION = "dunning.ws.settings.smsgw.application";
	String WS_SETTINGS_SMS_USERID = "dunning.ws.settings.smsgw.userid";
	String WS_SETTINGS_SMS_ORIGINATOR_ADSL = "dunning.ws.settings.smsgw.originator.dopingadsl";
	String WS_SETTINGS_SMS_ORIGINATOR_MILLENICOM = "dunning.ws.settings.smsgw.originator.millenicom";
	
	String WS_SETTINGS_TAHSILAT_USERNAME = "dunning.ws.settings.tahsilat.username";
	String WS_SETTINGS_TAHSILAT_PASSWORD = "dunning.ws.settings.tahsilat.password";
	

	int COA_ANNOUNCE_HATIRLATMA = 1;
	int COA_ANNOUNCE_IHTAR1 = 1;
	int COA_ANNOUNCE_SUSPEND = 2;

	String SMS_BIR_HATIRLATMA = "dunning.ws.settings.sms.bireysel.hatirlatma";
	String SMS_BIR_IHTAR = "dunning.ws.settings.sms.bireysel.ihtar";
	String SMS_IPTAL = "dunning.ws.settings.sms.iptal";
	String SMS_KUR_HATIRLATMA = "dunning.ws.settings.sms.kurumsal.hatirlatma";
	String SMS_KUR_IHTAR = "dunning.ws.settings.sms.kurumsal.ihtar";
	String SMS_KUR_IDARI = "dunning.ws.settings.sms.kurumsal.idari";
	String SMS_VIP_HATIRLATMA = "dunning.ws.settings.sms.vip.hatirlatma";
	String SMS_ODEMEBILDIRIM = "dunning.ws.settings.sms.odemebildirim";
	String SMS_ODEMEGELMEDI = "dunning.ws.settings.sms.odemegelmedi";
	String SMS_BULUT_HATIRLATMA = "dunning.ws.settings.sms.bulut.hatirlatma";
	String SMS_BULUT_IHTAR = "dunning.ws.settings.sms.bulut.ihtar";
	
	String SMS_MAIL_REPORT = "dunning.ws.settings.sms.rapor";
	String COA_MAIL_REPORT = "dunning.ws.settings.coa.rapor";
	
	String STEP_BIR_SMS_HATIRLATMA ="BIR_SMS_HATIRLATMA";
	String STEP_BIR_SMS_IHTAR ="BIR_SMS_IHTAR";
	String STEP_KUR_SMS_HATIRLATMA ="KUR_SMS_HATIRLATMA";
	String STEP_KUR_SMS_IHTAR ="KUR_SMS_IHTAR";
	String STEP_KUR_SMS_IDARI ="KUR_SMS_IDARI";
	String STEP_SMS_VIP_HATIRLATMA ="VIP_SMS_HATIRLATMA";
	String STEP_BULUT_SMS_HATIRLATMA ="BULUT_SMS_HATIRLATMA";
	String STEP_BULUT_SMS_IHTAR ="BULUT_SMS_IHTAR";
	
	
	
	String STEP_BIR_COA_HATIRLATMA ="BIR_COA_HATIRLATMA";
	String STEP_BIR_COA_IHTAR ="BIR_COA_IHTAR";
	String STEP_COA ="COA";
	String STEP_SMS ="SMS";
	
	
	String MAX_INVOICE_LIMIT = "dunning.settings.invoice.limit";
	String MAX_ADSL_SUSPENSION_INVOICE_LIMIT = "dunning.settings.invoice.limit.susp.adsl";
	String MAX_SES_SUSPENSION_INVOICE_LIMIT = "dunning.settings.invoice.limit.susp.ses";
	String MAX_SMS_SEND_IN_EXECUTION = "dunning.bulk.settings.max.smssend.inexecution";
	String MAX_SUSPENSION_EXECUTION = "dunning.bulk.settings.max.suspension.inexecution";
	String MAX_FESIH_MEKTUBU_IN_EXECUTION = "dunning.bulk.settings.max.fesih.inexecution";
	String MAX_COA_IN_EXECUTION = "dunning.bulk.settings.max.coa.inexecution";
	String PATH_FESIH_MEKTUBU = "dunning.path.fesih";
	String LINK_FESIH_MEKTUBU = "dunning.path.link.fesih";
	String LINK_WEBAPP ="dunning.path.webapp.link";
	
	
	
	
	int errorRetryCount = 0;
	String messagePaymentReceived = "messagePaymentReceived";
	
	String FL100_DunningProcessInitializer = "FL100_DunningProcessInitializer";
	String FL400_CustomerSuspensionProcess = "FL400_CustomerSuspensionProcess";
	String FL99_MustNotInDunningProcess = "FL99_MustNotInDunningProcess";
	String FL95_SuspendToActive  =  "FL95_SuspendToActive";
	
	
	
	//tickler
	String talepKonusu = "Tahsilat";
	String nedenAdsl = "DOPING";
	String nedenPstn = "SES";
	String altDurum  = "Seçiniz";
	String talepStatus = "NOT";
	
	
	
}