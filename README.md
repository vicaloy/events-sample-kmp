./gradlew clean
./gradlew downloadApolloSchema --endpoint=http://localhost:8081/graphql --schema="shared/src/commonMain/graphql/schema.graphqls"
./gradlew :shared:generateServiceApolloSources

./gradlew publishAndReleaseToMavenCentral --no-configuration-cache


./gradlew :shared:assembleSharedReleaseXCFramework
swift package reset && swift package show-dependencies --format json
