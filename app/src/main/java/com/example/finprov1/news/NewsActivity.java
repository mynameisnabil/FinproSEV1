package com.example.finprov1.news;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.finprov1.MenuFragment;
import com.example.finprov1.R;
import com.example.finprov1.databinding.ActivityNewsBinding;
import com.example.finprov1.placefacility.HistoryFragment;
import com.example.finprov1.recommended.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity implements NewsAdapter.OnNewsClickListener {

    private List<NewsModel> newsList;
    private NewsAdapter newsAdapter;
    private ActivityNewsBinding binding;
    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();

    MenuFragment menuFragment = new MenuFragment();

    HistoryFragment historyFragment = new HistoryFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rvNews.setLayoutManager(new LinearLayoutManager(this));

//        bottomNavigationView  = findViewById(R.id.bottom_navigation);
//
//        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
//        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.home:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
//                        return true;
//                    case R.id.menu:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.container,menuFragment).commit();
//                        return true;
//                    case R.id.history:
//                        getSupportFragmentManager().beginTransaction().replace(R.id.container,historyFragment).commit();
//                        return true;
//                }
//
//                return false;
//            }
//        });

        newsList = new ArrayList<>();
        newsList.add(new NewsModel("Indonesia akan melawan Argentina di GBK", "Bima Sakti - Jakarta", R.drawable.news1, "Pertandingan besar akan segera terjadi di tanah air ketika tim nasional Indonesia bersiap untuk menghadapi tim nasional Argentina di Stadion Utama Gelora Bung Karno (GBK). Ini adalah pertandingan yang penuh gairah dan ditunggu-tunggu oleh para penggemar sepak bola di seluruh Indonesia.\n" +
                "\n" +
                "GBK, yang telah menjadi ikon olahraga Indonesia, akan menjadi tempat di mana ribuan suporter akan berkumpul untuk menyaksikan pertarungan sengit antara kedua tim. Antusiasme dan semangat di sekitar stadion akan menciptakan atmosfer yang luar biasa, dengan warna-warni bendera dan nyanyian seruan dari para penggemar yang menyemangati para pemain.\n" +
                "\n" +
                "Tim nasional Indonesia, yang dikenal sebagai \"Merah Putih,\" akan tampil dengan rasa bangga dan tekad untuk memberikan penampilan terbaik mereka. Dengan gaya permainan yang cepat dan kombinasi teknik yang solid, mereka akan berusaha untuk menunjukkan kualitas dan potensi sepak bola Indonesia kepada dunia.\n" +
                "\n" +
                "Namun, tantangan besar menanti Indonesia ketika mereka berhadapan dengan tim nasional Argentina, yang dikenal sebagai \"Albiceleste\" dan memiliki sejarah yang kaya dalam sepak bola internasional. Argentina telah memenangkan banyak gelar juara dan memiliki pemain-pemain hebat yang dapat mengubah permainan dengan keahlian individu mereka.\n" +
                "\n" +
                "Pertemuan ini akan menjadi ujian sejati bagi para pemain Indonesia saat mereka berhadapan dengan kekuatan tim Argentina. Dibutuhkan kerja keras, kecerdasan taktik, dan kekuatan mental yang kuat untuk menghadapi tantangan ini. Pelatih dan pemain akan melakukan persiapan yang cermat, menganalisis kekuatan dan kelemahan lawan, serta mencari strategi yang tepat untuk meraih kemenangan.\n" +
                "\n" +
                "Ini adalah momen bagi pemain Indonesia untuk menunjukkan keberanian dan semangat bertanding yang tak tergoyahkan di hadapan ribuan suporter yang mendukung mereka. Pertandingan ini akan menjadi panggung di mana bakat dan dedikasi mereka dapat bersinar, dan mungkin akan menjadi tonggak sejarah bagi sepak bola Indonesia.\n" +
                "\n" +
                "Dalam atmosfer yang penuh semangat dan tegang di GBK, pertandingan ini akan memberikan hiburan tak terlupakan bagi penggemar sepak bola Indonesia. Setiap gol, tendangan, dan aksi hebat akan membuat hati berdegup kencang, sementara momen-momen kegembiraan dan kekecewaan akan melintasi lapangan hijau.\n" +
                "\n" +
                "Indonesia melawan Argentina di GBK akan menjadi pertempuran yang epik, di mana kedua tim akan memberikan yang terbaik untuk meraih kemenangan. Ini adalah momen untuk menghormati kebanggaan nasional dan menghadirkan kegembiraan bagi para penggemar sepak bola."));
        newsList.add(new NewsModel("Indonesia Juara SEA Games 2023 Cabang Sepak Bola", "Bima Sakti - Jakarta", R.drawable.news2, "Indonesia meraih prestasi gemilang dalam ajang SEA Games 2023 di cabang sepak bola dengan menyabet gelar juara. Tim nasional sepak bola Indonesia memperlihatkan keunggulan dan ketangguhannya selama turnamen, mengalahkan lawan-lawan tangguh dari negara-negara Asia Tenggara.\n" +
                "\n" +
                "Dalam perjalanan menuju gelar juara, tim sepak bola Indonesia menampilkan permainan yang brilian, penuh semangat, dan strategi yang matang. Dengan kerjasama tim yang solid dan kekompakan dalam bermain, para pemain berhasil membangun serangan yang mematikan serta menjaga pertahanan yang kokoh.\n" +
                "\n" +
                "Pelatih yang berbakat dan berpengalaman mampu membimbing para pemain dalam meraih prestasi tertinggi. Mereka memberikan motivasi dan taktik yang tepat, mampu mengoptimalkan potensi pemain serta mengarahkan mereka untuk tampil dalam performa terbaik.\n" +
                "\n" +
                "Dalam setiap pertandingan, para pemain sepak bola Indonesia menunjukkan keterampilan individu yang luar biasa dan kepiawaian dalam membaca permainan. Mereka tidak hanya mengandalkan kecepatan dan kekuatan, tetapi juga kecerdasan dalam mengambil keputusan serta kreativitas dalam mengeksekusi serangan dan mencetak gol.\n" +
                "\n" +
                "Kemenangan ini bukan hanya sekadar prestasi bagi tim sepak bola Indonesia, tetapi juga menjadi kebanggaan bagi seluruh rakyat Indonesia. Para pemain telah mempersembahkan kegembiraan dan kepuasan kepada masyarakat dengan keberhasilan mereka dalam mewujudkan impian menjadi juara.\n" +
                "\n" +
                "Keberhasilan ini menunjukkan potensi besar Indonesia dalam dunia sepak bola, serta memberikan inspirasi bagi generasi muda untuk terus mengembangkan bakat dan semangat berprestasi di bidang olahraga. Dengan pencapaian ini, Indonesia telah menegaskan posisinya sebagai kekuatan utama dalam sepak bola di kawasan Asia Tenggara.\n" +
                "\n" +
                "Indonesia, sebagai tuan rumah SEA Games 2023, telah memberikan pertandingan sepak bola yang tak terlupakan, menarik perhatian dunia, dan mengundang apresiasi dari para penggemar sepak bola di seluruh dunia. Keberhasilan ini menjadi tonggak sejarah bagi sepak bola Indonesia dan menjadi pijakan untuk melangkah lebih jauh dalam kompetisi tingkat internasional."));
        newsList.add(new NewsModel("BINUS Membuka Lapangan Sepak Bola Pertama", "Bima Sakti - Jakarta", R.drawable.news3, "BINUS dengan bangga mengumumkan pembukaan Lapangan Sepak Bola Pertama, menjadi inisiatif terbaru mereka dalam memperkaya pengalaman belajar dan kehidupan mahasiswa. Terletak di tengah kampus yang luas, lapangan sepak bola ini menawarkan fasilitas modern dan state-of-the-art yang dirancang untuk mendukung perkembangan olahraga dan semangat kompetisi.\n" +
                "\n" +
                "Dengan ukuran yang sesuai standar internasional, lapangan sepak bola BINUS menjadi tempat yang ideal bagi para mahasiswa, staf, dan masyarakat sekitar untuk berpartisipasi dalam kegiatan olahraga yang menyenangkan dan membangun. Dengan rumput hijau yang indah dan permukaan yang halus, lapangan ini menjamin pengalaman bermain sepak bola yang optimal.\n" +
                "\n" +
                "Lapangan sepak bola ini juga dilengkapi dengan sistem pencahayaan yang canggih, memungkinkan pertandingan malam yang menyenangkan dan penerangan yang memadai untuk latihan. Terdapat juga tribun penonton yang nyaman, memungkinkan teman-teman dan keluarga untuk memberikan dukungan kepada para pemain.\n" +
                "\n" +
                "Tidak hanya menjadi tempat bermain sepak bola, lapangan ini juga menjadi pusat kegiatan olahraga lainnya, seperti turnamen internal kampus, pelatihan tim, dan kegiatan kebugaran. Dengan berbagai program dan acara yang diselenggarakan di lapangan ini, BINUS berusaha untuk memperkuat semangat tim, meningkatkan keterampilan olahraga, dan mempromosikan kehidupan sehat dan aktif di antara komunitas kampusnya.\n" +
                "\n" +
                "Lapangan Sepak Bola Pertama BINUS adalah wujud komitmen mereka dalam memberikan lingkungan belajar yang lengkap dan holistik, di mana akademik, olahraga, dan pengembangan pribadi saling melengkapi. Diharapkan, lapangan ini akan menjadi tempat yang penuh semangat, di mana para mahasiswa dapat mengeksplorasi potensi mereka, membangun kebersamaan, dan menciptakan kenangan yang tak terlupakan sepanjang masa."));
        newsList.add(new NewsModel("Tournament Mobile Legend Terbesar di dunia", "Bima Sakti - Jakarta", R.drawable.news4, "Tournament Mobile Legend Terbesar di dunia adalah kompetisi eSports yang mengumpulkan para pemain dan tim profesional Mobile Legend dari berbagai belahan dunia untuk bersaing dalam pertandingan yang penuh aksi dan strategi. Merupakan ajang prestisius yang melibatkan ribuan pemain berbakat dan penggemar yang bersemangat, turnamen ini menjadi panggung bagi para pemain untuk memperlihatkan keahlian mereka dalam permainan populer ini.\n" +
                "\n" +
                "Turnamen ini menawarkan panggung yang megah, dengan pertandingan yang diselenggarakan di arena yang luas dan teknologi canggih. Para penonton dapat menikmati pertandingan secara langsung melalui streaming online, sementara ribuan orang di seluruh dunia menyaksikan pertandingan ini dengan antusias melalui platform digital.\n" +
                "\n" +
                "Kompetisi ini tidak hanya tentang skill individual, tetapi juga kerjasama tim yang kuat dan strategi yang cerdas. Tim-tim terbaik dari berbagai negara berjuang untuk merebut gelar juara dan memperebutkan hadiah uang tunai yang besar serta pengakuan dunia.\n" +
                "\n" +
                "Selama turnamen, para pemain ditampilkan dalam pertandingan seru, menunjukkan keterampilan kelas dunia, taktik yang cermat, dan koordinasi tim yang mengesankan. Pertandingan ini memberikan pengalaman tak terlupakan bagi pemain dan penggemar, dengan momen-momen mendebarkan dan permainan yang menegangkan.\n" +
                "\n" +
                "Selain itu, turnamen ini juga menjadi ajang untuk memperkuat komunitas penggemar Mobile Legend di seluruh dunia. Penggemar dapat berinteraksi dengan para pemain favorit mereka, mendukung tim-tim kesayangan, dan merasakan semangat persaingan yang sebenarnya.\n" +
                "\n" +
                "Tournament Mobile Legend Terbesar di dunia telah menjelma menjadi acara yang dinanti-nantikan setiap tahunnya, menyatukan pemain, penggemar, dan industri eSports dalam sebuah perayaan yang spektakuler. Melalui turnamen ini, Mobile Legend terus memperkuat posisinya sebagai salah satu game mobile terpopuler dan menyediakan wadah bagi para pemain untuk menunjukkan bakat mereka dan bersaing di tingkat global."));
        newsList.add(new NewsModel("BOOM ID Juara VCT Indonesia", "Bima Sakti - Jakarta", R.drawable.news5, "BOOM ID memperoleh gelar juara dalam turnamen Valorant Champions Tour (VCT) Indonesia dengan penampilan yang luar biasa. Tim ini menunjukkan keahlian dan kerja sama yang luar biasa selama seluruh perjalanan kompetisi, memukau penggemar dan pesaing mereka.\n" +
                "\n" +
                "Dengan kombinasi strategi yang cerdas, reaksi cepat, dan keterampilan individu yang luar biasa, BOOM ID berhasil mengatasi semua tantangan yang mereka hadapi. Setiap anggota tim memberikan kontribusi yang signifikan, menunjukkan ketepatan tembakan yang mematikan, kontrol map yang hebat, dan pemahaman yang mendalam tentang mekanika permainan.\n" +
                "\n" +
                "Pemain BOOM ID memiliki kualitas kepemimpinan yang kuat dan kemampuan berkomunikasi yang efektif, memungkinkan mereka untuk mengatasi situasi yang sulit dengan mudah. Mereka mampu beradaptasi dengan perubahan taktik lawan dan membuat keputusan cerdas secara instan, menjadikan mereka tim yang tak terduga dan sulit untuk dikalahkan.\n" +
                "\n" +
                "Selain itu, kebersamaan dan semangat tim BOOM ID terpancar dengan jelas dalam permainan mereka. Mereka saling mendukung satu sama lain, menjaga semangat tinggi, dan tetap tenang di bawah tekanan. Kekompakan mereka menjadi salah satu faktor kunci dalam keberhasilan tim ini.\n" +
                "\n" +
                "Dengan prestasi ini, BOOM ID telah mengukuhkan diri mereka sebagai salah satu tim paling dominan dalam kompetisi Valorant di Indonesia. Mereka memperoleh penghargaan yang layak dan menjadi sorotan dalam komunitas gaming. Keberhasilan ini juga memberi motivasi kepada para penggemar setia mereka untuk terus mendukung dan menginspirasi tim ini dalam petualangan kompetisi mendatang.\n" +
                "\n" +
                "Sebagai juara VCT Indonesia, BOOM ID telah membuktikan bahwa mereka adalah kekuatan yang harus diperhitungkan dalam kompetisi Valorant. Mereka adalah teladan bagi para pemain muda yang bercita-cita untuk mencapai keunggulan dalam dunia e-sports. Dengan dedikasi, kerja keras, dan semangat juang yang tak tergoyahkan, BOOM ID telah memastikan tempat mereka di puncak dan akan terus menjadi ancaman yang tangguh dalam kompetisi masa depan."));

        newsAdapter = new NewsAdapter(newsList, this);
        binding.rvNews.setAdapter(newsAdapter);

        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void onNewsClick(NewsModel newsModel) {
        Intent intent = new Intent(this, NewsDetailActivity.class);
        intent.putExtra("title", newsModel.getTitle());
        intent.putExtra("author_location", newsModel.getAuthorLocation());
        intent.putExtra("image", newsModel.getImageResourceId());
        intent.putExtra("description", newsModel.getDescription());
        startActivity(intent);
    }
}