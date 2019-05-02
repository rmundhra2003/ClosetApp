package com.company;


import java.util.ArrayList;

public class Closet {
    private ArrayList<Jacket> jacketlist = new ArrayList<Jacket>();
    private ArrayList<Shirt> shirtlist = new ArrayList<Shirt>();
    private ArrayList<Pants> paintslist = new ArrayList<Pants>();
    private ArrayList<Footwears> footwearslist = new Arigt rayList<Footwears>();



    public ArrayList<Jacket> getJacketlist() {
        return jacketlist;
    }

    public void setJacketlist( Jacket j) {
        this.jacketlist.add(j) ;
    }

    public ArrayList<Shirt> getShirtlist() {
        return shirtlist;
    }

    public void setShirtlist(Shirt s) {
        Shirt shirt = new Shirt();
        shirt.setMater("");
        this.shirtlist.add(s);
    }

    public ArrayList<Pants> getPaintslist() {
        return paintslist;
    }

    public void setPaintslist(Pants p) {
        this.paintslist.add(p);
    }

    public ArrayList<Footwears> getFootwearslist() {
        return footwearslist;
    }

    public void setFootwearslist(Footwears f) {
        this.footwearslist.add(f);
    }



    public Closet(){

    }




}
