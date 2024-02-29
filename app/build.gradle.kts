plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.jack.weather"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.jack.weather"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.2"
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    kapt {
        correctErrorTypes = true
    }

}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")

    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")

    // Jetpack Compose
    val composeVersion = "2023.01.00"
    implementation(platform("androidx.compose:compose-bom:$composeVersion"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material:material")
    implementation("androidx.activity:activity-compose")
    implementation("androidx.compose.ui:ui-viewbinding")
    implementation("androidx.compose.ui:ui-util")
    implementation("androidx.compose.ui:ui-text-google-fonts")

    // Optional - Included automatically by material, only add when you need
    // the icons but not the material library (e.g. when using Material3 or a
    // custom design system based on Foundation)
    implementation("androidx.compose.material:material-icons-core")
    // Optional - Add full set of material icons
    implementation("androidx.compose.material:material-icons-extended")
    // Optional - Add window size utils
    implementation("androidx.compose.material3:material3-window-size-class")

    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.30.0")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
    implementation("androidx.paging:paging-compose:3.3.0-alpha03")


    // Jetbrains
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.4")

    // Image processor
    implementation("io.coil-kt:coil-compose:2.2.2")
    implementation("com.airbnb.android:lottie-compose:6.0.0")

    // Dependency Injection
    implementation("com.google.dagger:hilt-android:2.47")
    kapt("com.google.dagger:hilt-android-compiler:2.47")
    kapt("androidx.hilt:hilt-compiler:1.2.0")


    implementation("me.nikhilchaudhari:composeNeumorphism:1.0.0-alpha02")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}