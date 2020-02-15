package com.wanztudio.idcamp.moviecatalogue.utils

import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.models.Crew
import com.wanztudio.idcamp.moviecatalogue.models.Movie

object MovieProvider {

    // ENGLISH VERSION
    fun getMoviesEnglishVersion(): List<Movie> {
        return arrayListOf(
            Movie(
                id = 1,
                title = "A Star Is Born",
                score = 75,
                thumbnail = R.drawable.poster_a_star,
                releaseDate = "03/10/2018",
                overview = "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. " +
                        "She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. " +
                        "But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                crews = arrayListOf(
                    Crew(name = "Bradley Cooper", role = "Director, Screenplay"),
                    Crew(name = "Will Fetters", role = "Screenplay"),
                    Crew(name = "Eric Roth", role = "Screenplay"),
                    Crew(name = "William A. Wellman", role = " Story"),
                    Crew(name = "Robert Carson", role = " Story")
                )
            ),
            Movie(
                id = 2,
                title = "Aquaman",
                score = 63,
                thumbnail = R.drawable.poster_aquaman,
                releaseDate = "07/12/2018",
                overview = "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. " +
                        "With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, " +
                        "Orm's half-human, half-Atlantean brother and true heir to the throne.",
                crews = arrayListOf(
                    Crew(name = "James Wan", role = "Director, Story"),
                    Crew(name = "Will Beall", role = "Screenplay, Story"),
                    Crew(name = "Paul Norris", role = "Characters"),
                    Crew(name = "Mort Weisinger", role = "Characters"),
                    Crew(name = "David Leslie Johnson-McGoldrick", role = "Screenplay"),
                    Crew(name = "Geoff Johns", role = "Story")
                )
            ),
            Movie(
                id = 3,
                title = "Avengers: Infinity War",
                score = 83,
                thumbnail = R.drawable.poster_avengerinfinity,
                releaseDate = "27/04/2018",
                overview = "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, " +
                        "a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, " +
                        "artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. " +
                        "Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
                crews = arrayListOf(
                    Crew(name = "Joe Russo", role = "Director"),
                    Crew(name = "Anthony Russo", role = "Director"),
                    Crew(name = "Stephen McFeely", role = "Screenplay"),
                    Crew(name = "Christopher Markus", role = "Screenplay")
                )
            ),
            Movie(
                id = 4,
                title = "Bird Box",
                score = 70,
                thumbnail = R.drawable.poster_birdbox,
                releaseDate = "13/12/2018",
                overview = "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.",
                crews = arrayListOf(
                    Crew(name = "Susanne Bier", role = "Director"),
                    Crew(name = "Josh Malerman", role = "Novel"),
                    Crew(name = "Eric Heisserer", role = "Screenplay")
                )
            ),
            Movie(
                id = 5,
                title = "Bohemian Rhapsody",
                score = 80,
                thumbnail = R.drawable.poster_aquaman,
                releaseDate = "24/10/2018",
                overview = "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist " +
                        "John Deacon take the music world by storm when they form the rock 'n' roll band Queen in 1970. Hit songs become instant classics. " +
                        "When Mercury's increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to " +
                        "keep the band together amid the success and excess.",
                crews = arrayListOf(
                    Crew(name = "Anthony McCarten", role = "Screenplay, Story"),
                    Crew(name = "Bryan Singer", role = "Director"),
                    Crew(name = "Peter Morgan", role = "Story")
                )
            ),
            Movie(
                id = 6,
                title = "Bumblebee",
                score = 65,
                thumbnail = R.drawable.poster_bumblebee,
                releaseDate = "15/12/2018",
                overview = "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to " +
                        "find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
                crews = arrayListOf(
                    Crew(name = "Christina Hodson", role = "Screenplay, Story"),
                    Crew(name = "Travis Knight", role = "Director")
                )
            ),
            Movie(
                id = 7,
                title = "Creed",
                score = 73,
                thumbnail = R.drawable.poster_creed,
                releaseDate = "07/12/2018",
                overview = "The former World Heavyweight Champion Rocky Balboa serves as a trainer and mentor to Adonis Johnson, the son of his late friend and former rival Apollo Creed.",
                crews = arrayListOf(
                    Crew(name = "Ryan Coogler", role = "Screenplay, Director, Story"),
                    Crew(name = "Sylvester Stallone", role = "Characters"),
                    Crew(name = "Aaron Covington", role = "Screenplay")
                )
            ),
            Movie(
                id = 8,
                title = "Deadpool",
                score = 76,
                thumbnail = R.drawable.poster_deadpool,
                releaseDate = "09/02/2016",
                overview = "Deadpool tells the origin story of former Special Forces operative turned mercenary Wade Wilson, " +
                        "who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. " +
                        "Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life.",
                crews = arrayListOf(
                    Crew(name = "Fabian Nicieza", role = "Characters"),
                    Crew(name = "Rob Liefeld", role = "Characters"),
                    Crew(name = "Tim Miller", role = "Director"),
                    Crew(name = "Paul Wernick", role = "Screenplay"),
                    Crew(name = "Rhett Reese", role = "Screenplay")
                )
            ),
            Movie(
                id = 9,
                title = "How to Train Your Dragon: The Hidden World",
                score = 77,
                thumbnail = R.drawable.poster_dragon,
                releaseDate = "03/01/2019",
                overview = "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. " +
                        "When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
                crews = arrayListOf(
                    Crew(name = "Dean DeBlois", role = "Screenplay, Director, Story"),
                    Crew(name = "Cressida Cowell", role = "Novel")
                )
            ),
            Movie(
                id = 10,
                title = "Dragon Ball Super",
                score = 71,
                thumbnail = R.drawable.poster_dragonball,
                releaseDate = "05/07/2015",
                overview = "People lived in peace without knowing who the true heroes were during the devastating battle against Majin Buu. " +
                        "The powerful Dragon Balls have prevented any permanent damage, and our heroes also continue to live a normal life. " +
                        "In the far reaches of the universe, however, a powerful being awakens early from his slumber, curious about a prophecy of his defeat.",
                crews = arrayListOf(
                    Crew(name = "Akira Toriyama", role = "Creator")
                )
            )
        )
    }

    fun getTvShowsEnglishVersion(): List<Movie> {
        return arrayListOf(
            Movie(
                id = 1,
                title = "Arrow",
                score = 59,
                thumbnail = R.drawable.poster_arrow,
                releaseDate = "10/10/2012",
                overview = "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. " +
                        "He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                crews = arrayListOf(
                    Crew(name = "Greg Berlanti", role = "Creator"),
                    Crew(name = "Marc Guggenheim", role = "Creator"),
                    Crew(name = "Andrew Kreisberg", role = "Creator")
                )
            ),
            Movie(
                id = 2,
                title = "Doom Patrol",
                score = 65,
                thumbnail = R.drawable.poster_doom_patrol,
                releaseDate = "15/02/2019",
                overview = "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. " +
                        "Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                crews = arrayListOf(
                    Crew(name = "Jeremy Carver", role = "Creator")
                )
            ),
            Movie(
                id = 3,
                title = "Dragon Ball",
                score = 71,
                thumbnail = R.drawable.poster_dragon_ball,
                releaseDate = "26/02/1986",
                overview = "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku." +
                        " Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. " +
                        "Then one day, Goku met a teenage girl named Bulma, whose search for the mystical Dragon Balls brought her to Goku's home. " +
                        "Together, they set off to find all seven and to grant her wish.",
                crews = arrayListOf(
                    Crew(name = "Akira Toriyama", role = "Creator")
                )
            ),
            Movie(
                id = 4,
                title = "Fairy Tail",
                score = 66,
                thumbnail = R.drawable.poster_fairytail,
                releaseDate = "12/10/2009",
                overview = "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. " +
                        "One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. " +
                        "But Natsu isn't just any ordinary kid, he's a member of one of the world's most infamous mage guilds: Fairy Tail.",
                crews = arrayListOf()
            ),
            Movie(
                id = 5,
                title = "Family Guy",
                score = 65,
                thumbnail = R.drawable.poster_family_guy,
                releaseDate = "31/01/1999",
                overview = "Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. " +
                        "Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). " +
                        "The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",
                crews = arrayListOf(
                    Crew(name = "Seth MacFarlane", role = "Creator")
                )
            ),
            Movie(
                id = 6,
                title = "The Flash",
                score = 68,
                thumbnail = R.drawable.poster_flash,
                releaseDate = "07/10/2014",
                overview = "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. " +
                        "Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. " +
                        "Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. B" +
                        "arry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. " +
                        "For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                crews = arrayListOf(
                    Crew(name = "Greg Berlanti", role = "Creator"),
                    Crew(name = "Geoff Johns", role = "Creator"),
                    Crew(name = "Andrew Kreisberg", role = "Creator")
                )
            ),
            Movie(
                id = 7,
                title = "Game of Thrones",
                score = 82,
                thumbnail = R.drawable.poster_got,
                releaseDate = "17/04/2011",
                overview = "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. " +
                        "All while a very ancient evil awakens in the farthest north. " +
                        "Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",
                crews = arrayListOf(
                    Crew(name = "David Benioff", role = "Creator"),
                    Crew(name = "D. B. Weiss", role = "Creator")
                )
            ),
            Movie(
                id = 8,
                title = "Gotham",
                score = 69,
                thumbnail = R.drawable.poster_gotham,
                releaseDate = "22/08/2014",
                overview = "Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. " +
                        "But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? " +
                        "And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",
                crews = arrayListOf(
                    Crew(name = "Bruno Heller", role = "Creator")
                )
            ),
            Movie(
                id = 9,
                title = "Grey's Anatomy",
                score = 66,
                thumbnail = R.drawable.poster_grey_anatomy,
                releaseDate = "27/05/2005",
                overview = "Follows the personal and professional lives of a group of doctors at Seattle’s Grey Sloan Memorial Hospital.",
                crews = arrayListOf(
                    Crew(name = "Shonda Rhimes", role = "Creator")
                )
            ),
            Movie(
                id = 10,
                title = "Hanna",
                score = 69,
                thumbnail = R.drawable.poster_hanna,
                releaseDate = "28/03/2009",
                overview = "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film..",
                crews = arrayListOf(
                    Crew(name = "David Farr", role = "Creator")
                )
            )
        )
    }

    // INDONESIAN VERSION
    fun getMoviesIndonesianVersion(): List<Movie> {
        return arrayListOf(
            Movie(
                id = 1,
                title = "A Star Is Born",
                score = 75,
                thumbnail = R.drawable.poster_a_star,
                releaseDate = "03/10/2018",
                overview = "Seorang bintang musik country yang karirnya mulai memudar, Jackson Maine (Bradley Cooper) menemukan sebuah talenta yang sangat berbakat di dalam diri dari seorang musisi muda bernama Ally (Lady Gaga). " +
                        "Maine berhasil mengorbitkan Ally menjadi seorang bintang muda yang menjanjikan. Namun keduanya terlibat hubungan yang lebih jauh dari sekedar mentor dan anak didik. " +
                        "Seiring dengan meroketnya karir dari Ally dan dirinya, Maine mengalami dilema mengenai masalah ini.",
                crews = arrayListOf(
                    Crew(name = "Bradley Cooper", role = "Sutradara, Skenario"),
                    Crew(name = "Will Fetters", role = "Skenario"),
                    Crew(name = "Eric Roth", role = "Skenario"),
                    Crew(name = "William A. Wellman", role = " Kisah"),
                    Crew(name = "Robert Carson", role = " Kisah")
                )
            ),
            Movie(
                id = 2,
                title = "Aquaman",
                score = 63,
                thumbnail = R.drawable.poster_aquaman,
                releaseDate = "07/12/2018",
                overview = "Dulunya merupakan rumah bagi peradaban paling maju di Bumi, Atlantis sekarang merupakan kerajaan bawah laut yang diperintah oleh Raja Orm yang haus kekuasaan. " +
                        "Dengan pasukan yang sangat besar, Orm berencana untuk menaklukkan orang-orang samudera yang tersisa dan kemudian ke permukaan. " +
                        "Yang menghalangi jalannya adalah Arthur Curry, saudara tiri manusia setengah manusia Orm dan pewaris sejati tahta.",
                crews = arrayListOf(
                    Crew(name = "James Wan", role = "Sutradara, Kisah"),
                    Crew(name = "Will Beall", role = "Skenario, Kisah"),
                    Crew(name = "Paul Norris", role = "Karakter"),
                    Crew(name = "Mort Weisinger", role = "Karakter"),
                    Crew(name = "David Leslie Johnson-McGoldrick", role = "Skenario"),
                    Crew(name = "Geoff Johns", role = "Kisah")
                )
            ),
            Movie(
                id = 3,
                title = "Avengers: Infinity War",
                score = 83,
                thumbnail = R.drawable.poster_avengerinfinity,
                releaseDate = "27/04/2018",
                overview = "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. " +
                        "Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. " +
                        "Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                crews = arrayListOf(
                    Crew(name = "Joe Russo", role = "Sutradara"),
                    Crew(name = "Anthony Russo", role = "Sutradara"),
                    Crew(name = "Stephen McFeely", role = "Skenario"),
                    Crew(name = "Christopher Markus", role = "Skenario")
                )
            ),
            Movie(
                id = 4,
                title = "Bird Box",
                score = 70,
                thumbnail = R.drawable.poster_birdbox,
                releaseDate = "13/12/2018",
                overview = "Lima tahun setelah kehadiran tak terlihat yang tak menyenangkan membuat sebagian besar masyarakat bunuh diri, seorang yang selamat dan dua anaknya melakukan upaya putus asa untuk mencapai keselamatan.",
                crews = arrayListOf(
                    Crew(name = "Susanne Bier", role = "Sutradara"),
                    Crew(name = "Josh Malerman", role = "Novel"),
                    Crew(name = "Eric Heisserer", role = "Skenario")
                )
            ),
            Movie(
                id = 5,
                title = "Bohemian Rhapsody",
                score = 80,
                thumbnail = R.drawable.poster_aquaman,
                releaseDate = "24/10/2018",
                overview = "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor dan gitaris bass John Deacon membawa dunia musik dengan badai ketika mereka membentuk band rock 'n' roll Queen pada tahun 1970. " +
                        "Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band bersama di tengah kesuksesan dan kelebihan.",
                crews = arrayListOf(
                    Crew(name = "Anthony McCarten", role = "Skenario, Kisah"),
                    Crew(name = "Bryan Singer", role = "Sutradara"),
                    Crew(name = "Peter Morgan", role = "Kisah")
                )
            ),
            Movie(
                id = 6,
                title = "Bumblebee",
                score = 65,
                thumbnail = R.drawable.poster_bumblebee,
                releaseDate = "15/12/2018",
                overview = "Dalam pelarian pada tahun 1987, Bumblebee menemukan perlindungan di tempat barang rongsokan di kota pantai kecil California. Charlie, di puncak usia 18 dan berusaha menemukan tempatnya di dunia, menemukan Bumblebee, bekas luka pertempuran dan patah. " +
                        "Ketika Charlie menghidupkannya, dia dengan cepat mengetahui bahwa ini bukan bug VW kuning biasa.",
                crews = arrayListOf(
                    Crew(name = "Christina Hodson", role = "Skenario, Kisah"),
                    Crew(name = "Travis Knight", role = "Sutradara")
                )
            ),
            Movie(
                id = 7,
                title = "Creed",
                score = 73,
                thumbnail = R.drawable.poster_creed,
                releaseDate = "07/12/2018",
                overview = "Mantan Juara Dunia Kelas Berat Rocky Balboa melayani sebagai pelatih dan mentor bagi Adonis Johnson, putra dari almarhum teman dan mantan saingannya Apollo Creed.",
                crews = arrayListOf(
                    Crew(name = "Ryan Coogler", role = "Skenario, Sutradara, Kisah"),
                    Crew(name = "Sylvester Stallone", role = "Karakter"),
                    Crew(name = "Aaron Covington", role = "Skenario")
                )
            ),
            Movie(
                id = 8,
                title = "Deadpool",
                score = 76,
                thumbnail = R.drawable.poster_deadpool,
                releaseDate = "09/02/2016",
                overview = "Film action berjudul “Deadpool” ini merupakan film yang bercerita tentang seorang pria yang berprofesi sebagai tentara bayaran bernama Wade Wilson ( Ryan Reynolds ). " +
                        "Wade yang sedang mengalami sakit sekarat karena kanker dan mendapatkan sebuah tawaran untuk percobaan perubahan genetik di mana bisa mengubah dirinya dan menjadi seorang superhero. " +
                        "Karena penyakit yang dideritanya, Wade akhirnya memutuskan untuk melakukan percobaan tersebut. " +
                        "Percobaan tersebut akhirnya membuat diri Wade berubah drastis dan menjadi seorang superhero yang dijuluki dengan Deadpool.",
                crews = arrayListOf(
                    Crew(name = "Fabian Nicieza", role = "Karakter"),
                    Crew(name = "Rob Liefeld", role = "Karakter"),
                    Crew(name = "Tim Miller", role = "Sutradara"),
                    Crew(name = "Paul Wernick", role = "Skenario"),
                    Crew(name = "Rhett Reese", role = "Skenario")
                )
            ),
            Movie(
                id = 9,
                title = "How to Train Your Dragon: The Hidden World",
                score = 77,
                thumbnail = R.drawable.poster_dragon,
                releaseDate = "03/01/2019",
                overview = "Ketika Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'dari pasangan yang tak teruji dan sukar ditangkap membuat Night Fury menjauh. " +
                        "Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga dan pengendara harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
                crews = arrayListOf(
                    Crew(name = "Dean DeBlois", role = "Skenario, Sutradara, Kisah"),
                    Crew(name = "Cressida Cowell", role = "Novel")
                )
            ),
            Movie(
                id = 10,
                title = "Dragon Ball Super",
                score = 71,
                thumbnail = R.drawable.poster_dragonball,
                releaseDate = "05/07/2015",
                overview = "Dengan Majin Boo dikalahkan setengah tahun sebelumnya, perdamaian kembali ke Bumi, tempat Son Goku (sekarang petani lobak) dan teman-temannya sekarang hidup damai. " +
                        "Namun, ancaman baru muncul dalam bentuk Beerus, Dewa Kehancuran. Dianggap sebagai makhluk paling menakutkan di seluruh alam semesta, Beerus sangat ingin melawan prajurit legendaris yang terlihat dalam ramalan yang telah dinubuatkan beberapa dekade lalu yang dikenal sebagai Dewa Super Saiyan. " +
                        "Serial ini menceritakan kembali peristiwa-peristiwa dari dua film Dragon Ball Z, Battle of Gods and Resurrection 'F' sebelum melanjutkan ke kisah orisinal tentang eksplorasi alam semesta alternatif.",
                crews = arrayListOf(
                    Crew(name = "Akira Toriyama", role = "Kreator")
                )
            )
        )
    }

    fun getTvShowsIndonesianVersion(): List<Movie> {
        return arrayListOf(
            Movie(
                id = 1,
                title = "Arrow",
                score = 59,
                thumbnail = R.drawable.poster_arrow,
                releaseDate = "10/10/2012",
                overview = "Panah adalah menceritakan kembali petualangan dari legendaris DC pahlawan Green Arrow",
                crews = arrayListOf(
                    Crew(name = "Greg Berlanti", role = "Kreator"),
                    Crew(name = "Marc Guggenheim", role = "Kreator"),
                    Crew(name = "Andrew Kreisberg", role = "Kreator")
                )
            ),
            Movie(
                id = 2,
                title = "Doom Patrol",
                score = 71,
                thumbnail = R.drawable.poster_doom_patrol,
                releaseDate = "15/02/2019",
                overview = "Anggota Patroli Doom masing-masing mengalami kecelakaan mengerikan yang memberi mereka kemampuan manusia super - tetapi juga membuat mereka terluka dan cacat. " +
                        "Trauma dan tertindas, tim menemukan tujuan melalui Ketua, yang menyatukan mereka untuk menyelidiki fenomena aneh yang ada - dan untuk melindungi Bumi dari apa yang mereka temukan.",
                crews = arrayListOf(
                    Crew(name = "Jeremy Carver", role = "Kreator")
                )
            ),
            Movie(
                id = 3,
                title = "Dragon Ball",
                score = 71,
                thumbnail = R.drawable.poster_dragon_ball,
                releaseDate = "26/02/1986",
                overview = "Dahulu kala di pegunungan, seorang master pertempuran yang dikenal sebagai Gohan menemukan seorang bocah aneh yang ia beri nama Goku. " +
                        "Gohan membesarkannya dan melatih Goku dalam seni bela diri sampai dia mati. Bocah muda dan sangat kuat itu sendirian, tetapi mudah dikelola. " +
                        "Kemudian suatu hari, Goku bertemu dengan seorang gadis remaja bernama Bulma, yang pencariannya untuk bola naga membawanya ke rumah Goku. " +
                        "Bersama-sama, mereka berangkat untuk menemukan ketujuh bola naga dalam sebuah petualangan yang akan mengubah hidup Goku selamanya. " +
                        "Lihat bagaimana Goku bertemu teman-teman seumur hidupnya Bulma, Yamcha, Krillin, Master Roshi dan banyak lagi.",
                crews = arrayListOf(
                    Crew(name = "Akira Toriyama", role = "Kreator")
                )
            ),
            Movie(
                id = 4,
                title = "Fairy Tail",
                score = 66,
                thumbnail = R.drawable.poster_fairytail,
                releaseDate = "12/10/2009",
                overview = "Lucy adalah seorang gadis berusia 17 tahun, yang ingin menjadi penyihir penuh. Suatu hari ketika mengunjungi Kota Harujion, dia bertemu Natsu, seorang pemuda yang mudah sakit karena segala jenis transportasi. " +
                        "Tapi Natsu bukan sembarang anak biasa, dia anggota dari salah satu serikat penyihir paling terkenal di dunia: Fairy Tail.",
                crews = arrayListOf()
            ),
            Movie(
                id = 5,
                title = "Family Guy",
                score = 65,
                thumbnail = R.drawable.poster_family_guy,
                releaseDate = "31/01/1999",
                overview = "Seri animasi animasi Freakin 'Sweet yang sakit, terpelintir, dan salah, menampilkan petualangan keluarga Griffin yang disfungsional. " +
                        "Peter yang kikuk dan Lois yang sudah lama menderita memiliki tiga anak. Stewie (bayi yang brilian tetapi sadis yang bertekad membunuh ibunya dan mengambil alih dunia), Meg (yang tertua, dan merupakan gadis yang paling tidak populer di kota) dan Chris (anak tengah, dia tidak terlalu cerdas tetapi memiliki hasrat untuk film ). " +
                        "Anggota terakhir keluarga itu adalah Brian - anjing yang bisa bicara dan lebih dari sekadar hewan peliharaan, ia menjaga Stewie, sementara menghirup Martinis dan memilah-milah masalah hidupnya sendiri.",
                crews = arrayListOf(
                    Crew(name = "Seth MacFarlane", role = "Kreator")
                )
            ),
            Movie(
                id = 6,
                title = "The Flash",
                score = 68,
                thumbnail = R.drawable.poster_flash,
                releaseDate = "07/10/2014",
                overview = "Setelah akselerator partikel menyebabkan badai aneh, Penyelidik CSI Barry Allen disambar petir dan jatuh koma. " +
                        "Beberapa bulan kemudian dia terbangun dengan kekuatan kecepatan super, memberinya kemampuan untuk bergerak melalui Central City seperti malaikat penjaga yang tak terlihat. " +
                        "Meskipun awalnya senang dengan kekuatan barunya, Barry terkejut menemukan bahwa dia bukan satu-satunya \"manusia meta\" yang diciptakan setelah ledakan akselerator - dan tidak semua orang menggunakan kekuatan baru mereka untuk kebaikan. " +
                        "Barry bermitra dengan S.T.A.R. Lab dan mendedikasikan hidupnya untuk melindungi yang tidak bersalah. " +
                        "Untuk saat ini, hanya beberapa teman dekat dan rekan yang tahu bahwa Barry secara harfiah adalah manusia tercepat, tetapi tidak lama sebelum dunia mengetahui apa yang menjadi Barry Allen ... The Flash.",
                crews = arrayListOf(
                    Crew(name = "Greg Berlanti", role = "Kreator"),
                    Crew(name = "Geoff Johns", role = "Kreator"),
                    Crew(name = "Andrew Kreisberg", role = "Kreator")
                )
            ),
            Movie(
                id = 7,
                title = "Game of Thrones",
                score = 82,
                thumbnail = R.drawable.poster_got,
                releaseDate = "17/04/2011",
                overview = "Tujuh keluarga bangsawan berjuang untuk menguasai tanah mitos Westeros. Gesekan antara rumah-rumah mengarah ke perang skala penuh. " +
                        "Semua sementara kejahatan yang sangat kuno terbangun di utara terjauh. " +
                        "Di tengah-tengah perang, perintah militer yang diabaikan, Night's Watch, adalah yang berdiri di antara alam manusia dan kengerian es di luarnya.",
                crews = arrayListOf(
                    Crew(name = "David Benioff", role = "Kreator"),
                    Crew(name = "D. B. Weiss", role = "Kreator")
                )
            ),
            Movie(
                id = 8,
                title = "Gotham",
                score = 69,
                thumbnail = R.drawable.poster_gotham,
                releaseDate = "22/08/2014",
                overview = "Semua orang tahu nama Komisaris Gordon. Dia adalah salah satu musuh terbesar dunia kejahatan, seorang pria yang reputasinya identik dengan hukum dan ketertiban. " +
                        "Tapi apa yang diketahui tentang kisah Gordon dan kenaikannya dari detektif pemula ke Komisaris Polisi? " +
                        "Apa yang diperlukan untuk menavigasi berbagai lapisan korupsi yang diam-diam memerintah Kota Gotham, tempat bertelurnya penjahat paling ikonik di dunia? Dan keadaan apa yang menciptakan mereka - persona yang lebih besar dari kehidupan yang akan menjadi Catwoman, The Penguin, The Riddler, Two-Face dan The Joker?",
                crews = arrayListOf(
                    Crew(name = "Bruno Heller", role = "Kreator")
                )
            ),
            Movie(
                id = 9,
                title = "Grey's Anatomy",
                score = 66,
                thumbnail = R.drawable.poster_grey_anatomy,
                releaseDate = "27/05/2005",
                overview = "Ikuti kehidupan pribadi dan profesional sekelompok dokter di Rumah Sakit Gray Sloan Memorial di Seattle.",
                crews = arrayListOf(
                    Crew(name = "Shonda Rhimes", role = "Kreator")
                )
            ),
            Movie(
                id = 10,
                title = "Hanna",
                score = 69,
                thumbnail = R.drawable.poster_hanna,
                releaseDate = "28/03/2009",
                overview = "Drama yang menegangkan dan menjadi dewasa ini mengikuti perjalanan seorang gadis muda yang luar biasa ketika ia menghindari pengejaran tanpa henti dari seorang agen CIA yang tidak ada buku dan mencoba untuk menggali kebenaran di balik siapa dirinya. " +
                        "Berdasarkan pada film Joe Wright 2011.",
                crews = arrayListOf(
                    Crew(name = "David Farr", role = "Kreator")
                )
            )
        )
    }
}