package org.prog.session8;

public class Android implements Iphone {
    String color;
    String model;
    String contacts;
    String owner;
    public Android (String color,String model,String contacts,String owner) {
        this.color = color;
        this.model = model;
this.contacts=contacts;
this.owner=owner;
    }
      //  @Override
      //  public boolean equals(Object Obj){
         //   if(Obj instanceof Android){
           //     Android andr=(Android) Obj;
             //   boolean isequals=this.color.equals(andr.color)
                //        && this.model.equals(andr.model);
              //  return isequals;
            //}
           // return false;
       // }

    @Override
    public void unklockPhone(){
        System.out.println("android uncklock fingers ");
    }
    public int hashCode(){return (this.color+this.model+this.contacts+this.owner).hashCode();}
    @Override
    public String toString() {
        return "Android [color=" + color + ", model=" + model + ", contacts=" + contacts + ", owner=" + owner + "]";
    }
}


