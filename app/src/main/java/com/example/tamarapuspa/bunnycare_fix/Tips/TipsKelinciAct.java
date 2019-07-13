package com.example.tamarapuspa.bunnycare_fix.Tips;

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

public class TipsKelinciAct extends AppCompatActivity {

    private static final String TAG = "TipsKelinciAct";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDescriptionCast = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_kelinci);

        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

        ImageView btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(TipsKelinciAct.this, HomeAct.class);
                startActivity(gotohome);
            }
        });
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.wikihow.com/images/thumb/c/c2/Hold-a-Rabbit-Step-5-Version-2.jpg/aid73207-v4-728px-Hold-a-Rabbit-Step-5-Version-2.jpg");
        mNames.add("Cara Memegang Kelinci");
        mDescriptionCast.add("1.\tBuat kelinci Anda merasa nyaman ketika disentuh dengan mengelusnya secara lembut.\n" +
                "Eluslah dengan interval yang pendek-pendek, habiskan waktu lebih lama untuk berada di sisinya. Pertimbangkan untuk menyimpan sepiring dedaunan di hadapannya untuk mengurangi potensi kelinci Anda menjadi gelisah ketika disentuh.\n" +
                "\n" +
                "2.\tKetahui cara mengangkat kelinci yang salah.\n" +
                "Jangan pernah mengangkat kelinci dengan telinga, kaki, atau ekornya. Kelinci begitu sensitif ketika disentuh. Ia dapat terluka parah jika Anda mengangkatnya dengan cara yang salah. Memegang kaki, ekor, atau telinganya dengan kasar dapat membuatnya bereaksi untuk menariknya. Hal tersebut dapat mengakibatkan keretakan, dislokasi, arau perobekan otot bawah dan jaringan halus.\n" +
                "\n" +
                "3.\tBerlatihlah untuk meletakkan telapak tangan Anda di bawah dada kelinci dan perlahan angkat kaki depannya, kemudian turunkan kembali.\n" +
                "Beri ia makanan sebagai hadiah. Praktik ini dapat membuat kelinci Anda merasa terbiasa diangkat.\n" +
                "\n" +
                "4.\tGunakan kulit elastis di belakang leher kelinci untuk memegang tengkuknya.\n" +
                "Jangan angkat kelinci tersebut dengan tengkuknya saja. Cara ini dilakukan hanya untuk mencegah gerakan ke depan saat tangan Anda yang satunya lagi menahan bagian kaki belakangnya. Bungkukkan kelinci hingga membentuk seperti “bola kelinci”.\n" +
                "\n" +
                "5.\tGunakan dua tangan untuk mengangkat kelinci.\n" +
                "Letakkan satu tangan di bawah dadanya dan satu lagi di bagian belakangya. Posisi ini harus nyaman bagi Anda dan kelinci Anda. Pastikan pegangan Anda kuat (namun jangan terlalu erat) agar kelinci tidak meloncat ketika Anda mengangkatnya.\n" +
                "\n" +
                "6.\tGunakan pendekatan yang tepat.\n" +
                "Mengangkat kelinci dari kandang (yang bagian atasnya terbuka) atau area tertutup di rumah Anda merupakan cara yang terbaik. Mengangkat kelinci dari kandang yang terbuka bagian sampingnya akan lebih sulit dilakukan. Biasanya kelinci langsung berlari dan bersembunyi ketika didekati. Selain itu, mengangkat kelinci di wilayah yang penuh dengan perabotan rumah juga akan sama sulitnya.\n" +
                "\n" +
                "7.\tBujuk kelinci untuk keluar dari tempat persembunyiannya, jangan menariknya dengan paksa.\n" +
                "Jika kelinci Anda cenderung berlari ke arah furnitur rumah, bujuklah ia dengan makanan sebelum mengangkatnya. Akan lebih baik lagi jika Anda mengatur area yang mampu mencegah kelinci Anda untuk kabur dan bersembunyi. Sehingga ia tidak memiliki akses ke tempat sembunyi yang sulit Anda raih.\n" +
                "\n" +
                "8.\tPerhatikan tanda peringatan yang menunjukkan bahwa kelinci tersebut tidak ingin diangkat.\n" +
                "Jika kelinci menggebuk-gebukkan kaki belakangnya ketika didekati, berhati-hatilah. Ini merupakan tanda bahwa Anda berada di wilayah kekuasaanya dan ia tidak senang dengan keberadaan Anda. Kelinci tersebut mungkin akan sulit ditangani, maka bersiagalah.\n");

        mImageUrls.add("https://www.wikihow.com/images/thumb/5/52/Prepare-a-Rabbit-Cage-Step-18.jpg/aid1014366-v4-728px-Prepare-a-Rabbit-Cage-Step-18.jpg");
        mNames.add("Kandang Kelinci");
        mDescriptionCast.add("1.\tPilihlah kandang yang tepat untuk kelinci Anda.\n" +
                "Kandang jenis kerangkeng cocok digunakan sebagai tempat tinggal sementara karena jenis dindingnya yang memiliki banyak bukaan membuat kelinci tidak dapat bersembunyi. Kelinci yang terus menerus terekspos dengan lingkungannya tanpa ruang untuk bersembunyi akan lebih mudah merasa tertekan. Jika Anda menggunakan kandang jenis kerangkeng, ada baiknya Anda menyediakan boks atau barang semacamnya agar kelinci Anda dapat bersembunyi.\n" +
                "\n" +
                "2.\tPilihlah kandang dengan ukuran yang sesuai untuk kelinci Anda. \n" +
                "Kelinci memiliki ukuran yang beragam, dari mulai kelinci tiny mini-lop dengan berat hanya 1,3 kilogram, hingga kelinci Flemish raksasa dengan berat yang dapat mencapai 10 kilogram. Luas dan ketinggian kandang pun beragam, bergantung pada jenis kelinci yang Anda pilih. Saat membeli kandang, selalu pertimbangkan berat dan ukuran kelinci Anda saat ia bertumbuh menjadi kelinci dewasa.\n" +
                "\n" +
                "3.\tPastikan kandang yang digunakan memiliki lantai yang padat. \n" +
                "Banyak kelinci yang menderita pododermatitis yang muncul saat mengalami nyeri pada bagian belakang kaki belakangnya akibat tekanan dari duduk di permukaan yang keras atau alas kandang yang basah. Lantai dari kawat tidak cocok untuk kelinci Anda dan dapat membuatnya tidak nyaman.\n" +
                "\n" +
                "4.\tPilihlah kandang dengan dinding yang terbuat dari kawat. \n" +
                "Kandang dengan dinding dan atap yang terbuat dari kawat dapat memberikan banyak bukaan untuk aliran udara. Selain itu, kandang seperti itu juga lebih mudah dibersihkan. Akan tetapi, pastikan lantainya tidak terbuat dari kawat. Jangan sampai kelinci Anda duduk dan berdiri di atas permukaan kawat untuk waktu yang lama.\n" +
                "\n" +
                "5.\tPastikan di bagian bawah kandang terdapat alas kotoran. \n" +
                "Bagian bawah kandang, alas kotoran, harus memiliki dinding yang tinggi dan tertutup karena saat kelinci buang air kecil, dia cenderung menyemburkan urinenya.\n" +
                "6.\tBelilah mangkuk makanan dan botol minum untuk dipasangkan di kandang.Gunakan mangkuk besar dengan dasar mangkuk yang rata agar tidak mudah terbalik. Sediakan rak kecil untuk menyimpan jerami namun letakkan di atas lantai kandang, serendah mungkin karena kelinci tidak suka mendongakkan atau mengangkat kepalanya.\n" +
                "\n" +
                "7.\tLetakkan kandang di ruangan dengan ventilasi udara yang baik agar suhu ruangan tidak terlalu panas dan tidak terlalu dingin. \n" +
                "Jangan letakkan kandang di ruangan yang berdebu atau kotor seperti atap atau ruang bawah tanah, karena debu yang ada dapat merusak paru-paru kelinci peliharaan Anda.\n");

        mImageUrls.add("https://www.wikihow.com/images/thumb/e/ef/Determine-if-Your-Rabbit-Is-Sick-Step-16.jpg/aid3387529-v4-728px-Determine-if-Your-Rabbit-Is-Sick-Step-16.jpg");
        mNames.add("Mengenali Kelinci Sakit");
        mDescriptionCast.add("1.\tNafsu Makan Berkurang\n" +
                "Seperti kebanyakan hewan lainnya, saat sakit kelinci akan lebih mudah terlihat karena mereka mengurangi porsi makan mereka atau bisa jadi tidak makan sama sekali.\n" +
                "Saat merasa sakit kelinci akan merasa tidak memiliki energi bahkan untuk makan.\n" +
                "Semakin parah penyakit yang mereka derita kemungkinan akan semakin malas mereka makan.\n" +
                "\n" +
                "2.\tDiare\n" +
                "Tanda kelinci sakit berikutnya adalah bisa terlihat dari bentuk kotoran kelinci, metabolisme kelinci akan memburuk yang membuat kotoran mereka akan mencair dan kemungkinan besar mereka terserang penyakit diare.\n" +
                "Kemungkinan lain bisa jadi mereka malah tidak buang kotoran sama sekali akibat dari nafsu makan yang berkurang.\n" +
                "Jeleknya sistem pencernaan akan membuat sirkulasi pembuangan kotoran akan memburuk juga,\n" +
                "\n" +
                "3.\tKebersihan\n" +
                "Mirip seperti kucing, kelinci sebenarnya merupakan hewan bersih, mereka senang membersihkan tubuhnya sendiri dan tidak suka bulunya kotor.\n" +
                "Saat sakit, mungkin kalian bisa melihat kotorannya sendiri menempel di bulunya.\n" +
                "Bulu kelinci juga akan cenderung bergelombang dan kusut menggimbal.\n" +
                "Ketombe, munculnya kutu dan terjadi kebotakan bulu merupakan tanda bahwa kondisi kelinci sudah sangat buruk.\n" +
                "\n" +
                "4.\tDemam\n" +
                "Masalah umum kelinci sakit adalah karena dia demam, kalian bisa melihat ada cairan di hidung dan kelinci akan sering terdengar batuk dan bersin.\n" +
                "Kelinci akan lebih sering membuka rongga mulutnya agar lebih bisa bernafas dengan baik.\n" +
                "Tubuhnya akan terlihat memucat.\n" +
                "Kondisi akan lebih memburuk saat kepala kelinci condong seperti jatuh ke satu sisi dan sulit bisa berada di tengah kembali.\n" +
                "Jika seperti itu sistem keseimbangan kelinci sudah rusak.\n" +
                "\n" +
                "5.\tGigi Bergemeletuk\n" +
                "Kelinci akan menggemeletukkan giginya atau mengeluarkan suara melengking jika ada bagian tubuhnya yang terasa sakit luar biasa, seperti terkena cairan kimia. Perilaku ini juga bisa terjadi jika kelinci merasa ketakutan.\n");

        mImageUrls.add("https://www.wikihow.com/images/thumb/2/2f/Prepare-a-Rabbit-Cage-Step-17.jpg/aid1014366-v4-728px-Prepare-a-Rabbit-Cage-Step-17.jpg.webp");
        mNames.add("Menjaga Kesehatan Kelinci");
        mDescriptionCast.add("1.\tMembersihkan Kandang\n" +
                "Kandang harus dibersihkan minimal seminggu sekali. Jika musim hujan dan kendang kelinci terkena air hujan, pembersihan kendang dapat dilakukan lebih sering. Kendang yang basah dan lembap membuat bibit penyakit lebih mudah berkembang biak.\n" +
                "\n" +
                "2.\tMembersihkan Kotak Beranak\n" +
                "Nestbox atau kotak beranak perlu dijaga kebersihannya. Sebagian kelinci suka menggunakan nestbox untuk membuang kotoran. Kotoran pada kotak ini dapat menjadi sumber penyakit, terutama bagi anak kelinci yang ditempatkan di sana.\n" +
                "\n" +
                "3.\tMembersihkan Tempat Makanan dan Minuman\n" +
                "Tempat makanan kelinci biasanya digunakan untuk menyimpan pellet agar tidak berceceran di lantai kendang. Seringkali, kelinci menginjak-injak tempat makanan ini. Pellet yang ada di dalamnya akan menggumpal dan menempel di tempat makanan. Sebelum menjadi sarang penyakit, kotoran ini harus dibersihkan. Bila perlu disikat dan dibilas menggunakan sabun antiseptic.\n" +
                "Botol minum juga sebaiknya dibersihkan secara rutin. Bagian dalamnya disikat, untuk menghilangkan jamur dan lumut.\n" +
                "\n" +
                "4.\tMenggunting Kuku\n" +
                "Seperti manusia, kuku kelinci juga dapat terkena kotoran. Oleh karena itu, perlu dipotong dan dibersihkan. Saat menggunting, pegang kelinci, tetapi tidak terlalu erat agar mudah dilepas jika kelinci itu panik. Posisi kelinci saat digunting bisa telentang atau berdiri.\n" +
                "Ada pembuluh darah di setiap kuku kelinci. Kuku yang dipotong adalah bagian yang berada di atas pembuluh darah. Pembuluh darah ini dapat terlihat jelas pada kelinci yang kukunya berwarna cerah. Pemotongan kuku kelinci ini sebaiknya menggunakan gunting kuku khusus hewan.\n" +
                "\n" +
                "5.\tMemandikan Kelinci\n" +
                "Kelinci adalah hewan pembersih. Ia dapat membersihkan diri sendiri beberapa kali dalam sehari. Pemilik kelinci hanya boleh memandikan kelinci jika keadaannya SANGAT KOTOR.\n");

        mImageUrls.add("https://www.wikihow.com/images/thumb/b/b5/Feed-Greens-to-Your-Rabbit-Step-8-Version-2.jpg/aid9694-v4-728px-Feed-Greens-to-Your-Rabbit-Step-8-Version-2.jpg");
        mNames.add("Pakan Kelinci");
        mDescriptionCast.add("1.\tSediakan rumput kering untuk kelinci Anda. \n" +
                "Rumput kering merupakan jenis makanan yang paling penting untuk kelinci. Ada banyak manfaat yang terkandung dalam rumput kering. Sebagai contoh, rumput kering mengandung serat yang membantu mendorong sisa atau ampas makanan melalui usus, serta mencegah stasis usus. Rumput kering juga memungkinkan kelinci Anda untuk menggigit dan mengunyah sehingga giginya dapat terkikis secara alami.\n" +
                "\n" +
                "2.\tBerikan pelet dalam jumlah yang dibatasi sebagai makanan untuk kelinci Anda.\n" +
                "Pelet hanya boleh diberikan dalam jumlah kecil saja. Karena kalorinya yang tinggi dan kandungan serat yang kecil, pemberian pelet secara berlebihan dapat menyebabkan obesitas dan pertumbuhan gigi yang berlebihan.\n" +
                "\n" +
                "3.\tBerikan sayur-sayuran segar untuk kelinci Anda.\n" +
                "Sayur-sayuran segar dapat menjaga usus kelinci tetap terhidrasi sehingga pencernaannya tetap lancar. Ada banyak jenis sayuran yang dapat diberikan pada kelinci, seperti seledri, daun collard, paprika hijau, dan daun lobak. Selain itu, sayur-sayuran, terutama yang kaya akan vitamin A seperti brokoli, wortel, dan daun moster, juga dapat menjadi jenis makanan yang utama bagi kelinci.\n" +
                "\n" +
                "4.\tSediakan air yang bersih dan segar untuk kelinci Anda. \n" +
                "Persediaan tetap air bersih dan segar merupakan hal penting dalam menjaga usus kelinci Anda tetap terhidrasi. Tanpa air yang cukup, apa yang ada di dalam usus akan mengering dan tertahan. Hal tersebut menyebabkan terjadinya stasis usus yang dapat mengancam hidupnya jika tidak segera ditangani.\n" +
                "\n" +
                "5.\tPelajari apa saja yang tidak boleh diberikan pada kelinci. \n" +
                "Ada beberapa jenis makanan yang tidak boleh Anda berikan pada kelinci, seperti cokelat, pasta, dan yoghurt. Selain itu, makanan seperti biji-bijian, kuki, kerupuk, serta serealia berserat tinggi juga tidak boleh diberikan kepada kelinci.\n" +
                "\n" +
                "6.\tBerikan buah-buahan segar sebagai camilan untuk kelinci. \n" +
                "Kelinci menyukai makanan yang manis dan kemungkinan akan senang memakan banyak buah-buahan. Akan tetapi, karena kandungan gulanya yang tinggi, buah-buahan hanya boleh diberikan sebagai camilan. Setiap hari, kelinci Anda tidak boleh memakan lebih dari 1 sampai 2 sendok makan buah-buahan untuk setiap 2 kilogram berat tubuhnya.\n");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.rv_list_tips);
        AdapterTips adapter = new AdapterTips(this, mNames, mImageUrls, mDescriptionCast);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
