package com.example.tamarapuspa.bunnycare_fix.JenisPenyakit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.tamarapuspa.bunnycare_fix.HomeAct;
import com.example.tamarapuspa.bunnycare_fix.R;

import java.util.ArrayList;

public class JenisPenyakitAct extends AppCompatActivity {

    private static final String TAG = "JenisKelinciAct";

    //vars
    private ArrayList<String> mNamaPenyakit = new ArrayList<>();
    private ArrayList<String> mDefinisi = new ArrayList<>();
    private ArrayList<String> mGejala = new ArrayList<>();
    private ArrayList<String> mSolusi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_penyakit);

        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

        ImageView btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(JenisPenyakitAct.this, HomeAct.class);
                startActivity(gotohome);
            }
        });
    }

    private void initImageBitmaps(){
       // Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mNamaPenyakit.add("Enteritis");
        mDefinisi.add("Penyakit ini menyerang alat pencernaan kelinci dan dipercaya menjadi penyebab kematian paling umum pada kelinci. \n" +
                "\nAnak-anak kelinci yang belum disapih lebih rentan terkena penyakit ini dibandingkan dengan kelinci dewasa. Anak kelinci ini, jika sembuh, pertumbuhan badannya akan kurang baik.\n" +
                "\nPada kelinci dewasa, penyebab penyakit ini adalah pakan yang kurang mengandung serat kasar. Kebalikannya, anak kelinci yang terlalu banyak memperoleh serat kasar justru rentan terkena penyakit ini.\n" +
                "\nUdara dingin, kendang yang lembap dan basah, serta kendang yang tidak terlindung dari angin malam juga menjadi pemicu penyakit ini secara tidak langsung.\n");
        mGejala.add("1.\tKelinci terlihat malas dan lemas tidak bias berdiri.\n" +
                "2.\tDaun telinga turun dan mata memicing.\n" +
                "3.\tGigi bergemeletuk menahan sakit.\n" +
                "4.\tKelinci sering merasa haus, selalu mendekati air minum.\n" +
                "5.\tKotoran kelinci berwarna hijau gelap, bau, berlendir, dan menggantung pada dubur.\n");
        mSolusi.add("1.\tMengganti pakan dan air minum yang ada di kendang dengan yang baru.\n" +
                "2.\tSelama 1 hari kelinci diberi pakan hay atau daun kacang kering.\n" +
                "3.\tKelinci diberi antibiotik yang dicampurkan pada makanan induk yang sedang menyusui atau dicampurkan ke dalam air minum kelinci yang sakit.\n" +
                "4.\tSetelah sembuh, kelinci dapat diberi pakan seperti biasa.\n");

        mNamaPenyakit.add("Favus");
        mDefinisi.add("Penyakit favus adalah penyakit yang disebabkan oleh gangguan jamur yang terdapat pada kulit kepala yang berbentuk seperti sisik berwarna merah tebal dan keras, hal ini dapat mengakibatkan rambut rontok serta kulit kepala kelinci pecah-pecah.\n");
        mGejala.add("1.\tKelinci terlihat malas dan lemas tidak bisa berdiri.\n" +
                "2.\tSerangan pada kulit kepala menimbulkan sisik berbentuk bulat pipih, merah, dan keras.\n" +
                "3.\tKulit kepala nampak pecah-pecah.\n" +
                "4.\tBulu di sekitar wilayah terinfeksi rontok.\n");
        mSolusi.add("1.\tBagian yang sakit dicuci dengan air sabun yang hangat.\n" +
                "2.\tSetelah bersih, kelinci dikeringkan.\n" +
                "3.\tObati bagian yang sakit dengan salep belerang atau scabicide cream.\n");

        mNamaPenyakit.add("Influenza");
        mDefinisi.add("Penyakit ini menyerang saluran pernafasan pada kelinci. Mekanisme pertahanan tubuh kelinci ada pada bagian saluran pernafasan, pada saat adanya benda asing (bisa debu, bakteri/virus, atau lainnya) maka dinding saluran nafas akan memproduksi lendir guna mengeluarkan benda asing tersebut sehingga akan muncul bersin - pilek.\n" +
                "\nPenyebab penyakit ini adalah perubahan cuaca, lingkungan peternakan yang lembap dan basah, serta sirkulasi udara di kendang yang buruk.\n");
        mGejala.add("1.\tKelinci terlihat malas dan lemas tidak bisa berdiri.\n" +
                "2.\tHidung mengeluarkan lender, baik bening maupun keruh.\n" +
                "3.\tKaki depan selalu berusaha menggaruk hidung.\n" +
                "4.\tKaki dan bulu badannya ikut basah.\n" +
                "5.\tMata sembab, basah, dan berair.\n");
        mSolusi.add("1.\tMembuat saluran pembuangan air yang baik.\n" +
                "2.\tKepadatan jumlah kelinci pada area peternakan dibatasi.\n" +
                "3.\tMemberikan pakan dengan nutrisi yang cukup.\n" +
                "4.\tKelinci dikeluarkan dari kendang agar dapat banyak bergerak.\n" +
                "5.\tKelinci cukup mendapat sinar matahari pagi.\n" +
                "6.\tKelinci yang sudah terlanjut terserang influenza dapat diobati dengan cara menyemprot hidungnya dengan larutan antiseptik.\n");

        mNamaPenyakit.add("Kanker Telinga");
        mDefinisi.add("Penyebab penyakit ini awalnya adalah kutu yang hidup di permukaan kulit bagian dalam telinga. Kutu ini menyebabkan kulit terluka, lalu terus berkembang menjadi kanker.\n");
        mGejala.add("1.\tKelinci terlihat malas dan lemas tidak bisa berdiri.\n" +
                "2.\tRasa gatal dan sakit pada telinga yang terserang.\n" +
                "3.\tKepala kelinci sering digoyang-goyang atau digeleng-gelengkan.\n" +
                "4.\tKelinci sering menggosok-gosokan daun telinganya, sehingga telinganya menjadi kemerah-merahan.\n" +
                "5.\tKeluar cairan dari jaringan yang rusak. Jika dibiarkan cairan ini akan mengeras dan membentuk kerak.\n");
        mSolusi.add("1.\tPada stadium awal, bagian luka diolesi salep dan diberi obat pembasmi kutu.\n" +
                "2.\tDiolesi ramuan obat yang terbuat dari campuran 1 bagian yodium, 25 bagian minyak kelapa, dan 10 bagian alkohol. Obat ini dioleskan menggunakan kapan pada bagian yang luka.\n");

        mNamaPenyakit.add("Koksidiosis");
        mDefinisi.add("Penyakit ini merupakan salah satu penyakit yang ditakuti peternak kelinci, karena tingkat kematian akibat penyakit ini cukup tinggi. Koksidiosis terutama menyerang kelinci yang dipelihara di atas lantai dan kelinci muda.\n" +
                "\nPenularan penyakit ini lewat mulut. Bibit penyakit ini menginfeksi kelinci lewat makanan, air minum, atau dijilati kelinci. Kuman masuk, kemudian menyerang usus dan hati kelinci.\n");
        mGejala.add("1.\tKelinci terlihat malas dan lemas tidak bisa berdiri.\n" +
                "2.\tNafsu makan menurun, sehingga berat badan merosot.\n" +
                "3.\tGigi bergemeletuk menahan sakit.\n" +
                "4.\tKotorannya cair serta bercampur darah atau berlendir putih.\n");
        mSolusi.add("1.\tKelinci diobati dengan obat-obatan yang mengandung sulfa untuk menghambat diare.\n" +
                "2.\tMenjaga kebersihan kendang kelinci.\n" +
                "3.\tMenjaga sirkulasi udara kendang kelinci.\n");

        mNamaPenyakit.add("Mencret");
        mDefinisi.add("Mencret pada kelinci biasanya disertai dengan kembung pada perut kelinci. Jika tidak segera diobati maka kelinci tersebut bisa mati dalam keadaan kembung.\n" +
                "\nPenyakit ini sering menimpa banyak ternak kelinci, sehingga harus sangat diwaspadai. " +
                "\nPenyebab utama penyakit ini adalah sebagai berikut.\n" +
                "a.\tTidak seimbangnya kandungan serat, protein, lmeak, dan zat gizi lainnya dalam pakan kelinci.\n" +
                "b.\tKotornya lingkungan peternakan, sehingga bakteri masuk ke dalam tubuh kelinci melalui udara, makanan, atau minuman.\n" +
                "c.\tSuhu udara atau suhu kendang yang terlalu dingin.\n" +
                "d.\tBerganti-ganti makanan secara drastis.\n");
        mGejala.add("1.\tKelinci terlihat malas dan lemas tidak bisa berdiri.\n" +
                "2.\tMata terlihat sayu.\n" +
                "3.\tKeaktifan kelinci berkurang.\n" +
                "4.\tGigi bergemeletuk, karena menahan sakit.\n" +
                "5.\tKelinci sering minum, karena merasa haus terus menerus.\n" +
                "6.\tKotoran kelinci lembek atau agak encer.\n");
        mSolusi.add("1.\tPeternak dapat mengeluarkan kelinci dari kendang dan  melepaskannya di area peternakan.\n" +
                "2.\tMenjemur kelinci yang sakit di pagi hari.\n" +
                "3.\tMengurangi pemberian makanan basah, diganti dengan hay atau pellet.\n" +
                "4.\tSaat malam hari, kelinci dikandangkan di tempat tertutup dan diberi lampu 5 watt.\n");

        mNamaPenyakit.add("Pneumonia");
        mDefinisi.add("Pneumonia  alias radang paru-paru termasuk jenis penyakit yang sulit disembuhkan. Penyakit ini berhubungan dengan kinerja paru-paru pada kelinci. " +
                "\nKelinci yang terinfeksi penyakit ini biasanya yang kondisinya sedang lemah. Misalnya, induk yang akan dan baru beranak, kelinci yang terlambat diberi makan, serta kelinci yang kedinginan.\n");
        mGejala.add("1.\tKelinci terlihat malas dan lemas tidak bisa berdiri.\n" +
                "2.\tKepala kelinci sering diangkat tinggi-tinggi untuk memudahkan menghidup udara.\n" +
                "3.\tMata dan telinganya berwarna kebiru-biruan.\n" +
                "4.\tKadang-kadang keluar cairan bernanah.\n" +
                "5.\tMencret.\n");
        mSolusi.add("1.\tMemelihara kelinci dalam kendang yang tidak terkena aliran angin secara langsung.\n" +
                "2.\tVentilasi kendang yang baik sehingga udara di dalam kendang selalu segar.\n" +
                "3.\tMemberi pakan yang bergizi.\n" +
                "4.\tPengobatan dengan Sul-Q-Nox pada makanan atau minuman.\n");

        mNamaPenyakit.add("Scabies");
        mDefinisi.add("Penyakit ini disebabkan oleh tungau yang menyerang dari sekitar mata, pipi, hidung, kulit, kepala, jari kaki kemudian meluas ke seluruh permukaan tubuh kelinci. Penyebabnya antara lain Sarcoptes scabie dan Notoedres cati, serta kutu Haemodipsus ventricosus.\n");
        mGejala.add("1.\tKelinci terlihat malas dan lemas tidak bisa berdiri.\n" +
                "2.\tKelinci menggaruk-garuk bagian tubuhnya yang gatal, sehingga bulu-bulu di daerah yang gatal itu menjadi rontok.\n" +
                "3.\tKulit di sekeliling telinga dan hidung berubah bentuk.\n" +
                "4.\tJika menyerang sudut mulut kelinci, maka kelinci akan sulit makan, sehingga akan mati kelaparan.\n");
        mSolusi.add("1.\tSegera isolasi kelinci yang terkena penyakit Scabies ini.\n" +
                "2.\tSeluruh bagian peternakan harus dibersihkan dengan disinfektan.\n" +
                "3.\tKendang bekas kelinci yang terinfeksi harus dikosongkan selama 15 hari atau lebih.\n" +
                "4.\tMengolesi bagian yang luka menggunakan salep belerang 2-3 kali sehari.\n" +
                "5.\tPemberian obat wormektin dengan menyuntikkan pada bagian bawah kulit kelinci yang sakit (tidak sampai masuk ke dalam daging).\n");

        mNamaPenyakit.add("Sembelit");
        mDefinisi.add("Seperti halnya manusia, kelinci pun bias mengalami sembelit. Sembelit adalah gangguan kesehatan yang berakibat pada sulitnya buang air besar. Penyebab dari sembelit ini adalah kurangnya asupan yang mengandung serat. \n" +
                "\nSelain serat, kurangnya asupan minum juga menyebabkan kelinci mengalami sembelit. Kelinci yang kurang minum air seninya lebih pekat atau kental daripada biasanya.\n");
        mGejala.add("1.\tKelinci terlihat malas dan lemas tidak bisa berdiri.\n" +
                "2.\tKotoran (feses) keras.\n" +
                "3.\tJumlah kotoran lebih sedikit daripada biasanya.\n" +
                "4.\tJumlah air kencing lebih sedikit daripada biasanya.\n" +
                "5.\tAir kencing lebih kental dan berwarna gelap.\n");
        mSolusi.add("1.\tMemberikan hay, sayuran berserat, atau air perasan tomat/mentimun.\n" +
                "2.\tMemberikan minum dengan jumlah tidak terbatas.\n" +
                "3.\tMengeluarkan kelinci dari dalam kendang untuk beberapa waktu agar dapat bergerak bebas, sehingga memperlancar system pencernaannya.\n" +
                "4.\tMemindahkan kelinci ke kendang yang lebih luas.\n");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.rv_list_jenis_penyakit);
        AdapterJenisPenyakit adapter = new AdapterJenisPenyakit(this, mNamaPenyakit, mDefinisi, mGejala, mSolusi);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
