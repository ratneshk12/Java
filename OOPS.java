public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor( "yellow");
        System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    Void setColor(String newcolor){
        color = newcolor;
        return null;
    }

    void setTip(int newtip){
        tip = newtip;
    }
}
