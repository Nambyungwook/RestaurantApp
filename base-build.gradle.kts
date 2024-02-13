plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 28
        targetSdk = 33
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles = 'consumer-rules.pro'
    }

    buildTypes {
        debug {
            isDefault = true
            debuggable = true
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = true
            zipAlignEnabled = true
            shrinkResources =  false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
        freeCompilerArgs += "-opt-in=kotlin.RequiresOptIn"
    }

    testOptions {
        unitTests {
            includeAndroidResources = true
            unitTests.returnDefaultValues = true
        }
    }

    lint {
        checkReleaseBuilds =false
        abortOnError = false
    }

    packagingOptions {
        jniLibs {
            excludes += ['META-INF/*', '**/kotlin/**']
        }
        resources {
            excludes += ['META-INF/*', '**/kotlin/**', '**/*.txt']
        }
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "$versions.kotlin_compiler_extension_version"
    }
}



dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
    api("androidx.core:core-ktx:1.8.0")

    // Compose
    api("androidx.compose.ui:ui:1.3.2")
    api("androidx.compose.ui:ui-tooling-preview:1.3.2")
    api("androidx.compose.material:material:1.0.1")
    api("androidx.activity:activity-compose:1.6.1")

    // Hilt
    api("com.google.dagger:hilt-android:2.45")
    api("androidx.hilt:hilt-navigation-fragment:1.0.0")
    kapt("com.google.dagger:hilt-android-compiler:2.45")

    // Timber
    implementation("com.jakewharton.timber:timber:5.0.1")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.3.2")
    debugImplementation("androidx.compose.ui:ui-tooling:1.3.2")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.3.2")
}
