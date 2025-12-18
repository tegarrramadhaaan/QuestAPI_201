package com.example.mydatasiswa.navigasi

import androidx.annotation.StringRes

/**
 * Interface to declare navigation properties for a screen.
 */
interface DestinasiNavigasi {
    /**
     * Unique name to define the path for a composable
     */
    val route: String

    /**
     * String resource id to be displayed in the top bar
     */
    @get:StringRes
    val titleRes: Int
}