package com.zendev.gelamaitiara.data;

import java.util.ArrayList;

public class PembuatanData {

    public static String newline = System.getProperty("line.separator");

    public static String[][] data = new String[][]{
            {"Pembuatan Beras Rendang", "Makanan Khas Payakumbuh", "1/2 Air Mentah" + newline + "1 Batu Bata", "1. Masukkan Air" + newline + "2. Bla Bla Bla" + newline + "3. asdasdasd", "https://2.bp.blogspot.com/-1UNwMYYLbWQ/XKoB9SRusqI/AAAAAAAAACo/vcNRJJPHQRALLSveZ8-h1gBTyhbqMwsKACLcBGAs/s1600/IMG_20190309_110315.jpg"},
            {"Pembuatan Kipang", "Makanan Khas Payakumbuh", "1/2 Air Mentah" + newline + "1 Batu Bata", "1. Masukkan Air" + newline + "2. Bla Bla Bla" + newline + "3. asdasdasd", "https://1.bp.blogspot.com/-CYSBxPsIr68/XKoB7G5-leI/AAAAAAAAACg/mwtpag9T6mEBAmv9EZ4zqdIOA67ACoGuwCLcBGAs/s1600/IMG_20190309_110239.jpg"},
            {"Pembuatan Batiah", "Makanan Khas Payakumbuh", "1/2 Air Mentah" + newline + "1 Batu Bata", "1. Masukkan Air" + newline + "2. Bla Bla Bla" + newline + "3. asdasdasd", "https://3.bp.blogspot.com/-dP-rsxz7D3c/XKoB89r93RI/AAAAAAAAACk/5RLFw_ntCOsBDxAiHNG4IrY8-ZrCYUARgCLcBGAs/s1600/IMG_20190309_110335.jpg"},
            {"Pembuatan Gelamai", "Makanan Khas Payakumbuh", "1/2 Air Mentah" + newline + "1 Batu Bata", "1. Masukkan Air" + newline + "2. Bla Bla Bla" + newline + "3. asdasdasd", "https://2.bp.blogspot.com/-NDmQtpsBL6w/XKoLcb-DU6I/AAAAAAAAAC8/YnwLijoVne4axTJ3DEktZtutzWT1_r4OwCLcBGAs/s1600/InShot_20190407_213354348.jpg"}
    };

    public static ArrayList<Pembuatan> getListData(){
        Pembuatan pembuatan = null;
        ArrayList<Pembuatan> list = new ArrayList<>();
        for (String[] aData : data){
            pembuatan = new Pembuatan();
            pembuatan.setName(aData[0]);
            pembuatan.setKategori(aData[1]);
            pembuatan.setKomposisi(aData[2]);
            pembuatan.setPembuatan(aData[3]);
            pembuatan.setImage(aData[4]);

            list.add(pembuatan);
        }
        return list;
    }
}
