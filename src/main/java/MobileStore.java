import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobileStore {

    List<Mobile> list1 = new ArrayList<>();

    public MobileStore() {

    }

    public List<Mobile> readMobileData(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String str;
            br.readLine();

            while ((str = br.readLine()) != null)
            {
                String[] temp = str.split(",");
                double price = Double.parseDouble(temp[2]);
                int pixel = Integer.parseInt(temp[6]);
                Mobile obj = new Mobile(temp[0], temp[1], price, temp[3], temp[4], temp[5], pixel);
                list1.add(obj);
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return list1;
    }

    //Find phones of a particular brand.
    public List<Mobile> findPhoneByBrand(String brandName)
    {
        List<Mobile> list2 = new ArrayList<>();
        for (Mobile m : list1)
        {
            if (m.getBrandName().equalsIgnoreCase(brandName)) {
                list2.add(m);
            }
        }
        return list2;
    }

    //Find the phones whose cost is $500 and above.
    public List<Mobile> findPhoneCostMoreThan500$() {
        List<Mobile> list3 = new ArrayList<>();
        for (Mobile m : list1)
        {
            if (m.getCost() > 500) {
                list3.add(m);
            }
        }
        return list3;
    }

    //Enlist the phones which have camera specification as 12 MP and more
    public List<Mobile> findPhonePixelMoreThan12MP()
    {
        List<Mobile> list4 = new ArrayList<>();
        for (Mobile m : list1) {
            if (m.getCameraPixels() > 12) {
                list4.add(m);
            }
        }
        return list4;
    }
}
