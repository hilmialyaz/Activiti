package org.activiti.spring.test.ws;

import java.net.MalformedURLException;
import java.util.List;

import javax.xml.ws.BindingProvider;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.milleni.dunning.ws.client.coa.COASoap;
import org.milleni.dunning.ws.client.coa.ServiceResponse;
import org.milleni.dunning.ws.client.customerservice.CustomerInfoServiceSoap;
import org.milleni.dunning.ws.client.customerservice.TeconCustomerInfoResponse;
import org.milleni.dunning.ws.client.milinternal.ArrayOfFaturaKalemi;
import org.milleni.dunning.ws.client.milinternal.FaturaDetayi;
import org.milleni.dunning.ws.client.milinternal.FaturaKalemi;
import org.milleni.dunning.ws.client.milinternal.MillenicomInternalSoap;
import org.milleni.dunning.ws.client.tahsilat.AcikKalem;
import org.milleni.dunning.ws.client.tahsilat.ArrayOfAcikKalem;
import org.milleni.dunning.ws.client.tahsilat.GuvenlikBilgisi;
import org.milleni.dunning.ws.client.tahsilat.MilleniComOnlineTahsilatSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ws_test.xml")
public class CoaServiceTest {

	@Autowired
	COASoap coa;
	
	@Autowired
	MilleniComOnlineTahsilatSoap onlineTahsilat;

	@Autowired
	MillenicomInternalSoap  milInternal;
	
	@Autowired
	CustomerInfoServiceSoap customerInfoWs;
	/**
	 * Tests inserting a user and asserts it can be loaded again.
	 * 
	 * @throws MalformedURLException
	 */
	@Test
	public void testCoa() throws MalformedURLException {

		((BindingProvider) coa).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/MilleniWS/coa.asmx");

		ServiceResponse response = coa.sendAnnounceCoa(1, 1, 1,true);
		//System.out.println(response);
	}
	
	@Test
	public void testTahsilat() throws MalformedURLException {

		((BindingProvider) onlineTahsilat).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/OnlineTahsilat/MilleniComOnlineTahsilat.asmx");

		String res = onlineTahsilat.test();
		System.out.println(res);
		ArrayOfAcikKalem response = onlineTahsilat.acikKalemler(new GuvenlikBilgisi(), "10");
		List<AcikKalem> acikkalem =  response.getAcikKalem();
		for (AcikKalem acikKalem2 : acikkalem) {
			System.out.println(acikKalem2);
		}
	}
	
	
	
	@Test
	public void testMilleniInternal() throws MalformedURLException {

		//((BindingProvider) onlineTahsilat).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/OnlineTahsilat/MilleniComOnlineTahsilat.asmx");
		org.milleni.dunning.ws.client.milinternal.GuvenlikBilgisi secInfo = new org.milleni.dunning.ws.client.milinternal.GuvenlikBilgisi();
		secInfo.setKullaniciAdi("millnet");
		secInfo.setSifre("123456");
		FaturaDetayi detay = milInternal.faturaDetayiGoruntule(secInfo, "9417835", "01.09.2050");
		ArrayOfFaturaKalemi faturaKalemleri =  detay.getFaturaKalemleri();
		List<FaturaKalemi> faturaKalemList = faturaKalemleri.getFaturaKalemi();
		
		for (FaturaKalemi faturaKalemi : faturaKalemList) {
			if("B".equals(faturaKalemi.getBorcAlacak()) && "A".equals(faturaKalemi.getStatu())){
				System.out.println(faturaKalemi);
				//faturayi acik olarak kaydet
			}else if("B".equals(faturaKalemi.getBorcAlacak()) && "K".equals(faturaKalemi.getStatu())){
				System.out.println(faturaKalemi);
				//faturayi kaydet.
			}

		}
		
	}

	@Test
	public void testCustomerInfoWs() {
		TeconCustomerInfoResponse response=customerInfoWs.retrieveCustomerInfo(	"tid",9005870,true);
		System.out.println(response.getResultCode());
	}
}
