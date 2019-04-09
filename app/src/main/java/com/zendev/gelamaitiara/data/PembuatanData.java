package com.zendev.gelamaitiara.data;

import java.util.ArrayList;

public class PembuatanData {

    public static String[][] data = new String[][]{
            {"Pembuatan Beras Rendang", "Makanan Khas Payakumbuh", "Pendiri Amazon ini Memiliki Total Kekayaan 112 Miliar Dollar AS", "https://2.bp.blogspot.com/-1UNwMYYLbWQ/XKoB9SRusqI/AAAAAAAAACo/vcNRJJPHQRALLSveZ8-h1gBTyhbqMwsKACLcBGAs/s1600/IMG_20190309_110315.jpg"},
            {"Pembuatan Kipang", "Makanan Khas Payakumbuh", "Pendiri Microsoft ini Memiliki Total Kekayaan 90 Miliar Dollar AS", "https://1.bp.blogspot.com/-CYSBxPsIr68/XKoB7G5-leI/AAAAAAAAACg/mwtpag9T6mEBAmv9EZ4zqdIOA67ACoGuwCLcBGAs/s1600/IMG_20190309_110239.jpg"},
            {"Pembuatan Batiah", "Makanan Khas Payakumbuh", "Pemilik Saham Berkshire Hathaway ini Memiliki Total Kekayaan 84 Miliar Dollar AS", "https://3.bp.blogspot.com/-dP-rsxz7D3c/XKoB89r93RI/AAAAAAAAACk/5RLFw_ntCOsBDxAiHNG4IrY8-ZrCYUARgCLcBGAs/s1600/IMG_20190309_110335.jpg"},
            {"Pembuatan Gelamai", "Makanan Khas Payakumbuh", "Pemilik Brand Louis Vuitton ini Memiliki Total Kekayaan 72,2 Miliar Dollar AS", "https://2.bp.blogspot.com/-NDmQtpsBL6w/XKoLcb-DU6I/AAAAAAAAAC8/YnwLijoVne4axTJ3DEktZtutzWT1_r4OwCLcBGAs/s1600/InShot_20190407_213354348.jpg"}
    };

    public static ArrayList<Pembuatan> getListData(){
        Pembuatan pembuatan = null;
        ArrayList<Pembuatan> list = new ArrayList<>();
        for (String[] aData : data){
            pembuatan = new Pembuatan();
            pembuatan.setName(aData[0]);
            pembuatan.setPembuatan(aData[1]);
            pembuatan.setDescription(aData[2]);
            pembuatan.setImage(aData[3]);

            list.add(pembuatan);
        }
        return list;
    }
}
