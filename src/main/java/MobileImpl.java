import java.util.ArrayList;
import java.util.List;
public class MobileImpl
{
    public static void main(String[] args)
    {
        MobileStore mobileStore = new MobileStore();
        List<Mobile> mobileData = new ArrayList<>();
        mobileData = mobileStore.readMobileData("D:\\mobile.csv");
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("All Mobiles Details");
        for (Mobile data : mobileData)
            System.out.println(data);
        System.out.println();
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------------");
        List<Mobile> mobileBrandName = mobileStore.findPhoneByBrand("Samsung");
        System.out.println("Mobile As Per Brand Name");
        for (Mobile data : mobileBrandName)
            System.out.println(data);
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------------");
        List<Mobile> mPrice = mobileStore.findPhoneCostMoreThan500$();
        System.out.println("Mobile Which Is More Than 500$");
        for (Mobile price : mPrice)
            System.out.println(price);
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------");
        List<Mobile> mobilePixel = mobileStore.findPhonePixelMoreThan12MP();
        System.out.println("Mobile Phone Which is Having More Than 12Pixel");
        for (Mobile pixel : mobilePixel)
            System.out.println(pixel);

    }


}
