package com.pluralsight.finance;

import com.sun.jdi.Value;

import java.math.BigDecimal;
import java.util.List;

public class Portifolio {

    private String nome;
    private String owner;
    private List<Valuable> assets;

    public Portifolio(String nome, String owner, List<Valuable> assets) {
        this.nome = nome;
        this.owner = owner;
        this.assets = assets;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Valuable> getAssets() {
        return assets;
    }

    public void setAssets(List<Valuable> assets) {
        this.assets = assets;
    }

    public void add(Valuable valuable){
        this.assets.add(valuable);
    }

   public BigDecimal getValue(){
//      BigDecimal value = BigDecimal.ZERO ;

//       for(Valuable valuable : assets) {
//           value = value.add(valuable.getValue());
//
//       }
       BigDecimal value = assets.stream()
               .map(Valuable::getValue)
               .reduce(BigDecimal.ZERO, BigDecimal::add);

       return value;
   }


   public BigDecimal getMostValuable(){
//       Valuable mostValuable = assets.get(0);
//        for(Valuable valuable : assets) {
//            if (valuable.getValue().compareTo(mostValuable.getValue()) > 0) {
//                mostValuable = valuable;
//            }
//
//        }
//        return mostValuable;

        return assets.stream()
                .map(Valuable::getValue)
                .max(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);




   }

   public BigDecimal getLowestValuable(){
//        Valuable lowestValuable = assets.get(0);
//        for(Valuable valuable : assets) {
//            if (valuable.getValue().compareTo(lowestValuable.getValue()) < 0) {
//                lowestValuable = valuable;
//            }
//        }

        return assets.stream()
                .map(Valuable::getValue)
                .min(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);
   }

}
