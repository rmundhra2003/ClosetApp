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
        Jacket jacket = new Jacket();
        jacket.setSize(3);
        jacket.setColor("brown");
        jacket.setMaterial("polime");
        jacket.setSleeveType("heart");
        this.jacketlist.add(j) ;
    }

    public ArrayList<Shirt> getShirtlist() {
        return shirtlist;
    }

    public void setShirtlist(Shirt s) {
        Shirt shirt = new Shirt();
        shirt.setSize(4);
        shirt.setColor("yello");
        shirt.setMaterial("coton");
        shirt.setSleeveType("short");
        this.shirtlist.add(s);
    }

    public ArrayList<Pants> getPaintslist() {
        return paintslist;
    }

    public void setPaintslist(Pants p) {
        Pants pants = new Pants();
        pants.setSize(6);
        pants.setColor("black");
        pants.setMaterial("nilon");
        pants.setType("long");
        this.paintslist.add(p);
    }

    public ArrayList<Footwears> getFootwearslist() {
        return footwearslist;
    }

    public void setFootwearslist(Footwears f) {
        Footwear footwear = new Footwear();
        footwear.setBrand("Polo");
        footwear.setMatterial("heo");
        footwear.setSize(5);
        footwear.setStle("tradition");
        this.footwearslist.add(f);
    }



    public Closet(){

    }




}
