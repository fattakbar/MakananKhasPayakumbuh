package com.zendev.gelamaitiara.data;

import java.util.ArrayList;

public class FoodData {

    public static String newline = System.getProperty("line.separator");

    public static String[][] data = new String[][]{
            {"Beras Rendang", "Makanan Khas Payakumbuh", "Besar Rp. 12.500" + newline + "Menengah Rp. 8.000", "Beras Rendang merupakan salah satu makanan khas kota Payakumbuh disamping Batiah dan Gelamai. Makanan ini terbuat dari beras ketan yang dicampur dengan beberapa bahan tertentu. Warnanya putih dan rasanya manis. Untuk mendapatkan sangat mudah, apalagi jika anda berkunjung ke Payakumbuh ada banyak penjual bareh randang dan makanan khas tradisional lainnya. Selain di Payakumbuh mungkin anda bisa mendapatkannya di Kota Padang, Bukittinggi dan kota-kota lainnya di Sumatera Barat.", "https://2.bp.blogspot.com/-1UNwMYYLbWQ/XKoB9SRusqI/AAAAAAAAACo/vcNRJJPHQRALLSveZ8-h1gBTyhbqMwsKACLcBGAs/s1600/IMG_20190309_110315.jpg"},
            {"Kipang", "Makanan Khas Payakumbuh", "Rp. 4.000", "Kipang merupakan kue kering yang enak dan manis yang banyak disukai anak-anak dan orang dewasa. Bentuk dari kue jipang/gipang bentuknya itu sendiri adalah persegi panjang  dengan warna putih ada juga yang berwarna agak kecoklatan. Kipang bukan hanya dapat dijumpai di daerah payakumbuh dan skitarnya, tetapi juga banyak ditemui di daerah-daerah indonesai lainnya seperti daerah-daerah jawa", "https://1.bp.blogspot.com/-CYSBxPsIr68/XKoB7G5-leI/AAAAAAAAACg/mwtpag9T6mEBAmv9EZ4zqdIOA67ACoGuwCLcBGAs/s1600/IMG_20190309_110239.jpg"},
            {"Batiah", "Makanan Khas Payakumbuh", "Rp. 12.000", "Batiah adalah salah satu makanan khas Minangkabau yang berasal dari Payakumbuh. Batiah merupakan makanan yang berasal dari beras. Batiah sangat mudah Anda temui di Kota Payakumbuh dan daerah lainnya seperti Padang, Bukittinggi, dan lain-lain.", "https://3.bp.blogspot.com/-dP-rsxz7D3c/XKoB89r93RI/AAAAAAAAACk/5RLFw_ntCOsBDxAiHNG4IrY8-ZrCYUARgCLcBGAs/s1600/IMG_20190309_110335.jpg"},
            {"Gelamai", "Makanan Khas Payakumbuh", "Besar Petak Rp. 12.500" + newline + "Besar Bulat Rp. 12.500" + newline + "Menengah Petak Rp. 8.000", "Gelamai adalah penganan dibuat dari tepung beras pulut, gula, dan santan; dodol; (KBBI)" + newline + "Makanan ini berasal dari daerah Payakumbuh, Sumatera Barat. Makanan ini terbuat dari bahan beras ketan dan gula aren. Citarasa makanan ini sangat legit. Makanan ini sepintas mirip dengan makanan dari Jawa Barat, yaitu Dodol Garut. Cuma berbeda dalam cara penyajian.", "https://2.bp.blogspot.com/-NDmQtpsBL6w/XKoLcb-DU6I/AAAAAAAAAC8/YnwLijoVne4axTJ3DEktZtutzWT1_r4OwCLcBGAs/s1600/InShot_20190407_213354348.jpg"}
    };

    public static ArrayList<Food> getListData(){
        Food food = null;
        ArrayList<Food> list = new ArrayList<>();
        for (String[] aData : data){
            food = new Food();
            food.setName(aData[0]);
            food.setFood(aData[1]);
            food.setPrice(aData[2]);
            food.setDescription(aData[3]);
            food.setImage(aData[4]);

            list.add(food);
        }
        return list;
    }
}

