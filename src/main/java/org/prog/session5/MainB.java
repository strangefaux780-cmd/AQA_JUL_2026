package org.prog.session5;
public class MainB {
    public static void main (String[] args) {
        Route route1=new Route("Khmelnitskiy-Slavuta",120);
        Route route2=new Route("Khmelnitskiy-Shepetivka",101);
        Route route3=new Route("Khmelnitskiy-Izyaslav",106);
        Route route4=new Route("Khmelnitskiy-Krasilov",40);;
        Route route5=new Route("Khmelnitskiy-Stara-Sinyava",65);
        BUSHM bus1 = new BUSHM();
        bus1.numberBus = "Spinter-BX2327RT";
        bus1.goRouteB(route1);
        BUSHM bus2 = new BUSHM();
        bus2.numberBus="Crafter-BX6754QW";
        bus2.goRouteB(route2);
        BUSHM bus3=new BUSHM();
        bus3.numberBus="Sprinter-BX9876YT";
        bus3.goRouteB(route3);
        BUSHM bus4 =new BUSHM();
        bus4.numberBus="Crafter-BX7809PO";
        bus4.goRouteB(route4);
        BUSHM bus5=new BUSHM();
        bus5.numberBus="Renault-BX9087YT";
        bus5.goRouteB(route5);


    }

}