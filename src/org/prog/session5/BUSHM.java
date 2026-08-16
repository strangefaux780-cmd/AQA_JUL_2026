package org.prog.session5;
import java.util.Random;
public class BUSHM {
    String numberBus;
    String roUteB;
    int carGOMax=2000;
    int cargoMin=400;
    int numBerPointsstandart=35;
    public static int totalDistance=0;
    public void goRouteB(Route route) {
        Random random = new Random();
        int kilomeTrs = route.distance;
        int carGo = random.nextInt(2500);
        int numBerPoints;
        numBerPoints = random.nextInt(90);
        if (carGo <= cargoMin) {
            System.out.println("bus not transfer" + "--" + carGo + "--" + route.distance + "--" + numberBus + "--" + route.name + "--" + numBerPoints);
        } else if (carGo > carGOMax) {
            System.out.println("bus overload and not transfer" + "--" + carGo + "--" + route.distance + "--" + numberBus + "--" + route.name + "--" + numBerPoints);
        }
        else if (numBerPoints<numBerPointsstandart){
            System.out.println("The bus isn't running because there aren't enough stops"+ "--" + carGo + "--" + route.distance + "--" + numberBus + "--" + route.name + "--" + numBerPoints);
        }
        else {
            System.out.println("bus transfer"+"--"+ carGo + "--" + route.distance + "--" + numberBus+"--"+route.name+"--"+numBerPoints);
        }
         {

        }
        }
    }









