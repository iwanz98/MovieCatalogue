package com.wanztudio.idcamp.moviecatalogue.utils

import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.models.Crew
import com.wanztudio.idcamp.moviecatalogue.models.Movie

object MovieProvider {

    fun generateMovies(): List<Movie> {
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
                id = 1,
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
}