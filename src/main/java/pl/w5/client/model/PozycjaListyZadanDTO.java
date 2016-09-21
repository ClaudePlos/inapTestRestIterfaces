/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.w5.client.model;

import java.io.Serializable;
//import pl.nap.zad.ZadanieVO;

/**
 *
 * @author k.skowronski
 */
// klasa do transferu listy zadan uzytkownika - wysylamy zamiast Zadanie dla obslugi zadan masowych
public class PozycjaListyZadanDTO implements Serializable
{
    public static String TYP_REKORDU_GRUPA = "GRUPA";
    public static String TYP_REKORDU_ZADANIE = "ZADANIE";
    
    
    private String typRekordu; // czy 
    
    
    private String tytulZadania; 
    private Long iloscZadan; 
    private String kodTypuZadania; 
    
    
    //private ZadanieVO zadanie; // zadanie - jesli jest to pojedncze

    public String getTytulZadania() {
        return tytulZadania;
    }

    public void setTytulZadania(String tytulZadania) {
        this.tytulZadania = tytulZadania;
    }

    public String getTypRekordu() {
        return typRekordu;
    }

    public void setTypRekordu(String typRekordu) {
        this.typRekordu = typRekordu;
    }

    /*public ZadanieVO getZadanie() {
        return zadanie;
    }

    public void setZadanie(ZadanieVO zadanie) {
        this.zadanie = zadanie;
    }*/

    public Long getIloscZadan() {
        return iloscZadan;
    }

    public void setIloscZadan(Long iloscZadan) {
        this.iloscZadan = iloscZadan;
    }

    public String getKodTypuZadania() {
        return kodTypuZadania;
    }

    public void setKodTypuZadania(String kodTypuZadania) {
        this.kodTypuZadania = kodTypuZadania;
    }
    
    
}
