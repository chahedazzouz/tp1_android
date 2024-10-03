package com.example.tp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.tp1.ui.theme.Tp1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tp1Theme {
                // Utilisation du Scaffold pour la structure de l'interface
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        // Utiliser l'une des deux interfaces en appelant l'une des fonctions
                        // ColorBlocksUI()  // Première interface avec trois blocs de couleurs
                        ColorBlocksUI2()   // Deuxième interface avec quatre blocs de couleurs
                    }
                }
            }
        }
    }
}

// Interface pour la première configuration avec trois couleurs
@Composable
fun ColorBlocksUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Bloc rouge occupant la moitié supérieure de l'écran
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // Prend 50% de la hauteur de l'écran
                .background(Color.Red)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // Prend les 50% restants
        ) {
            // Bloc bleu à gauche
            Box(
                modifier = Modifier
                    .weight(1f) // Prend 50% de la largeur
                    .fillMaxHeight()
                    .background(Color.Blue)
            )

            // Bloc vert à droite
            Box(
                modifier = Modifier
                    .weight(1f) // Prend 50% de la largeur
                    .fillMaxHeight()
                    .background(Color.Green)
            )
        }
    }
}

// Interface pour la deuxième configuration avec quatre couleurs
@Composable
fun ColorBlocksUI2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // Prend 50% de l'écran en hauteur pour les blocs du haut
        ) {
            // Bloc bleu à gauche
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue)
            )

            // Bloc vert à droite
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // Prend 50% de l'écran en hauteur pour les blocs du bas
        ) {
            // Bloc rouge à gauche
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
            )

            // Bloc jaune à droite
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow)
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

// Prévisualisation de l'interface à trois couleurs
@Preview(showBackground = true)
@Composable
fun ColorBlocksPreview() {
    Tp1Theme {
        ColorBlocksUI()
    }
}

// Prévisualisation de l'interface à quatre couleurs
@Preview(showBackground = true)
@Composable
fun ColorBlocksPreview2() {
    Tp1Theme {
        ColorBlocksUI2()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tp1Theme {
        Greeting("Android")
    }
}
