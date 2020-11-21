/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kpp;

/**
 *
 * @author Maciek
 */
public class pytanie {

    private int numer;
    private String zapytanie;
 //   String tekstOdpowiedzi;
    private String odpowiedz1;
    private String odpowiedz2;
    private String odpowiedz3;
    private String odpowiedz4;
    private String odpowiedz5;
    private String odpowiedz11;
    private String odpowiedz21;
    private String odpowiedz31;
    private String odpowiedz41;
    private String odpowiedz51;
    private int prawidlowe;
    private int zaznaczone;

    public pytanie(int numer, String zapytanie, String odpowiedz1,String odpowiedz11,String odpowiedz2,String odpowiedz21, String odpowiedz3,String odpowiedz31,String odpowiedz4,String odpowiedz41,String odpowiedz5,String odpowiedz51, int prawidlowe )
    {this.numer=numer;
     this.zapytanie=zapytanie;
//     this.tekstOdpowiedzi=tekstodpowiedzi;
     this.odpowiedz1=odpowiedz1;
     this.odpowiedz2=odpowiedz2;
     this.odpowiedz3=odpowiedz3;
     this.odpowiedz4=odpowiedz4;
     this.odpowiedz5=odpowiedz5;
     this.odpowiedz11=odpowiedz11;
     this.odpowiedz21=odpowiedz21;
     this.odpowiedz31=odpowiedz31;
     this.odpowiedz41=odpowiedz41;
     this.odpowiedz51=odpowiedz51;
     this.prawidlowe=prawidlowe;
     this.zaznaczone=0;
             
    }

    public void setNumer(int a) {
        this.numer = a;
    }

    public int getNumer() {
        return this.numer;
    }

    public void setZapytanie(String a) {
        this.zapytanie = a;
    }

    public String getZapytanie() {
        return this.zapytanie;
    }

     

    public void setOdpowiedz1(String a) {
        this.odpowiedz1 = a;
    }

    public String getOdpowiedz1() {
        return this.odpowiedz1;
    }
    public void setOdpowiedz2(String a) {
        this.odpowiedz2 = a;
    }

    public String getOdpowiedz2() {
        return this.odpowiedz2;
    }
    public void setOdpowiedz3(String a) {
        this.odpowiedz3 = a;
    }

    public String getOdpowiedz3() {
        return this.odpowiedz3;
    }
    public void setOdpowiedz4(String a) {
        this.odpowiedz4 = a;
    }

    public String getOdpowiedz4() {
        return this.odpowiedz4;
    }
    public void setOdpowiedz5(String a) {
        this.odpowiedz5 = a;
    }

    public String getOdpowiedz5() {
        return this.odpowiedz5;
    }
    
    public void setOdpowiedz11(String a) {
        this.odpowiedz11 = a;
    }

    public String getOdpowiedz11() {
        return this.odpowiedz11;
    }
    public void setOdpowiedz21(String a) {
        this.odpowiedz21 = a;
    }

    public String getOdpowiedz21() {
        return this.odpowiedz21;
    }
    public void setOdpowiedz31(String a) {
        this.odpowiedz31 = a;
    }

    public String getOdpowiedz31() {
        return this.odpowiedz31;
    }
    public void setOdpowiedz41(String a) {
        this.odpowiedz41 = a;
    }

    public String getOdpowiedz41() {
        return this.odpowiedz41;
    }
    public void setOdpowiedz51(String a) {
        this.odpowiedz51 = a;
    }

    public String getOdpowiedz51() {
        return this.odpowiedz51;
    }
    public void setZaznaczone(int a) {
        this.zaznaczone = a;
    }

    public int getZaznaczone() {
        return this.zaznaczone;
    }
     public void setPrawidlowe (int a){
         this.prawidlowe=a;
     }
     public int getPrawidlowe(){
         return this.prawidlowe;
     }
}

