plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.mlseriesdemo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.mlseriesdemo"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // image classification
    implementation("com.google.mlkit:image-labeling:17.0.8")
    // custom image classification
    implementation("com.google.mlkit:image-labeling-custom:17.0.2")
    // object detection
    implementation("com.google.mlkit:object-detection:17.0.1")


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}