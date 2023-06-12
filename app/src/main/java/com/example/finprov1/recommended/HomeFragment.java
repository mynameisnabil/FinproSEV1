package com.example.finprov1.recommended;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.finprov1.ProfileFragment;
import com.example.finprov1.R;
import com.example.finprov1.community.CommunityActivity;
import com.example.finprov1.databinding.FragmentHomeBinding;
import com.example.finprov1.latestupdates.LatestUpdatesAdapter;
import com.example.finprov1.latestupdates.LatestUpdatesModel;
import com.example.finprov1.news.NewsActivity;
import com.example.finprov1.placefacility.PlaceAndFacilityActivity;
import com.example.finprov1.training.TrainingAndOnlineActivity;
import com.example.finprov1.turnament.TournamentActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater,container,false);
        return binding.getRoot();


    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecommendedAdapter recommendedAdapter = new RecommendedAdapter();
        LatestUpdatesAdapter latestUpdatesAdapter = new LatestUpdatesAdapter();
        binding.rvRecom.setAdapter(recommendedAdapter);
        binding.rvRecom.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.rvLatest.setAdapter(latestUpdatesAdapter);
        binding.rvLatest.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.rvPopular.setAdapter(recommendedAdapter);
        binding.rvPopular.setLayoutManager(new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false));

        binding.btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), NewsActivity.class);
                startActivity(intent);
            }
        });

        binding.btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // intent ke fragment
                ProfileFragment profileFragment = new ProfileFragment();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, profileFragment)
                        .addToBackStack(null)
                        .commit();

            }
        });

        binding.btnPf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), PlaceAndFacilityActivity.class);
                startActivity(intent);
            }
        });

        binding.btnCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), CommunityActivity.class);
                startActivity(intent);
            }
        });

        binding.btnTurnament.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), TournamentActivity.class);
                startActivity(intent);
            }
        });

        binding.btnTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), TrainingAndOnlineActivity.class);
                startActivity(intent);
            }
        });

        binding.btnShowAllCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPlaceAndFacilityActivity();
            }
        });

        binding.btnShowAllPopular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToPlaceAndFacilityActivity();
            }
        });

        binding.btnShowAllLatestUpdates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNewsActivity();
            }
        });

        List<RecommendedModel> listRecommended = new ArrayList<>();
        listRecommended.add(new RecommendedModel("BINUS Baketball Court", "BINUS Baketball Court", R.drawable.paf1));
        listRecommended.add(new RecommendedModel("UPH Basketball Court", "UPH Basketball Court", R.drawable.paf2));
        listRecommended.add(new RecommendedModel("UNESA Tennis Court", "UNESA Tennis Court", R.drawable.paf3));
        listRecommended.add(new RecommendedModel("SMK St. Louis Basketball Court", "SMK St. Louis Basketball Court", R.drawable.paf4));
        listRecommended.add(new RecommendedModel("GBK Lapangan B", "GBK Lapangan B", R.drawable.paf5));
        recommendedAdapter.setData(listRecommended);

        List<LatestUpdatesModel> listLatestUpdates = new ArrayList<>();
        listLatestUpdates.add(new LatestUpdatesModel("Indonesia akan melawan Argentina di GBK", "Pertandingan besar akan segera terjadi di tanah air ketika tim nasional Indonesia bersiap untuk menghadapi tim nasional Argentina di Stadion Utama Gelora Bung Karno (GBK). Ini adalah pertandingan yang penuh gairah dan ditunggu-tunggu oleh para penggemar sepak bola di seluruh Indonesia.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"GBK, yang telah menjadi ikon olahraga Indonesia, akan menjadi tempat di mana ribuan suporter akan berkumpul untuk menyaksikan pertarungan sengit antara kedua tim. Antusiasme dan semangat di sekitar stadion akan menciptakan atmosfer yang luar biasa, dengan warna-warni bendera dan nyanyian seruan dari para penggemar yang menyemangati para pemain.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Tim nasional Indonesia, yang dikenal sebagai \\\"Merah Putih,\\\" akan tampil dengan rasa bangga dan tekad untuk memberikan penampilan terbaik mereka. Dengan gaya permainan yang cepat dan kombinasi teknik yang solid, mereka akan berusaha untuk menunjukkan kualitas dan potensi sepak bola Indonesia kepada dunia.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Namun, tantangan besar menanti Indonesia ketika mereka berhadapan dengan tim nasional Argentina, yang dikenal sebagai \\\"Albiceleste\\\" dan memiliki sejarah yang kaya dalam sepak bola internasional. Argentina telah memenangkan banyak gelar juara dan memiliki pemain-pemain hebat yang dapat mengubah permainan dengan keahlian individu mereka.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Pertemuan ini akan menjadi ujian sejati bagi para pemain Indonesia saat mereka berhadapan dengan kekuatan tim Argentina. Dibutuhkan kerja keras, kecerdasan taktik, dan kekuatan mental yang kuat untuk menghadapi tantangan ini. Pelatih dan pemain akan melakukan persiapan yang cermat, menganalisis kekuatan dan kelemahan lawan, serta mencari strategi yang tepat untuk meraih kemenangan.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Ini adalah momen bagi pemain Indonesia untuk menunjukkan keberanian dan semangat bertanding yang tak tergoyahkan di hadapan ribuan suporter yang mendukung mereka. Pertandingan ini akan menjadi panggung di mana bakat dan dedikasi mereka dapat bersinar, dan mungkin akan menjadi tonggak sejarah bagi sepak bola Indonesia.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Dalam atmosfer yang penuh semangat dan tegang di GBK, pertandingan ini akan memberikan hiburan tak terlupakan bagi penggemar sepak bola Indonesia. Setiap gol, tendangan, dan aksi hebat akan membuat hati berdegup kencang, sementara momen-momen kegembiraan dan kekecewaan akan melintasi lapangan hijau.\\n\" +\n" +
                "                \"\\n\" +\n" +
                "                \"Indonesia melawan Argentina di GBK akan menjadi pertempuran yang epik, di mana kedua tim akan memberikan yang terbaik untuk meraih kemenangan. Ini adalah momen untuk menghormati kebanggaan nasional dan menghadirkan kegembiraan bagi para penggemar sepak bola.\"", R.drawable.news1));
        listLatestUpdates.add(new LatestUpdatesModel("Indonesia Juara SEA Games 2023 Cabang Sepak Bola", "Indonesia meraih prestasi gemilang dalam ajang SEA Games 2023 di cabang sepak bola dengan menyabet gelar juara. Tim nasional sepak bola Indonesia memperlihatkan keunggulan dan ketangguhannya selama turnamen, mengalahkan lawan-lawan tangguh dari negara-negara Asia Tenggara.\n" +
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
                "Indonesia, sebagai tuan rumah SEA Games 2023, telah memberikan pertandingan sepak bola yang tak terlupakan, menarik perhatian dunia, dan mengundang apresiasi dari para penggemar sepak bola di seluruh dunia. Keberhasilan ini menjadi tonggak sejarah bagi sepak bola Indonesia dan menjadi pijakan untuk melangkah lebih jauh dalam kompetisi tingkat internasional.", R.drawable.news2));
        listLatestUpdates.add(new LatestUpdatesModel("BINUS Membuka Lapangan Sepak Bola Pertama", "BINUS dengan bangga mengumumkan pembukaan Lapangan Sepak Bola Pertama, menjadi inisiatif terbaru mereka dalam memperkaya pengalaman belajar dan kehidupan mahasiswa. Terletak di tengah kampus yang luas, lapangan sepak bola ini menawarkan fasilitas modern dan state-of-the-art yang dirancang untuk mendukung perkembangan olahraga dan semangat kompetisi.\n" +
                "\n" +
                "Dengan ukuran yang sesuai standar internasional, lapangan sepak bola BINUS menjadi tempat yang ideal bagi para mahasiswa, staf, dan masyarakat sekitar untuk berpartisipasi dalam kegiatan olahraga yang menyenangkan dan membangun. Dengan rumput hijau yang indah dan permukaan yang halus, lapangan ini menjamin pengalaman bermain sepak bola yang optimal.\n" +
                "\n" +
                "Lapangan sepak bola ini juga dilengkapi dengan sistem pencahayaan yang canggih, memungkinkan pertandingan malam yang menyenangkan dan penerangan yang memadai untuk latihan. Terdapat juga tribun penonton yang nyaman, memungkinkan teman-teman dan keluarga untuk memberikan dukungan kepada para pemain.\n" +
                "\n" +
                "Tidak hanya menjadi tempat bermain sepak bola, lapangan ini juga menjadi pusat kegiatan olahraga lainnya, seperti turnamen internal kampus, pelatihan tim, dan kegiatan kebugaran. Dengan berbagai program dan acara yang diselenggarakan di lapangan ini, BINUS berusaha untuk memperkuat semangat tim, meningkatkan keterampilan olahraga, dan mempromosikan kehidupan sehat dan aktif di antara komunitas kampusnya.\n" +
                "\n" +
                "Lapangan Sepak Bola Pertama BINUS adalah wujud komitmen mereka dalam memberikan lingkungan belajar yang lengkap dan holistik, di mana akademik, olahraga, dan pengembangan pribadi saling melengkapi. Diharapkan, lapangan ini akan menjadi tempat yang penuh semangat, di mana para mahasiswa dapat mengeksplorasi potensi mereka, membangun kebersamaan, dan menciptakan kenangan yang tak terlupakan sepanjang masa.", R.drawable.news3));
        listLatestUpdates.add(new LatestUpdatesModel("Tournament Mobile Legend Terbesar di dunia", "Tournament Mobile Legend Terbesar di dunia adalah kompetisi eSports yang mengumpulkan para pemain dan tim profesional Mobile Legend dari berbagai belahan dunia untuk bersaing dalam pertandingan yang penuh aksi dan strategi. Merupakan ajang prestisius yang melibatkan ribuan pemain berbakat dan penggemar yang bersemangat, turnamen ini menjadi panggung bagi para pemain untuk memperlihatkan keahlian mereka dalam permainan populer ini.\n" +
                "\n" +
                "Turnamen ini menawarkan panggung yang megah, dengan pertandingan yang diselenggarakan di arena yang luas dan teknologi canggih. Para penonton dapat menikmati pertandingan secara langsung melalui streaming online, sementara ribuan orang di seluruh dunia menyaksikan pertandingan ini dengan antusias melalui platform digital.\n" +
                "\n" +
                "Kompetisi ini tidak hanya tentang skill individual, tetapi juga kerjasama tim yang kuat dan strategi yang cerdas. Tim-tim terbaik dari berbagai negara berjuang untuk merebut gelar juara dan memperebutkan hadiah uang tunai yang besar serta pengakuan dunia.\n" +
                "\n" +
                "Selama turnamen, para pemain ditampilkan dalam pertandingan seru, menunjukkan keterampilan kelas dunia, taktik yang cermat, dan koordinasi tim yang mengesankan. Pertandingan ini memberikan pengalaman tak terlupakan bagi pemain dan penggemar, dengan momen-momen mendebarkan dan permainan yang menegangkan.\n" +
                "\n" +
                "Selain itu, turnamen ini juga menjadi ajang untuk memperkuat komunitas penggemar Mobile Legend di seluruh dunia. Penggemar dapat berinteraksi dengan para pemain favorit mereka, mendukung tim-tim kesayangan, dan merasakan semangat persaingan yang sebenarnya.\n" +
                "\n" +
                "Tournament Mobile Legend Terbesar di dunia telah menjelma menjadi acara yang dinanti-nantikan setiap tahunnya, menyatukan pemain, penggemar, dan industri eSports dalam sebuah perayaan yang spektakuler. Melalui turnamen ini, Mobile Legend terus memperkuat posisinya sebagai salah satu game mobile terpopuler dan menyediakan wadah bagi para pemain untuk menunjukkan bakat mereka dan bersaing di tingkat global.", R.drawable.news4));
        listLatestUpdates.add(new LatestUpdatesModel("BOOM ID Juara VCT Indonesia", "BOOM ID memperoleh gelar juara dalam turnamen Valorant Champions Tour (VCT) Indonesia dengan penampilan yang luar biasa. Tim ini menunjukkan keahlian dan kerja sama yang luar biasa selama seluruh perjalanan kompetisi, memukau penggemar dan pesaing mereka.\n" +
                "\n" +
                "Dengan kombinasi strategi yang cerdas, reaksi cepat, dan keterampilan individu yang luar biasa, BOOM ID berhasil mengatasi semua tantangan yang mereka hadapi. Setiap anggota tim memberikan kontribusi yang signifikan, menunjukkan ketepatan tembakan yang mematikan, kontrol map yang hebat, dan pemahaman yang mendalam tentang mekanika permainan.\n" +
                "\n" +
                "Pemain BOOM ID memiliki kualitas kepemimpinan yang kuat dan kemampuan berkomunikasi yang efektif, memungkinkan mereka untuk mengatasi situasi yang sulit dengan mudah. Mereka mampu beradaptasi dengan perubahan taktik lawan dan membuat keputusan cerdas secara instan, menjadikan mereka tim yang tak terduga dan sulit untuk dikalahkan.\n" +
                "\n" +
                "Selain itu, kebersamaan dan semangat tim BOOM ID terpancar dengan jelas dalam permainan mereka. Mereka saling mendukung satu sama lain, menjaga semangat tinggi, dan tetap tenang di bawah tekanan. Kekompakan mereka menjadi salah satu faktor kunci dalam keberhasilan tim ini.\n" +
                "\n" +
                "Dengan prestasi ini, BOOM ID telah mengukuhkan diri mereka sebagai salah satu tim paling dominan dalam kompetisi Valorant di Indonesia. Mereka memperoleh penghargaan yang layak dan menjadi sorotan dalam komunitas gaming. Keberhasilan ini juga memberi motivasi kepada para penggemar setia mereka untuk terus mendukung dan menginspirasi tim ini dalam petualangan kompetisi mendatang.\n" +
                "\n" +
                "Sebagai juara VCT Indonesia, BOOM ID telah membuktikan bahwa mereka adalah kekuatan yang harus diperhitungkan dalam kompetisi Valorant. Mereka adalah teladan bagi para pemain muda yang bercita-cita untuk mencapai keunggulan dalam dunia e-sports. Dengan dedikasi, kerja keras, dan semangat juang yang tak tergoyahkan, BOOM ID telah memastikan tempat mereka di puncak dan akan terus menjadi ancaman yang tangguh dalam kompetisi masa depan.", R.drawable.news5));
        latestUpdatesAdapter.setData(listLatestUpdates);
    }

    public void goToPlaceAndFacilityActivity() {
        Intent intent = new Intent(requireContext(), PlaceAndFacilityActivity.class);
        startActivity(intent);
    }

    public void goToNewsActivity() {
        Intent intent = new Intent(requireContext(), NewsActivity.class);
        startActivity(intent);
    }
}