public class ColorTv extends TV {
    String type;
    ColorTv(String type, String company, int size)
    {
        super(company, size);
        this.type = type;
    }
    void show(){
        System.out.println("Type: "+type);
        super.show();
    }
    public static void main(String args[])
    {
        ColorTv ob=new ColorTv("UHD","Samsung", 55);
        ob.show();
    }
}

class TV{
    String companyName;
    int screenSize;
    TV(String company, int size)
    {
        companyName=company;
        screenSize=size;
    }
    void show()
    {
        System.out.println("Company Name: "+companyName+" Screen size: "+screenSize);
    }
}