package com.iqbal.a10119209latihan7.view.informasi;
/*
    nim                 : 10119209
    nama                : Muhammad Iqbal Rosyidin
    kelas               : IF-5
*/
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iqbal.a10119209latihan7.R;
import com.iqbal.a10119209latihan7.models.InformasiItemModel;

import java.util.ArrayList;
import java.util.List;

public class InformasiFragment extends Fragment {
    ViewPager2 viewPager2;
    List<InformasiItemModel> informasiList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_informasi, container, false);

        viewPager2 = view.findViewById(R.id.viewpager);
        informasiList = new ArrayList<>();

        String[] judul = {"Version", "Tentang", "Dibuat Oleh"};
        String[] desc = {"Aplikasi Iqbal RestoAPP", "MakanApp adalah aplikasi menunjukkan rekomendasi tempat makan bagi yang berada di daerah bandung", "Akmal Jihad Fauzan - 10119258"};

        for (int i = 0; i < judul.length; i++) {
            InformasiItemModel item = new InformasiItemModel(judul[i], desc[i]);
            informasiList.add(item);
        }

        ViewPagerInformasiAdapter adapter = new ViewPagerInformasiAdapter(informasiList);

        viewPager2.setAdapter(adapter);
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);


        return view;
    }
}