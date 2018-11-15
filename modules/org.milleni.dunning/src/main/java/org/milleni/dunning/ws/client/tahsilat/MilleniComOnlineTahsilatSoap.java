
package org.milleni.dunning.ws.client.tahsilat;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "MilleniComOnlineTahsilatSoap", targetNamespace = "http://milleni.com/online_tahsilat")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MilleniComOnlineTahsilatSoap {


    /**
     * Web service'in ve arkas\u0131ndaki R/3'�n eri\u015filebilir oldu\u011funu test etmek i�in kullan\u0131l\u0131r.
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Test", action = "http://milleni.com/online_tahsilat/Test")
    @WebResult(name = "TestResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "Test", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.Test")
    @ResponseWrapper(localName = "TestResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.TestResponse")
    public String test();

    /**
     * M�\u015fteri numaras\u0131 ile m�\u015fterinin �denmeyi bekleyen faturalar\u0131 sorgulan\u0131r.
     * 
     * @param guvenlikBilgisi
     * @param musteriNo
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.ArrayOfAcikKalem
     */
    @WebMethod(operationName = "AcikKalemler", action = "http://milleni.com/online_tahsilat/AcikKalemler")
    @WebResult(name = "AcikKalemlerResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "AcikKalemler", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.AcikKalemler")
    @ResponseWrapper(localName = "AcikKalemlerResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.AcikKalemlerResponse")
    public ArrayOfAcikKalem acikKalemler(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "musteriNo", targetNamespace = "http://milleni.com/online_tahsilat")
        String musteriNo);

    /**
     * Tahsilat kalemleri 'AcikKalemler' ile sorgulanm\u0131\u015f bilgilerle doldurularak �demesi yap\u0131lmak �zere iletilir.
     * 
     * @param tahsilatKalemleri
     * @param guvenlikBilgisi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.ArrayOfIslemSonucu
     */
    @WebMethod(operationName = "TahsilatYap", action = "http://milleni.com/online_tahsilat/TahsilatYap")
    @WebResult(name = "TahsilatYapResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "TahsilatYap", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.TahsilatYap")
    @ResponseWrapper(localName = "TahsilatYapResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.TahsilatYapResponse")
    public ArrayOfIslemSonucu tahsilatYap(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "tahsilatKalemleri", targetNamespace = "http://milleni.com/online_tahsilat")
        ArrayOfTahsilatKalemiExt tahsilatKalemleri);

    /**
     * Tahsilat\u0131 yap\u0131lm\u0131\u015f kalemlerin iptalini yapar.
     * 
     * @param tahsilatKalemleri
     * @param guvenlikBilgisi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.ArrayOfIslemSonucu
     */
    @WebMethod(operationName = "TahsilatIptaliYap", action = "http://milleni.com/online_tahsilat/TahsilatIptaliYap")
    @WebResult(name = "TahsilatIptaliYapResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "TahsilatIptaliYap", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.TahsilatIptaliYap")
    @ResponseWrapper(localName = "TahsilatIptaliYapResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.TahsilatIptaliYapResponse")
    public ArrayOfIslemSonucu tahsilatIptaliYap(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "tahsilatKalemleri", targetNamespace = "http://milleni.com/online_tahsilat")
        ArrayOfTahsilatKalemi tahsilatKalemleri);

    /**
     * Daha �nceden yap\u0131lan bir i\u015flemin sonucunun ba\u015far\u0131l\u0131 olup olmad\u0131\u011f\u0131n\u0131n sorgulamas\u0131n\u0131 yapar.
     * 
     * @param tahsilatKalemleri
     * @param guvenlikBilgisi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.ArrayOfIslemSonucu
     */
    @WebMethod(operationName = "AkibetSorgula", action = "http://milleni.com/online_tahsilat/AkibetSorgula")
    @WebResult(name = "AkibetSorgulaResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "AkibetSorgula", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.AkibetSorgula")
    @ResponseWrapper(localName = "AkibetSorgulaResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.AkibetSorgulaResponse")
    public ArrayOfIslemSonucu akibetSorgula(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "tahsilatKalemleri", targetNamespace = "http://milleni.com/online_tahsilat")
        ArrayOfTahsilatKalemi tahsilatKalemleri);

    /**
     * Belirli bir tarih aral\u0131\u011f\u0131nda yap\u0131lan i\u015flemlerin toplu say\u0131lar\u0131n\u0131 getirir
     * 
     * @param baslangicTarihi
     * @param guvenlikBilgisi
     * @param bitisTarihi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.TopluMutabakatRakamlari
     */
    @WebMethod(operationName = "TopluMutabakat", action = "http://milleni.com/online_tahsilat/TopluMutabakat")
    @WebResult(name = "TopluMutabakatResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "TopluMutabakat", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.TopluMutabakat")
    @ResponseWrapper(localName = "TopluMutabakatResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.TopluMutabakatResponse")
    public TopluMutabakatRakamlari topluMutabakat(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "baslangicTarihi", targetNamespace = "http://milleni.com/online_tahsilat")
        String baslangicTarihi,
        @WebParam(name = "bitisTarihi", targetNamespace = "http://milleni.com/online_tahsilat")
        String bitisTarihi);

    /**
     * Belirli bir tarih aral\u0131\u011f\u0131nda yap\u0131lm\u0131\u015f t�m i\u015flemlerin detay\u0131n\u0131 getirir.
     * 
     * @param baslangicTarihi
     * @param guvenlikBilgisi
     * @param bitisTarihi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.ArrayOfMutabakatDetayKalemi
     */
    @WebMethod(operationName = "DetayMutabakat", action = "http://milleni.com/online_tahsilat/DetayMutabakat")
    @WebResult(name = "DetayMutabakatResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "DetayMutabakat", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.DetayMutabakat")
    @ResponseWrapper(localName = "DetayMutabakatResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.DetayMutabakatResponse")
    public ArrayOfMutabakatDetayKalemi detayMutabakat(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "baslangicTarihi", targetNamespace = "http://milleni.com/online_tahsilat")
        String baslangicTarihi,
        @WebParam(name = "bitisTarihi", targetNamespace = "http://milleni.com/online_tahsilat")
        String bitisTarihi);

    /**
     * Tahsilat\u0131 ya da tahsilat iptali yap\u0131lm\u0131\u015f bor�lar\u0131n mutabakat\u0131n\u0131n yap\u0131lmas\u0131n\u0131 sa\u011flar
     * 
     * @param tahsilatKalemleri
     * @param guvenlikBilgisi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.ArrayOfIslemSonucu
     */
    @WebMethod(operationName = "MutabakatYap", action = "http://milleni.com/online_tahsilat/MutabakatYap")
    @WebResult(name = "MutabakatYapResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "MutabakatYap", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.MutabakatYap")
    @ResponseWrapper(localName = "MutabakatYapResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.MutabakatYapResponse")
    public ArrayOfIslemSonucu mutabakatYap(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "tahsilatKalemleri", targetNamespace = "http://milleni.com/online_tahsilat")
        ArrayOfTahsilatKalemi tahsilatKalemleri);

    /**
     * Belirli bir tarih aral\u0131\u011f\u0131nda yap\u0131lan i\u015flemlerin toplu mutabakat\u0131n\u0131 yapar.
     * 
     * @param baslangicTarihi
     * @param guvenlikBilgisi
     * @param bitisTarihi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.TopluMutabakatRakamlari
     */
    @WebMethod(operationName = "TopluMutabakatYap", action = "http://milleni.com/online_tahsilat/TopluMutabakatYap")
    @WebResult(name = "TopluMutabakatYapResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "TopluMutabakatYap", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.TopluMutabakatYap")
    @ResponseWrapper(localName = "TopluMutabakatYapResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.TopluMutabakatYapResponse")
    public TopluMutabakatRakamlari topluMutabakatYap(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "baslangicTarihi", targetNamespace = "http://milleni.com/online_tahsilat")
        String baslangicTarihi,
        @WebParam(name = "bitisTarihi", targetNamespace = "http://milleni.com/online_tahsilat")
        String bitisTarihi);

    /**
     * M�\u015fteri numaras\u0131 ve i\u015flem kodunu alarak �deme talimat\u0131 olu\u015fturur veya iptal eder.
     * 
     * @param islemKodu
     * @param guvenlikBilgisi
     * @param musteriNumarasi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.IslemSonucu
     */
    @WebMethod(operationName = "OdemeTalimatiOlustur", action = "http://milleni.com/online_tahsilat/OdemeTalimatiOlustur")
    @WebResult(name = "OdemeTalimatiOlusturResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "OdemeTalimatiOlustur", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.OdemeTalimatiOlustur")
    @ResponseWrapper(localName = "OdemeTalimatiOlusturResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.OdemeTalimatiOlusturResponse")
    public IslemSonucu odemeTalimatiOlustur(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "musteriNumarasi", targetNamespace = "http://milleni.com/online_tahsilat")
        String musteriNumarasi,
        @WebParam(name = "islemKodu", targetNamespace = "http://milleni.com/online_tahsilat")
        String islemKodu);

    /**
     * M�\u015fteri numaras\u0131n\u0131 alarak �deme talimat\u0131 sorgular.
     * 
     * @param guvenlikBilgisi
     * @param musteriNumarasi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.IslemSonucu
     */
    @WebMethod(operationName = "OdemeTalimatiSorgula", action = "http://milleni.com/online_tahsilat/OdemeTalimatiSorgula")
    @WebResult(name = "OdemeTalimatiSorgulaResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "OdemeTalimatiSorgula", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.OdemeTalimatiSorgula")
    @ResponseWrapper(localName = "OdemeTalimatiSorgulaResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.OdemeTalimatiSorgulaResponse")
    public IslemSonucu odemeTalimatiSorgula(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "musteriNumarasi", targetNamespace = "http://milleni.com/online_tahsilat")
        String musteriNumarasi);

    /**
     * G�n� gelmi\u015f talimatl\u0131 faturalar\u0131 getirir.
     * 
     * @param guvenlikBilgisi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.ArrayOfAcikKalem
     */
    @WebMethod(operationName = "OdenecekFaturalariGetir", action = "http://milleni.com/online_tahsilat/OdenecekFaturalariGetir")
    @WebResult(name = "OdenecekFaturalariGetirResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "OdenecekFaturalariGetir", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.OdenecekFaturalariGetir")
    @ResponseWrapper(localName = "OdenecekFaturalariGetirResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.OdenecekFaturalariGetirResponse")
    public ArrayOfAcikKalem odenecekFaturalariGetir(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi);

    /**
     * G�n� gelmi\u015f talimatl\u0131 faturalar\u0131 getirir. �denecek fatura kalemlerini ve i\u015flem sonucunu d�ner.
     * 
     * @param guvenlikBilgisi
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.AcikKalemDetay
     */
    @WebMethod(operationName = "OdenecekFaturalariGetirDetay", action = "http://milleni.com/online_tahsilat/OdenecekFaturalariGetirDetay")
    @WebResult(name = "OdenecekFaturalariGetirDetayResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "OdenecekFaturalariGetirDetay", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.OdenecekFaturalariGetirDetay")
    @ResponseWrapper(localName = "OdenecekFaturalariGetirDetayResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.OdenecekFaturalariGetirDetayResponse")
    public AcikKalemDetay odenecekFaturalariGetirDetay(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi);

    /**
     * M�\u015fteri numaras\u0131 ile m�\u015fterinin �denmeyi bekleyen faturalar\u0131 sorgulan\u0131r. �deme bekleyen kalemler ve i\u015flem sonucu d�ner.
     * 
     * @param guvenlikBilgisi
     * @param musteriNo
     * @return
     *     returns org.milleni.dunning.ws.client.tahsilat.AcikKalemDetay
     */
    @WebMethod(operationName = "AcikKalemlerDetay", action = "http://milleni.com/online_tahsilat/AcikKalemlerDetay")
    @WebResult(name = "AcikKalemlerDetayResult", targetNamespace = "http://milleni.com/online_tahsilat")
    @RequestWrapper(localName = "AcikKalemlerDetay", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.AcikKalemlerDetay")
    @ResponseWrapper(localName = "AcikKalemlerDetayResponse", targetNamespace = "http://milleni.com/online_tahsilat", className = "org.milleni.dunning.ws.client.tahsilat.AcikKalemlerDetayResponse")
    public AcikKalemDetay acikKalemlerDetay(
        @WebParam(name = "guvenlikBilgisi", targetNamespace = "http://milleni.com/online_tahsilat")
        GuvenlikBilgisi guvenlikBilgisi,
        @WebParam(name = "musteriNo", targetNamespace = "http://milleni.com/online_tahsilat")
        String musteriNo);

}