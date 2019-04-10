package com.zendev.gelamaitiara.data;

import java.util.ArrayList;

public class PembuatanData {

    public static String newline = System.getProperty("line.separator");

    public static String[][] data = new String[][]{
            {"Pembuatan Beras Rendang", "Makanan Khas Payakumbuh", "Tepung Beras Ketan" + newline + "Santan dari 2 Butir Kelapa" + newline + "Pandan" + newline+ "Gula Pasir" + newline + "Garam" , "1.Rebus 1 liter santan dengan daun pandan, gula dan garam hingga mengental" + newline + "2.Setelah mengental matikan api, dinginkan." + newline + "3.Ambil tepung beras dengan menggunakan piring, tuang satu gelas rebusan gula sedikit demi sedikit sambil diaduk hingga tepung beras mudah dibentuk." + newline + "4.Bentuk tepung beras menjadi persegi uk 4x4 cm, lakukan hingga adonan tepung beras ketan habis", "https://2.bp.blogspot.com/-1UNwMYYLbWQ/XKoB9SRusqI/AAAAAAAAACo/vcNRJJPHQRALLSveZ8-h1gBTyhbqMwsKACLcBGAs/s1600/IMG_20190309_110315.jpg"},
            {"Pembuatan Kipang", "Makanan Khas Payakumbuh", "½ kg Beras ketan" + newline + "½  kg Gula pasir" + newline + "Asam secukupnya" + newline + "Minyak goreng secukupnya", "1. Masak beras ketan seperti memasak nasi biasanya sampai matang dengan  cara dikukus. Cuci lagi dengan air" + newline + "2. Setelah matang, letakkan ketan di atas nampan." + newline + "3. Setelah itu jemur di panas matahari sampai kering .(seperti beras)" + newline + "4. Setelah kering , dinginkan sampai kering, Kemudian goreng sampai mengembang. Tunggu dingin" + newline + "5. Rebus air asam , angkat dan diamkan hingga jernih" + newline + "6. Sementara itu , larutkan gula pasir dengan air panas hingga menjadi air gula." + newline + "7. Rebus air gula dengan air asem sampai kental, Kemudian masukkan nasi ketan yang sudah digoreng , aduk sampai rata." + newline + "8. Masukkan kedalam cetakan dan padatkan . setelah padat segera potong potong kipang sebelum menjadi dingin." + newline + "9. Sementara itu , larutkan gula pasir dengan air panas hingga menjadi air gula.", "https://1.bp.blogspot.com/-CYSBxPsIr68/XKoB7G5-leI/AAAAAAAAACg/mwtpag9T6mEBAmv9EZ4zqdIOA67ACoGuwCLcBGAs/s1600/IMG_20190309_110239.jpg"},
            {"Pembuatan Batiah", "Makanan Khas Payakumbuh", "Beras Ketan" + newline + "Gula Merah" + newline + "Garam" + newline + "Penguat rasa" + newline + "Minyak goreng", "1. Rendam beras ketan" + newline + "2. Setelah di rendam buang air, lalu campuri beras ketan dengan gula merah, garam, dan penguat rasa" + newline + "3. Setelah itu tambahkan air lalu di masak" + newline + "4. Setelah itu tambahkan air lalu di masak" + newline + "5. Setelah di masak bentuk adonan menjadi bulat dengan cetakkan" + newline + "6. Setelah itu jemur hingga kering" + newline + "7. Setelah kering adonan di goreng dan siap untuk di sajikan", "https://3.bp.blogspot.com/-dP-rsxz7D3c/XKoB89r93RI/AAAAAAAAACk/5RLFw_ntCOsBDxAiHNG4IrY8-ZrCYUARgCLcBGAs/s1600/IMG_20190309_110335.jpg"},
            {"Pembuatan Gelamai", "Makanan Khas Payakumbuh", "Santan Kental" + newline + "Santan Encer" + newline + "Gula Merah, Diiris Halus" + newline + "Garam" + newline + "Tepung Beras Ketan", "1. Rebus santan kental dengan setengah bagian santan encer." + newline + "2.Masukkan gula dan garam. Setelah mendidih, angkat." + newline + "3.Sisa santan diaduk ke dalam tepung." + newline + "4.Tuang ke dalam rebusan sambil terus diaduk hingga berminyak." + newline + "5.Siapkan loyang 12×12 cm yang dioles minyak goreng." + newline + "6.Tuang adonan lalu biarkan dingin." + newline + "7.Potong-potong sebelum disajikan.", "https://2.bp.blogspot.com/-NDmQtpsBL6w/XKoLcb-DU6I/AAAAAAAAAC8/YnwLijoVne4axTJ3DEktZtutzWT1_r4OwCLcBGAs/s1600/InShot_20190407_213354348.jpg"}
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
