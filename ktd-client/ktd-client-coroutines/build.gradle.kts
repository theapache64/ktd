plugins {
    use(Plugins.mppModule)
}

configureMultiplatform()

kotlin {
    dependenciesMain {
        api(Dependencies.kotlin.stdlib)
        api(Dependencies.kotlinx.coroutines.core)
    }
    dependenciesTest {
        implementation(Dependencies.kotlin.test)
        implementation(Dependencies.kotlin.annotations)
    }

    metadata {
        dependenciesMain {
            api(ProjectModules.Client.clientSuspend)
            api(ProjectModules.Updates.updatesFlow)
            api(ProjectModules.Migration.V060.clientRaw)
        }
    }
}