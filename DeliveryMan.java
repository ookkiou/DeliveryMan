package DM;

import java.util.Objects;

public class DeliveryMan extends Person{
    protected static String[] DeliveryArea;
    public DeliveryMan(){
        super();
    }
    public DeliveryMan(String id,String name,String[] DeliveryArea){
        super(id,name);
        this.DeliveryArea = DeliveryArea;
    }

    public String[] getDeliveryArea() {
        return DeliveryArea;
    }

    public void setDeliveryArea(String[] deliveryArea) {
        DeliveryArea = deliveryArea;
    }
    public static boolean isArrived(String area){
        boolean a = false;
        for (String s : DeliveryArea) {
            if (Objects.equals(s, area)) {
                a = true;
                break;
            }
        }
        return a;
    }
    public String toString(){
        String str = "deliveryMan info\nId:"+getId()+"\nName:"+getName()+"\ndelivery area:";
        int i=0;
        for(i=0;i<DeliveryArea.length-1;i++){
            str+=DeliveryArea[i]+",";
        }
        return str+DeliveryArea[i];
    }
}
