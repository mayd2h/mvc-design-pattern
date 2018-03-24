/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

public class controler extends model {
    double total;
    double TaxCalc;
    double sub;
        
        public void first(){
            total=super.priceJuice;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
         public void second(){
            total=super.priceSalad;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
          public void fourth(){
                total=super.priceChicken;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
           public void fifth(){
                        total=super.priceDrinks ;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
            public void sixth(){
                 total=super.priceJuice + super.priceSalad;
                    
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
             public void seventh(){
                      total=super.priceJuice + super.priceChicken;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
              public void eighth(){
                      total=super.priceJuice + super.priceDrinks;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
               public void ninth(){
                      total=super.priceSalad + super.priceChicken;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
                public void tenth(){
                      total=super.priceSalad + super.priceDrinks;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
                 public void eleventh(){
                      total=super.priceDrinks + super.priceChicken;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
                  public void twelvth(){
                      total=super.priceJuice + super.priceChicken+super.priceSalad;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
                   public void efr(){
                      total=super.priceSalad+ super.priceChicken+super.priceDrinks;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
                    public void fourtin(){
                                 total=super.priceJuice + super.priceChicken + super.priceDrinks;
            TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
                               public void fiftin(){
        total=super.priceJuice + super.priceChicken + super.priceDrinks+super.priceSalad;
       TaxCalc = super.VAT*total;
            sub = total+TaxCalc;
            System.out.println("Total cost of items is "+ total + "$");
            System.out.println("Total Tax Rate is "+ TaxCalc +"$" );
            System.out.println("Sub total of items is "+ sub + "$");
        }
}
