package com.example.tamarapuspa.bunnycare_fix.JenisKelinci;

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

public class JenisKelinciAct extends AppCompatActivity {

    private static final String TAG = "JenisKelinciAct";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDescription = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenis_kelinci);

        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();

        ImageView btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotohome = new Intent(JenisKelinciAct.this, HomeAct.class);
                startActivity(gotohome);
            }
        });
    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://www.petguide.com/wp-content/uploads/2017/02/alaska-rabbit-1.jpg");
        mNames.add("Alaskan");
        mDescription.add("Kelinci jenis ini sangat cocok untuk peliharaan keluarga, karena mereka sangat jinak dan ramah. Mereka dapat hidup selama 7 hingga 9 tahun.\n" +
                "\nBentuk tubuhnya sama seperti bentuk tubuh kelinci pada umumya. Mereka memiliki berat berkisar 3 hingga 4 kg.\n" +
                "\nJangan tertipu dengan namanya. Kelinci Alaskan sebenarnya bukan berasal dari Alaska, tetapi kelinci jenis ini sebenarnya kelinci yang dikembangkan dari Champagne d’Argent, Dutch, Havana, dan kelinci Himalaya. Pengembangan ini dilakukan di German.\n" +
                "\nSeorang penilai kelinci, yaitu Max Gotha, menciptakan jenis ini dengan harapan untuk mengembangkan kelinci yang mirip dengan Alaskan Fox atau rubah Alaska yang dimana bulunya diperjual-belikan pada sekitaran tahun 1900.\n" +
                "\nDengan demikian, tujuan utama dari pengembangan kelinci ini sebenarnya adalah untuk menciptakan jenis kelinci yang memiliki bulu berwarna putih di bawah bulu berwarna hitam.\n" +
                "\nRencana tetaplah rencana. Hasil dari pengembangan ini malah menciptakan kelinci dengan warna bulu sangat hitam dan panjang serta mengkilap.\n" +
                "\nWalaupun tidak sesuai dengan tujuan awalnya, tetapi karena bulunya yang hitam dan lebat ini membuat kelinci ini dijadikan sebagai kelinci peliharaan jenis baru.\n" +
                "\nDari sinilah, muncul kelinci Rex Hitam alias pengembangan kelinci Rex Hitam bermula dari kelinci Alaska.\n");

        mImageUrls.add("https://i.pinimg.com/originals/50/98/ba/5098baa4df027bc8a53545e61fa755c1.jpg");
        mNames.add("American Chincilla");
        mDescription.add("Kata chinchilla mengacu pada warna abu-abu keperakan. Sesuai dengan warna kebanyakan kelinci jenis ini. " +
                "Asal kelinci jenis ini adalah dari Prancis, yang kemudian dikembangkan di Amerika Serikat." +
                "Kelinci jenis American Chinchilla lebih besar daripada kelinci jenis Chinchilla lainnya.\n\n"  +
                "Bobot kelinci jenis ini rata-rata sekitar 5 kg. Jika dilihat dari samping, tubuhnya terlihat kekar. " +
                "Oleh karena itu, awalnya kelinci ini dibudidayakan untuk dimanfaatkan daging dan kulitnya." +
                "Pada perkembangan selanjutnya, kelinci jenis ini juga dijadikan kelinci hias, karena sifatnya yang jinak.\n" +
                "\nAmerican Chinchillas merupakan biakan versi super dari sepupu Perancisnya. Mereka memiliki berat tubuh 9 hingga 11 pon atau setara dengan 4 hingga 5 kg, sedangkan untuk Chincilla biasa, yaitu dari Perancis hanya berbobot 5 hingga 8 pon atau setara dengan 2,2 hingga 3,6 kg.\n" +
                "\nUntuk Chincilla yang berjenis raksasa atau giant, dapat memiliki bobot 10 hingga 16 pon atau setara dengan 4,5 kg hingga 7 kg.\n");

        mImageUrls.add("https://www.thepetstep.com/wp-content/uploads/2019/01/American-Fuzzy-Lop.jpg");
        mNames.add("American Fuzzy Lop");
        mDescription.add("American fuzzy lop merupakan persilangan dari holland lop dengan french anggora. Dinamai american fuzzy karena persilangannya dikembangkan di California, Amerika. " +
                "Pada tahun 1988, American Rabbit Breeders Association (ARBA) meresmikannya sebagai ras baru.\n" +
                "\n" + "Ciri cirinya yang paling kentara adalah wajah yang lebar dengan hidung pesek. Bulunya memang lebat, tapi tidak selebat anggora.\n");

        mImageUrls.add("https://i.pinimg.com/originals/84/58/2b/84582b1c8a10641f3608c5dfe32f1792.jpg");
        mNames.add("Belgian Hare");
        mDescription.add("Kelinci Belgia sebenarnya bukan termasuk jenis kelinci liar, tetapi mereka merupakan kelinci domestik yang berpenampilan mirip dengan kelinci liar.\n" +
                "\nMereka pertama kali diperkenalkan di Belgia pada awal tahun 1700-an dan mulai menyebar ke Amerika Serikat pada pertengahan tahun 1800-an.\n" +
                "\nJika dibandingkan dengan jenis kelinci domestik lainnya, kelinci Belgia memiliki tubuh yang lebih ramping dengan telinga panjang dan kaki belakang yang lebih panjang.\n" +
                "\nMereka memiliki julukan sebagai “poor man’s racehorse” atau kuda pacuan untuk orang menengah ke bawah.\n" +
                "\nKelinci Belgia dikenal sebagai kelinci dengan tingkat kepintaran yang tinggi, bahkan mereka dianggap oleh banyak orang sebagai spesies kelinci domestik yang paling cerdas.\n" +
                "\nMereka juga dikenal ramah, walaupun terdapat beberapa diantaranya tidak bisa diam. Ini karena mereka sangat suka bermain serta membutuhkan banyak latihan.\n" +
                "\nBulunya yang pendek serta berwarna kecoklatan membuat mereka lebih mudah dirawat dan tentunya tidak memerlukan perawatan khusus.\n");

        mImageUrls.add("http://differentbreedsofrabbit.weebly.com/uploads/2/3/1/1/23118150/1410481_orig.jpg");
        mNames.add("Checkered Giant");
        mDescription.add("Corak dan warna kelinci jenis ini mirip dengan kelinci jenis English Spot. Pada hidung kedua jenis kelinci ini terdapat corak mirip kupu-kupu. Meskipun demikian, ukuran Checkered Giant jauh lebih besar daripada English Spot. " +
                "Akibat corak mirip kupu-kupu tersebut, kelinci ini sering disebut juga Giant Papillon. Dalam Bahasa Prancis, papillon berarti kupu-kupu.\n\n" +
                "Warna dominan kelinci jenis ini adalah putih dengan corak berwarna hitam atau biru di punggung dan perutnya. Warna hitam atau biru itu juga menutupi semua bagian telinganya. Meskipun ukurannya besar, Checkered Giant bukanlah jenis kelinci pedaging. " +
                "Kelinci jenis ini lebih sering dijadikan kelinci hias dan dilombakan keindahannya.\n");

        mImageUrls.add("https://www.kelinci.net/wp-content/uploads/2018/03/Kelinci-Dutch.jpg");
        mNames.add("Dutch");
        mDescription.add("Bagi kamu yang bosan dengan warna kelinci yang putih saja, mungkin kamu akan tertarik dengan jenis kelinci berikut ini. Kombinasi warnanya adalah putih dengan bercak hitam, cokelat, atau abu abu. Warna warna tersebut terkadang membentuk pola yang membuat hewan ini semakin menggemaskan.\n" +
                "\nBerbeda dengan anggora, dutch rabbit tidak memiliki bulu yang lebat. Bulunya lebih pendek, rapi, dan kelihatan bersih. Kombinasi warna tubuhnya seolah olah seperti panda dengan ukuran yang jauh lebih kecil.\n");

        mImageUrls.add("https://i.pinimg.com/originals/1e/5e/45/1e5e456b23251deffd2a0f0d747af280.jpg");
        mNames.add("Dwarf Hotot");
        mDescription.add("Kelinci Dwarf Hotot mudah dikenali dari warnanya yang putih. Hanya ada sedikit lingkaran hitam di sekeliling kedua matanya. Kelinci ini pertama kali diperkenalkan di Jerman pada tahun 1970-an. Para ahli meyakini bahwa kelinci jenis ini merupakan hasil persilangan kelinci Hotot biasa dengan Netherland Dwarf.\n\n" +
                "Sebagaimana kelinci jenis kecil lainnya, Dwarf Hotot lebih banyak dimanfaatkan sebagai kelinci hias. Jika dikonteskan, kelinci hotot baik adalah yang benar-benar putih. Kelinci yang berwarna putih kebiruan atau kehitaman biasanya dianggap kurang baik.\n\n" +
                "Berat kelinci ini saat dewasa rata-rata 1-1,5kg. kepalanya bulat dan lebar serta lehernya pendek. Telinganya yang kecil berdiri tegak dan meruncing ke atas.\n");

        mImageUrls.add("https://i.pinimg.com/originals/f0/aa/d3/f0aad34ea8cdc9928e4c9bfab189b32f.jpg");
        mNames.add("English Angora");
        mDescription.add("Kelinci english angora ini merupakan kelinci jenis angora yang sangat populer dan sangat diminati oleh banyak orang , karena kelinci english angora ini juga mempunyai bulu yang sangat panjang jika di bandingkan dengan kelinci angora lain . Kelinci english angora ini juga mempunyai sifat yang jinak yang membuat kelinci ini sangat di sukai banyak orang .\n" +
                "\nKelinci english angora ini juga terkadang matanya tidak terlihat gara-gara bulunya yang sangat panjang , kelinci ini juga mempunyai telinga yang berdiri tegak dan terdapat bulu-bulu yang panjang juga di sekitar telinganya tersebut . Berat badan dari kelinci english angora ini berkisar 2 kg sampai 4 kg . Walaupun berat tetapi masih saja yang mencarinya untuk di jadikan kelinci peliharaan .\n");

        mImageUrls.add("https://i.pinimg.com/originals/0d/79/10/0d79104fa656c2c15df3026eb1511080.jpg");
        mNames.add("English Lop");
        mDescription.add("Ada beberapa macam kelinci jenis Lop, antara lain English Lop, Holland Lop, Dwarf Lop, American Fuzzy Lop, Angora Lop, dan French Lop. Semua kelinci jenis lop ini dapat dikenali dari mukanya yang lebar serta telinga yang panjang dan menjuntai ke bawah.\n\n" +
                "Di antara berbagai jenis kelinci Lop tersebut, English Lop adalah yang paling terkenal. Kelinci jenis ini merupakan salah satu jenis kelinci yang pertama kali dijinakkan. Selain itu, tubuhnya yang besar membuat kelinci ini sering dijadikan kelinci pedaging. Kelebihan lain dari kelinci jenis ini adalah dapat beradaptasi di daerah yang bersuhu panas, seperti di Indonesia.\n\n" +
                "Kelinci jenis English Lop ini memiliki ciri khas fisik yang paling menonjol diantara jenis kelinci lainnya, yaitu memiliki telinga yang sangat panjang dan lebar.\n");

        mImageUrls.add("https://i.pinimg.com/originals/9f/a6/68/9fa668cca297d2bf5ee3cac910333dcf.jpg");
        mNames.add("English Spot");
        mDescription.add("Kelinci jenis ini pertama kali diperkenalkan pada pertengahan abad ke-19 di Inggris. Kelinci ini langsung disukai para penggemar kelinci karena bulunya yang halus dan kombinasi bintiknya yang menarik.\n\n" +
                "Badan kelinci ini cenderung panjang dan membusur, kakinya Panjang dan ramping, serta telinganya panjang dan berdiri tegak. Pada hidung dan mulutnya terdapat corak dengan beragam ukuran. Sedangkan pada matanya terdapat lingkaran.\n\n" +
                "Warna dominan pada English Spot adalah putih dengan bitnik-bintik di badannya. Di sepanjang punggungnya terdapat corak yang menyerupai garis tidak beraturan.");

        mImageUrls.add("https://i.pinimg.com/originals/97/45/28/9745280a3fb2e519202750a659533198.jpg");
        mNames.add("Flemish Giant");
        mDescription.add("Jenis kelinci yang berasal dari Belgia ini termasuk yang paling popular di Indonesia. Awalnya, kelinci jenis ini dijadikan kelinci pedaging. Tapi karena sifatnya yang lembut dan jinak membuat orang menjadikan kelinci ini sebagai kelinci hias.\n\n" +
                "Berat rata-rata kelinci ini lebih dari 6 kg. selain gemuk, Panjang kelinci ini dari hidung sampai pangkal ekor dapat mencapai 80 cm. Panjang telinganya yang tebal dan berdiri tegak sekitar 20 cm. Warna Flemish Giant bermacam-macam, seperti hitam, abu-abu besi, coklat, biru, dan putih.\n");

        mImageUrls.add("https://i.pinimg.com/originals/b3/40/a3/b340a36f18d7e02dea88fa196c5ebf32.jpg");
        mNames.add("French Angora");
        mDescription.add("Jenis kelinci anggora ini adalah kelinci anggora prancis. Range beratnya berkisar di angka 3,5 kilogram sampai 4,5 kilogram. Adapun varian dari kelinci anggora prancis yang diakui oleh ARBA antara lain Agouti French Angora Rabbit, Pointed White French Angora Rabbit, Self French Angora Rabbit, " +
                "Shaded French Angora Rabbit, Ticked French Angora Rabbit, Wide French Angora Rabbit, Band French Angora Rabbit  dan Brown Broken French Angora Rabbit. \n" +
                "\nKelinci ini berbeda dari jenis anggora inggris. Perbedaan utamanya adalah pertumbuhan bulu. Jika pada inggris, bulu memenuhi hampir semua permukaan tubuh. Maka pada anggora prancis, telinga dan wajahnya masih sama dengan kelinci pada umumnya. Bagian berbulu lebat dan lembut hanya pada badan saja. Determinasi warna pada kelinci anggora jenis ini ada pada wajahnya dan juga ekor.\n");

        mImageUrls.add("https://www.pets4homes.co.uk/images/classifieds/2017/09/21/1716891/french-lop-agouti-butterfly-buck-59c3391b3cb66.jpg");
        mNames.add("French Lop");
        mDescription.add("French lop merupakan hasil perkawinan selektif dari english lop dan flemish giant. Nama french lop diberikan karena jenis ini dikembangkan di Perancis.\n" +
                "\nCiri cirinya yaitu memilki tubuh yang kuat, telinga yang tebal, serta kepala bagian atas berbentuk agak kotak. Bobotnya lebih berat dibanding tipe lop lainnya. Mungkin karena ia mewarisi gen flemish giant.\n" +
                "\nKelinci satu ini sangat besar, berat badan bisa mencapai 12 kg. Namun walau jenis kelinci ini berukuran besar, kelinci ini memiliki kepribadian yang ramah, bersahabat dan baik hati sehingga cocok untuk anda para pemula jika ingin memelihara jenis kelinci ini.\n");

        mImageUrls.add("https://www.petguide.com/wp-content/uploads/2016/05/havana-rabbit.jpg");
        mNames.add("Havana");
        mDescription.add("Kelinci Havana termasuk ras kelinci tertua di dunia karena sudah dikembangkan di Belanda sejak tahun 1898 silam.\n" +
                "\nPenyebaran kelinci Havana terbilang cepat, sebab memasuki tahun 1908 jenis kelinci ini sudah tersebar diseluruh daratan Eropa. Baru pada tahun 1916 kelinci Havana dipasarkan di Amerika dan Asia termasuk Indonesia.\n" +
                "\nDulunya mereka di kembangbiakan oleh beberapa orang antara lain, Fee de Marbourg, Perle Biaya dan Gris Perle de Hal.\n" +
                "\nKelinci jenis ini telah diakui oleh American Rabbit Breeders Association dalam empat jenis varian warna yang mereka miliki antaranya: coklat, biru, dan hitam. Berat rata-rata mereka adalah antara (2,0 kg) dan (2,9 kg).\n");

        mImageUrls.add("https://rabbitbreeders.us/wp-content/uploads/Himalayan-Rabbit.jpg");
        mNames.add("Himalayan");
        mDescription.add("Himalayan hampir mirip dengan english spot. Bedanya adalah jumlah bercak hitam yang lebih sedikit. Pada himalayan, bercak hitam biasanya hanya di bagian telinga, hidung, dan kaki saja.\n" +
                "\nSangat susah untuk mengawinkan himalayan. Sekalinya berhasil, paling hanya mampu melahirkan bayi sebanyak 2 sampai 6 ekor saja. Oleh karena inilah harga himalayan sedikit lebih mahal dari harga kelinci biasa.\n" +
                "\nUniknya lagi, warna matanya pink kemerahan. Mungkin mata himalayan ini adalah yang terunik dari jenis jenis kelinci yang ada di dunia ini.\n");

        mImageUrls.add("https://www.petguide.com/wp-content/uploads/2016/06/holland-lop.jpg");
        mNames.add("Holland Lop");
        mDescription.add("Holland lop termasuk jenis kelinci berukuran mini. Jenis ini merupakan persilangan antara english lop, french lop, dan netherland dwarf. Ciri utamanya adalah kaki yang pendek, kepala bulat, wajah pesek, dan pastinya telinga yang terkulai.\n" +
                "\nTubuhnya yang mungil adalah gen bawaan dari netherland dwarf. Oleh karenanya ia dinamai holland dwarf. Holland merupakan sebutan lain dari negeri Belanda selain Netherland.\n" +
                "\nKelinci Holland ini tidak cocok untuk di ternakan karena jika kita akan mengkawinkan 2 kelinci holland lop ini maka anda hanya akan mendapatkan keturunan yang jelek lebih besar dibandingkan keturunan yang bagus . " +
                "Karena seorang breeder itu harus mendapatkan anakan kelinci holland yang baik dari bapak dan ibunya atau malah bisa mendapatkan anakan kelinci holland yang lebih baik .\n");

        mImageUrls.add("https://www.petguide.com/wp-content/uploads/2016/06/jersey-wooly.jpeg");
        mNames.add("Jersey Wolly");
        mDescription.add("Bonnie Seeley dari High Bridge, New Jersey memperkenalkan Jersey Wooly pertama kali di tahun 1984 kepada (ARBA) Konvensi di Orlando, Florida.\n" +
                "\nSaat ini, Jersey Wooly merupakan salah satu kelinci yang paling banyak dipamerkan di pameran lokal dan nasional di Amerika Serikat. Mereka juga terkenal sebagai hewan peliharaan yang sangat jinak.\n" +
                "\nJersey Wooly adalah sebuah ras kelinci yang di hasilkan dari sebuah persilangan antara ras kelinci Dwarf Netherland dan ras kelinci Angora Perancis. \n" +
                "\nHasil persilangan ini mendapatkan seekor kelinci yang mungil dengan warna bulu yang menarik. Untuk ukuran berat badan dari jenis kelinci yang satu ini dapat mencapai 1,5 kg.\n");

        mImageUrls.add("https://4.bp.blogspot.com/-mESX19EeVic/V9JAOoMzUnI/AAAAAAAAA8U/1fvsfKKvpx0C4BqglI5_Jcd8VGX9tH25gCLcB/s400/Kelinci-Lion-Head-Coklat.jpg");
        mNames.add("Lion Head");
        mDescription.add("Kelinci Lion ini mempunyai ciri khas seperti kelinci anggora yaitu mempunyai bulu halus dan lebat tetapi yang menjadi kelinci ini menjadi unik yaitu tumbuhnya bulu yang panjang di sekitar kepalanya yang menjadikan kelinci ini layaknya sing atau lion . Kelinci ini berasal dari amerika serikat , kelinci ini mempunyai julukan kelinci lion karena mempunyai bulu lebat pada kepalanya.\n" +
                "\nKelinci lion ini mempunyai telinga yang pendek , tubuh yang mungil , dan pada tubuhnya mempunyai bulu yang tidak selebat yang ada pada kepalanya . Kelinci ini juga pernah dianggap menjadi kelinci jenis anggora yang gagal karena mempunyai telinga yang pendek dan bulunya yang tumbuh lebat hanya di sekitar kepalanya . Mungkin pada waktu persilangan indukan kelinci anggoranya di silangkan dengan kelinci yang berbulu pendek.\n");

        mImageUrls.add("https://cdn0.wideopenpets.com/wp-content/uploads/2016/01/netherland-dwarf-cover-770x405.jpg");
        mNames.add("Netherland Dwarf");
        mDescription.add("Sesuai Namanya, kelinci ini pertama kali ditemukan di Belanda. Kelinci ini mempunyai kepala, telinga dan badan yang serba mungil. " +
                "Bahkan ,lehernya begitu pendek sehingga hamper tidak terlihat. " +
                "Bobot rata-rata kelinci dewasanya sekitar 1,1 kg atau hanya sedikit lebih besar daripada marmut.\n\n" +
                "Kelinci Netherland Dwarf merupakan hasil persilangan kelinci Polish dengan kelinci liar. Kelinci jenis Netherland Dwarf yang pertama kali diperkenalkan pada tahun 1940. " +
                "Selanjutnya, jenis kelinci ini dibawa ke Inggris dan Amerika Serikat. " +
                "Setelah itu, persebarannya semakin luas di dunia.\n\n" +
                "Karena tubuhnya yang mungil, kelinci jenis ini lebih banyak dipelihara sebagai kelinci hias. Warna kelinci jenis ini bermacam-macam, dari hitam, abu-abu, biru muda, sampai coklat. " +
                "Karakter dan sifatnya yang menonjol adalah pendiam, manis, dan pemalu. Kelinci jenis ini juga sulit bersahabat dengan manusia. " +
                "Mereka akan berlari menghindar jika didekati oleh orang yang tidak dikenalnya.\n");

        mImageUrls.add("https://i.pinimg.com/originals/ba/5e/69/ba5e69effa9699b986fccf4c1ad453eb.jpg");
        mNames.add("New Zealand White");
        mDescription.add("Kelinci berwarna putih ini tidak berasal dari New Zealand atau Selandia Baru, tetapi dari California Amerika Serikat. Nenek moyang kelinci ini memang berasal dari Selandia Baru, yaitu New Zealand Red, yang kemudian disilangkan dengan kelinci jenis lain.\n\n" +
                "New Zealand White adalah kelinci albino. Seluruh tubuhnya berwarna putih dan matanya berwarna merah. Kelinci ini disenangi karena pertumbuhan badannya cepat. bobot maksimal diperoleh saat berusia 8 – 12 minggu. Selain itu, bulunya juga lebih mudah diproses menjadi benang dibandingkan jenis kelinci lain.\n");

        mImageUrls.add("https://rabbitsforsaleinmontana.files.wordpress.com/2013/12/88.jpg?w=640");
        mNames.add("Polish");
        mDescription.add("Kelinci jenis ini dipercaya merupakan nenek moyang dari Netherland Dwarf. Oleh karena itu, bentuknya tidak jauh berbeda dengan Netherland Dwarf. Tubuhnya kecil, badannya bulat, dan telinganya berdiri tegak dengan ujung yang meruncing.\n\n" +
                "Kelinci yang berat rata-ratanya 1-1,5 kg ini pertama kali diperkenalkan di Inggris pada abad ke-19. Setelah itu, dibawa ke Amerika Serikat untuk dikawinsilangkan dengan jenis kelinci lain. Meskipun demikian, galur murni kelinci Polish tetap dipertahankan sampai sekarang.\n");

        mImageUrls.add("https://www.petguide.com/wp-content/uploads/2016/08/rex-rabbit-1.jpg");
        mNames.add("Rex");
        mDescription.add("Kelinci jenis rex pertama kali diperkenalkan di Prancis pada tahun 1919. Kelinci jenis ini dikenal karena memiliki bulu lembut, pendek, dan padat seperti karpet. Ciri lainnya yang membedakan Rex dengan jenis kelinci jenis lain adalah ukuran kakinya yang lebih kecil dan pendek. Kepalanya juga lebih lebar daripada kelinci seukurannya.\n\n" +
                "Selain dipelihara untuk kelinci hias, Rex juga menjadi favorit pembuat kerajinan dari kulit kelinci. Umumnya, kelinci jenis ini dapat hidup sampai 6 tahun, dengan berat rata-rata saat dewasa 3,4 – 4,8 kg. Meskipun demikian, para peternak biasanya sudah menyerahkan kelinci ini ke penjagal sebelum berusia 6 tahun, untuk dimanfaat kulit dan dagingnya.\n");

        mImageUrls.add("https://penrynrabbitfarm.com/wp-content/uploads/2018/03/Satin-Rabbit-For-Sale2.png");
        mNames.add("Satin");
        mDescription.add("Kelinci satin ini pertama ditemukan oleh walter kwik yang merupakan seorang pengembang dari kelinci havana pada tahun 1930 . Lalu walter kwik mengirim kelinci ini ke universitas harvard dan oleh para peneliti genetik disana menetapkan bahwa adanya genetik mutasi baru yang merupakan gen yang resesif yang mempunyai bulu yang bersinar , bulu yang pendek namun terkesan rapat . Mutasi gen tersebut juga hampir sama dengan kelinci rex .\n" +
                "\nKelinci satin ini merupakan kelinci yang berasal dari amerika mempunyai bobot berkisar 3,8 kg sampai 5 kg , mempunyai bulu yang pendek dan bersinar , jarak antara bulu pada kelinci satin ini rapat , kepala dari kelinci satin ini agak bulat dan telinganya yang panjang dan tegak . Jika anda perhatikan kelinci satin ini hampir mirip dengan kelinci rex oleh karena itu banyak yang menyebutnya kelinci rex satin .\n" +
                "\nTetapi yang membedakan kelinci satin dan kelinci rex adalah bulunya karena bulu dari kelinci satin itu lebih tebal dengan beberapa varian warna seperti putih totol-totol , merah , perak , krem dan coklat . Kelinci satin ini juga mempunyai badan yang panjang dan leher yang pendek , telinga dari kelinci ini juga terlihat seimbang dengan tubuhnya , tulang kelinci satin juga kuat dan kakinya yang lurus serta kuku yang berwarna hitam .\n");

        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_list_jenis_kelinci);
        AdapterJenisKelinci adapter = new AdapterJenisKelinci(this, mNames, mImageUrls, mDescription);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

//    public void onBackPressed() {
//
//    }

}
