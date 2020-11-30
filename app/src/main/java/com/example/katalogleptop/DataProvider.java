package com.example.katalogleptop;

import android.content.Context;

import com.example.katalogleptop.Model.Acer;
import com.example.katalogleptop.Model.Lenovo;
import com.example.katalogleptop.Model.Leptop;
import com.example.katalogleptop.Model.Toshiba;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Leptop> leptops = new ArrayList<>();

    private static List<Acer> initDataAcer(Context ctx) {
        List<Acer> acers = new ArrayList<>();
        acers.add(new Acer("acer_aspire_v5", "Acer",
                "Acer Aspire V5 dengan prosesor AMD Dual Core yang dapat memproses data dengan kecepatan 1GHz. Dilengkapi juga dengan RAM DDR3 berkapasitas 2Gb yang akan sangat membantu kinerja dari prosesor tersebut",R.drawable.acer_aspire_v5));
        acers.add(new Acer("acer_s1", "Acer",
                "Laptop Acer seri s1 ini didukung dengan prosesor Quad-Core N4200 berkecepatan 1.10 GHz berukuran layar 14 inch",R.drawable.acer_s1));
        acers.add(new Acer("acer_swift_3_sf31_54", "Acer",
                "Acer Swift 3 memiliki spesifikasi optimal yang bisa memaksimalkan produktivitas Menggunakan prosesor Intel® CoreTM i5-6200U dengan RAM sebesar 4GB DDR4, kinerja Acer Swift 3 ", R.drawable.acer_swift_3_sf31_54));
         return acers;
    }

    private static List<Lenovo> initDataLenovo(Context ctx) {
        List<Lenovo> lenovos = new ArrayList<>();
        lenovos.add(new Lenovo("lenovo_300", "Lenovo",
                "LENOVO 300 dengan Spesifikasi Intel Pentium Quad Core N3150 HDD 500Gb", R.drawable.lenovo_300));
        lenovos.add(new Lenovo("lenovo_i300", "Lenovo",
                "lenovo _i300 14 inch laptops wirh OS Windows 10 and the latest Intel Core processor and fast connection speed", R.drawable.lenovo_i300));
        lenovos.add(new Lenovo("LENOVO ThinkBook 20RS001HID (Core i5-10210U)", "Lenovo",
                "LENOVO Thinkbook 14s merupakan laptop bisnis yang tak hanya memiliki performa bertenaga, namun juga desain yang stylish. Laptop besutan LENOVO ini sangat cocok untuk kebutuhan pebsinis muda yang aktif dan juga memiliki produktivitas tinggi.", R.drawable.lenovo_thinkbook));// ingat di ganti
        return lenovos;
    }
    private static List<Toshiba> initDataToshiba(Context ctx) {
        List<Toshiba> toshibas = new ArrayList<>();
        toshibas.add(new Toshiba("toshiba_portege", "Toshiba",
                "toshiba_portage Corei5 3210M 3.1GHz,2.5GHz Corei5 3320M 3.3GHz,2.6GHz Corei7 3520M 3.6GHz,2.9GHz", R.drawable.toshiba_portege));
        toshibas.add(new Toshiba("toshiba_portege_830_l\", ", "Toshiba",
                "Portege Series telah lama dikenal sebagai jajaran laptop Toshiba yang hadir dengan desain tipis dan menawan", R.drawable.toshiba_portege_830_2083u_l_1));
        toshibas.add(new Toshiba("toshiba_portage_830", "Toshiba",
               "Toshiba Portage 830 Display Intel Core i3 2367M 1.4GHz 4CPUs 4GB RAM SSD 120GB Placa video Intel HD 3000 USB 3.0", R.drawable.toshiba_portege_830_l_1));
       return toshibas;
    }

    private static void initAllLeptop(Context ctx) {
        leptops.addAll(initDataAcer(ctx));
        leptops.addAll(initDataLenovo(ctx));
        leptops.addAll(initDataToshiba(ctx));
    }

    public static List<Leptop> getAllLeptop(Context ctx) {
        if (leptops.size() == 0) {
            initAllLeptop(ctx);
        }
        return  leptops;
    }

    public static List<Leptop> getLeptopsByTipe(Context ctx, String jenis) {
        List<Leptop> leptopsByType = new ArrayList<>();
        if (leptopsByType.size() == 0) {
            initAllLeptop(ctx);
        }
        for (Leptop h : leptops) {
            if (h.getJenis().equals(jenis)) {
                leptopsByType.add(h);
            }
        }
        return leptopsByType;
    }

}

