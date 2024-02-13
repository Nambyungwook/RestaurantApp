pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RestaurantApp"
include(":app")
include(":core")
include(":ui_components")
include(":features:feed")
include(":features:detail")
include(":libraries:storage")
include(":libraries:storage-contract")
include(":libraries:network")
include(":libraries:network-contract")
