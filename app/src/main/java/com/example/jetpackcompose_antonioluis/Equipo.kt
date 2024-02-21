package com.example.jetpackcompose_antonioluis

data class Equipo(val escudoUrl: String, val nombre: String, val ciudad: String, val estadio: String) {

    companion object {
        val listaEquipos = listOf(
            Equipo(
                "https://upload.wikimedia.org/wikipedia/en/thumb/3/3b/Sevilla_FC_logo.svg/1200px-Sevilla_FC_logo.svg.png",
                "Sevilla FC",
                "Sevilla",
                "Ramón Sánchez-Pizjuán"
            ),
            Equipo(
                "https://upload.wikimedia.org/wikipedia/en/thumb/1/13/Real_betis_logo.svg/800px-Real_betis_logo.svg.png",
                "Real Betis",
                "Sevilla",
                "Benito Villamarín"
            ),
            Equipo(
                "https://upload.wikimedia.org/wikipedia/en/thumb/4/47/FC_Barcelona_%28crest%29.svg/1200px-FC_Barcelona_%28crest%29.svg.png",
                "FC Barcelona",
                "Barcelona",
                "Camp Nou"
            ),
            Equipo(
                "https://upload.wikimedia.org/wikipedia/en/thumb/5/56/Real_Madrid_CF.svg/1200px-Real_Madrid_CF.svg.png",
                "Real Madrid",
                "Madrid",
                "Santiago Bernabéu"
            ),
            Equipo(
                "https://upload.wikimedia.org/wikipedia/en/thumb/f/f4/Atletico_Madrid_2017_logo.svg/1200px-Atletico_Madrid_2017_logo.svg.png",
                "Atlético de Madrid",
                "Madrid",
                "Wanda Metropolitano"
            ),
            Equipo(
                "https://upload.wikimedia.org/wikipedia/en/thumb/c/ce/Valenciacf.svg/1200px-Valenciacf.svg.png",
                "Valencia CF",
                "Valencia",
                "Mestalla"
            ),
            Equipo(
                "https://a.espncdn.com/combiner/i?img=/i/teamlogos/soccer/500/93.png",
                "Athletic Club",
                "Bilbao",
                "San Mamés"
            ),
            Equipo(
                "https://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/16.png",
                "Real Sociedad",
                "San Sebastián",
                "Anoeta"
            ),
            Equipo(
                "https://upload.wikimedia.org/wikipedia/en/thumb/b/b9/Villarreal_CF_logo-en.svg/1200px-Villarreal_CF_logo-en.svg.png",
                "Villarreal CF",
                "Villarreal",
                "Estadio de la Cerámica"
            ),
            Equipo(
                "https://upload.wikimedia.org/wikipedia/en/7/7a/Girona_FC_new_logo.png",
                "Girona FC",
                "Girona",
                "Montilivi"
            )
        )
    }
}
